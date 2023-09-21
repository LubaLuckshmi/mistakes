package sem2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeworkTask3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("====== Задача № 3 ======");
        try {
            System.out.print("Введите первое целое число: ");
            int a = sc.nextInt();
            System.out.print("Введите второе целое число: ");
            int b = sc.nextInt();
            System.out.print("Введите третье целое число: ");
            int c = sc.nextInt();
            checkNumbers(a, b, c);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: некорректный ввод. Вводите целые числа!");
        } catch (DivisionByZeroException | NumberSumException | NumberOutOfRangeException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
    public static void checkNumbers(int a, int b, int c) throws NumberOutOfRangeException,
            NumberSumException, DivisionByZeroException {
        if (a > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        } else if (b < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        } else if ((a + b) < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        } else if (c == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        } else {
            System.out.println("Проверка пройдена успешно!");
        }
    }

   static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }

    static class NumberOutOfRangeException extends Exception {
        public NumberOutOfRangeException(String message) {
            super(message);
        }
    }

    static class NumberSumException extends Exception {
        public NumberSumException(String message) {
            super(message);
        }
    }
}
