package Practice3;

import java.util.Scanner;

public class Homework3_Task_1_2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        //Завдання 1
        System.out.println("=== КАЛЬКУЛЯТОР ПОЇЗДКИ ТА ПАЛЬНОГО ===");
        System.out.print("Введіть відстань поїздки (км): ");
        double distance = scanner.nextDouble();
        System.out.print("Введіть витрату пального на 100 км (л): ");
        double fuelConsumption = scanner.nextDouble();
        if (distance <= 0 || fuelConsumption <= 0) {
            System.out.println("Помилка: значення повинні бути більшими за 0!");
            scanner.close();
            return;
        }

        System.out.print("Тип пального (1 - А-95, 2 - Дизель, 3 - Газ): ");
        int fuelType = scanner.nextInt();
        double pricePerLiter;
        String fuelName;
        switch (fuelType) {
            case 1 -> {
                pricePerLiter = 56.50;
                fuelName = "Бензин А-95";
            }
            case 2 -> {
                pricePerLiter = 52.80;
                fuelName = "Дизель";
            }
            case 3 -> {
                pricePerLiter = 29.40;
                fuelName = "Газ";
            }
            default -> {
                System.out.println("Помилка: невідомий тип пального!");
                scanner.close();
                return;
            }
        }

        double neededFuel = distance * fuelConsumption / 100.0;
        double baseCost = neededFuel * pricePerLiter;
        double finalCost = baseCost >= 2000.0 ? baseCost * 0.95 : baseCost;
        double discount = baseCost - finalCost;
        System.out.println("\n------------ ЗВІТ ПОЇЗДКИ ------------");
        System.out.println("Обране пальне: " + fuelName);
        System.out.printf("Ціна за літр: %.2f грн%n", pricePerLiter);
        System.out.printf("Необхідно пального: %.2f л%n", neededFuel);
        System.out.printf("Базова вартість: %.2f грн%n", baseCost);
        System.out.printf("Знижка: %.2f грн%n", discount);
        System.out.printf("До сплати: %.2f грн%n", finalCost);
        System.out.println("--------------------------------------");



        //Завдання 2
        System.out.println("=== КАЛЬКУЛЯТОР ДОСТАВКИ ===");
        System.out.print("Введіть вагу посилки (кг): ");
        double weight = scanner.nextDouble();
        System.out.print("Введіть відстань доставки (км): ");
        int distance2 = scanner.nextInt();
        if (weight <= 0 || weight > 50) {
            System.out.println("Помилка: вага повинна бути від 0 до 50 кг!");
        }
        scanner.close();
    }
}
