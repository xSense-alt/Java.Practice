package Practice3;

import java.util.Scanner;

public class practice3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Номер завдання: ");
        int task = scanner.nextInt();
        scanner.nextLine();
        // Завдання 1
        if (task == 1) {
            System.out.print("Введіть ім'я: ");
            String name = scanner.nextLine();
            System.out.print("Введіть прізвище: ");
            String surname = scanner.nextLine();
            System.out.print("Введіть вік: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Введіть місто: ");
            String city = scanner.nextLine();
        }

        //Завдання 2
        if (task == 2) {

            {
                System.out.println();
                System.out.println("Введіть перше число: ");
                int first = scanner.nextInt();
                System.out.println("Введіть друге число: ");
                int second = scanner.nextInt();
                System.out.println("Сума: " + (first + second));
                System.out.println("Різниця: " + (first - second));
                System.out.println("Добуток: " + (first * second));
                System.out.println("Остача від ділення: " + (first % second));
            }
        }
        // Завдання 3
        if (task == 3) {

            System.out.println();
            System.out.println("Введіть суму в гривнях (UAH): ");
            double uah = scanner.nextDouble();
            System.out.println("Введіть курс USD: ");
            double usd = scanner.nextDouble();
            System.out.printf("Сума до видачі: %.2f USD%n", uah / usd);

        }

        // Завдання 4
        if (task == 4) {
            System.out.print("Введіть номер квитка: ");
            int studentId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Введіть повне ім'я студента: ");
            String fullName = scanner.nextLine();
            System.out.print("Введіть спеціальність: ");
            String specName = scanner.nextLine();
            System.out.println("Студент: " + fullName + ", " + "квиток №" + studentId + ", " + "спеціальність: " + specName);
        }

        // Завдання 5
        if (task == 5) {
            System.out.println("Ваша вага (кг): ");
            double weight = scanner.nextDouble();
            System.out.println("Ваш зріст (м): ");
            double height = scanner.nextDouble();
            double bmi = weight / (height * height);
            System.out.printf("Розрахований BMI: %.2f%n", bmi);
        }

        // Завдання 6
        if (task == 6) {
            System.out.println("Введіть символ: ");
            char letter = scanner.next().charAt(0);
            System.out.println("Символ: " + letter + " | Код символу: " + (int) letter);
        }

        //Завдання 7
        if (task == 7) {
            System.out.println("Катет А: ");
            double a = scanner.nextDouble();
            System.out.println("Катет В: ");
            double b = scanner.nextDouble();
            double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            double perimeter = a + b + c;
            double area = (a * b) / 2;

            System.out.println("Гіпотенуза: " + c);
            System.out.println("Периметр: " + perimeter);
            System.out.println("Площа: " + area);
        }

        //Завдання 8
        if (task == 8) {
            System.out.println("Товар: ");
            String obj = scanner.nextLine();
            System.out.println("Ціна: ");
            double price = scanner.nextDouble();
            System.out.println("Кількість: ");
            int count = scanner.nextInt();
            double total = price * count;
            double vat = (total * 0.20);
            System.out.println("Загальна сума: " + total + " грн " + "(з них ПДВ 20%: " + vat);
        }

        //Завдання 9
        if (task == 9) {
            System.out.println("Введіть число: ");
            int number = scanner.nextInt();
            if (number > 0) {
                System.out.println("Число додатне");
            } else if (number < 0) {
                System.out.println("Число від'ємне");
            } else {
                System.out.println("Число дорівнює нулю");
            }
        }

        //Завдання 10
        if (task == 10) {
            System.out.println("Введіть число: ");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("Число " + number + " є парним");
            } else {
                System.out.println("Число непарне");
            }
        }

        //Завдання 11
        if (task == 11) {
            System.out.println("Введіть ваш вік: ");
            int age = scanner.nextInt();
            if (age < 0 || age > 120) {
                System.out.println("Некоректний вік");
            } else if (age >= 0 && age <= 12) {
                System.out.println("Дитина");
            } else if (age >= 13 && age <= 17) {
                System.out.println("Підліток");
            } else if (age >= 18 && age <= 64) {
                System.out.println("Дорослий");
            } else {
                System.out.println("Пенсіонер");
            }
        }

        //Завдання 12
        if (task == 12) {
            System.out.println("Введіть бал: ");
            int rate = scanner.nextInt();
            if (rate >= 0 && rate <= 59) {
                System.out.println("Незадовільно (F)");
            } else if (rate >= 60 && rate <= 63) {
                System.out.println("Достатньо (E)");
            } else if (rate >= 64 && rate <= 73) {
                System.out.println("Задовільно (D)");
            } else if (rate >= 74 && rate <= 81) {
                System.out.println("Добре (С)");
            } else if (rate >= 82 && rate <= 89) {
                System.out.println("Дуже добре (В)");
            } else if (rate >= 90 && rate <= 100) {
                System.out.println("Відмінно (А)");
            } else {
                System.out.println("\"Помилка: некоректний бал!\"");
            }
        }

        //Завдання 13
        if (task == 13) {

            // Завдання 13
            if (task == 13) {
                System.out.print("Введіть перше число: ");
                int a = scanner.nextInt();
                System.out.print("Введіть друге число: ");
                int b = scanner.nextInt();
                System.out.print("Введіть третє число: ");
                int c = scanner.nextInt();
                int max = a;
                int min = a;
                if (b > max) {
                    max = b;
                }
                if (c > max) {
                    max = c;
                }
                if (b < min) {
                    min = b;
                }
                if (c < min) {
                    min = c;
                }
                System.out.println("Максимум: " + max);
                System.out.println("Мінімум: " + min);
            }
        }

        //Завдання 14
        if (task == 14) {
            System.out.println("Введіть Х: ");
            double x = scanner.nextDouble();
            System.out.println("Введіть Y: ");
            double y = scanner.nextDouble();
            if (x == 0 && y == 0) {
                System.out.println("Точка знаходиться в початку координат");
            } else if (x == 0) {
                System.out.println("Точка знаходиться на осі Y");
            } else if (y == 0) {
                System.out.println("Точка знаходиться на осі X");
            } else if (x > 0 && y > 0) {
                System.out.println("Точка (" + x + "; " + y + ") знаходиться у I чверті");
            } else if (x < 0 && y > 0) {
                System.out.println("Точка (" + x + "; " + y + ") знаходиться у II чверті");
            } else if (x < 0 && y < 0) {
                System.out.println("Точка (" + x + "; " + y + ") знаходиться у III чверті");
            } else {
                System.out.println("Точка (" + x + "; " + y + ") знаходиться у IV чверті");
            } //Це завдання я не зміг виконати сам, тому для написання умов if-else скористався ШІ
        }

        //Завдання 15
        if (task == 15) {
            //Варіант без дужок
            int x = 5;
            int y = 20;
            if (x > 10)
                if (y > 10)
                    System.out.println("Обидві умови виконані");
                else
                    System.out.println("Внутрішня умова не виконана");
            //Варіант з дужками
            if (x > 10) {
                if (y > 10) {
                    System.out.println("Обидві умови виконані");
                }
            } else {
                System.out.println("Зовнішня умова не виконана");
            }
        }

        //Завдання 16
        if (task == 16) {
            System.out.println("Введіть обсяг спожитої  електроенеергії (кВт год.): ");
            double energy = scanner.nextDouble();
            double total;
            if (energy < 0) {
                System.out.println("Помилка: некоректне значення!");
            } else if (energy <= 100) {
                total = (energy * 2.64);
                System.out.println("Сума до сплати: " + total + " грн");
            } else {
                total = 100 * 2.64 + (energy - 100) * 4.32;
                System.out.println("Сума до сплати: " + total + " грн");
            }
        }//Завдання 17
        if (task == 17) {
            System.out.println("Введіть перше число: ");
            int x = scanner.nextInt();
            System.out.println("Введіть друге число: ");
            int y = scanner.nextInt();
            int max = (x > y) ? x : y;
            System.out.println("Більше число: " + max);
        }

        //Завдання 18
        if (task == 18) {
            System.out.println("Введіть число: ");
            int n = scanner.nextInt();
            int abs = (n < 0) ? -n : n;
            System.out.println("Абсолютне значення: " + abs);

        }

        //Завдання 19
        if (task == 19) {
            System.out.println("Введіть число: ");
            int number = scanner.nextInt();
            String result = (number % 2 == 0) ? "Парне" : "Непарне";
            System.out.println("Результат: " + result);
        }

        //Завдання 20
        if (task == 20) {
            System.out.println("Введіть бал: ");
            int rate = scanner.nextInt();
            System.out.println("Результат: " + ((rate >= 60 ) ? "Зараховано" : "Незараховано"));

        }

        //Завдання 21
        if (task == 21) {
            System.out.println("Напишіть число:");
            int n = scanner.nextInt();
            String status = (n > 0) ? "Додатне" : (n < 0) ? "Від'ємне" : "Нуль";
            System.out.println("Результат: " + status);

        }

        //Завдання 22
        if (task == 22) {
            System.out.println("Сума покупки: ");
            double cost = scanner.nextDouble();
            double total = (cost > 1000) ? cost * 0.90 : cost * 0.98;
            System.out.println("До сплати зі знижкою: " + total + " грн");
        }

        //Завдання 23
        if (task == 23) {
            System.out.print("Введіть перше число: ");
            int a = scanner.nextInt();
            System.out.print("Введіть друге число: ");
            int b = scanner.nextInt();
            String result = (b != 0)
                    ? String.valueOf((double) a / b)
                    : "Помилка: ділення на нуль неможливе!";
            System.out.println("Результат: " + result);
        }

        //Завдання 24
        if (task == 24) {
            System.out.print("Введіть кількість знайдених помилок: ");
            int count = scanner.nextInt();

            String result = (count == 1)
                    ? "Знайдено 1 помилку"
                    : "Знайдено " + count + " помилок";
            System.out.println(result);

        }

        //Завдання 25
        if (task == 25) {
            int x = 10;
            int divisor = 0;
            if (divisor != 0 && (x / divisor > 1)) {
                System.out.println("Успішне ділення");
            } else {
                System.out.println("Ділення безпечно пропущено завдяки short-circuit!");
                //Так як divisor дорівнює нулю, перша умова є false
                //Через символ && ділення на нуль не виконується
                //і помилка ArithmeticException не виникає
            }
        }

        //Завдання 26
        if (task == 26) {
            int counter1 = 0;
            int counter2 = 0;
            boolean b1 = false && (++counter1 > 0);
            boolean b2 = false & (++counter2 > 0);
            System.out.println("counter1 (&&) " + counter1);
            System.out.println("counter2 (&) " + counter2);
            //&& не виконує другу умову, якщо перша false
            //& перевіряє обидві умови, тому counter2 збільшується на 1

        }

        //Завдання 27
        if (task == 27) {
            int number = 5;
            if (number > 0 || (10 / 0 == 0)) {
                System.out.println("Умова виконана, аварійне ділення не викликалося!");

                //Символи || не перевіряє другу умову, якщо перша вже є true
                //Оскільки number > 0, ділення 10 / 0 не виконується
                //Тому програма працює без помилки ArithmeticException
            }

        }

        //Завдання 28
        if (task == 28) {
            int counterA = 0; int counterB = 0;
            boolean test1 = true || (++counterA > 0);
            boolean test2 = true | (++counterB > 0);
            System.out.println(counterA);
            System.out.println(counterB);
            //Оператор || не перевіряє другу частину якщо перша вже є true
            //А от оператор | все одно перевіряє другу частину якщо перша true
        }

        //Завдання 29
        if (task == 29) {
            System.out.println("Введіть години: ");
            int hrs = scanner.nextInt();
            System.out.println("Введіть хвилини: ");
            int min = scanner.nextInt();
            boolean isValidTime = (hrs >= 0 && hrs <= 23) && (min >= 0 && min <= 59);
            if (isValidTime) {
                System.out.printf("Час: %02d:%02d%n", hrs, min);
            } else  {
                System.out.println("Помилка: Некоректний час!");
            }
        }

        //Завдання 30
        if (task == 30) {
            System.out.println("Введіть сторону А: ");
            double a = scanner.nextDouble();
            System.out.println("Введіть сторону В: ");
            double b = scanner.nextDouble();
            System.out.println("Введіть сторону C: ");
            double c = scanner.nextDouble();

            boolean triangle = (a + b > c) && (a + c > b) && (b + c > a);
            System.out.println("Трикутник існує: " + triangle);


        }

        //Завдання 31
        if (task == 31) {

        }















    scanner.close();
    }


}