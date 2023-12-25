package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Translate dict = new Translate();
        Scanner scanner = new Scanner(System.in);
        int choese = scanner.nextInt();
        System.out.println("Выберите действие :" +
                "1. Добавить слово в словарь" +
                "2. Поиск слова на английском");
        String english = scanner.nextLine();
        String russian = scanner.nextLine();

        do {
            switch (choese){
                case 1:
                    System.out.println("Введите слово на английском и русском");
                    dict.addTrans(english, russian);
                    break;

                case 2:
                    System.out.println("Введите слово для поиска");

                    System.out.println("Ваше искаймое слово" + dict.findTrans()); //не работает
            }

        } while (choese!= 0);


        dict.addTrans(english, russian);




    }
}
