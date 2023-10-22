package main.array;

import java.util.Random;
import java.util.Scanner;

/**
 * IdentificationArray
 *
 * @author Vladimir Polochanin
 */

public class IdentificationArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размерность массива: ");
        while (!sc.hasNextInt() && sc.hasNext()) {
            System.out.println("Ошибка ввода: " + sc.next());
        }
        Random rnd = new Random();
        int n = sc.nextInt();
        int[] mass = new int[n];
        int [] arrMultipliesOfThree = new int[n];

        for (int i = 0; i < n; i++) {
            mass[i] = rnd.nextInt();
        }

        System.out.println("Исходный массив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mass[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            if (mass[i] % 3 == 0) {
                arrMultipliesOfThree[i] = mass[i];
            }
        }

        System.out.println();
        System.out.println("Массив чисел кратных 3: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arrMultipliesOfThree[i] + " ");
        }
    }
}
