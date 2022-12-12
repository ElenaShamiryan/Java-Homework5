package DZ6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HeapSort {
    private static int LEFT(int i) {
        return (2 * i + 1);
    }

    private static int RIGHT(int i) {
        return (2 * i + 2);
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    private static void heapify(int[] A, int i, int size) {
        int left = LEFT(i);
        int right = RIGHT(i);
        int largest = i;
        if (left < size && A[left] > A[i]) {
            largest = left;
        }

        if (right < size && A[right] > A[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(A, i, largest);
            heapify(A, largest, size);
        }
    }

    public static int pop(int[] A, int size) {
        if (size <= 0) {
            return -1;
        }
        int top = A[0];
        A[0] = A[size - 1];
        heapify(A, 0, size - 1);

        return top;
    }

    public static void heapsort(int[] A) {
        int n = A.length;
        int i = (n - 2) / 2;
        while (i >= 0) {
            heapify(A, i--, n);
        }
        while (n > 0) {
            A[n - 1] = pop(A, n);
            n--;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов в списке: ");
        int size = input.nextInt();
        final int[] A = new int[size];
        Random rnd = new Random();
        System.out.println("Произвольный список: ");
        for (int i = 0; i < size; i++) {
            A[i] = rnd.nextInt(101);

            System.out.print(A[i] + " ");
        }
        heapsort(A);
        System.out.println();
        System.out.println(Arrays.toString(A));
    }
}
