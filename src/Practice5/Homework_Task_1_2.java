package Practice5;

import java.util.Scanner;

public class Homework_Task_1_2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String[] days = {
                "Понеділок", "Вівторок", "Середа",
                "Четвер", "П'ятниця", "Субота", "Неділя"
        };

        double[] sales = new double[7];

        System.out.println("=== ФІНАНСОВИЙ ЗВІТ КАВ'ЯРНІ ===");
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Введіть виторг за " + days[i] + " (грн): ");
            sales[i] = scanner.nextDouble();
        }

        double total = 0;
        int bestDay = 0;
        int worstDay = 0;

        for (int i = 0; i < sales.length; i++) {
            total += sales[i];

            if (sales[i] > sales[bestDay]) {
                bestDay = i;
            }

            if (sales[i] < sales[worstDay]) {
                worstDay = i;
            }
        }

        double average = total / sales.length;

        System.out.println("\n--------- ПІДСУМКИ ---------");
        System.out.printf("Загальний виторг: %.2f грн%n", total);
        System.out.printf("Середній виторг: %.2f грн%n", average);
        System.out.println("Найкращий день: " + days[bestDay]
                + " (" + sales[bestDay] + " грн)");
        System.out.println("Найгірший день: " + days[worstDay]
                + " (" + sales[worstDay] + " грн)");

        System.out.println("\nДні з виторгом вище середнього:");
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                System.out.printf("%s: %.2f грн%n", days[i], sales[i]);
            }


        }

        String[] items = {
                "Ноутбук",
                "Смартфон",
                "Бездротові навушники",
                "Механічна клавіатура",
                "Монітор 27\""
        };

        int[] quantities = {8, 3, 25, 4, 12};

        double[] prices = {
                28500.0, 19200.0, 1850.0, 3100.0, 9400.0
        };

        double[] totalValues = new double[items.length];

        double totalWarehouseValue = 0;
        int mostExpensiveStock = 0;

        System.out.println("=== ЗВІТ СКЛАДУ ЕЛЕКТРОНІКИ ===");

        System.out.printf("%-3s %-25s %-10s %-15s %-15s%n",
                "№", "Товар", "Кількість", "Ціна", "Вартість");

        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < items.length; i++) {
            totalValues[i] = quantities[i] * prices[i];
            totalWarehouseValue += totalValues[i];

            if (totalValues[i] > totalValues[mostExpensiveStock]) {
                mostExpensiveStock = i;
            }

            System.out.printf("%-3d %-25s %-10d %-15.2f %-15.2f%n",
                    i + 1,
                    items[i],
                    quantities[i],
                    prices[i],
                    totalValues[i]);
        }

        System.out.println("--------------------------------------------------------------------------");

        System.out.printf("Загальна вартість складу: %.2f грн%n",
                totalWarehouseValue);

        System.out.println("Найбільший капітал у товарі: "
                + items[mostExpensiveStock]
                + " (" + totalValues[mostExpensiveStock] + " грн)");

        System.out.println("\nДЕФІЦИТНІ ТОВАРИ (менше 5 шт.):");

        for (int i = 0; i < items.length; i++) {
            if (quantities[i] < 5) {
                System.out.println(items[i]
                        + " (залишилось: " + quantities[i] + " шт.)"
                        + " - УВАГА: Терміново замовити постачальнику!");
            }
        }
}}