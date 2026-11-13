package semester1.practice1;

import java.util.Arrays;
import java.util.Locale;

public class Practice09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("=== ПРАКТИЧНА РОБОТА №9 ===");
        for (int n = 1; n <= 39; n++) {
            System.out.printf("%n========== Завдання %d ==========%n", n);
            try {
                runTask(n);
            } catch (Exception exception) {
                System.out.println("Помилка виконання: " + exception.getMessage());
            }
        }
        System.out.println("\n=== КІНЕЦЬ ПРАКТИЧНОЇ РОБОТИ ===");
    }

    private static void runTask(int n) {
        switch (n) {
            case 1 -> {
                ImmutableGeoPoint a = new ImmutableGeoPoint(55, 200);
                System.out.println("Початкова: " + a);
                System.out.println("Після зміщення: " + a.shift(5, -20));
                System.out.println("Стара точка: " + a);
            }
            case 2 -> {
                double[] values = {1.2, 2.4, 3.6};
                LabMeasurement lab = new LabMeasurement("Експеримент №1", values);
                values[0] = 999;
                double[] copy = lab.getSamples();
                copy[1] = 888;
                System.out.println(lab);
                System.out.println("Зовнішній масив: " + Arrays.toString(values));
            }
            case 3 -> {
                CryptoVault vault = new CryptoVault("BTC-demo", "my-demo-phrase", 1.5);
                System.out.println(vault);
                System.out.println("Розблокування: " + vault.unlock("my-demo-phrase"));
                System.out.println("Переказ: " + vault.sendBtc(0.25, "BTC-destination"));
                vault.lock();
                System.out.println(vault);
            }
            case 4 -> {
                ClosedInterval a = new ClosedInterval(10, 2);
                ClosedInterval b = new ClosedInterval(8, 15);
                System.out.println(a + "; " + b);
                System.out.println("Перетинаються: " + a.overlaps(b));
                a.resize(20, 12);
                System.out.println("Новий інтервал: " + a);
            }
            case 5 -> {
                RgbColor color = new RgbColor(260, 70, -5);
                System.out.println("Колір: " + color);
                System.out.println("Інверсія: " + color.invert());
                System.out.println("Змішування: " + color.mixWith(new RgbColor(0, 100, 250)));
            }
            case 6 -> {
                HighSecuritySafe safe = new HighSecuritySafe(1234, 500);
                System.out.println("Покласти: " + safe.putCash(1234, 200));
                System.out.println("Зняти: " + safe.takeCash(1234, 100));
                safe.takeCash(9999, 10);
                safe.takeCash(9999, 10);
                safe.takeCash(9999, 10);
                System.out.println(safe);
            }
            case 7 -> {
                double[] c = {2, 3, 1};
                EncapsulatedPolynomial p = new EncapsulatedPolynomial(c);
                c[0] = 100;
                System.out.println(p);
                System.out.println("Степінь: " + p.getDegree() + ", P(2) = " + p.evaluate(2));
            }
            case 8 -> {
                MedicalRecord record = new MedicalRecord("P-001", "Олег", 2, true, new String[]{"Пилок", "Горіхи"});
                System.out.println(record);
                System.out.println("Алергія на горіхи: " + record.hasAllergyTo("горіхи"));
            }
            case 9 -> {
                CompositeCircle circle = new CompositeCircle(2, 3, 5);
                System.out.println(circle);
                System.out.println("Точка (5,5) усередині: " + circle.containsPoint(new Point2D(5, 5)));
            }
            case 10 -> {
                Automobile car = new Automobile("BMW M3", "Бензин", 1800);
                car.accelerate(20);
                car.start();
                car.accelerate(30);
                System.out.println(car);
            }
            case 11 -> {
                SmartDevice phone = new SmartDevice("iPhone 12  ", 3500, 80, 6.1, 85);
                phone.watchVideo(50);
                System.out.println(phone);
            }
            case 12 -> {
                Point2D a = new Point2D(0, 0);
                Point2D b = new Point2D(6, 8);
                LineSegment segment = new LineSegment(a, b);
                a.setX(500);
                System.out.println(segment);
                System.out.println("Довжина: " + segment.getLength() + "; середина: " + segment.getMidpoint());
            }
            case 13 -> {
                BankAccount account = new BankAccount("UA123", 2000);
                PlasticCard first = new PlasticCard("****1111", "12/28", account);
                PlasticCard second = new PlasticCard("****2222", "08/29", account);
                System.out.println("Оплата 1: " + first.payAtTerminal(300));
                System.out.println("Оплата 2: " + second.payAtTerminal(250));
                System.out.println(first + "\n" + second + "\n" + account);
            }
            case 14 -> {
                HeroCharacter hero = new HeroCharacter("V", 30);
                hero.equip(new WeaponItem("Катана", 25, 100));
                System.out.println(hero + "; атака: " + hero.attack());
                hero.unequip();
                System.out.println(hero + "; атака без зброї: " + hero.attack());
            }
            case 15 -> {
                ParcelOrder order = new ParcelOrder("ORD-1", 2.3, new DeliveryAddress("Київ", "Хрещатик", 1));
                System.out.println("Зміна адреси: " + order.changeDestination(new DeliveryAddress("Суми", "Соборна", 2)));
                order.markAsShipped();
                System.out.println("Зміна після відправки: " + order.changeDestination(new DeliveryAddress("Львів", "Центральна", 3)));
                System.out.println(order);
            }
            case 16 -> {
                ClimateController controller = new ClimateController(17, 22, 2.2);
                controller.regulate();
                System.out.println(controller);
                controller.getSensor().setCurrentTemp(23);
                controller.regulate();
                System.out.println(controller);
            }
            case 17 -> {
                Polyline poly = new Polyline(5);
                poly.addVertex(0, 0);
                poly.addVertex(3, 0);
                poly.addVertex(3, 4);
                System.out.println(poly);
                System.out.printf("Довжина: %.2f; замкнений периметр: %.2f%n", poly.getTotalLength(), poly.getClosedPerimeter());
            }
            case 18 -> {
                ShoppingOrder order = new ShoppingOrder();
                order.addItem("Миша", 500, 1);
                order.addItem("Монітор", 6000, 1);
                order.addItem("Миша", 500, 2);
                System.out.println(order);
            }
            case 19 -> {
                Bookshelf shelf = new Bookshelf("Фантастика", 5);
                shelf.putBook(new BookItem("Дюна", "Френк Герберт", 600));
                shelf.putBook(new BookItem("Нейромант", "Вільям Гібсон", 320));
                System.out.println(shelf);
                System.out.println("Найдовша: " + shelf.findLongestBook());
                System.out.println("Сторінок: " + shelf.getTotalPagesOnShelf());
            }
            case 20 -> {
                Playlist playlist = new Playlist("Мій плейлист", 5);
                playlist.addTrack(new AudioTrack("Track A", "Artist A", 215));
                playlist.addTrack(new AudioTrack("Track B", "Artist B", 184));
                System.out.println(playlist);
            }
            case 21 -> {
                DataCenterCluster cluster = new DataCenterCluster("Київ", 3);
                cluster.addNode(new ServerNode("10.0.0.1", 32, 8, true));
                cluster.addNode(new ServerNode("10.0.0.2", 16, 4, false));
                System.out.println("Розміщення 20 GB: " + cluster.deployContainer(20));
                System.out.println(cluster);
            }
            case 22 -> {
                UniversityCourse course = new UniversityCourse("Java", 3);
                course.addModule(new CourseModule("Основи", 30, 30, 40));
                course.addModule(new CourseModule("ООП", 20, 40, 60));
                System.out.printf("%s | кредити: %.2f | сума балів = 100: %s%n", course, course.getEctsCredits(), course.hasValidTotalScore());
            }
            case 23 -> {
                PassengerTrain train = new PassengerTrain("Київ—Суми", 3);
                train.attachCarriage(new TrainCarriage(1, "Купе", 40));
                train.attachCarriage(new TrainCarriage(2, "Інтерсіті", 60));
                System.out.println("Бронювання: " + train.bookTicketsInCarriage(1, 3));
                System.out.println(train + "; вільні місця: " + train.getTotalFreeSeats());
            }
            case 24 -> {
                EquationSystem system = new EquationSystem(3);
                system.addEquation(new LinearEquation(2, 3, 8));
                system.addEquation(new LinearEquation(4, -1, 2));
                System.out.println("(1,2) — розв'язок: " + system.checkSolution(1, 2));
                System.out.println(system);
            }
            case 25 -> {
                AbstractShape[] shapes = {new CircleShape("Синій", 3), new RectangleShape("Зелений", 4, 5)};
                for (AbstractShape shape : shapes) System.out.println(shape);
            }
            case 26 -> {
                AbstractPowerPlant[] plants = {new SolarPowerPlant("Сонячна", 20, 0.7), new WindPowerPlant("Вітрова", 30, 10)};
                for (AbstractPowerPlant plant : plants) System.out.printf("%s, прибуток: %.2f грн%n", plant, plant.calculateDailyProfit(1500));
            }
            case 27 -> {
                AbstractEmployee[] staff = {new SalariedEmployee(1, "Дмитро", 25000, 3000), new HourlyContractor(2, "Володимир", 175, 200)};
                for (AbstractEmployee e : staff) System.out.printf("%s, до податку: %.2f, після: %.2f%n", e, e.calculateGrossSalary(), e.calculateNetSalary());
            }
            case 28 -> {
                AbstractSequence[] sequences = {new HarmonicSequence(), new SquareNumbersSequence()};
                for (AbstractSequence seq : sequences) System.out.printf("%s, сума перших 5: %.4f%n", seq, seq.sumFirstN(5));
            }
            case 29 -> {
                AbstractTransaction[] transfers = {new DomesticTransfer("D-1", 1000), new CryptoTransfer("C-1", 1000, 35)};
                for (AbstractTransaction t : transfers) System.out.printf("%s, комісія: %.2f, списання: %.2f%n", t, t.calculateCommission(), t.getTotalDebit());
            }
            case 30 -> {
                Solid3D[] solids = {new Sphere3D("Сталь", 7850, 0.2), new Cylinder3D("Алюміній", 2700, 0.3, 1)};
                for (Solid3D s : solids) System.out.printf("%s, площа: %.3f, маса: %.3f кг%n", s, s.getSurfaceArea(), s.getMassKg());
            }
            case 31 -> {
                AbstractSensor[] sensors = {new PressureSensor("Цех", 1, 10, 7, 1.1), new RadiationSensor("Склад", 0, 0.3, 0.5)};
                for (AbstractSensor s : sensors) System.out.println(s + ", тривога: " + s.isAlarmTriggered());
            }
            case 32 -> {
                AbstractCompressor[] compressors = {new ZipCompressor(), new UltraLzmaCompressor()};
                for (AbstractCompressor c : compressors) System.out.printf("%s -> %d байт, стискання: %.2f%%%n", c, c.estimateCompressedSize(10000), c.getCompressionRatio(10000));
            }
            case 33 -> {
                DesktopPC pc = new DesktopPC(500, 5);
                pc.addPart(new ProcessorPart("Ryzen 5", 6, 65, 5000));
                pc.addPart(new VideoCardPart("GTX 1650", 4, 75, 6500));
                System.out.println(pc + "; БЖ із запасом 20%: " + pc.hasSufficientPsu());
            }
            case 34 -> {
                Spacecraft ship = new Spacecraft("Explorer", 20, 4);
                ship.addThruster(new ChemicalThruster("CH-1", 400, 20));
                ship.addThruster(new IonThruster("ION-1", 10, 0.1));
                System.out.println(ship);
                System.out.printf("Тяга: %.2f кН, початкове прискорення: %.2f м/с²%n", ship.getTotalThrustKn(), ship.getInitialAcceleration());
            }
            case 35 -> {
                LandPlot plot = new LandPlot(200, 5);
                System.out.println("Прямокутник: " + plot.addStructure(new RectangleShape("Сірий", 8, 10)));
                System.out.println("Коло: " + plot.addStructure(new CircleShape("Жовтий", 3)));
                System.out.println(plot + ", зелена площа: " + plot.getFreeGreenArea());
            }
            case 36 -> {
                InvestmentPortfolio portfolio = new InvestmentPortfolio("Олена", 4);
                portfolio.addAsset(new GovernmentBond("UA-BOND", 10000, 15.5));
                portfolio.addAsset(new DividendStock("TECH", 20000, 8, 5, 0.195));
                System.out.println(portfolio);
            }
            case 37 -> {
                RaidParty party = new RaidParty("Shoreline", 4);
                party.addMember(new TankWarrior("Танк", 900, 80));
                party.addMember(new ArcaneMage("Маг", 300, 95, 150));
                System.out.println(party + ", готовий до рейду (1000): " + party.isReadyForRaid(1000));
            }
            case 38 -> {
                SmartLab lab = new SmartLab(4);
                lab.addSensor(new PressureSensor("Резервуар", 1, 10, 8, 1));
                lab.addSensor(new RadiationSensor("Камера", 0, 0.3, 0.6));
                lab.runDiagnostics();
                System.out.println(lab);
            }
            case 39 -> {
                SignalProcessor processor = new SignalProcessor(3);
                processor.addFilter(new AmplifierFilter(2));
                processor.addFilter(new ClippingFilter(1));
                double[] input = {-0.8, -0.2, 0, 0.3, 0.9};
                System.out.println("До: " + Arrays.toString(input));
                System.out.println("Після: " + Arrays.toString(processor.process(input)));
                System.out.println(processor);
            }
            default -> throw new IllegalArgumentException("Невідоме завдання");
        }
    }

    // Блок 1: поглиблена інкапсуляція
    static final class ImmutableGeoPoint {
        private final double latitude, longitude;
        ImmutableGeoPoint(double lat, double lon) {
            latitude = Math.max(-90, Math.min(90, lat));
            longitude = Math.max(-180, Math.min(180, lon));
        }
        ImmutableGeoPoint shift(double dLat, double dLon) { return new ImmutableGeoPoint(latitude + dLat, longitude + dLon); }
        @Override public String toString() { return String.format("GeoPoint[%.2f, %.2f]", latitude, longitude); }
    }

    static class LabMeasurement {
        private final String experimentName;
        private final double[] samples;
        LabMeasurement(String name, double[] values) {
            experimentName = name;
            samples = values == null ? new double[0] : Arrays.copyOf(values, values.length);
        }
        double[] getSamples() { return Arrays.copyOf(samples, samples.length); }
        @Override public String toString() { return experimentName + ": " + Arrays.toString(samples); }
    }

    static class CryptoVault {
        private final String walletAddress;
        private String secretRecoveryPhrase;
        private double btcBalance;
        private boolean locked = true;
        CryptoVault(String address, String phrase, double balance) {
            walletAddress = address;
            secretRecoveryPhrase = phrase;
            btcBalance = Math.max(0, balance);
        }
        boolean unlock(String phrase) {
            if (phrase != null && phrase.equals(secretRecoveryPhrase)) { locked = false; return true; }
            return false;
        }
        void lock() { locked = true; }
        boolean sendBtc(double amount, String destination) {
            if (locked || amount <= 0 || amount > btcBalance || destination == null || destination.isBlank()) return false;
            btcBalance -= amount;
            return true;
        }
        @Override public String toString() { return String.format("CryptoVault[%s, locked=%s, BTC=%.4f]", walletAddress, locked, btcBalance); }
    }

    static class ClosedInterval {
        private double start, end;
        ClosedInterval(double a, double b) { resize(a, b); }
        void resize(double a, double b) { start = Math.min(a, b); end = Math.max(a, b); }
        double getLength() { return end - start; }
        double getMidpoint() { return (start + end) / 2; }
        boolean overlaps(ClosedInterval other) { return other != null && start <= other.end && other.start <= end; }
        @Override public String toString() { return String.format("[%.2f; %.2f] (центр: %.2f, довжина: %.2f)", start, end, getMidpoint(), getLength()); }
    }

    static final class RgbColor {
        private final int red, green, blue;
        private static int clamp(int v) { return Math.max(0, Math.min(255, v)); }
        RgbColor(int r, int g, int b) { red = clamp(r); green = clamp(g); blue = clamp(b); }
        String toHex() { return String.format("#%02X%02X%02X", red, green, blue); }
        RgbColor invert() { return new RgbColor(255 - red, 255 - green, 255 - blue); }
        RgbColor mixWith(RgbColor other) {
            return new RgbColor((red + other.red) / 2, (green + other.green) / 2, (blue + other.blue) / 2);
        }
        @Override public String toString() { return String.format("RGB(%d,%d,%d) %s", red, green, blue, toHex()); }
    }

    static class HighSecuritySafe {
        private int pinCode, failedAttempts;
        private double storedCash;
        private boolean permanentlyBlocked;
        HighSecuritySafe(int pin, double cash) { pinCode = pin; storedCash = Math.max(0, cash); }
        private boolean checkAccess(int pin) {
            if (permanentlyBlocked) return false;
            if (pin != pinCode) {
                failedAttempts++;
                if (failedAttempts >= 3) permanentlyBlocked = true;
                return false;
            }
            failedAttempts = 0;
            return true;
        }
        boolean putCash(int pin, double amount) {
            if (!checkAccess(pin) || amount <= 0) return false;
            storedCash += amount;
            return true;
        }
        boolean takeCash(int pin, double amount) {
            if (!checkAccess(pin) || amount <= 0 || amount > storedCash) return false;
            storedCash -= amount;
            return true;
        }
        @Override public String toString() { return String.format("Safe[cash=%.2f, attempts=%d, blocked=%s]", storedCash, failedAttempts, permanentlyBlocked); }
    }

    static class EncapsulatedPolynomial {
        private final double[] coeffs;
        EncapsulatedPolynomial(double[] coefficients) {
            coeffs = coefficients == null || coefficients.length == 0 ? new double[]{0} : Arrays.copyOf(coefficients, coefficients.length);
        }
        int getDegree() { return coeffs.length - 1; }
        double getCoefficient(int power) { return power >= 0 && power < coeffs.length ? coeffs[power] : 0; }
        double evaluate(double x) {
            double y = 0;
            for (int i = coeffs.length - 1; i >= 0; i--) y = y * x + coeffs[i];
            return y;
        }
        @Override public String toString() {
            StringBuilder sb = new StringBuilder("P(x) = ");
            for (int i = coeffs.length - 1; i >= 0; i--) {
                if (i != coeffs.length - 1) sb.append(coeffs[i] >= 0 ? " + " : " - ");
                sb.append(Math.abs(coeffs[i]));
                if (i > 0) sb.append("x");
                if (i > 1) sb.append("^").append(i);
            }
            return sb.toString();
        }
    }

    static class MedicalRecord {
        private final String patientId;
        private String fullName;
        private int bloodGroup;
        private boolean rhPositive;
        private String[] allergies;
        MedicalRecord(String id, String name, int group, boolean rh, String[] list) {
            patientId = id;
            fullName = name;
            bloodGroup = Math.max(1, Math.min(4, group));
            rhPositive = rh;
            allergies = list == null ? new String[0] : Arrays.copyOf(list, list.length);
        }
        String[] getAllergies() { return Arrays.copyOf(allergies, allergies.length); }
        boolean hasAllergyTo(String substance) {
            for (String a : allergies) if (a != null && a.equalsIgnoreCase(substance)) return true;
            return false;
        }
        @Override public String toString() {
            String[] groups = {"I (O)", "II (A)", "III (B)", "IV (AB)"};
            return String.format("MedicalRecord[%s, %s, %s Rh%s, алергії: %s]", patientId, fullName,
                    groups[bloodGroup - 1], rhPositive ? "+" : "-", Arrays.toString(allergies));
        }
    }

    // Блок 2: композиція й агрегація
    static class Point2D {
        private double x, y;
        Point2D(double x, double y) { this.x = x; this.y = y; }
        double getX() { return x; }
        double getY() { return y; }
        void setX(double value) { x = value; }
        double distanceTo(Point2D p) { return Math.hypot(x - p.x, y - p.y); }
        @Override public String toString() { return String.format("(%.2f; %.2f)", x, y); }
    }
    static class CompositeCircle {
        private double radius;
        private final Point2D center;
        CompositeCircle(double cx, double cy, double r) {
            center = new Point2D(cx, cy);
            radius = r > 0 ? r : 1;
        }
        boolean containsPoint(Point2D point) { return point != null && center.distanceTo(point) <= radius; }
        @Override public String toString() { return String.format("Circle[центр=%s, r=%.2f]", center, radius); }
    }
    static class Engine {
        private final String fuelType;
        private final int volumeCc;
        private int rpm;
        private boolean started;
        Engine(String fuel, int volume) { fuelType = fuel; volumeCc = Math.max(1, volume); }
        void start() { started = true; rpm = 800; }
        void stop() { started = false; rpm = 0; }
        void setRpm(int value) { if (started) rpm = Math.max(800, Math.min(7000, value)); }
        boolean isStarted() { return started; }
        @Override public String toString() { return String.format("Engine[%s, %dcc, rpm=%d, on=%s]", fuelType, volumeCc, rpm, started); }
    }
    static class Automobile {
        private final String model;
        private double speed;
        private final Engine engine;
        Automobile(String model, String fuel, int volume) { this.model = model; engine = new Engine(fuel, volume); }
        void start() { engine.start(); }
        void accelerate(double delta) {
            if (!engine.isStarted() || delta <= 0) { System.out.println("Розгін неможливий: двигун вимкнено або значення некоректне"); return; }
            speed += delta;
            engine.setRpm(800 + (int) (speed * 35));
        }
        @Override public String toString() { return String.format("Automobile[%s, швидкість=%.1f, %s]", model, speed, engine); }
    }
    static class Battery {
        private int capacityMah, chargePercent;
        Battery(int cap, int charge) { capacityMah = Math.max(1, cap); chargePercent = Math.max(0, Math.min(100, charge)); }
        void drain(int amount) { chargePercent = Math.max(0, chargePercent - Math.max(0, amount)); }
        void charge(int amount) { chargePercent = Math.min(100, chargePercent + Math.max(0, amount)); }
        int getChargePercent() { return chargePercent; }
        @Override public String toString() { return capacityMah + " мА·год, " + chargePercent + "%"; }
    }
    static class Display {
        private double diagonalInches;
        private int brightnessPercent;
        Display(double diagonal, int brightness) { diagonalInches = diagonal > 0 ? diagonal : 6; brightnessPercent = Math.max(10, Math.min(100, brightness)); }
        int getBrightnessPercent() { return brightnessPercent; }
        @Override public String toString() { return String.format("%.1f дюйма, яскравість %d%%", diagonalInches, brightnessPercent); }
    }
    static class SmartDevice {
        private final String model;
        private final Battery battery;
        private final Display display;
        private boolean active = true;
        SmartDevice(String name, int cap, int charge, double diagonal, int brightness) {
            model = name; battery = new Battery(cap, charge); display = new Display(diagonal, brightness);
        }
        void watchVideo(int minutes) {
            if (!active || minutes <= 0) return;
            int drain = ((minutes + 9) / 10) * (display.getBrightnessPercent() > 70 ? 2 : 1);
            battery.drain(drain);
            if (battery.getChargePercent() == 0) active = false;
        }
        @Override public String toString() { return String.format("%s [%s; %s; active=%s]", model, battery, display, active); }
    }
    static class LineSegment {
        private final Point2D start, end;
        LineSegment(Point2D a, Point2D b) {
            start = new Point2D(a.getX(), a.getY()); end = new Point2D(b.getX(), b.getY());
        }
        double getLength() { return start.distanceTo(end); }
        Point2D getMidpoint() { return new Point2D((start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2); }
        @Override public String toString() { return "LineSegment[" + start + " -> " + end + "]"; }
    }
    static class BankAccount {
        private final String iban;
        private double balance;
        BankAccount(String iban, double initial) { this.iban = iban; balance = Math.max(0, initial); }
        void deposit(double amount) { if (amount > 0) balance += amount; }
        boolean withdraw(double amount) { if (amount <= 0 || amount > balance) return false; balance -= amount; return true; }
        @Override public String toString() { return String.format("Рахунок[%s, баланс %.2f грн]", iban, balance); }
    }
    static class PlasticCard {
        private final String cardNumber, expiryDate;
        private boolean blocked;
        private final BankAccount linkedAccount;
        PlasticCard(String number, String expiry, BankAccount account) { cardNumber = number; expiryDate = expiry; linkedAccount = account; }
        boolean payAtTerminal(double amount) { return !blocked && linkedAccount != null && linkedAccount.withdraw(amount); }
        @Override public String toString() { return "Картка[" + cardNumber + ", до " + expiryDate + ", blocked=" + blocked + "]"; }
    }
    static class WeaponItem {
        private final String name;
        private final int bonusDamage;
        private int durability;
        WeaponItem(String name, int bonus, int durability) {
            this.name = name; bonusDamage = Math.max(0, bonus); this.durability = Math.max(0, Math.min(100, durability));
        }
        int useWeapon() {
            if (durability == 0) return 0;
            durability = Math.max(0, durability - 10);
            return bonusDamage;
        }
        @Override public String toString() { return name + " (міцність: " + durability + ")"; }
    }
    static class HeroCharacter {
        private final String nickname;
        private int baseStrength;
        private WeaponItem equippedWeapon;
        HeroCharacter(String nickname, int strength) { this.nickname = nickname; baseStrength = Math.max(0, strength); }
        void equip(WeaponItem weapon) { equippedWeapon = weapon; }
        void unequip() { equippedWeapon = null; }
        int attack() { return baseStrength + (equippedWeapon == null ? 0 : equippedWeapon.useWeapon()); }
        @Override public String toString() { return "Hero[" + nickname + ", зброя=" + equippedWeapon + "]"; }
    }
    static class DeliveryAddress {
        private String city, street;
        private int postOfficeNumber;
        DeliveryAddress(String city, String street, int office) {
            this.city = city == null || city.isBlank() ? "Невідоме місто" : city;
            this.street = street == null || street.isBlank() ? "Невідома вулиця" : street;
            postOfficeNumber = Math.max(1, office);
        }
        @Override public String toString() { return city + ", " + street + ", відділення №" + postOfficeNumber; }
    }
    static class ParcelOrder {
        private final String orderId;
        private double weightKg;
        private DeliveryAddress destination;
        private boolean shipped;
        ParcelOrder(String id, double weight, DeliveryAddress address) { orderId = id; weightKg = Math.max(0, weight); destination = address; }
        boolean changeDestination(DeliveryAddress next) { if (shipped || next == null) return false; destination = next; return true; }
        void markAsShipped() { shipped = true; }
        @Override public String toString() { return "Parcel[" + orderId + ", " + weightKg + " кг, " + destination + ", відправлено=" + shipped + "]"; }
    }
    static class TemperatureSensor {
        private double currentTemp;
        TemperatureSensor(double temp) { currentTemp = temp; }
        double getCurrentTemp() { return currentTemp; }
        void setCurrentTemp(double temp) { currentTemp = temp; }
    }
    static class HeatingUnit {
        private boolean heatingOn;
        private double powerKw;
        HeatingUnit(double power) { powerKw = Math.max(0, power); }
        void turnOn() { heatingOn = true; }
        void turnOff() { heatingOn = false; }
        @Override public String toString() { return "Обігрівач[on=" + heatingOn + ", kW=" + powerKw + "]"; }
    }
    static class ClimateController {
        private final TemperatureSensor sensor;
        private final HeatingUnit heatingUnit;
        private double targetTemp;
        ClimateController(double current, double target, double power) { sensor = new TemperatureSensor(current); heatingUnit = new HeatingUnit(power); targetTemp = target; }
        TemperatureSensor getSensor() { return sensor; }
        void regulate() {
            if (sensor.getCurrentTemp() < targetTemp - 0.5) heatingUnit.turnOn();
            else if (sensor.getCurrentTemp() >= targetTemp) heatingUnit.turnOff();
        }
        @Override public String toString() { return String.format("Climate[темп=%.1f, ціль=%.1f, %s]", sensor.getCurrentTemp(), targetTemp, heatingUnit); }
    }

    // Блок 3: композиція з масивами об'єктів
    static class Polyline {
        private final Point2D[] vertices;
        private int count;
        Polyline(int capacity) { vertices = new Point2D[Math.max(1, capacity)]; }
        void addVertex(double x, double y) { if (count < vertices.length) vertices[count++] = new Point2D(x, y); }
        double getTotalLength() {
            double sum = 0;
            for (int i = 1; i < count; i++) sum += vertices[i - 1].distanceTo(vertices[i]);
            return sum;
        }
        double getClosedPerimeter() { return getTotalLength() + (count >= 3 ? vertices[count - 1].distanceTo(vertices[0]) : 0); }
        @Override public String toString() { return "Polyline" + Arrays.toString(Arrays.copyOf(vertices, count)); }
    }
    static class OrderItem {
        private final String productName;
        private final double unitPrice;
        private int quantity;
        OrderItem(String name, double price, int qty) { productName = name; unitPrice = Math.max(0, price); quantity = Math.max(0, qty); }
        void addQuantity(int delta) { if (delta > 0) quantity += delta; }
        double getItemTotal() { return unitPrice * quantity; }
        @Override public String toString() { return String.format("%s × %d = %.2f грн", productName, quantity, getItemTotal()); }
    }
    static class ShoppingOrder {
        private final OrderItem[] items = new OrderItem[10];
        private int itemCount;
        void addItem(String name, double price, int qty) {
            if (name == null || name.isBlank() || qty <= 0 || price < 0) return;
            for (int i = 0; i < itemCount; i++) {
                if (items[i].productName.equalsIgnoreCase(name)) { items[i].addQuantity(qty); return; }
            }
            if (itemCount < items.length) items[itemCount++] = new OrderItem(name, price, qty);
        }
        double calculateGrandTotal() {
            double total = 0;
            for (int i = 0; i < itemCount; i++) total += items[i].getItemTotal();
            return total;
        }
        @Override public String toString() {
            StringBuilder sb = new StringBuilder("Чек замовлення:\n");
            for (int i = 0; i < itemCount; i++) sb.append("  ").append(items[i]).append('\n');
            return sb.append(String.format("Разом: %.2f грн", calculateGrandTotal())).toString();
        }
    }
    static class BookItem {
        private final String title, author;
        private final int pages;
        BookItem(String title, String author, int pages) { this.title = title; this.author = author; this.pages = Math.max(0, pages); }
        @Override public String toString() { return title + " — " + author + " (" + pages + " с.)"; }
    }
    static class Bookshelf {
        private final String genre;
        private final BookItem[] books;
        private int bookCount;
        Bookshelf(String genre, int capacity) { this.genre = genre; books = new BookItem[Math.max(1, capacity)]; }
        boolean putBook(BookItem book) { if (book == null || bookCount >= books.length) return false; books[bookCount++] = book; return true; }
        BookItem findLongestBook() {
            if (bookCount == 0) return null;
            BookItem best = books[0];
            for (int i = 1; i < bookCount; i++) if (books[i].pages > best.pages) best = books[i];
            return best;
        }
        int getTotalPagesOnShelf() { int total = 0; for (int i = 0; i < bookCount; i++) total += books[i].pages; return total; }
        @Override public String toString() { return "Bookshelf[" + genre + ", " + Arrays.toString(Arrays.copyOf(books, bookCount)) + "]"; }
    }
    static class AudioTrack {
        private final String title, artist;
        private final int durationSeconds;
        AudioTrack(String title, String artist, int seconds) { this.title = title; this.artist = artist; durationSeconds = Math.max(0, seconds); }
        String formattedDuration() { return String.format("%02d:%02d", durationSeconds / 60, durationSeconds % 60); }
        @Override public String toString() { return title + " — " + artist + " (" + formattedDuration() + ")"; }
    }
    static class Playlist {
        private String name;
        private final AudioTrack[] tracks;
        private int trackCount;
        Playlist(String name, int capacity) { this.name = name; tracks = new AudioTrack[Math.max(1, capacity)]; }
        boolean addTrack(AudioTrack track) { if (track == null || trackCount >= tracks.length) return false; tracks[trackCount++] = track; return true; }
        int getTotalDurationSeconds() { int s = 0; for (int i = 0; i < trackCount; i++) s += tracks[i].durationSeconds; return s; }
        @Override public String toString() {
            StringBuilder sb = new StringBuilder("Плейлист: " + name + "\n");
            for (int i = 0; i < trackCount; i++) sb.append(i + 1).append(". ").append(tracks[i]).append('\n');
            int total = getTotalDurationSeconds();
            return sb.append("Тривалість: ").append(total / 60).append(" хв ").append(total % 60).append(" сек").toString();
        }
    }
    static class ServerNode {
        private final String ipAddress;
        private final int totalRamGb;
        private int usedRamGb;
        private boolean online;
        ServerNode(String ip, int ram, int used, boolean online) {
            ipAddress = ip; totalRamGb = Math.max(0, ram); usedRamGb = Math.max(0, Math.min(totalRamGb, used)); this.online = online;
        }
        int getFreeRamGb() { return totalRamGb - usedRamGb; }
        boolean deploy(int required) { if (!online || required <= 0 || getFreeRamGb() < required) return false; usedRamGb += required; return true; }
        @Override public String toString() { return ipAddress + "[" + usedRamGb + "/" + totalRamGb + " GB, online=" + online + "]"; }
    }
    static class DataCenterCluster {
        private final String clusterLocation;
        private final ServerNode[] nodes;
        private int nodeCount;
        DataCenterCluster(String location, int capacity) { clusterLocation = location; nodes = new ServerNode[Math.max(1, capacity)]; }
        boolean addNode(ServerNode node) { if (node == null || nodeCount == nodes.length) return false; nodes[nodeCount++] = node; return true; }
        boolean deployContainer(int requiredRamGb) {
            for (int i = 0; i < nodeCount; i++) if (nodes[i].deploy(requiredRamGb)) return true;
            return false;
        }
        @Override public String toString() { return "Cluster[" + clusterLocation + ", " + Arrays.toString(Arrays.copyOf(nodes, nodeCount)) + "]"; }
    }
    static class CourseModule {
        private final String topic;
        private final int lectureHours, practiceHours;
        private double maxScore;
        CourseModule(String topic, int lectures, int practices, double maxScore) {
            this.topic = topic; lectureHours = Math.max(0, lectures); practiceHours = Math.max(0, practices); this.maxScore = Math.max(0, maxScore);
        }
        int getTotalHours() { return lectureHours + practiceHours; }
        @Override public String toString() { return topic + " (" + getTotalHours() + " год, " + maxScore + " балів)"; }
    }
    static class UniversityCourse {
        private final String courseTitle;
        private final CourseModule[] modules;
        private int moduleCount;
        UniversityCourse(String title, int capacity) { courseTitle = title; modules = new CourseModule[Math.max(1, capacity)]; }
        boolean addModule(CourseModule module) { if (module == null || moduleCount >= modules.length) return false; modules[moduleCount++] = module; return true; }
        double getEctsCredits() { int hours = 0; for (int i = 0; i < moduleCount; i++) hours += modules[i].getTotalHours(); return hours / 30.0; }
        boolean hasValidTotalScore() { double score = 0; for (int i = 0; i < moduleCount; i++) score += modules[i].maxScore; return Math.abs(score - 100) < 1e-9; }
        @Override public String toString() { return courseTitle + ": " + Arrays.toString(Arrays.copyOf(modules, moduleCount)); }
    }
    static class TrainCarriage {
        private final int carriageNumber;
        private final String type;
        private final int totalSeats;
        private int occupiedSeats;
        TrainCarriage(int number, String type, int seats) { carriageNumber = number; this.type = type; totalSeats = Math.max(0, seats); }
        int getFreeSeats() { return totalSeats - occupiedSeats; }
        boolean book(int seats) { if (seats <= 0 || seats > getFreeSeats()) return false; occupiedSeats += seats; return true; }
        @Override public String toString() { return "№" + carriageNumber + " " + type + ": " + occupiedSeats + "/" + totalSeats; }
    }
    static class PassengerTrain {
        private final String route;
        private final TrainCarriage[] carriages;
        private int carriageCount;
        PassengerTrain(String route, int capacity) { this.route = route; carriages = new TrainCarriage[Math.max(1, capacity)]; }
        boolean attachCarriage(TrainCarriage carriage) { if (carriage == null || carriageCount >= carriages.length) return false; carriages[carriageCount++] = carriage; return true; }
        int getTotalFreeSeats() { int count = 0; for (int i = 0; i < carriageCount; i++) count += carriages[i].getFreeSeats(); return count; }
        boolean bookTicketsInCarriage(int number, int seats) {
            for (int i = 0; i < carriageCount; i++) if (carriages[i].carriageNumber == number) return carriages[i].book(seats);
            return false;
        }
        @Override public String toString() { return "Train[" + route + ", " + Arrays.toString(Arrays.copyOf(carriages, carriageCount)) + "]"; }
    }
    static class LinearEquation {
        private final double a, b, c;
        LinearEquation(double a, double b, double c) { this.a = a; this.b = b; this.c = c; }
        boolean isSatisfiedBy(double x, double y) { return Math.abs(a * x + b * y - c) < 1e-6; }
        @Override public String toString() { return String.format("%.2fx + %.2fy = %.2f", a, b, c); }
    }
    static class EquationSystem {
        private final LinearEquation[] equations;
        private int count;
        EquationSystem(int capacity) { equations = new LinearEquation[Math.max(1, capacity)]; }
        boolean addEquation(LinearEquation eq) { if (eq == null || count >= equations.length) return false; equations[count++] = eq; return true; }
        boolean checkSolution(double x, double y) {
            if (count == 0) return false;
            for (int i = 0; i < count; i++) if (!equations[i].isSatisfiedBy(x, y)) return false;
            return true;
        }
        @Override public String toString() { return "System" + Arrays.toString(Arrays.copyOf(equations, count)); }
    }

    // Блок 4: абстрактні класи та шаблонні методи
    static abstract class AbstractShape {
        private final String color;
        AbstractShape(String color) { this.color = color; }
        public abstract double getArea();
        public abstract double getPerimeter();
        @Override public String toString() { return String.format("Shape[%s, S=%.2f, P=%.2f]", color, getArea(), getPerimeter()); }
    }
    static class CircleShape extends AbstractShape {
        private final double radius;
        CircleShape(String color, double r) { super(color); radius = Math.max(0, r); }
        @Override public double getArea() { return Math.PI * radius * radius; }
        @Override public double getPerimeter() { return 2 * Math.PI * radius; }
        @Override public String toString() { return "Circle " + super.toString(); }
    }
    static class RectangleShape extends AbstractShape {
        private final double width, height;
        RectangleShape(String color, double w, double h) { super(color); width = Math.max(0, w); height = Math.max(0, h); }
        @Override public double getArea() { return width * height; }
        @Override public double getPerimeter() { return 2 * (width + height); }
        @Override public String toString() { return "Rectangle " + super.toString(); }
    }
    static abstract class AbstractPowerPlant {
        private final String stationName;
        protected double baseCapacityMw;
        AbstractPowerPlant(String name, double capacity) { stationName = name; baseCapacityMw = Math.max(0, capacity); }
        public abstract double generateMegawatts();
        double calculateDailyProfit(double tariffPerMwh) { return generateMegawatts() * 24 * tariffPerMwh; }
        @Override public String toString() { return String.format("%s: %.2f МВт", stationName, generateMegawatts()); }
    }
    static class SolarPowerPlant extends AbstractPowerPlant {
        private double sunIntensityFactor;
        SolarPowerPlant(String name, double capacity, double factor) { super(name, capacity); sunIntensityFactor = Math.max(0, Math.min(1, factor)); }
        @Override public double generateMegawatts() { return baseCapacityMw * sunIntensityFactor; }
    }
    static class WindPowerPlant extends AbstractPowerPlant {
        private double windSpeedMs;
        WindPowerPlant(String name, double capacity, double speed) { super(name, capacity); windSpeedMs = speed; }
        @Override public double generateMegawatts() { return windSpeedMs < 3 || windSpeedMs > 25 ? 0 : baseCapacityMw * Math.min(1, windSpeedMs / 12.0); }
    }
    static abstract class AbstractEmployee {
        private final int id;
        private final String name;
        protected double taxRate = 0.195;
        AbstractEmployee(int id, String name) { this.id = id; this.name = name; }
        public abstract double calculateGrossSalary();
        public final double calculateNetSalary() { return calculateGrossSalary() * (1 - taxRate); }
        @Override public String toString() { return id + " — " + name; }
    }
    static class SalariedEmployee extends AbstractEmployee {
        private double monthlySalary, bonus;
        SalariedEmployee(int id, String name, double salary, double bonus) { super(id, name); monthlySalary = Math.max(0, salary); this.bonus = Math.max(0, bonus); }
        @Override public double calculateGrossSalary() { return monthlySalary + bonus; }
    }
    static class HourlyContractor extends AbstractEmployee {
        private int hoursWorked;
        private double hourlyRate;
        HourlyContractor(int id, String name, int hours, double rate) { super(id, name); hoursWorked = Math.max(0, hours); hourlyRate = Math.max(0, rate); }
        @Override public double calculateGrossSalary() { return hourlyRate * (Math.min(hoursWorked, 160) + 1.5 * Math.max(0, hoursWorked - 160)); }
    }
    static abstract class AbstractSequence {
        private final String title;
        AbstractSequence(String title) { this.title = title; }
        public abstract double getTerm(int index);
        double sumFirstN(int n) { double total = 0; for (int i = 1; i <= n; i++) total += getTerm(i); return total; }
        @Override public String toString() { return title; }
    }
    static class HarmonicSequence extends AbstractSequence {
        HarmonicSequence() { super("Гармонічна послідовність"); }
        @Override public double getTerm(int index) { return index < 1 ? 0 : 1.0 / index; }
    }
    static class SquareNumbersSequence extends AbstractSequence {
        SquareNumbersSequence() { super("Квадрати чисел"); }
        @Override public double getTerm(int index) { return index < 1 ? 0 : (double) index * index; }
    }
    static abstract class AbstractTransaction {
        private final String txId;
        protected final double amount;
        AbstractTransaction(String id, double amount) { txId = id; this.amount = Math.max(0, amount); }
        public abstract double calculateCommission();
        public final double getTotalDebit() { return amount + calculateCommission(); }
        @Override public String toString() { return txId + " (" + amount + " грн)"; }
    }
    static class DomesticTransfer extends AbstractTransaction {
        DomesticTransfer(String id, double amount) { super(id, amount); }
        @Override public double calculateCommission() { return Math.max(5, amount * 0.005); }
    }
    static class CryptoTransfer extends AbstractTransaction {
        private final double networkGasFee;
        CryptoTransfer(String id, double amount, double fee) { super(id, amount); networkGasFee = Math.max(0, fee); }
        @Override public double calculateCommission() { return networkGasFee; }
    }
    static abstract class Solid3D {
        private final String materialName;
        private final double densityKgPerM3;
        Solid3D(String material, double density) { materialName = material; densityKgPerM3 = Math.max(0, density); }
        public abstract double getVolume();
        public abstract double getSurfaceArea();
        public final double getMassKg() { return densityKgPerM3 * getVolume(); }
        @Override public String toString() { return String.format("%s, V=%.4f м³", materialName, getVolume()); }
    }
    static class Sphere3D extends Solid3D {
        private final double radius;
        Sphere3D(String name, double density, double r) { super(name, density); radius = Math.max(0, r); }
        @Override public double getVolume() { return 4.0 / 3 * Math.PI * Math.pow(radius, 3); }
        @Override public double getSurfaceArea() { return 4 * Math.PI * radius * radius; }
    }
    static class Cylinder3D extends Solid3D {
        private final double radius, height;
        Cylinder3D(String name, double density, double r, double h) { super(name, density); radius = Math.max(0, r); height = Math.max(0, h); }
        @Override public double getVolume() { return Math.PI * radius * radius * height; }
        @Override public double getSurfaceArea() { return 2 * Math.PI * radius * (radius + height); }
    }
    static abstract class AbstractSensor {
        private final String location;
        private final double minSafe, maxSafe;
        AbstractSensor(String location, double min, double max) {
            this.location = location; minSafe = Math.min(min, max); maxSafe = Math.max(min, max);
        }
        public abstract double readValue();
        public abstract String getUnit();
        public final boolean isAlarmTriggered() { double value = readValue(); return value < minSafe || value > maxSafe; }
        @Override public String toString() { return String.format("%s: %.3f %s, safe=[%.3f; %.3f]", location, readValue(), getUnit(), minSafe, maxSafe); }
    }
    static class PressureSensor extends AbstractSensor {
        private double rawPressure, calibrationFactor;
        PressureSensor(String place, double min, double max, double pressure, double factor) { super(place, min, max); rawPressure = pressure; calibrationFactor = factor; }
        @Override public double readValue() { return rawPressure * calibrationFactor; }
        @Override public String getUnit() { return "бар"; }
    }
    static class RadiationSensor extends AbstractSensor {
        private double microsievertsPerHour;
        RadiationSensor(String place, double min, double max, double reading) { super(place, min, max); microsievertsPerHour = reading; }
        @Override public double readValue() { return microsievertsPerHour; }
        @Override public String getUnit() { return "мкЗв/год"; }
    }
    static abstract class AbstractCompressor {
        private final String algorithmName;
        AbstractCompressor(String name) { algorithmName = name; }
        public abstract int estimateCompressedSize(int originalSizeBytes);
        double getCompressionRatio(int originalSizeBytes) {
            if (originalSizeBytes <= 0) return 0;
            return 100.0 * (1 - estimateCompressedSize(originalSizeBytes) / (double) originalSizeBytes);
        }
        @Override public String toString() { return algorithmName; }
    }
    static class ZipCompressor extends AbstractCompressor {
        ZipCompressor() { super("ZIP"); }
        @Override public int estimateCompressedSize(int bytes) { return (int) Math.round(Math.max(0, bytes) * 0.55); }
    }
    static class UltraLzmaCompressor extends AbstractCompressor {
        UltraLzmaCompressor() { super("Ultra LZMA"); }
        @Override public int estimateCompressedSize(int bytes) { return (int) Math.round(Math.max(0, bytes) * 0.30) + 128; }
    }

    // Блок 5: поєднання інкапсуляції, композиції та абстрактних класів
    static abstract class AbstractPcPart {
        private final String model;
        private final double priceUah;
        AbstractPcPart(String model, double price) { this.model = model; priceUah = Math.max(0, price); }
        public abstract int getPowerConsumptionWatts();
        @Override public String toString() { return model + " (" + priceUah + " грн, " + getPowerConsumptionWatts() + " Вт)"; }
    }
    static class ProcessorPart extends AbstractPcPart {
        private final int cores, watts;
        ProcessorPart(String model, int cores, int watts, double price) { super(model, price); this.cores = Math.max(1, cores); this.watts = Math.max(0, watts); }
        @Override public int getPowerConsumptionWatts() { return watts; }
    }
    static class VideoCardPart extends AbstractPcPart {
        private final int vramGb, watts;
        VideoCardPart(String model, int vram, int watts, double price) { super(model, price); vramGb = Math.max(0, vram); this.watts = Math.max(0, watts); }
        @Override public int getPowerConsumptionWatts() { return watts; }
    }
    static class DesktopPC {
        private final int psuMaxWatts;
        private final AbstractPcPart[] parts;
        private int count;
        DesktopPC(int psu, int capacity) { psuMaxWatts = Math.max(0, psu); parts = new AbstractPcPart[Math.max(1, capacity)]; }
        boolean addPart(AbstractPcPart part) { if (part == null || count >= parts.length) return false; parts[count++] = part; return true; }
        int getTotalWatts() { int total = 0; for (int i = 0; i < count; i++) total += parts[i].getPowerConsumptionWatts(); return total; }
        boolean hasSufficientPsu() { return psuMaxWatts >= getTotalWatts() * 1.20; }
        @Override public String toString() { return "DesktopPC[БЖ=" + psuMaxWatts + " Вт; споживання=" + getTotalWatts() + " Вт; " + Arrays.toString(Arrays.copyOf(parts, count)) + "]"; }
    }
    static abstract class AbstractThruster {
        private final String thrusterId;
        AbstractThruster(String id) { thrusterId = id; }
        public abstract double getThrustKn();
        public abstract double getFuelBurnRate();
        @Override public String toString() { return thrusterId + " [" + getThrustKn() + " кН, витрата " + getFuelBurnRate() + "]"; }
    }
    static class ChemicalThruster extends AbstractThruster {
        private final double thrust, burnRate;
        ChemicalThruster(String id, double thrust, double burn) { super(id); this.thrust = Math.max(0, thrust); burnRate = Math.max(0, burn); }
        @Override public double getThrustKn() { return thrust; }
        @Override public double getFuelBurnRate() { return burnRate; }
    }
    static class IonThruster extends AbstractThruster {
        private final double thrust, burnRate;
        IonThruster(String id, double thrust, double burn) { super(id); this.thrust = Math.max(0, thrust); burnRate = Math.max(0, burn); }
        @Override public double getThrustKn() { return thrust; }
        @Override public double getFuelBurnRate() { return burnRate; }
    }
    static class Spacecraft {
        private final String shipName;
        private final double dryMassTons;
        private final AbstractThruster[] thrusters;
        private int count;
        Spacecraft(String name, double mass, int capacity) { shipName = name; dryMassTons = Math.max(0.01, mass); thrusters = new AbstractThruster[Math.max(1, capacity)]; }
        boolean addThruster(AbstractThruster engine) { if (engine == null || count == thrusters.length) return false; thrusters[count++] = engine; return true; }
        double getTotalThrustKn() { double sum = 0; for (int i = 0; i < count; i++) sum += thrusters[i].getThrustKn(); return sum; }
        double getInitialAcceleration() { return getTotalThrustKn() / dryMassTons; } // кН/т = м/с²
        @Override public String toString() { return shipName + ": " + Arrays.toString(Arrays.copyOf(thrusters, count)); }
    }
    static class LandPlot {
        private final double totalPlotAreaM2;
        private final AbstractShape[] structures;
        private int count;
        LandPlot(double totalArea, int capacity) { totalPlotAreaM2 = Math.max(0, totalArea); structures = new AbstractShape[Math.max(1, capacity)]; }
        double getBuiltArea() { double sum = 0; for (int i = 0; i < count; i++) sum += structures[i].getArea(); return sum; }
        boolean addStructure(AbstractShape structure) {
            if (structure == null || count >= structures.length || getBuiltArea() + structure.getArea() > totalPlotAreaM2 * 0.6 + 1e-9) return false;
            structures[count++] = structure;
            return true;
        }
        double getFreeGreenArea() { return totalPlotAreaM2 - getBuiltArea(); }
        @Override public String toString() { return String.format("LandPlot[%.2f м², зайнято %.2f м², %d споруд]", totalPlotAreaM2, getBuiltArea(), count); }
    }
    static abstract class AbstractAsset {
        private final String ticker;
        protected double investedAmount;
        AbstractAsset(String ticker, double invested) { this.ticker = ticker; investedAmount = Math.max(0, invested); }
        public abstract double calculateAnnualReturn();
        double getInvestedAmount() { return investedAmount; }
        @Override public String toString() { return ticker + " [" + investedAmount + " грн]"; }
    }
    static class GovernmentBond extends AbstractAsset {
        private final double couponPercent;
        GovernmentBond(String name, double invested, double coupon) { super(name, invested); couponPercent = Math.max(0, coupon); }
        @Override public double calculateAnnualReturn() { return investedAmount * couponPercent / 100.0; }
    }
    static class DividendStock extends AbstractAsset {
        private final double growthPercent, dividendPercent, taxRate;
        DividendStock(String name, double invested, double growth, double dividend, double tax) {
            super(name, invested); growthPercent = growth; dividendPercent = dividend; taxRate = Math.max(0, Math.min(1, tax));
        }
        @Override public double calculateAnnualReturn() { return investedAmount * (growthPercent + dividendPercent * (1 - taxRate)) / 100.0; }
    }
    static class InvestmentPortfolio {
        private final String investorName;
        private final AbstractAsset[] assets;
        private int count;
        InvestmentPortfolio(String name, int capacity) { investorName = name; assets = new AbstractAsset[Math.max(1, capacity)]; }
        boolean addAsset(AbstractAsset asset) { if (asset == null || count == assets.length) return false; assets[count++] = asset; return true; }
        double getTotalInvested() { double sum = 0; for (int i = 0; i < count; i++) sum += assets[i].getInvestedAmount(); return sum; }
        double getExpectedAnnualProfit() { double sum = 0; for (int i = 0; i < count; i++) sum += assets[i].calculateAnnualReturn(); return sum; }
        @Override public String toString() { return String.format("Портфель %s: вкладено %.2f грн, очікуваний дохід %.2f грн", investorName, getTotalInvested(), getExpectedAnnualProfit()); }
    }
    static abstract class AbstractHeroUnit {
        private final String name;
        protected int hp;
        AbstractHeroUnit(String name, int hp) { this.name = name; this.hp = Math.max(0, hp); }
        public abstract int getCombatPower();
        public abstract String getRole();
        @Override public String toString() { return name + " [" + getRole() + ", HP=" + hp + ", CP=" + getCombatPower() + "]"; }
    }
    static class TankWarrior extends AbstractHeroUnit {
        private final int armor;
        TankWarrior(String name, int hp, int armor) { super(name, hp); this.armor = Math.max(0, armor); }
        @Override public int getCombatPower() { return hp + armor * 5; }
        @Override public String getRole() { return "Tank"; }
    }
    static class ArcaneMage extends AbstractHeroUnit {
        private final int intelligence, spellPower;
        ArcaneMage(String name, int hp, int intelligence, int magic) { super(name, hp); this.intelligence = Math.max(0, intelligence); spellPower = Math.max(0, magic); }
        @Override public int getCombatPower() { return intelligence * 3 + spellPower * 4; }
        @Override public String getRole() { return "Mage"; }
    }
    static class RaidParty {
        private final String guildName;
        private final AbstractHeroUnit[] members;
        private int memberCount;
        RaidParty(String name, int capacity) { guildName = name; members = new AbstractHeroUnit[Math.max(1, capacity)]; }
        boolean addMember(AbstractHeroUnit member) { if (member == null || memberCount == members.length) return false; members[memberCount++] = member; return true; }
        int getTotalCombatPower() { int total = 0; for (int i = 0; i < memberCount; i++) total += members[i].getCombatPower(); return total; }
        boolean isReadyForRaid(int dungeonDifficulty) {
            boolean hasTank = false;
            for (int i = 0; i < memberCount; i++) if ("Tank".equals(members[i].getRole())) hasTank = true;
            return hasTank && getTotalCombatPower() > dungeonDifficulty;
        }
        @Override public String toString() { return "RaidParty[" + guildName + ", сила=" + getTotalCombatPower() + ", " + Arrays.toString(Arrays.copyOf(members, memberCount)) + "]"; }
    }
    static class EmergencySiren {
        private boolean sounding;
        void activate() { sounding = true; }
        void deactivate() { sounding = false; }
        boolean isSounding() { return sounding; }
    }
    static class SmartLab {
        private final EmergencySiren siren = new EmergencySiren();
        private final AbstractSensor[] sensors;
        private int count;
        SmartLab(int capacity) { sensors = new AbstractSensor[Math.max(1, capacity)]; }
        boolean addSensor(AbstractSensor sensor) { if (sensor == null || count == sensors.length) return false; sensors[count++] = sensor; return true; }
        void runDiagnostics() {
            siren.deactivate();
            for (int i = 0; i < count; i++) {
                boolean alarm = sensors[i].isAlarmTriggered();
                System.out.println(sensors[i] + " -> " + (alarm ? "НЕБЕЗПЕКА" : "норма"));
                if (alarm) siren.activate();
            }
            System.out.println("Сирена: " + (siren.isSounding() ? "УВІМКНЕНА" : "вимкнена"));
        }
        @Override public String toString() { return "SmartLab[датчиків=" + count + ", сирена=" + siren.isSounding() + "]"; }
    }
    static abstract class AbstractFilter {
        private final String filterName;
        AbstractFilter(String name) { filterName = name; }
        public abstract double processSample(double x);
        @Override public String toString() { return filterName; }
    }
    static class AmplifierFilter extends AbstractFilter {
        private final double gain;
        AmplifierFilter(double gain) { super("Amplifier"); this.gain = gain; }
        @Override public double processSample(double x) { return x * gain; }
    }
    static class ClippingFilter extends AbstractFilter {
        private final double threshold;
        ClippingFilter(double threshold) { super("Clipping"); this.threshold = Math.abs(threshold); }
        @Override public double processSample(double x) { return Math.max(-threshold, Math.min(threshold, x)); }
    }
    static class SignalProcessor {
        private final AbstractFilter[] pipeline;
        private int count;
        SignalProcessor(int capacity) { pipeline = new AbstractFilter[Math.max(1, capacity)]; }
        boolean addFilter(AbstractFilter filter) { if (filter == null || count == pipeline.length) return false; pipeline[count++] = filter; return true; }
        double[] process(double[] signal) {
            double[] output = signal == null ? new double[0] : Arrays.copyOf(signal, signal.length);
            for (int f = 0; f < count; f++) {
                for (int i = 0; i < output.length; i++) output[i] = pipeline[f].processSample(output[i]);
            }
            return output;
        }
        @Override public String toString() { return "SignalProcessor" + Arrays.toString(Arrays.copyOf(pipeline, count)); }
    }
}
