package main.name;

import java.util.Scanner;

/**
 * IdentificationName
 *
 * @author Vladimir Polochanin
 */

public class IdentificationName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя ");
        while (sc.hasNext()) {
            String input = sc.next();

            if (input.equals("Вячеслав")) {
                System.out.println("Привет, Вячеслав");
                break;
            }
        }
    }
}
