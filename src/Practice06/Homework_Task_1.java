package Practice06;

public class Homework_Task_1 {
    public static void main(String[] args) {

        Fraction fraction = new Fraction();
        fraction.setValues(8, 12);

        System.out.println("=== КАЛЬКУЛЯТОР ЗВИЧАЙНИХ ДРОБІВ ===");

        System.out.print("Початковий дріб: ");
        fraction.printFraction();

        fraction.simplify();

        System.out.print("\nПісля скорочення: ");
        fraction.printFraction();
        System.out.printf(" (десятковий вигляд: %.4f)%n",
                fraction.toDecimal());

        System.out.println("\nДодаємо дріб 3/4...");

        fraction.add(3, 4);

        System.out.print("Результат додавання: ");
        fraction.printFraction();
        System.out.printf(" (десятковий вигляд: %.4f)%n",
                fraction.toDecimal());
    }
}

class Fraction {
    private int numerator;
    private int denominator;

    public void setValues(int num, int den) {
        if (den == 0) {
            System.out.println("Помилка: знаменник не може дорівнювати 0!");
            den = 1;
        }

        if (den < 0) {
            num = -num;
            den = -den;
        }

        numerator = num;
        denominator = den;
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public void simplify() {
        int divisor = gcd(numerator, denominator);

        if (divisor != 0) {
            numerator /= divisor;
            denominator /= divisor;
        }
    }

    public double toDecimal() {
        return (double) numerator / denominator;
    }

    public void add(int otherNum, int otherDen) {
        if (otherDen == 0) {
            System.out.println("Помилка: знаменник не може дорівнювати 0!");
            return;
        }

        numerator = numerator * otherDen + otherNum * denominator;
        denominator *= otherDen;

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        simplify();
    }

    public void printFraction() {
        if (denominator == 1) {
            System.out.print(numerator);
        } else {
            System.out.print(numerator + "/" + denominator);
        }
    }
}