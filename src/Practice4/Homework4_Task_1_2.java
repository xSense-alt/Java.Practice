package Practice4;

import java.util.Scanner;

public class Homework4_Task_1_2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        //Завдання 1
        int n;
        do {
            System.out.print("Введіть число N: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Помилка: N має бути більшим за 0!");
            }
        } while (n <= 0);
        long totalSum = 0;
        long evenSum = 0;
        long oddSum = 0;
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 1; i <= n; i++) {
            totalSum += i;

            if (i % 2 == 0) {
                evenSum += i;
                evenCount++;
            } else {
                oddSum += i;
                oddCount++;
            }
        }
        double average = (double) totalSum / n;
        System.out.println("\n--- РЕЗУЛЬТАТИ ---");
        System.out.println("Загальна сума: " + totalSum);
        System.out.println("Сума парних: " + evenSum);
        System.out.println("Кількість парних: " + evenCount);
        System.out.println("Сума непарних: " + oddSum);
        System.out.println("Кількість непарних: " + oddCount);
        System.out.printf("Середнє арифметичне: %.2f%n", average);
        System.out.println();


        //Завдання 2
        System.out.print("Введіть додатне ціле число: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Помилка: число має бути додатним!");
            scanner.close();
            return;
        }
        int originalNumber = number;
        int temp = number;
        int digitCount = 0;
        int digitSum = 0;
        int maxDigit = 0;
        long reversedNumber = 0;

        while (temp > 0) {
            int digit = temp % 10;

            digitCount++;
            digitSum += digit;

            if (digit > maxDigit) {
                maxDigit = digit;
            }

            reversedNumber = reversedNumber * 10 + digit;
            temp /= 10;
        }
        System.out.println("\n--- СТАТИСТИКА ЧИСЛА ---");
        System.out.println("Початкове число: " + originalNumber);
        System.out.println("Кількість цифр: " + digitCount);
        System.out.println("Сума цифр: " + digitSum);
        System.out.println("Найбільша цифра: " + maxDigit);
        System.out.println("Перевернуте число: " + reversedNumber);

        if (originalNumber == reversedNumber) {
            System.out.println("Це число є паліндромом!");
        } else {
            System.out.println("Це звичайне число (не паліндром).");
        }
        scanner.close();

    }
}
