package Practice06;

import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер завдання (1-40): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Потрібно ввести число.");
            scanner.close();
            return;
        }
        int number = scanner.nextInt();
        switch (number) {
            case 1 -> Task1.run();
            case 2 -> Task2.run();
            case 3 -> Task3.run();
            case 4 -> Task4.run();
            case 5 -> Task5.run();
            case 6 -> Task6.run();
            case 7 -> Task7.run();
            case 8 -> Task8.run();
            case 9 -> Task9.run();
            case 10 -> Task10.run();
            case 11 -> Task11.run();
            case 12 -> Task12.run();
            case 13 -> Task13.run();
            case 14 -> Task14.run();
            case 15 -> Task15.run();
            case 16 -> Task16.run();
            case 17 -> Task17.run();
            case 18 -> Task18.run();
            case 19 -> Task19.run();
            case 20 -> Task20.run();
            case 21 -> Task21.run();
            case 22 -> Task22.run();
            case 23 -> Task23.run();
            case 24 -> Task24.run();
            case 25 -> Task25.run();
            case 26 -> Task26.run();
            case 27 -> Task27.run();
            case 28 -> Task28.run();
            case 29 -> Task29.run();
            case 30 -> Task30.run();
            case 31 -> Task31.run();
            case 32 -> Task32.run();
            case 33 -> Task33.run();
            case 34 -> Task34.run();
            case 35 -> Task35.run();
            case 36 -> Task36.run();
            case 37 -> Task37.run();
            case 38 -> Task38.run();
            case 39 -> Task39.run();
            case 40 -> Task40.run();
            default -> System.out.println("Такого завдання немає.");
        }
        // System.in більше не використовується після виконання завдання.
        scanner.close();
    }

    // Завдання 1
    static class Task1 {

        public String name;
        public int age;
        public double gpa;

    public static void run() {
            Task1 s1 = new Task1();
            s1.name = "Сергій";
            s1.age = 17;
            s1.gpa = 4.75;
            System.out.println(s1.name + ", " + s1.age + ", " + s1.gpa);
        }
    }

    // Завдання 2
    static class Task2 {

        String brand, model;
        int year, speed;

    public static void run() {
            Task2 car1 = new Task2();
            car1.brand = "Toyota"; car1.model = "Camry"; car1.year = 2021; car1.speed = 180;
            Task2 car2 = new Task2();
            car2.brand = "BMW"; car2.model = "M5"; car2.year = 2023; car2.speed = 250;
            System.out.println(car1.brand + " " + car1.model + ", " + car1.year + ", " + car1.speed);
            System.out.println(car2.brand + " " + car2.model + ", " + car2.year + ", " + car2.speed);
            System.out.println("Новіший автомобіль: " + (car1.year > car2.year ? car1.brand : car2.brand));
        }
    }

    // Завдання 3
    static class Task3 {

        String title, author;
        int pages;
        boolean isRead;

    public static void run() {
            Task3 emptyBook = new Task3();
            System.out.println("Назва: " + emptyBook.title);
            System.out.println("Автор: " + emptyBook.author);
            System.out.println("Сторінок: " + emptyBook.pages);
            System.out.println("Прочитано: " + emptyBook.isRead);
        }
    }

    // Завдання 4
    static class Task4 {

        double width, height;

    public static void run() {
            Task4 rectangle = new Task4();
            rectangle.width = 7.5;
            rectangle.height = 4.0;
            double area = rectangle.width * rectangle.height;
            double perimeter = 2 * (rectangle.width + rectangle.height);
            System.out.println("Площа: " + area);
            System.out.println("Периметр: " + perimeter);
        }
    }

    // Завдання 5
    static class Task5 {

        String name;
        double price;
        int quantity;

    public static void run() {
            Task5 product = new Task5();
            product.name = "Монітор";
            product.price = 6500.0;
            product.quantity = 8;
            System.out.println(product.name + ": " + (product.price * product.quantity) + " грн");
        }
    }

    // Завдання 6
    static class Task6 {

        String model;
        int batteryLevel;
        boolean isTurnedOn;

    public static void run() {
            Task6 phone = new Task6();
            phone.model = "Samsung Galaxy";
            phone.batteryLevel = 100;
            phone.isTurnedOn = true;
            phone.batteryLevel = Math.max(0, phone.batteryLevel - 35);
            if (phone.batteryLevel == 0) phone.isTurnedOn = false;
            System.out.println(phone.model + ", заряд: " + phone.batteryLevel + "%, увімкнено: " + phone.isTurnedOn);
        }
    }

    // Завдання 7
    static class Task7 {

        double x, y;

    public static void run() {
            Task7 a = new Task7();
            a.x = 0; a.y = 0;
            Task7 b = new Task7();
            b.x = 3; b.y = 4;
            double distance = Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
            System.out.println("Відстань: " + distance);
        }
    }

    // Завдання 8
    static class Task8 {
        String name;
    public static void run() {
            Task8 first = new Task8();
            first.name = "Сергій";
            Task8 second = first;
            second.name = "Артем";
            // Обидві змінні посилаються на той самий об'єкт у пам'яті.
            System.out.println(first.name);
        }
    }

    // Завдання 9
    static class Task9 {

        public void sayHello() { System.out.println("Привіт усім!"); }
        public void sayHelloTo(String name) { System.out.println("Привіт, " + name + "! Раді тебе бачити."); }

    public static void run() {
            Task9 greeter = new Task9();
            greeter.sayHello();
            greeter.sayHelloTo("Олена");
        }
    }

    // Завдання 10
    static class Task10 {

        String species, name;
        public void makeSound() { System.out.println(name + " видає звук!"); }
        public void printInfo() { System.out.println("Вид: " + species + ", кличка: " + name); }

    public static void run() {
            Task10 cat = new Task10();
            cat.species = "Кіт"; cat.name = "Барсик";
            Task10 dog = new Task10();
            dog.species = "Собака"; dog.name = "Рекс";
            cat.printInfo(); cat.makeSound();
            dog.printInfo(); dog.makeSound();
        }
    }

    // Завдання 11
    static class Task11 {

        int count;
        public void increment() { count++; }
        public void decrement() { count--; }
        public void reset() { count = 0; }
        public void printCount() { System.out.println("Лічильник: " + count); }

    public static void run() {
            Task11 counter = new Task11();
            counter.increment(); counter.increment(); counter.increment();
            counter.decrement();
            counter.printCount();
            counter.reset();
            counter.printCount();
        }
    }

    // Завдання 12
    static class Task12 {

        String currentColor;
        public void changeColor(String newColor) { currentColor = newColor; }
        public void showSignal() {
            if ("Червоний".equals(currentColor)) System.out.println("Стій!");
            else if ("Жовтий".equals(currentColor)) System.out.println("Увага!");
            else if ("Зелений".equals(currentColor)) System.out.println("Їдь!");
            else System.out.println("Невідомий сигнал");
        }

    public static void run() {
            Task12 light = new Task12();
            light.changeColor("Червоний"); light.showSignal();
            light.changeColor("Жовтий"); light.showSignal();
            light.changeColor("Зелений"); light.showSignal();
        }
    }

    // Завдання 13
    static class Task13 {

        String nickname;
        int health = 100;
        public void takeDamage(int damage) {
            if (damage <= 0) return;
            health = Math.max(0, health - damage);
            if (health == 0) System.out.println(nickname + " загинув!");
        }
        public void heal(int amount) {
            if (amount > 0) health = Math.min(100, health + amount);
        }

    public static void run() {
            Task13 player = new Task13();
            player.nickname = "USEC";
            player.takeDamage(45);
            System.out.println("Здоров'я після шкоди: " + player.health);
            player.heal(20);
            System.out.println("Після лікування: " + player.health);
            player.takeDamage(100);
        }
    }

    // Завдання 14
    static class Task14 {

        boolean isOn;
        public void turnOn() { isOn = true; }
        public void turnOff() { isOn = false; }
        public void toggle() { isOn = !isOn; }
        public void status() { System.out.println(isOn ? "Лампа світить" : "Лампа вимкнена"); }

    public static void run() {
            Task14 lamp = new Task14();
            lamp.turnOn(); lamp.status();
            lamp.toggle(); lamp.status();
            lamp.toggle(); lamp.status();
            lamp.turnOff(); lamp.status();
        }
    }

    // Завдання 15
    static class Task15 {

        int seconds;
        public void tick() { seconds++; }
        public void addSeconds(int s) { if (s > 0) seconds += s; }
        public void displayTime() { System.out.printf("%02d:%02d%n", seconds / 60, seconds % 60); }

    public static void run() {
            Task15 watch = new Task15();
            watch.tick();
            watch.addSeconds(124);
            watch.displayTime();
        }
    }

    // Завдання 16
    static class Task16 {

        String model;
        int paperCount;
        public void printDocument(String title, int pages) {
            if (pages <= 0) { System.out.println("Некоректна кількість сторінок"); return; }
            if (paperCount >= pages) {
                paperCount -= pages;
                System.out.println("Надруковано: " + title + " (" + pages + " стор.)");
            } else {
                System.out.println("Помилка: Недостатньо паперу в принтері " + model + "!");
            }
        }

    public static void run() {
            Task16 printer = new Task16();
            printer.model = "HP LaserJet";
            printer.paperCount = 12;
            printer.printDocument("Звіт", 5);
            printer.printDocument("Посібник", 10);
            System.out.println("Залишок паперу: " + printer.paperCount);
        }
    }

    // Завдання 17
    static class Task17 {

        public int add(int a, int b) { return a + b; }
        public int subtract(int a, int b) { return a - b; }
        public int multiply(int a, int b) { return a * b; }
        public double divide(int a, int b) {
            if (b == 0) { System.out.println("Ділення на нуль!"); return 0.0; }
            return (double) a / b;
        }

    public static void run() {
            Task17 calculator = new Task17();
            int sum = calculator.add(12, 4);
            int difference = calculator.subtract(12, 4);
            int product = calculator.multiply(12, 4);
            double quotient = calculator.divide(12, 4);
            System.out.println(sum + ", " + difference + ", " + product + ", " + quotient);
            calculator.divide(12, 0);
        }
    }

    // Завдання 18
    static class Task18 {

        double radius;
        public double getArea() { return Math.PI * radius * radius; }
        public double getCircumference() { return 2 * Math.PI * radius; }

    public static void run() {
            Task18 circle = new Task18();
            circle.radius = 5.0;
            System.out.println("Площа: " + circle.getArea());
            System.out.println("Довжина кола: " + circle.getCircumference());
        }
    }

    // Завдання 19
    static class Task19 {

        public double celsiusToFahrenheit(double c) { return c * 1.8 + 32; }
        public double fahrenheitToCelsius(double f) { return (f - 32) / 1.8; }

    public static void run() {
            Task19 converter = new Task19();
            double fahrenheit = converter.celsiusToFahrenheit(25);
            System.out.println("25°C = " + fahrenheit + "°F");
            System.out.println(fahrenheit + "°F = " + converter.fahrenheitToCelsius(fahrenheit) + "°C");
        }
    }

    // Завдання 20
    static class Task20 {

        public boolean isEven(int n) { return n % 2 == 0; }
        public boolean isPositive(int n) { return n > 0; }
        public boolean isPrime(int n) {
            if (n <= 1) return false;
            for (int divisor = 2; divisor <= n / divisor; divisor++) {
                if (n % divisor == 0) return false;
            }
            return true;
        }

    public static void run() {
            Task20 checker = new Task20();
            for (int number : new int[]{7, 12, -5}) {
                System.out.println(number + ": парне=" + checker.isEven(number)
                    + ", додатне=" + checker.isPositive(number)
                    + ", просте=" + checker.isPrime(number));
            }
        }
    }

    // Завдання 21
    static class Task21 {

        double usdRate = 41.5;
        public double toUSD(double uah) { return uah / usdRate; }
        public double toUAH(double usd) { return usd * usdRate; }

    public static void run() {
            Task21 exchange = new Task21();
            System.out.printf(java.util.Locale.US, "10000 грн = %.2f USD%n", exchange.toUSD(10000));
            System.out.printf(java.util.Locale.US, "100 USD = %.2f грн%n", exchange.toUAH(100));
        }
    }

    // Завдання 22
    static class Task22 {

        String name;
        double baseSalary, bonusPercentage;
        public double calculateTotalSalary() { return baseSalary * (1 + bonusPercentage / 100); }
        public double calculateTax() { return calculateTotalSalary() * 0.195; }

    public static void run() {
            Task22 employee = new Task22();
            employee.name = "Олександр";
            employee.baseSalary = 30000;
            employee.bonusPercentage = 15;
            System.out.println("Співробітник: " + employee.name);
            System.out.println("Повна зарплата: " + employee.calculateTotalSalary());
            System.out.println("Податки: " + employee.calculateTax());
        }
    }

    // Завдання 23
    static class Task23 {

        public String formatTitle(String text) { return "*** " + text.toUpperCase(java.util.Locale.ROOT) + " ***"; }
        public int countVowels(String text) {
            int count = 0;
            String vowels = "аоуеиіяюєїaeiou";
            for (char ch : text.toLowerCase(java.util.Locale.ROOT).toCharArray())
                if (vowels.indexOf(ch) >= 0) count++;
            return count;
        }

    public static void run() {
            Task23 formatter = new Task23();
            System.out.println(formatter.formatTitle("Програмування"));
            System.out.println("Голосних: " + formatter.countVowels("Програмування"));
        }
    }

    // Завдання 24
    static class Task24 {

        double a, b, c;
        public boolean isValid() {
            return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
        }
        public double getPerimeter() { return a + b + c; }
        public double getArea() {
            if (!isValid()) return 0.0;
            double p = getPerimeter() / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

    public static void run() {
            Task24 triangle = new Task24();
            triangle.a = 3; triangle.b = 4; triangle.c = 5;
            System.out.println("Існує: " + triangle.isValid());
            System.out.println("Периметр: " + triangle.getPerimeter());
            System.out.println("Площа: " + triangle.getArea());
        }
    }

    // Завдання 25
    static class Task25 {

        private String secretCode = "Pass123";
        public boolean verifyCode(String attempt) { return secretCode.equals(attempt); }

    public static void run() {
            Task25 vault = new Task25();
            // vault.secretCode = "hacked"; // Помилка компілятора: secretCode has private access
            System.out.println("Вірний код: " + vault.verifyCode("Pass123"));
            System.out.println("Хибний код: " + vault.verifyCode("hacked"));
        }
    }

    // Завдання 26
    static class Task26 {

        private String username, password;
        public void setCredentials(String u, String p) { username = u; password = p; }
        public boolean login(String enteredUser, String enteredPass) {
            return java.util.Objects.equals(username, enteredUser)
                && java.util.Objects.equals(password, enteredPass);
        }
        public void changePassword(String oldPass, String newPass) {
            if (password != null && password.equals(oldPass)) {
                password = newPass;
                System.out.println("Пароль змінено");
            } else System.out.println("Неправильний старий пароль");
        }

    public static void run() {
            Task26 user = new Task26();
            user.setCredentials("student", "java123");
            System.out.println("Вхід: " + user.login("student", "java123"));
            user.changePassword("wrong", "new123");
            user.changePassword("java123", "new123");
            System.out.println("Вхід із новим паролем: " + user.login("student", "new123"));
        }
    }

    // Завдання 27
    static class Task27 {

        private String accountNumber;
        private double balance;
        public void setAccountNumber(String number) { this.accountNumber = number; }
        public void deposit(double amount) { if (amount > 0) balance += amount; }
        public boolean withdraw(double amount) {
            if (amount <= 0 || amount > balance) return false;
            balance -= amount;
            return true;
        }
        public double getBalance() { return balance; }

    public static void run() {
            Task27 account = new Task27();
            account.setAccountNumber("UA123456");
            account.deposit(1000);
            System.out.println("Зняти 1500: " + account.withdraw(1500));
            System.out.println("Зняти 400: " + account.withdraw(400));
            System.out.println("Залишок: " + account.getBalance());
        }
    }

    // Завдання 28
    static class Task28 {

        private double temperature;
        public void setTemperature(double t) {
            if (t < -273.15) System.out.println("Помилка: температура нижча за абсолютний нуль");
            else temperature = t;
        }
        public double getTemperature() { return temperature; }

    public static void run() {
            Task28 thermometer = new Task28();
            thermometer.setTemperature(22.5);
            thermometer.setTemperature(-300);
            System.out.println("Температура: " + thermometer.getTemperature());
        }
    }

    // Завдання 29
    static class Task29 {

        private int speed = 0;
        public void accelerate(int delta) {
            if (delta > 0) speed = (int) Math.min(240L, (long) speed + delta);
        }
        public void brake(int delta) {
            if (delta > 0) speed = (int) Math.max(0L, (long) speed - delta);
        }
        public int getSpeed() { return speed; }

    public static void run() {
            Task29 speedometer = new Task29();
            speedometer.accelerate(300);
            System.out.println("Після розгону: " + speedometer.getSpeed());
            speedometer.brake(500);
            System.out.println("Після гальмування: " + speedometer.getSpeed());
        }
    }

    // Завдання 30
    static class Task30 {

        private String name;
        private int age;
        public void setName(String name) { this.name = name; }
        public void setAge(int age) {
            if (age >= 0 && age <= 120) this.age = age;
            else System.out.println("Некоректний вік: " + age);
        }
        public void printSummary() { System.out.println(name + ", " + age + " років"); }

    public static void run() {
            Task30 first = new Task30();
            first.setName("Андрій"); first.setAge(18);
            Task30 second = new Task30();
            second.setName("Марія"); second.setAge(20);
            first.printSummary();
            second.printSummary();
        }
    }

    // Завдання 31
    static class Task31 {

        private String ownerName;
        private double totalSpent;
        private int discountPercent = 1;
        public void setOwnerName(String name) { ownerName = name; }
        public void addPurchase(double cost) {
            if (cost <= 0) return;
            totalSpent += cost;
            if (totalSpent >= 10000) discountPercent = 10;
            else if (totalSpent >= 5000) discountPercent = 5;
            else discountPercent = 1;
        }
        public void printCardInfo() {
            System.out.println(ownerName + ": витрачено " + totalSpent + " грн, знижка " + discountPercent + "%");
        }

    public static void run() {
            Task31 card = new Task31();
            card.setOwnerName("Іван");
            card.addPurchase(3000); card.printCardInfo();
            card.addPurchase(4000); card.printCardInfo();
        }
    }

    // Завдання 32
    static class Task32 {

        private int pinCode = 1234;
        private boolean isLocked = true;
        private int failedAttempts = 0;
        public void enterPin(int enteredPin) {
            if (failedAttempts >= 3) {
                System.out.println("СИСТЕМА ЗАБЛОКОВАНА! Викличте охорону.");
                return;
            }
            if (enteredPin == pinCode) {
                isLocked = false;
                failedAttempts = 0;
                System.out.println("Замок відчинено");
            } else {
                failedAttempts++;
                System.out.println("Невірний PIN. Спроб: " + failedAttempts);
            }
        }

    public static void run() {
            Task32 lock = new Task32();
            lock.enterPin(1111);
            lock.enterPin(2222);
            lock.enterPin(3333);
            lock.enterPin(1234);
        }
    }

    // Завдання 33
    static class Task33 {

        private String studentName;
        private int[] grades;
        public void setData(String name, int[] g) {
            studentName = name;
            grades = g == null ? new int[0] : g.clone();
        }
        public double getAverage() {
            if (grades == null || grades.length == 0) return 0;
            int sum = 0;
            for (int grade : grades) sum += grade;
            return (double) sum / grades.length;
        }
        public int getHighestGrade() {
            if (grades == null || grades.length == 0) return 0;
            int highest = grades[0];
            for (int grade : grades) if (grade > highest) highest = grade;
            return highest;
        }
        public int getLowestGrade() {
            if (grades == null || grades.length == 0) return 0;
            int lowest = grades[0];
            for (int grade : grades) if (grade < lowest) lowest = grade;
            return lowest;
        }

    public static void run() {
            Task33 book = new Task33();
            book.setData("Денис", new int[]{85, 92, 78, 96, 65});
            System.out.println("Середня: " + book.getAverage());
            System.out.println("Найвища: " + book.getHighestGrade());
            System.out.println("Найнижча: " + book.getLowestGrade());
        }
    }

    // Завдання 34
    static class Task34 {

        private int[] numbers;
        public void setNumbers(int[] nums) { numbers = nums == null ? new int[0] : nums.clone(); }
        public int countEvens() {
            int count = 0;
            if (numbers != null) for (int n : numbers) if (n % 2 == 0) count++;
            return count;
        }
        public int countOdds() {
            int count = 0;
            if (numbers != null) for (int n : numbers) if (n % 2 != 0) count++;
            return count;
        }
        public int calculateSum() {
            int sum = 0;
            if (numbers != null) for (int n : numbers) sum += n;
            return sum;
        }

    public static void run() {
            Task34 stats = new Task34();
            stats.setNumbers(new int[]{3, 8, 12, 5, 0, -3, 4, 11, 6, 7});
            System.out.println("Парних: " + stats.countEvens());
            System.out.println("Непарних: " + stats.countOdds());
            System.out.println("Сума: " + stats.calculateSum());
        }
    }

    // Завдання 35
    static class Task35 {

        private double[] itemPrices = new double[10];
        private int count;
        public void addItem(double price) {
            if (price >= 0 && count < itemPrices.length) itemPrices[count++] = price;
            else System.out.println("Неможливо додати товар");
        }
        public double getTotalCost() {
            double sum = 0;
            for (int i = 0; i < count; i++) sum += itemPrices[i];
            return sum;
        }
        public void applyDiscount(double percent) {
            if (percent < 0 || percent > 100) return;
            for (int i = 0; i < count; i++) itemPrices[i] *= 1 - percent / 100;
        }

    public static void run() {
            Task35 cart = new Task35();
            cart.addItem(100); cart.addItem(250); cart.addItem(400);
            System.out.println("Чек до знижки: " + cart.getTotalCost());
            cart.applyDiscount(15);
            System.out.println("Чек після знижки: " + cart.getTotalCost());
        }
    }

    // Завдання 36
    static class Task36 {

        private double[] dailyTemps = new double[7];
        public void setTemps(double[] temps) {
            if (temps == null || temps.length != 7) {
                System.out.println("Потрібно 7 температур");
                return;
            }
            dailyTemps = temps.clone();
        }
        public int countDaysAbove(double threshold) {
            int count = 0;
            for (double temp : dailyTemps) if (temp > threshold) count++;
            return count;
        }
        public void printWeeklyReport() {
            int warmest = 0;
            for (int i = 0; i < dailyTemps.length; i++) {
                System.out.println("День " + (i + 1) + ": " + dailyTemps[i] + "°C");
                if (dailyTemps[i] > dailyTemps[warmest]) warmest = i;
            }
            System.out.println("Найтепліший день: " + (warmest + 1));
        }

    public static void run() {
            Task36 tracker = new Task36();
            tracker.setTemps(new double[]{15.5, 17, 19, 18.5, 21, 16, 14});
            tracker.printWeeklyReport();
            System.out.println("Днів вище 18°C: " + tracker.countDaysAbove(18));
        }
    }

    // Завдання 37
    static class Task37 {

        private int[] data;
        public void setData(int[] data) { this.data = data == null ? new int[0] : data.clone(); }
        public boolean contains(int target) { return findIndex(target) >= 0; }
        public int findIndex(int target) {
            if (data == null) return -1;
            for (int i = 0; i < data.length; i++) if (data[i] == target) return i;
            return -1;
        }

    public static void run() {
            Task37 searcher = new Task37();
            searcher.setData(new int[]{5, 12, 8, 12, 3});
            System.out.println("Число 8 є: " + searcher.contains(8) + ", індекс: " + searcher.findIndex(8));
            System.out.println("Число 99 є: " + searcher.contains(99) + ", індекс: " + searcher.findIndex(99));
        }
    }

    // Завдання 38
    static class Task38 {

        private double[] coords = new double[3];
        public void setCoords(double x, double y, double z) {
            coords[0] = x; coords[1] = y; coords[2] = z;
        }
        public double getMagnitude() {
            double sum = 0;
            for (double coord : coords) sum += coord * coord;
            return Math.sqrt(sum);
        }
        public void multiplyByScalar(double scalar) {
            for (int i = 0; i < coords.length; i++) coords[i] *= scalar;
        }
        public void printVector() {
            System.out.println("(" + coords[0] + ", " + coords[1] + ", " + coords[2] + ")");
        }

    public static void run() {
            Task38 vector = new Task38();
            vector.setCoords(2, 3, 6);
            System.out.println("Довжина: " + vector.getMagnitude());
            vector.multiplyByScalar(2);
            vector.printVector();
        }
    }

    // Завдання 39
    static class Task39 {

        private int[][] grid;
        public void setGrid(int[][] grid) { this.grid = grid; }
        public void printMatrix() {
            if (grid == null) return;
            for (int[] row : grid) {
                for (int number : row) System.out.printf("%4d", number);
                System.out.println();
            }
        }
        public int getTotalSum() {
            int sum = 0;
            if (grid != null) for (int[] row : grid) for (int n : row) sum += n;
            return sum;
        }
        public int getRowSum(int rowIndex) {
            if (grid == null || rowIndex < 0 || rowIndex >= grid.length) return 0;
            int sum = 0;
            for (int n : grid[rowIndex]) sum += n;
            return sum;
        }

    public static void run() {
            Task39 matrix = new Task39();
            matrix.setGrid(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
            matrix.printMatrix();
            System.out.println("Загальна сума: " + matrix.getTotalSum());
            System.out.println("Сума другого рядка: " + matrix.getRowSum(1));
        }
    }

    // Завдання 40
    static class Task40 {

        private int[][] matrix;
        public void setMatrix(int[][] matrix) { this.matrix = matrix; }
        public int getMainDiagonalSum() {
            int sum = 0;
            if (matrix == null) return sum;
            for (int i = 0; i < matrix.length; i++) sum += matrix[i][i];
            return sum;
        }
        public int getAntiDiagonalSum() {
            int sum = 0;
            if (matrix == null) return sum;
            for (int i = 0; i < matrix.length; i++) sum += matrix[i][matrix.length - 1 - i];
            return sum;
        }
        public boolean isDiagonalSymmetric() { return getMainDiagonalSum() == getAntiDiagonalSum(); }

    public static void run() {
            Task40 diagonals = new Task40();
            diagonals.setMatrix(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
            System.out.println("Головна діагональ: " + diagonals.getMainDiagonalSum());
            System.out.println("Побічна діагональ: " + diagonals.getAntiDiagonalSum());
            System.out.println("Суми однакові: " + diagonals.isDiagonalSymmetric());
        }
    }

}
