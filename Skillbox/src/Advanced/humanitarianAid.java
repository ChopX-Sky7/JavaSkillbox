package Advanced;

import java.util.Scanner;

public class humanitarianAid {
    private static Scanner in = new Scanner(System.in);
    private static int countTrucks;
    private static int countContainers;
    private static int countBox;

    private static String line = "__________\n";

    public static void main(String[] args) {
        //TODO: реализовать цикловое выполнение этой же программы
        System.out.println("Введите кол-во ящиков");
        countBox = in.nextInt();
        if (countBox % 27 == 0) {
            countContainers = countBox / 27;
            System.out.printf("Нужно %d контейнеров \n", countContainers);
            System.out.print(line);
        } else {
            countContainers = countBox /27;
            System.out.printf("%d контейнеров заполнено полностью\n", countContainers);
            countContainers++;
            int tempo = countBox % 27;
            System.out.printf("1 контейнер содержит в себе %d ящиков из 27 \n", tempo);
            System.out.print(line);
        }

        if (countContainers % 12 == 0){
            countTrucks = countContainers / 12;
            System.out.printf("Нужно %d грузовиков \n", countTrucks);
            System.out.print(line);
        }else {
            countTrucks = countContainers / 12;
            System.out.printf("%d грузовиков загружено полностью\n", countTrucks);
            int tempo = countContainers / 12;
            System.out.printf("1 грузовик содержиит в себе %d контейнеров из 12\n", tempo);
            System.out.print(line);
        }

    }
}
