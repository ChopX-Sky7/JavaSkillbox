import java.util.*;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.print("Добро пожаловать в таблицу Шульте! \nВведите длину стороны таблицы. Значение не должно превышать 1000 \n");

        try {
            int size = new Scanner(System.in).nextInt();
            if (size >= 1000) {
                System.out.println("Cлишком большое значениe!");
                return;
            }

            int dummy = 0;
            System.out.println("Генерирую таблицу...");
            while (dummy != (size * size)) {
                dummy++;
                numbers.add(dummy);
            }
            Collections.shuffle(numbers);

            int dummy2 = 0;
            while (dummy2 != (size * size)) {
                if (dummy2 % size == 0) {
                    System.out.println();
                }
                if (dummy2 < 10) {
                    System.out.print(numbers.get(dummy2) + "\t");
                }else{
                System.out.print(numbers.get(dummy2) + "\t");}
                dummy2++;
            }
        } catch (InputMismatchException ex) {
            System.out.println("Вы ввели буквенный символ! Попробуйте еще раз, но только с численными значениями");

        }
    }
}
