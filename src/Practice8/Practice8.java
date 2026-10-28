package Practice8;
import java.util.*;
public class Practice8 {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИЧНА РОБОТА №8 ===");

        for (int number = 1; number <= 39; number++) {
            System.out.println("\n========== Завдання " + number + " ==========");
            try {
                run(number);
            } catch (Exception ex) {
                System.out.println("Помилка у завданні " + number + ": " + ex.getMessage());
            }
        }


    }

    private static void run(int n) {
        switch(n) {
            // Завдання 1
            case 1 -> {
                Student a = new Student("Олена",2,95);
                System.out.println(a);
                a.setCourse(9);
                a.setGpa(-5);
                System.out.println(a);
            }
            // Завдання 2
            case 2 -> {
                System.out.println(new Product("A-101","Монітор",6499.5,4));
                System.out.println(new Product("B-12","Миша",850,3));
            }
            // Завдання 3
            case 3 -> {
                Circle c = new Circle(-3);
                System.out.println(c);
                c.setRadius(5);
                System.out.println(c);
            }
            // Завдання 4
            case 4 -> {
                CardWallet w = new CardWallet("1234567890124589","1234",12500);
                System.out.println(w);
                System.out.println("PIN змінено: " + w.changePin("1234","5678"));
                System.out.println(w);
            }
            // Завдання 5
            case 5 -> {
                SensorNode s = new SensorNode("SN01",15.2,1.4);
                System.out.println(s);
            }
            // Завдання 6
            case 6 -> {
                double[] t = {
                    12,15,10,16
                };
                WeatherDay w = new WeatherDay("28.10.2026",t);
                t[0]=100;
                System.out.println(w);
            }
            // Завдання 7
            case 7 -> {
                IntRange r = new IntRange(20,5);
                System.out.println(r);
                System.out.println("Містить 10: " + r.contains(10));
                r.setRange(50,30);
                System.out.println(r);
            }
            // Завдання 8
            case 8 -> {
                InvoiceItem i = new InvoiceItem("Клавіатура",2,1500,10);
                System.out.println("Позиція чека: " + i);
            }
            // Завдання 9
            case 9 -> {
                System.out.println(new Employee("Іван",30000));
                System.out.println(new Developer("Марія",45000,"Java"));
            }
            // Завдання 10
            case 10 -> {
                System.out.println(new Dog("Рекс",3,15,"Вівчарка"));
                System.out.println(new Cat("Мурчик",2,4,true));
            }
            // Завдання 11
            case 11 -> {
                System.out.println(new PassengerCar("Toyota",180,50,5));
                System.out.println(new CargoTruck("Volvo",120,300,20));
            }
            // Завдання 12
            case 12 -> {
                System.out.println(new Rectangle(3,4));
                System.out.println(new Box3D(3,4,5));
            }
            // Завдання 13
            case 13 -> {
                UniversityStudent s = new UniversityStudent("Андрій",2007,"A01","КН",1500);
                Professor p = new Professor("Олег",1980,"Доцент",25);
                System.out.println(s+"; вік="+s.getAge(2026));
                System.out.println(p+"; вік="+p.getAge(2026));
            }
            // Завдання 14
            case 14 -> {
                System.out.println(new Smartphone("Samsung",20000,256,true));
                System.out.println(new Smartphone("Apple",30000,128));
                System.out.println(new Smartphone("Xiaomi"));
            }
            // Завдання 15
            case 15 -> {
                System.out.println(new PrintedBook("Кобзар","Шевченко",1840,250,"Тверда"));
                System.out.println(new AudioBook("Лісова пісня","Леся Українка",1911,135,"Олена"));
            }
            // Завдання 16
            case 16 -> {
                System.out.println(new Gamer("player",1000));
                System.out.println(new ProEsportsPlayer("pro",5000,"NAVI",100000,5));
            }
            // Завдання 17
            case 17 -> {
                System.out.println(new StaffMember("Іван",20000));
                System.out.println(new Manager("Марія",30000,5000));
                System.out.println(new SalesPerson("Олег",20000,150000,5));
            }
            // Завдання 18
            case 18 -> {
                System.out.println(new StandardTransfer(1000));
                System.out.println(new InternationalTransfer(1000,"US"));
            }
            // Завдання 19
            case 19 -> {
                System.out.println(new Ticket("Концерт",1000));
                System.out.println(new StudentTicket("Концерт",1000,"S123"));
                System.out.println(new VipTicket("Концерт",1000,true,350));
            }
            // Завдання 20
            case 20 -> {
                System.out.println(new Weapon("Меч",100));
                System.out.println(new EnchantedSword("Меч вогню",100,"Вогонь",30,3));
            }
            // Завдання 21
            case 21 -> {
                System.out.println(new Parcel("NP01",3));
                System.out.println(new FragileParcel("NP02",3,true,10000));
            }
            // Завдання 22
            case 22 -> {
                System.out.println(new Appliance("Прилад",2000)+"; 8 год = "+new Appliance("Прилад",2000).getDailyConsumptionKWh(8));
                EcoHeater h = new EcoHeater("Обігрівач",2000,true);
                System.out.println(h+"; 8 год = "+h.getDailyConsumptionKWh(8));
            }
            // Завдання 23
            case 23 -> {
                System.out.println(new Point2D(3,4)+"; відстань="+new Point2D(3,4).distanceToOrigin());
                System.out.println(new Point3D(3,4,12)+"; відстань="+new Point3D(3,4,12).distanceToOrigin());
            }
            // Завдання 24
            case 24 -> {
                System.out.println(new Coffee("Середнє",300,65));
                System.out.println(new LatteWithAddons("Середнє",300,65,"Рослинне",2));
            }
            // Завдання 25
            case 25 -> {
                System.out.println(new DotaHero("Hero","Сила",600));
                System.out.println(new StrengthHero("Alchemist",600,25));
                AlchemistHero a = new AlchemistHero("Alchemist",600,25,120);
                System.out.println(a);
                System.out.println(a.chemicalRage());
            }
            // Завдання 26
            case 26 -> {
                System.out.println(new ElectricCar("Tesla",2026,400,4,75,500));
            }
            // Завдання 27
            case 27 -> {
                CashbackPlatinumCard c = new CashbackPlatinumCard("Олена",5000,2500,5);
                System.out.println("Оплата: "+c.pay(1000));
                System.out.println("Завелика оплата: "+c.pay(3000));
                System.out.println(c);
            }
            // Завдання 28
            case 28 -> {
                CustomTerminal t = new CustomTerminal();
                System.out.println(t.getWelcomeBanner());
                System.out.println(t.generateAuthHash("student"));
            }
            // Завдання 29
            case 29 -> {
                System.out.println(new ImmutableServerCredentials("localhost",8080,"very-secret-key"));
            }
            // Завдання 30
            case 30 -> {
                System.out.println(new Segment1D(3));
                System.out.println(new Square2D(3));
                System.out.println(new Cube3D(3));
            }
            // Завдання 31
            case 31 -> {
                System.out.println(new PostgraduateStudent(1,"user@mail.com","КН-01",92,"Штучний інтелект","Професор Іваненко"));
            }
            // Завдання 32
            case 32 -> {
                ControlledSubstance c = new ControlledSubstance("Препарат",300,false,"LIC01",20);
                System.out.println(c+"; можна продати з рецептом: "+c.canSell(true));
                System.out.println("Без рецепта: "+c.canSell(false));
            }
            // Завдання 33
            case 33 -> {
                System.out.println(new ArithmeticProgression(2,3));
                System.out.println(new GeometricProgression(2,3));
            }
            // Завдання 34
            case 34 -> {
                int[] grades= {
                    80,90,100
                };
                double[] weights= {
                    1,2,3
                };
                System.out.println(new GradeSheet("Олена",grades));
                System.out.println(new WeightedGradeSheet("Олена",grades,weights));
            }
            // Завдання 35
            case 35 -> {
                System.out.println(new LinearFunction(2,3));
                QuadraticFunction f=new QuadraticFunction(1,-4,3);
                System.out.println(f+"; f(2)="+f.evaluate(2)+"; x0="+f.vertexX());
            }
            // Завдання 36
            case 36 -> {
                System.out.println(new WarehouseItem("Ноутбук",4,new double[] {
                    20000,22000,21000
                }
                ));
                System.out.println(new DiscountedWarehouseItem("Монітор",3,new double[] {
                    8000,8500
                }
                ,"Уцінка",15));
            }
            // Завдання 37
            case 37 -> {
                CinemaHall a=new CinemaHall("Зал 1",3,4,180);
                a.bookSeat(0,0);
                System.out.println(a);
                VipCinemaHall v=new VipCinemaHall("VIP",3,4,300,100);
                v.bookSeat(2,1);
                v.bookSeat(0,0);
                System.out.println(v);
            }
            // Завдання 38
            case 38 -> {
                TeamLead t=new TeamLead("Ірина",60000,"Java",3);
                t.addTeamMember(new Developer("Олег",35000,"Java"));
                t.addTeamMember(new Developer("Анна",40000,"Kotlin"));
                System.out.println(t);
            }
            // Завдання 39
            case 39 -> {
                ShieldedPaladin p=new ShieldedPaladin("Паладин",100,10,30);
                System.out.println(p);
                p.takeDamage(20);
                p.takeDamage(50);
                System.out.println(p);
            }
            // Завдання 40

            default -> System.out.println("Невідоме завдання.");
        }
    }
    static class Student {
        private String name;
        private int course;
        private double gpa;
        Student(String n,int c,double g) {
            name=n;
            setCourse(c);
            setGpa(g);
        }
        public String getName() {
            return name;
        }
        public int getCourse() {
            return course;
        }
        public double getGpa() {
            return gpa;
        }
        public void setName(String n) {
            name=n;
        }
        public void setCourse(int c) {
            course=(c>=1&&c<=6)?c:1;
        }
        public void setGpa(double g) {
            gpa=(g>=0&&g<=100)?g:60;
        }
        @Override public String toString() {
            return "Student{name='"+name+"', course="+course+", gpa="+gpa+"}";
        }
    }
    static class Product {
        private String sku,title;
        private double price;
        private int stock;
        Product(String s,String t,double p,int q) {
            sku=s;
            title=t;
            setPrice(p);
            setStock(q);
        }
        public void setPrice(double p) {
            price=Math.max(0,p);
        }
        public void setStock(int q) {
            stock=Math.max(0,q);
        }
        public double getTotalCost() {
            return price*stock;
        }
        @Override public String toString() {
            return String.format(Locale.US,"[SKU: %s] %s | Ціна: %.2f грн | Залишок: %d шт. | Разом: %.2f грн",sku,title,price,stock,getTotalCost());
        }
    }
    static class Circle {
        private double radius;
        Circle(double r) {
            setRadius(r);
        }
        public void setRadius(double r) {
            radius=r>0?r:1;
        }
        public double getArea() {
            return Math.PI*radius*radius;
        }
        public double getCircumference() {
            return 2*Math.PI*radius;
        }
        @Override public String toString() {
            return String.format(Locale.US,"Коло: r=%.2f, площа=%.2f, довжина=%.2f",radius,getArea(),getCircumference());
        }
    }
    static class CardWallet {
        private String cardNumber,pinCode;
        private double balance;
        CardWallet(String c,String p,double b) {
            cardNumber=c;
            pinCode=p;
            balance=Math.max(0,b);
        }
        public boolean changePin(String oldPin,String newPin) {
            if(!pinCode.equals(oldPin)||newPin==null||newPin.isBlank())return false;
            pinCode=newPin;
            return true;
        }
        @Override public String toString() {
            String last=cardNumber.length()>=4?cardNumber.substring(cardNumber.length()-4):"????";
            return String.format(Locale.US,"CardWallet{card='**** **** **** %s', balance=%.2f UAH}",last,balance);
        }
    }
    static class SensorNode {
        private String sensorId;
        protected double calibrationOffset;
        private double rawValue;
        SensorNode(String id,double raw,double offset) {
            sensorId=id;
            rawValue=raw;
            calibrationOffset=offset;
        }
        public String getSensorId() {
            return sensorId;
        }
        public double getCalibratedValue() {
            return rawValue+calibrationOffset;
        }
        @Override public String toString() {
            return "SensorNode{"+sensorId+", raw="+rawValue+", calibrated="+getCalibratedValue()+"}";
        }
    }
    static class WeatherDay {
        private String date;
        private double[] hourlyTemps;
        WeatherDay(String d,double[] t) {
            date=d;
            hourlyTemps=t==null?new double[0]:t.clone();
        }
        public double getMinTemp() {
            if(hourlyTemps.length==0)return 0;
            double v=hourlyTemps[0];
            for(double t:hourlyTemps)v=Math.min(v,t);
            return v;
        }
        public double getMaxTemp() {
            if(hourlyTemps.length==0)return 0;
            double v=hourlyTemps[0];
            for(double t:hourlyTemps)v=Math.max(v,t);
            return v;
        }
        public double getAverageTemp() {
            if(hourlyTemps.length==0)return 0;
            double s=0;
            for(double t:hourlyTemps)s+=t;
            return s/hourlyTemps.length;
        }
        @Override public String toString() {
            return date+" "+Arrays.toString(hourlyTemps)+" середня="+getAverageTemp()+" мін="+getMinTemp()+" макс="+getMaxTemp();
        }
    }
    static class IntRange {
        private int min,max;
        IntRange(int a,int b) {
            setRange(a,b);
        }
        public void setRange(int a,int b) {
            min=Math.min(a,b);
            max=Math.max(a,b);
        }
        public boolean contains(int v) {
            return v>=min&&v<=max;
        }
        public int getLength() {
            return max-min;
        }
        @Override public String toString() {
            return "["+min+" .. "+max+"] (довжина: "+getLength()+")";
        }
    }
    static class InvoiceItem {
        private String description;
        private int quantity;
        private double unitPrice,discountPercent;
        InvoiceItem(String d,int q,double p,double disc) {
            description=d;
            quantity=Math.max(0,q);
            unitPrice=Math.max(0,p);
            discountPercent=Math.max(0,Math.min(50,disc));
        }
        public double getFinalAmount() {
            return quantity*unitPrice*(1-discountPercent/100);
        }
        @Override public String toString() {
            return String.format(Locale.US,"%s | %d шт. x %.2f | Знижка %.1f%% | До сплати %.2f грн",description,quantity,unitPrice,discountPercent,getFinalAmount());
        }
    }
    static class Employee {
        private String name;
        protected double salary;
        Employee(String n,double s) {
            name=n;
            salary=Math.max(0,s);
        }
        public String getName() {
            return name;
        }
        public double getSalary() {
            return salary;
        }
        @Override public String toString() {
            return "Employee{name='"+name+"', salary="+salary+"}";
        }
    }
    static class Developer extends Employee {
        private String programmingLanguage;
        Developer(String n,double s,String lang) {
            super(n,s);
            programmingLanguage=lang;
        }
        @Override public String toString() {
            return "Developer{"+super.toString()+", language='"+programmingLanguage+"'}";
        }
    }
    static class TeamLead extends Developer {
        private Developer[] teamMembers;
        private int memberCount;
        TeamLead(String n,double s,String lang,int capacity) {
            super(n,s,lang);
            teamMembers=new Developer[Math.max(0,capacity)];
        }
        public void addTeamMember(Developer d) {
            if(d!=null&&memberCount<teamMembers.length)teamMembers[memberCount++]=d;
        }
        public double getTotalTeamBudget() {
            double sum=getSalary();
            for(int i=0; i<memberCount; i++)sum+=teamMembers[i].getSalary();
            return sum;
        }
        @Override public String toString() {
            return "TeamLead{"+super.toString()+", budget="+getTotalTeamBudget()+", team="+Arrays.toString(Arrays.copyOf(teamMembers,memberCount))+"}";
        }
    }
    static class Animal {
        private String name;
        private int age;
        private double weight;
        Animal(String n,int a,double w) {
            name=n;
            age=Math.max(0,a);
            weight=Math.max(0,w);
        }
        @Override public String toString() {
            return "Animal{"+name+", "+age+" років, "+weight+" кг}";
        }
    }
    static class Dog extends Animal {
        private String breed;
        Dog(String n,int a,double w,String b) {
            super(n,a,w);
            breed=b;
        }
        public String fetchStick() {
            return "Собака приніс паличку";
        }
        @Override public String toString() {
            return "Dog{"+super.toString()+", порода="+breed+", "+fetchStick()+"}";
        }
    }
    static class Cat extends Animal {
        private boolean isIndoor;
        Cat(String n,int a,double w,boolean i) {
            super(n,a,w);
            isIndoor=i;
        }
        public String purr() {
            return "Мур-мур";
        }
        @Override public String toString() {
            return "Cat{"+super.toString()+", домашній="+isIndoor+", "+purr()+"}";
        }
    }
    static class Vehicle {
        protected String brand;
        protected int maxSpeed;
        protected double fuelTankCapacity;
        Vehicle(String b,int s,double f) {
            brand=b;
            maxSpeed=s;
            fuelTankCapacity=f;
        }
        @Override public String toString() {
            return "Vehicle{"+brand+", maxSpeed="+maxSpeed+", tank="+fuelTankCapacity+"}";
        }
    }
    static class PassengerCar extends Vehicle {
        private int passengerSeats;
        PassengerCar(String b,int s,double f,int seats) {
            super(b,s,f);
            passengerSeats=seats;
        }
        @Override public String toString() {
            return "PassengerCar{"+super.toString()+", місць="+passengerSeats+"}";
        }
    }
    static class CargoTruck extends Vehicle {
        private double maxLoadTons;
        CargoTruck(String b,int s,double f,double tons) {
            super(b,s,f);
            maxLoadTons=tons;
        }
        public double getFullLoadFuelConsumption() {
            return 20+maxLoadTons*0.5;
        }
        @Override public String toString() {
            return "CargoTruck{"+super.toString()+", вантаж="+maxLoadTons+" т, витрата="+getFullLoadFuelConsumption()+" л/100км}";
        }
    }
    static class Rectangle {
        private double width,height;
        Rectangle(double w,double h) {
            width=Math.max(0,w);
            height=Math.max(0,h);
        }
        public double getWidth() {
            return width;
        }
        public double getHeight() {
            return height;
        }
        public double getArea() {
            return width*height;
        }
        @Override public String toString() {
            return "Rectangle{"+width+"x"+height+", S="+getArea()+"}";
        }
    }
    static class Box3D extends Rectangle {
        private double depth;
        Box3D(double w,double h,double d) {
            super(w,h);
            depth=Math.max(0,d);
        }
        public double getVolume() {
            return super.getArea()*depth;
        }
        @Override public String toString() {
            return "Box3D{"+super.toString()+", depth="+depth+", V="+getVolume()+"}";
        }
    }
    static class Person {
        private String fullName;
        private int birthYear;
        Person(String n,int y) {
            fullName=n;
            birthYear=y;
        }
        public int getAge(int year) {
            return year-birthYear;
        }
        @Override public String toString() {
            return "Person{"+fullName+", "+birthYear+"}";
        }
    }
    static class UniversityStudent extends Person {
        private String studentId,major;
        private int scholarship;
        UniversityStudent(String n,int y,String id,String m,int s) {
            super(n,y);
            studentId=id;
            major=m;
            scholarship=s;
        }
        @Override public String toString() {
            return "UniversityStudent{"+super.toString()+", "+studentId+", "+major+", стипендія="+scholarship+"}";
        }
    }
    static class Professor extends Person {
        private String academicTitle;
        private int publicationsCount;
        Professor(String n,int y,String title,int count) {
            super(n,y);
            academicTitle=title;
            publicationsCount=count;
        }
        @Override public String toString() {
            return "Professor{"+super.toString()+", "+academicTitle+", публікацій="+publicationsCount+"}";
        }
    }
    static class Gadget {
        private String brand;
        private double price;
        Gadget(String b,double p) {
            brand=b;
            price=Math.max(0,p);
        }
        @Override public String toString() {
            return "Gadget{"+brand+", "+price+" грн}";
        }
    }
    static class Smartphone extends Gadget {
        private int memoryGb;
        private boolean has5G;
        Smartphone(String b,double p,int m,boolean g) {
            super(b,p);
            memoryGb=m;
            has5G=g;
        }
        Smartphone(String b,double p,int m) {
            this(b,p,m,true);
        }
        Smartphone(String b) {
            this(b,9999,128,false);
        }
        @Override public String toString() {
            return "Smartphone{"+super.toString()+", "+memoryGb+"GB, 5G="+has5G+"}";
        }
    }
    static class Publication {
        private String title,author;
        private int releaseYear;
        Publication(String t,String a,int y) {
            title=t;
            author=a;
            releaseYear=y;
        }
        @Override public String toString() {
            return "Publication{"+title+", "+author+", "+releaseYear+"}";
        }
    }
    static class PrintedBook extends Publication {
        private int pageCount;
        private String coverType;
        PrintedBook(String t,String a,int y,int p,String c) {
            super(t,a,y);
            pageCount=p;
            coverType=c;
        }
        @Override public String toString() {
            return "PrintedBook{"+super.toString()+", "+pageCount+" стор., обкладинка="+coverType+"}";
        }
    }
    static class AudioBook extends Publication {
        private int durationMinutes;
        private String narrator;
        AudioBook(String t,String a,int y,int m,String n) {
            super(t,a,y);
            durationMinutes=m;
            narrator=n;
        }
        public String formattedDuration() {
            return durationMinutes/60+" год "+durationMinutes%60+" хв";
        }
        @Override public String toString() {
            return "AudioBook{"+super.toString()+", "+formattedDuration()+", диктор="+narrator+"}";
        }
    }
    static class Gamer {
        private String nickname;
        private int hoursPlayed;
        Gamer(String n,int h) {
            nickname=n;
            hoursPlayed=h;
        }
        @Override public String toString() {
            return "Gamer{"+nickname+", годин="+hoursPlayed+"}";
        }
    }
    static class ProEsportsPlayer extends Gamer {
        private String teamName;
        private double prizeMoneyUSD;
        private int tournamentsWon;
        ProEsportsPlayer(String n,int h,String t,double p,int w) {
            super(n,h);
            teamName=t;
            prizeMoneyUSD=p;
            tournamentsWon=w;
        }
        public double getAveragePrizePerWin() {
            return tournamentsWon==0?0:prizeMoneyUSD/tournamentsWon;
        }
        @Override public String toString() {
            return "ProEsportsPlayer{"+super.toString()+", team="+teamName+", prize="+prizeMoneyUSD+", wins="+tournamentsWon+", avg="+getAveragePrizePerWin()+"}";
        }
    }
    static class StaffMember {
        private String name;
        protected double baseSalary;
        StaffMember(String n,double s) {
            name=n;
            baseSalary=s;
        }
        public double calculateMonthlyPay() {
            return baseSalary;
        }
        @Override public String toString() {
            return "Staff{"+name+", base="+baseSalary+", pay="+calculateMonthlyPay()+"}";
        }
    }
    static class Manager extends StaffMember {
        private double teamBonus;
        Manager(String n,double s,double b) {
            super(n,s);
            teamBonus=b;
        }
        @Override public double calculateMonthlyPay() {
            return super.calculateMonthlyPay()+teamBonus;
        }
        @Override public String toString() {
            return "Manager{"+super.toString()+", bonus="+teamBonus+"}";
        }
    }
    static class SalesPerson extends StaffMember {
        private double salesVolume,commissionRate;
        SalesPerson(String n,double s,double v,double r) {
            super(n,s);
            salesVolume=v;
            commissionRate=r;
        }
        @Override public double calculateMonthlyPay() {
            return super.calculateMonthlyPay()+salesVolume*commissionRate/100;
        }
        @Override public String toString() {
            return "SalesPerson{"+super.toString()+", sales="+salesVolume+", rate="+commissionRate+"%}";
        }
    }
    static class StandardTransfer {
        protected double amount;
        StandardTransfer(double a) {
            amount=Math.max(0,a);
        }
        public double getFee() {
            return amount*.01;
        }
        public double getTotalWithFee() {
            return amount+getFee();
        }
        @Override public String toString() {
            return "Transfer{"+amount+", fee="+getFee()+", total="+getTotalWithFee()+"}";
        }
    }
    static class InternationalTransfer extends StandardTransfer {
        private String countryCode;
        InternationalTransfer(double a,String c) {
            super(a);
            countryCode=c;
        }
        @Override public double getFee() {
            return super.getFee()*2+15;
        }
        @Override public String toString() {
            return "InternationalTransfer{"+super.toString()+", country="+countryCode+"}";
        }
    }
    static class Ticket {
        private String eventName;
        private double basePrice;
        Ticket(String e,double p) {
            eventName=e;
            basePrice=p;
        }
        public double getFinalPrice() {
            return basePrice;
        }
        @Override public String toString() {
            return "Ticket{"+eventName+", ціна="+getFinalPrice()+"}";
        }
    }
    static class StudentTicket extends Ticket {
        private String studentCardNumber;
        StudentTicket(String e,double p,String n) {
            super(e,p);
            studentCardNumber=n;
        }
        @Override public double getFinalPrice() {
            return super.getFinalPrice()*.5;
        }
        @Override public String toString() {
            return "StudentTicket{"+super.toString()+", студентський="+studentCardNumber+"}";
        }
    }
    static class VipTicket extends Ticket {
        private boolean includesBackstage;
        private double loungeFee;
        VipTicket(String e,double p,boolean b,double f) {
            super(e,p);
            includesBackstage=b;
            loungeFee=f;
        }
        @Override public double getFinalPrice() {
            return super.getFinalPrice()+loungeFee;
        }
        @Override public String toString() {
            return "VipTicket{"+super.toString()+", backstage="+includesBackstage+", lounge="+loungeFee+"}";
        }
    }
    static class Weapon {
        private String title;
        private int baseDamage;
        Weapon(String t,int d) {
            title=t;
            baseDamage=d;
        }
        public int calculateDamage() {
            return baseDamage;
        }
        @Override public String toString() {
            return "Weapon{"+title+", physical="+baseDamage+", total="+calculateDamage()+"}";
        }
    }
    static class EnchantedSword extends Weapon {
        private String element;
        private int magicPower,enchantmentLevel;
        EnchantedSword(String t,int d,String e,int m,int l) {
            super(t,d);
            element=e;
            magicPower=m;
            enchantmentLevel=l;
        }
        @Override public int calculateDamage() {
            return super.calculateDamage()+magicPower*enchantmentLevel;
        }
        @Override public String toString() {
            return "EnchantedSword{"+super.toString()+", element="+element+", magic="+magicPower+"x"+enchantmentLevel+", total="+calculateDamage()+"}";
        }
    }
    static class Parcel {
        private String trackingCode;
        private double weightKg;
        Parcel(String t,double w) {
            trackingCode=t;
            weightKg=Math.max(0,w);
        }
        public double calculateShippingCost() {
            return 50+weightKg*12;
        }
        @Override public String toString() {
            return "Parcel{"+trackingCode+", "+weightKg+" кг, ціна="+calculateShippingCost()+"}";
        }
    }
    static class FragileParcel extends Parcel {
        private boolean requiresWoodenBox;
        private double insuranceValue;
        FragileParcel(String t,double w,boolean b,double i) {
            super(t,w);
            requiresWoodenBox=b;
            insuranceValue=i;
        }
        @Override public double calculateShippingCost() {
            return super.calculateShippingCost()+insuranceValue*.015+(requiresWoodenBox?120:0);
        }
        @Override public String toString() {
            return "FragileParcel{"+super.toString()+", обрешітка="+requiresWoodenBox+", страхування="+insuranceValue+"}";
        }
    }
    static class Appliance {
        private String model;
        private double powerWatts;
        Appliance(String m,double p) {
            model=m;
            powerWatts=p;
        }
        public double getDailyConsumptionKWh(int hours) {
            return powerWatts*Math.max(0,hours)/1000;
        }
        @Override public String toString() {
            return "Appliance{"+model+", power="+powerWatts+" W}";
        }
    }
    static class EcoHeater extends Appliance {
        private boolean ecoModeActive;
        EcoHeater(String m,double p,boolean e) {
            super(m,p);
            ecoModeActive=e;
        }
        @Override public double getDailyConsumptionKWh(int hours) {
            return super.getDailyConsumptionKWh(hours)*(ecoModeActive?.75:1);
        }
        @Override public String toString() {
            return "EcoHeater{"+super.toString()+", eco="+ecoModeActive+"}";
        }
    }
    static class Point2D {
        private double x,y;
        Point2D(double x,double y) {
            this.x=x;
            this.y=y;
        }
        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
        public double distanceToOrigin() {
            return Math.sqrt(x*x+y*y);
        }
        @Override public String toString() {
            return "("+x+"; "+y+")";
        }
    }
    static class Point3D extends Point2D {
        private double z;
        Point3D(double x,double y,double z) {
            super(x,y);
            this.z=z;
        }
        @Override public double distanceToOrigin() {
            return Math.sqrt(Math.pow(super.distanceToOrigin(),2)+z*z);
        }
        @Override public String toString() {
            return "("+getX()+"; "+getY()+"; "+z+")";
        }
    }
    static class Coffee {
        private String roastType;
        private int volumeMl;
        private double basePrice;
        Coffee(String r,int v,double p) {
            roastType=r;
            volumeMl=v;
            basePrice=p;
        }
        public double calculatePrice() {
            return basePrice;
        }
        public double calculateCalories() {
            return volumeMl*.1;
        }
        @Override public String toString() {
            return "Coffee{"+roastType+", "+volumeMl+" мл, ціна="+calculatePrice()+", ккал="+calculateCalories()+"}";
        }
    }
    static class LatteWithAddons extends Coffee {
        private String milkType;
        private int syrupPumps;
        LatteWithAddons(String r,int v,double p,String m,int s) {
            super(r,v,p);
            milkType=m;
            syrupPumps=Math.max(0,s);
        }
        @Override public double calculatePrice() {
            return super.calculatePrice()+(milkType.equalsIgnoreCase("Рослинне")?20:0)+syrupPumps*12;
        }
        @Override public double calculateCalories() {
            return super.calculateCalories()+syrupPumps*15+(milkType.equalsIgnoreCase("Рослинне")?10:0);
        }
        @Override public String toString() {
            return "Latte{"+super.toString()+", milk="+milkType+", syrup="+syrupPumps+"}";
        }
    }
    static class DotaHero {
        private String name,primaryAttribute;
        private int baseHp;
        DotaHero(String n,String a,int h) {
            name=n;
            primaryAttribute=a;
            baseHp=h;
        }
        public int getMaxHp() {
            return baseHp;
        }
        @Override public String toString() {
            return "DotaHero{"+name+", attr="+primaryAttribute+", HP="+getMaxHp()+"}";
        }
    }
    static class StrengthHero extends DotaHero {
        private int strength;
        StrengthHero(String n,int hp,int s) {
            super(n,"Сила",hp);
            strength=s;
        }
        @Override public int getMaxHp() {
            return super.getMaxHp()+strength*22;
        }
        @Override public String toString() {
            return "StrengthHero{"+super.toString()+", STR="+strength+"}";
        }
    }
    static class AlchemistHero extends StrengthHero {
        private int greevilsGreedBonusGold;
        AlchemistHero(String n,int hp,int s,int g) {
            super(n,hp,s);
            greevilsGreedBonusGold=g;
        }
        public String chemicalRage() {
            return "Chemical Rage активовано!";
        }
        @Override public String toString() {
            return "AlchemistHero{"+super.toString()+", bonusGold="+greevilsGreedBonusGold+"}";
        }
    }
    static class BaseVehicle {
        private String brand;
        private int year;
        BaseVehicle(String b,int y) {
            brand=b;
            year=y;
        }
        @Override public String toString() {
            return "BaseVehicle{"+brand+", "+year+"}";
        }
    }
    static class MotorCar extends BaseVehicle {
        private int horsePower,doorsCount;
        MotorCar(String b,int y,int h,int d) {
            super(b,y);
            horsePower=h;
            doorsCount=d;
        }
        @Override public String toString() {
            return "MotorCar{"+super.toString()+", hp="+horsePower+", дверей="+doorsCount+"}";
        }
    }
    static class ElectricCar extends MotorCar {
        private double batteryCapacityKWh;
        private int rangeKm;
        ElectricCar(String b,int y,int h,int d,double c,int r) {
            super(b,y,h,d);
            batteryCapacityKWh=c;
            rangeKm=r;
        }
        @Override public String toString() {
            return "ElectricCar{"+super.toString()+", battery="+batteryCapacityKWh+" kWh, range="+rangeKm+" км}";
        }
    }
    static class PaymentCard {
        private String cardHolder;
        protected double balance;
        PaymentCard(String h,double b) {
            cardHolder=h;
            balance=Math.max(0,b);
        }
        public boolean pay(double amount) {
            if(amount<=0||amount>balance)return false;
            balance-=amount;
            return true;
        }
        @Override public String toString() {
            return "PaymentCard{"+cardHolder+", balance="+balance+"}";
        }
    }
    static class DebitCard extends PaymentCard {
        private double dailyLimit;
        DebitCard(String h,double b,double l) {
            super(h,b);
            dailyLimit=l;
        }
        @Override public boolean pay(double a) {
            if(a>dailyLimit)return false;
            return super.pay(a);
        }
        @Override public String toString() {
            return "DebitCard{"+super.toString()+", limit="+dailyLimit+"}";
        }
    }
    static class CashbackPlatinumCard extends DebitCard {
        private double cashbackPercent,accumulatedCashback;
        CashbackPlatinumCard(String h,double b,double l,double p) {
            super(h,b,l);
            cashbackPercent=p;
        }
        @Override public boolean pay(double a) {
            if(!super.pay(a))return false;
            accumulatedCashback+=a*cashbackPercent/100;
            return true;
        }
        @Override public String toString() {
            return "CashbackPlatinumCard{"+super.toString()+", cashback="+accumulatedCashback+"}";
        }
    }
    static class SecurityTerminal {
        public final String generateAuthHash(String user) {
            return "AUTH-SHA-"+user.toUpperCase(Locale.ROOT);
        }
        public String getWelcomeBanner() {
            return "Вітаємо";
        }
    }
    static class CustomTerminal extends SecurityTerminal {
        @Override public String getWelcomeBanner() {
            return "Ласкаво просимо до захищеного термінала";
        }
        // generateAuthHash() — final, тому @Override у нащадку заборонений.
    }
    static final class ImmutableServerCredentials {
        private final String host,apiKey;
        private final int port;
        ImmutableServerCredentials(String h,int p,String key) {
            host=h;
            port=p;
            apiKey=key;
        }
        public String getHost() {
            return host;
        }
        public int getPort() {
            return port;
        }
        public String getApiKey() {
            return apiKey;
        }
        @Override public String toString() {
            return "ImmutableServerCredentials{host='"+host+"', port="+port+", apiKey='***SECRET***'}";
        }
    }
    static class Segment1D {
        protected double length;
        Segment1D(double l) {
            length=Math.max(0,l);
        }
        @Override public String toString() {
            return "Segment1D{length="+length+"}";
        }
    }
    static class Square2D extends Segment1D {
        Square2D(double l) {
            super(l);
        }
        public double getPerimeter() {
            return length*4;
        }
        public double getArea() {
            return length*length;
        }
        @Override public String toString() {
            return "Square2D{"+super.toString()+", P="+getPerimeter()+", S="+getArea()+"}";
        }
    }
    static class Cube3D extends Square2D {
        Cube3D(double l) {
            super(l);
        }
        @Override public double getArea() {
            return 6*super.getArea();
        }
        public double getVolume() {
            return length*length*length;
        }
        @Override public String toString() {
            return "Cube3D{"+super.toString()+", V="+getVolume()+"}";
        }
    }
    static class User {
        private int id;
        private String email;
        User(int id,String email) {
            this.id=id;
            this.email=email;
        }
        @Override public String toString() {
            return "User{"+id+", "+email+"}";
        }
    }
    static class StudentUser extends User {
        private String groupCode;
        protected double gpa;
        StudentUser(int i,String e,String group,double score) {
            super(i,e);
            groupCode=group;
            gpa=score;
        }
        @Override public String toString() {
            return "StudentUser{"+super.toString()+", group="+groupCode+", GPA="+gpa+"}";
        }
    }
    static class PostgraduateStudent extends StudentUser {
        private String thesisTopic,supervisorName;
        PostgraduateStudent(int i,String e,String gr,double g,String t,String s) {
            super(i,e,gr,g);
            thesisTopic=t;
            supervisorName=s;
        }
        public boolean canDefend() {
            return gpa>=85&&thesisTopic!=null&&!thesisTopic.isBlank();
        }
        @Override public String toString() {
            return "PostgraduateStudent{"+super.toString()+", topic="+thesisTopic+", supervisor="+supervisorName+", допуск="+canDefend()+"}";
        }
    }
    static class Medicine {
        private String name;
        private double price;
        private boolean isExpired;
        Medicine(String n,double p,boolean e) {
            name=n;
            price=p;
            isExpired=e;
        }
        public boolean isExpired() {
            return isExpired;
        }
        @Override public String toString() {
            return "Medicine{"+name+", price="+price+", expired="+isExpired+"}";
        }
    }
    static class PrescriptionMedicine extends Medicine {
        private String doctorLicense;
        PrescriptionMedicine(String n,double p,boolean e,String l) {
            super(n,p,e);
            doctorLicense=l;
        }
        public boolean canSell(boolean hasPrescription) {
            return !isExpired()&&hasPrescription;
        }
        @Override public String toString() {
            return "PrescriptionMedicine{"+super.toString()+", license="+doctorLicense+"}";
        }
    }
    static class ControlledSubstance extends PrescriptionMedicine {
        private int patientAge;
        ControlledSubstance(String n,double p,boolean e,String l,int age) {
            super(n,p,e,l);
            patientAge=age;
        }
        @Override public boolean canSell(boolean hasPrescription) {
            return super.canSell(hasPrescription)&&patientAge>=18;
        }
        @Override public String toString() {
            return "ControlledSubstance{"+super.toString()+", age="+patientAge+"}";
        }
    }
    static class Progression {
        protected double firstTerm,step;
        Progression(double f,double s) {
            firstTerm=f;
            step=s;
        }
        public double getTerm(int n) {
            return firstTerm;
        }
        public double[] generateFirstN(int n) {
            double[] a=new double[Math.max(0,n)];
            for(int i=0; i<a.length; i++)a[i]=getTerm(i+1);
            return a;
        }
        @Override public String toString() {
            return "Progression{"+Arrays.toString(generateFirstN(5))+"}";
        }
    }
    static class ArithmeticProgression extends Progression {
        ArithmeticProgression(double f,double d) {
            super(f,d);
        }
        @Override public double getTerm(int n) {
            return firstTerm+(n-1)*step;
        }
        @Override public String toString() {
            return "Arithmetic: a(n)="+firstTerm+"+(n-1)*"+step+"; "+Arrays.toString(generateFirstN(5));
        }
    }
    static class GeometricProgression extends Progression {
        GeometricProgression(double f,double q) {
            super(f,q);
        }
        @Override public double getTerm(int n) {
            return firstTerm*Math.pow(step,n-1);
        }
        @Override public String toString() {
            return "Geometric: b(n)="+firstTerm+"*"+step+"^(n-1); "+Arrays.toString(generateFirstN(5));
        }
    }
    static class GradeSheet {
        private String studentName;
        protected int[] grades;
        GradeSheet(String n,int[] g) {
            studentName=n;
            grades=g==null?new int[0]:g.clone();
        }
        public double calculateScore() {
            if(grades.length==0)return 0;
            double sum=0;
            for(int g:grades)sum+=g;
            return sum/grades.length;
        }
        @Override public String toString() {
            return "GradeSheet{"+studentName+", "+Arrays.toString(grades)+", score="+calculateScore()+"}";
        }
    }
    static class WeightedGradeSheet extends GradeSheet {
        private double[] weights;
        WeightedGradeSheet(String n,int[] g,double[] w) {
            super(n,g);
            weights=w==null?new double[0]:w.clone();
        }
        @Override public double calculateScore() {
            double sum=0,wSum=0;
            for(int i=0; i<Math.min(grades.length,weights.length); i++) {
                sum+=grades[i]*weights[i];
                wSum+=weights[i];
            }
            return wSum==0?0:sum/wSum;
        }
        @Override public String toString() {
            return "Weighted{"+super.toString()+", weights="+Arrays.toString(weights)+", score="+calculateScore()+"}";
        }
    }
    static class LinearFunction {
        protected double k,b;
        LinearFunction(double k,double b) {
            this.k=k;
            this.b=b;
        }
        public double evaluate(double x) {
            return k*x+b;
        }
        @Override public String toString() {
            return "f(x)="+k+"x+"+b;
        }
    }
    static class QuadraticFunction extends LinearFunction {
        private double a;
        QuadraticFunction(double a,double k,double b) {
            super(k,b);
            this.a=a;
        }
        @Override public double evaluate(double x) {
            return a*x*x+super.evaluate(x);
        }
        public double vertexX() {
            return a==0?Double.NaN:-k/(2*a);
        }
        @Override public String toString() {
            return "f(x)="+a+"x²+"+k+"x+"+b;
        }
    }
    static class WarehouseItem {
        private String name;
        private int quantity;
        private double[] priceHistory;
        WarehouseItem(String n,int q,double[] p) {
            name=n;
            quantity=Math.max(0,q);
            priceHistory=p==null?new double[0]:p.clone();
        }
        public int getQuantity() {
            return quantity;
        }
        public double getAveragePurchasePrice() {
            if(priceHistory.length==0)return 0;
            double s=0;
            for(double p:priceHistory)s+=p;
            return s/priceHistory.length;
        }
        @Override public String toString() {
            return "WarehouseItem{"+name+", qty="+quantity+", prices="+Arrays.toString(priceHistory)+", avg="+getAveragePurchasePrice()+"}";
        }
    }
    static class DiscountedWarehouseItem extends WarehouseItem {
        private String markdownReason;
        private double discountPercent;
        DiscountedWarehouseItem(String n,int q,double[] p,String r,double d) {
            super(n,q,p);
            markdownReason=r;
            discountPercent=Math.max(0,Math.min(100,d));
        }
        public double getSaleValue() {
            return getQuantity()*getAveragePurchasePrice()*(1-discountPercent/100);
        }
        @Override public String toString() {
            return "Discounted{"+super.toString()+", reason="+markdownReason+", discount="+discountPercent+"%, saleTotal="+getSaleValue()+"}";
        }
    }
    static class CinemaHall {
        private String hallName;
        protected boolean[][] seats;
        protected double baseTicketPrice;
        CinemaHall(String n,int rows,int cols,double price) {
            hallName=n;
            seats=new boolean[Math.max(1,rows)][Math.max(1,cols)];
            baseTicketPrice=price;
        }
        public boolean bookSeat(int row,int col) {
            if(row<0||row>=seats.length||col<0||col>=seats[row].length||seats[row][col])return false;
            seats[row][col]=true;
            return true;
        }
        public int getOccupiedCount() {
            int count=0;
            for(boolean[] row:seats)for(boolean x:row)if(x)count++;
            return count;
        }
        public double calculateRevenue() {
            return getOccupiedCount()*baseTicketPrice;
        }
        @Override public String toString() {
            StringBuilder sb=new StringBuilder(hallName+"\n");
            for(boolean[] row:seats) {
                for(boolean x:row)sb.append(x?"[X]":"[O]");
                sb.append('\n');
            }
            return sb+"Зайнято: "+getOccupiedCount()+", каса="+calculateRevenue();
        }
    }
    static class VipCinemaHall extends CinemaHall {
        private double complimentaryBarCost;
        VipCinemaHall(String n,int r,int c,double p,double b) {
            super(n,r,c,p);
            complimentaryBarCost=b;
        }
        @Override public double calculateRevenue() {
            double total=super.calculateRevenue();
            for(boolean occupied:seats[seats.length-1])if(occupied)total+=complimentaryBarCost;
            return total;
        }
        @Override public String toString() {
            return "VIP " +super.toString()+" (доплата за останній ряд: "+complimentaryBarCost+")";
        }
    }
    static class CharacterUnit {
        private String name;
        protected int hp,maxHp,armor;
        CharacterUnit(String n,int hp,int armor) {
            name=n;
            this.hp=Math.max(0,hp);
            maxHp=this.hp;
            this.armor=Math.max(0,armor);
        }
        public void takeDamage(int rawDamage) {
            if(rawDamage<=0)return;
            hp=Math.max(0,hp-Math.max(1,rawDamage-armor));
        }
        protected String hpBar() {
            int bars=maxHp==0?0:(int)Math.round(hp*10.0/maxHp);
            return "["+"█".repeat(bars)+"░".repeat(10-bars)+"]";
        }
        @Override public String toString() {
            return "Character{"+name+", HP="+hpBar()+" "+hp+"/"+maxHp+", armor="+armor+"}";
        }
    }
    static class ShieldedPaladin extends CharacterUnit {
        private int shieldPoints;
        ShieldedPaladin(String n,int hp,int armor,int shield) {
            super(n,hp,armor);
            shieldPoints=Math.max(0,shield);
        }
        @Override public void takeDamage(int rawDamage) {
            if(rawDamage<=0)return;
            int absorbed=Math.min(shieldPoints,rawDamage);
            shieldPoints-=absorbed;
            int remaining=rawDamage-absorbed;
            if(remaining>0)super.takeDamage(remaining);
        }
        @Override public String toString() {
            return "ShieldedPaladin{"+super.toString()+", shield="+shieldPoints+"}";
        }
    }
}
