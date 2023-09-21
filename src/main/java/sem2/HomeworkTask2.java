package sem2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class HomeworkTask2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("====== Задача № 2 ======");

        try {
            System.out.print("Введите первое целое число: ");
            int a = sc.nextInt();
            System.out.print("Введите второе целое число: ");
            int b = sc.nextInt();
            divide(a, b);
        } catch (InputMismatchException e1) {
            System.out.println("Ошибка: Некорректный ввод. Вводите целые числа!");
        } catch (DivisionByZeroException e2) {
            System.out.println(e2.getMessage());
        } catch (NoSuchElementException e3) {
            System.out.println("Ошибка: Ввод не был предоставлен. Программа завершена.");
        } finally {
            sc.nextLine();
        }
        System.out.println();
    }

    static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }

    public static void divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо!");
        } else {
            System.out.println(a / b);
        }
    }
}