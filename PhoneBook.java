package DZ6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] arg) {

        Map<Integer, List<String>> phonebook = new HashMap<>();

        List<String> info1 = Arrays.asList("ФИО: Иванов Иван Иванович", "личн.: + 7 111 111 11 11",
                "раб.: + 7 222 222 22 22");
        List<String> info2 = Arrays.asList("ФИО: Сергеев Сергей Сергеевич", "личн.: + 7 333 333 33 33",
                "раб.: + 7 444 444 44 44");
        List<String> info3 = Arrays.asList("ФИО: Петров Петр Петрович", "личн.: + 7 555 555 55 55",
                "раб.: + 7 666 666 66 66");
        phonebook.put(1, info1);
        phonebook.put(2, info2);
        phonebook.put(3, info3);

        System.out.println(phonebook);

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите id человека (1/2/3) для поиска: ");
        int id = input.nextInt();

        if (id == 1) {
            System.out.println(phonebook.get(1));
        } else if (id == 2) {
            System.out.println(phonebook.get(2));
        } else if (id == 3) {
            System.out.println(phonebook.get(3));
        } else if (id >= 4) {
            System.out.println("Такого id нет в базе");
        }

    }
}

