package Practice2;

public class Practice2 {
    public static void main(String[] args) {

        // Завдання 1
        {
            System.out.println("\n========== Завдання 1 ==========");

            int age = 17;
            double height = 1.78;
            char firstLetter = 'S';
            boolean isStudent = true;

            System.out.println(age);
            System.out.println(height);
            System.out.println(firstLetter);
            System.out.println(isStudent);


        }

        // Завдання 2
        {
            System.out.println("\n========== Завдання 2 ==========");

            byte temperature = -15;
            short currentYear = 2026;
            int cityPopulation = 1200000;
            long worldPopulation = 8100000000L;

            System.out.println(temperature);
            System.out.println(currentYear);
            System.out.println(cityPopulation);
            System.out.println(worldPopulation);

        }

        // Завдання 3
        {
            System.out.println("\n========== Завдання 3 ==========");

            float floatValue = 1.1234567f;
            double doubleValue = 1.123456789012345;
            System.out.println(floatValue);
            System.out.println(doubleValue);

        }

        // Завдання 4
        {
            System.out.println("\n========== Завдання 4 ==========");

            char symbol1 = 'J';
            char symbol2 = 74;
            char symbol3 = '\u004A';

            System.out.println(symbol1);
            System.out.println(symbol2);
            System.out.println(symbol3);


        }

        // Завдання 5
        {
            System.out.println("\n========== Завдання 5 ==========");

            boolean isJavaFun = true;
            boolean isFishFly = false;
            boolean isSkyBlue = true;

            System.out.println(isJavaFun);
            System.out.println(isFishFly);
            System.out.println(isSkyBlue);

        }

        // Завдання 6
        {
            System.out.println("\n========== Завдання 6 ==========");

            final double GRAVITY = 9.81;
            //GRAVITY = 10;
            final int DAYS_IN_WEEK = 7;
            final String UNIVERSITY_NAME = "Львівська Політехніка";

            System.out.println(GRAVITY);
            System.out.println(DAYS_IN_WEEK);
            System.out.println(UNIVERSITY_NAME);
            //Якщо ми запишемо GRAVITY = 10 то Java напише помилку.
            //Ми вже не можемо змінювати константу final double GRAVITY = 9.81
            //Бо тут грає роль саме «final». Воно фіксує нашу константу final
            //І не дає їй змінитись навіть якщо ми пишемо потім інше значення даючи на це помилку


        }

        // Завдання 7
        {
            System.out.println("\n========== Завдання 7 ==========");

            int intVal = 250;
            double doubleVal = intVal;

            System.out.println(intVal);
            System.out.println(doubleVal);

        }

        // Завдання 8
        {
            System.out.println("\n========== Завдання 8 ==========");

            double priceWithPennies = 49.99;
            int roundedPrice = (int) priceWithPennies;
            System.out.println(roundedPrice);

        }

        // Завдання 9
        {
            System.out.println("\n========== Завдання 9 ==========");

            int firstNumber = 5;
            double userWeight = 72.5;
            String userCity = "Kyiv";
            boolean isValidUser = true;
            System.out.print(firstNumber + "," + userWeight + "," + userCity + "," + isValidUser);

        }

        // Завдання 10
        {
            System.out.println("\n========== Завдання 10 ==========");

            String firstName = "Тарас";
            String lastName = "Шевченко";
            int age = 47;
            System.out.println("Мене звати " + firstName + " " + lastName + " мені " + age + " років.");



        }

        // Завдання 11
        {
            System.out.println("\n========== Завдання 11 ==========");

            int a = 10;
            int b = 20;
            System.out.println("Сума без дужок: " + a + b);
            System.out.println("Сума з дужками: " + (a + b));
            // У сумі без дужок вийшло 1020, тому що Java спочатку з'єднала текст із числом 10, а потім додала 20
            // Тобто числа не додалися, а просто стали поруч.
            // У сумі з дужками вийшло 30, тому що Java спочатку порахувала вираз (a + b), а потім
            // з'єднала отриманий результат із текстом.

        }

        // Завдання 12
        {
            System.out.println("\n========== Завдання 12 ==========");

            String login = "ivan.petrenko";
            String domain = "gmail.com";
            String role = "student";
            System.out.println("Користувач " + login + " (роль: " + role + ") " + "має пошту: " + login + "@" + domain);

        }

        // Завдання 13
        {
            System.out.println("\n========== Завдання 13 ==========");

            String productName = "Ноутбук";
            int quantity = 2;
            double pricePerUnit = 24500.50;
            System.out.println("ЧЕК:\nТовар: " + productName + "\nКількість: " + quantity + "\nЦіна: " + pricePerUnit);

        }

        // Завдання 14
        {
            System.out.println("\n========== Завдання 14 ==========");

            String currency = "UAH";
            int hryvnias = 1500;
            int kopecks = 75;
            System.out.println("Поточний баланс: " + hryvnias + "." + kopecks + " " + currency);

        }

        // Завдання 15
        {
            System.out.println("\n========== Завдання 15 ==========");

            String protocol = "https://";
            String host = "api.example.com";
            String endpoint = "/users";
            String userId = "42";
            System.out.print("Запит відправлено на: " + protocol + host + endpoint + userId);

        }

        // Завдання 16
        {
            System.out.println("\n========== Завдання 16 ==========");

            String language = "Java";
            int level = 1;
            boolean isReady = true;
            System.out.println("Мова: " + language + " | " + "Рівень: " + level + " | " + "Готовність до практики: " +isReady );

        }

        // Завдання 17
        {
            System.out.println("\n========== Завдання 17 ==========");

            int number = 19;
            int remainder = number % 2;
            System.out.println("Число " + number + " при діленні на 2 дає остачу: " + remainder );

        }

        // Завдання 18
        {
            System.out.println("\n========== Завдання 18 ==========");

            int totalSeconds = 385;
            int minutes = totalSeconds / 60;
            int seconds = totalSeconds % 60;
            System.out.println("385 секунд + " + minutes + " хв " + seconds + " сек");


        }

        // Завдання 19
        {
            System.out.println("\n========== Завдання 19 ==========");

            int n = 47;
            int tens =  n / 10;
            int units =  n % 10;
            int p = (tens + units);
            System.out.println("Число: " + n + "." + " Десятки: " + tens + "," + " Одиниці: " + units + "." + " Сума цифр: " + p );

        }

        // Завдання 20
        {
            System.out.println("\n========== Завдання 20 ==========");

            int score = 100;
            int sc1 = score += 50;
            int sc2 = score -= 20;
            int sc3 = score *= 2;
            int sc4 = score /= 4;
            System.out.println("Після додавання: " + sc1 + "\nПісля віднімання: " + sc2 + "\nПісля множення: " + sc3 + "\nПісля ділення: " + sc4);

        }

        // Завдання 21
        {
            System.out.println("\n========== Завдання 21 ==========");

            int counter = 5;
            System.out.println(counter++);
            System.out.println(counter);
            // Спочатку вивелося 5, тому що оператор counter++
            // спочатку використовує поточне значення змінної
            // а вже після цього збільшує його на 1
            // Тому при наступному виведенні ми отримали 6.


        }

        // Завдання 22
        {
            System.out.println("\n========== Завдання 22 ==========");

            int counter = 5;
            System.out.println(++counter);
            System.out.println(counter);
            // На відміну від counter++ оператор ++counter
            // спочатку збільшує значення змінної на 1
            // а вже потім виводить його
            // Тому в консолі одразу отримуємо 6 а не 5

        }

        // Завдання 23
        {
            System.out.println("\n========== Завдання 23 ==========");

            int grade1 = 4; int grade2 = 5; int grade3 = 4;
            double average = (grade1 + grade2 + grade3) / 3.0;
            System.out.println("Середній бал: " + average);

        }

        // Завдання 24
        {
            System.out.println("\n========== Завдання 24 ==========");

            double celsius = 25.0;
            double farengeit = (celsius*1.8+32);
            double calvin = (celsius + 273.15);
            System.out.println(celsius + " С" + " = " + farengeit + " F");
            System.out.println(celsius + " С" + " = " + calvin + " К");

        }

        // Завдання 25
        {
            System.out.println("\n========== Завдання 25 ==========");

            int userAge = 17;
            boolean isAdult = userAge >= 18;
            System.out.println("Вік: " + userAge + ". " + "Чи є повнолітнім: " + isAdult);

        }

        // Завдання 26
        {
            System.out.println("\n========== Завдання 26 ==========");

            int x = 15; int y = 20;
            System.out.println("x == y: " + (x == y));
            System.out.println("x != y: " + (x != y));
            System.out.println("x > y: " + (x > y));

        }

        // Завдання 27
        {
            System.out.println("\n========== Завдання 27 ==========");

            int speed = 75;
            boolean isSafeSpeed = (speed >= 20) && (speed <= 80);
            System.out.println(isSafeSpeed);

        }

        // Завдання 28
        {
            System.out.println("\n========== Завдання 28 ==========");

            int personAge = 70;
            boolean hasFreePass = (personAge < 7) || (personAge >= 65);
            System.out.println("Вік: " + personAge + "." + "Право на безкоштовний рооїзд: " + hasFreePass);

        }

        // Завдання 29
        {
            System.out.println("\n========== Завдання 29 ==========");

            boolean isDoorLocked = true;
            boolean canEnter = !isDoorLocked;
            System.out.println("Двері зачинені: " + isDoorLocked);
            System.out.println("Чи можна увійти: " + canEnter);

        }

        // Завдання 30
        {
            System.out.println("\n========== Завдання 30 ==========");

            int number = 30;
            int number1 = 25;
            boolean isDivisibleByBoth = (number % 3 == 0) && (number % 5 == 0);
            boolean isDivisibleByBoth1 = (number1 % 3 == 0) && (number1 % 5 == 0);
            System.out.println(isDivisibleByBoth);
            System.out.println(isDivisibleByBoth1);

        }

        // Завдання 31
        {
            System.out.println("\n========== Завдання 31 ==========");

            boolean hasPassword = true;
            boolean hasSmsCode = true;
            boolean isAccountBlocked = false;
            boolean canLogin = hasPassword && hasSmsCode && !isAccountBlocked;
            System.out.println("Користувач може увійти, якщо в нього є пароль, є смс-код І його акаунт НЕ заблоковано: " + canLogin);

        }

        // Завдання 32
        {
            System.out.println("\n========== Завдання 32 ==========");

            int year = 2024;
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            System.out.println(isLeapYear);

        }

        // Завдання 33
        {
            System.out.println("\n========== Завдання 33 ==========");

            double a = 3.0; double b = 4.0;
            double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            System.out.println("Катети: " + a + " та " + b + ". " + "Гіпотенуза: " + c);


        }

        // Завдання 34
        {
            System.out.println("\n========== Завдання 34 ==========");

            double radius = 5.0;
            double length = 2 * Math.PI * radius;
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println("Радіус: " + radius);
            System.out.println("Довжина кола: " + length);
            System.out.println("Площа круга: " + area);

        }

        // Завдання 35
        {
            System.out.println("\n========== Завдання 35 ==========");

            double dayTemp = 18.5;
            double nightTemp = -3.2;

            double difference = Math.abs(dayTemp - nightTemp);
            double maxTemp = Math.max(dayTemp, nightTemp);
            double minTemp = Math.min(dayTemp, nightTemp);

            System.out.println("Перепад температури: " + difference);
            System.out.println("Максимальна температура: " + maxTemp);
            System.out.println("Мінімальна температура: " + minTemp);

        }

        // Завдання 36
        {
            System.out.println("\n========== Завдання 36 ==========");

            double num = 5.67;

            System.out.println("Додатне число: " + num);
            System.out.println("Math.round: " + Math.round(num));
            System.out.println("Math.ceil: " + Math.ceil(num));
            System.out.println("Math.floor: " + Math.floor(num));

            double negNum = -5.67;

            System.out.println("\nВід'ємне число: " + negNum);
            System.out.println("Math.round: " + Math.round(negNum));
            System.out.println("Math.ceil: " + Math.ceil(negNum));
            System.out.println("Math.floor: " + Math.floor(negNum));

        }

        // Завдання 37
        {
            System.out.println("\n========== Завдання 37 ==========");

            double a = 1.0;
            double b = -7.0;
            double c = 10.0;

            double d = Math.pow(b, 2) - 4 * a * c;

            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Дискримінант D = " + d);
            System.out.println("Корінь x1 = " + x1);
            System.out.println("Корінь x2 = " + x2);

        }

        // Завдання 38
        {
            System.out.println("\n========== Завдання 38 ==========");

            int dice = (int) (Math.random() * 6) + 1;

            System.out.println("Випало на кубику: " + dice);

        }

        // Завдання 39
        {
            System.out.println("\n========== Завдання 39 ==========");

            int min = -10;
            int max = 35;

            int randomTemp = (int) (Math.random() * (max - min + 1)) + min;

            System.out.println("Погода на завтра: " + randomTemp + "°C");

        }

        // Завдання 40
        {
            System.out.println("\n========== Завдання 40 ==========");

            double p = 10000.0;
            double r = 12.0;
            int t = 3;

            double total = p * Math.pow(1 + r / 100, t);
            double profit = total - p;

            System.out.println("+------------------------------------+");
            System.out.println("|       ДЕПОЗИТНИЙ КАЛЬКУЛЯТОР       |");
            System.out.println("+------------------------------------+");
            System.out.println("Початкова сума: " + p + " грн");
            System.out.println("Термін: " + t + " роки під " + r + "% річних");
            System.out.printf("Підсумкова сума: %.2f грн%n", total);
            System.out.printf("Чистий прибуток: %.2f грн%n", profit);
            System.out.println("+------------------------------------+");

        }
    }
}
