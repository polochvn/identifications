package main.number;

import java.util.Scanner;

/**
 * IdentificationNumber
 *
 * @author Vladimir Polochanin
 */

public class IdentificationNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");
        while (!sc.hasNextInt() && sc.hasNext()) {
            System.out.println("Ошибка ввода: " + sc.next());
        }
        int input = sc.nextInt();

        if (input > 7) {
            System.out.println("Привет");
        }
    }
}
