package semester1.practice1;

import java.util.*;

public class Practice11 {
    public static void main(String[] args) {
        System.out.println("\n========== БЛОК 1 ==========");
        System.out.println("\n--- Завдання 1 ---");
            demonstrateWrapperTwins();
        System.out.println("\n--- Завдання 2 ---");
            showCompilerUnderTheHood();
        System.out.println("\n--- Завдання 3 ---");
            System.out.println("Числа: " + parseNumbersFromStrings(new String[]{"120", "-45", "300", "abc", "1024", ""}));
        System.out.println("\n--- Завдання 4 ---");
            {
                    System.out.println("Integer: " + Integer.MIN_VALUE + " ... " + Integer.MAX_VALUE);
                    System.out.println("Byte: " + Byte.MIN_VALUE + " ... " + Byte.MAX_VALUE);
                    System.out.println("Short: " + Short.MIN_VALUE + " ... " + Short.MAX_VALUE);
                    System.out.println("Long: " + Long.MIN_VALUE + " ... " + Long.MAX_VALUE);
                    findMinAndMax(List.of(14, -7, 52, 0, 29));
                    System.out.println("MAX_VALUE + 1 = " + (Integer.MAX_VALUE + 1));
                    int x = Integer.MAX_VALUE;
                    if (x < Integer.MAX_VALUE) x++;
                    else System.out.println("Додавання 1 заборонено: переповнення int");
            }
        System.out.println("\n--- Завдання 5 ---");
            testIntegerPool();
        System.out.println("\n--- Завдання 6 ---");
            {
                    ArrayList<Integer> temperatures = new ArrayList<>(Arrays.asList(18, 22, null, 15, null, 20));
                    try { int t = temperatures.get(2); System.out.println(t); }
                    catch (NullPointerException e) { System.out.println("null не можна розпакувати у int"); }
                    System.out.println("Сума без null: " + sumIgnoringNulls(temperatures));
            }
        System.out.println("\n--- Завдання 7 ---");
            {
                    System.out.println("Цифри: " + extractDigitsFromText("Server-04: CPU 85%, RAM 16GB"));
                    double a = Double.parseDouble("36.6");
                    Double b = Double.valueOf("99.95");
                    System.out.println(a + ", " + b + "; NaN? " + Double.isNaN(a) + "; Infinity? " + Double.isInfinite(b));
            }
        System.out.println("\n--- Завдання 8 ---");
            {
                    convertNumberSystems(42);
                    System.out.println("101010 (2) = " + Integer.parseInt("101010", 2));
                    System.out.println("FF (16) = " + Integer.parseInt("FF", 16));
            }
        System.out.println("\n========== БЛОК 2 ==========");
        System.out.println("\n--- Завдання 9 ---");
            {
                    String[] fixedArray = {"Київ", "Львів", "Одеса"};
                    try { fixedArray[3] = "Харків"; }
                    catch (ArrayIndexOutOfBoundsException e) { System.out.println("Масив не може прийняти четвертий елемент"); }
                    ArrayList<String> dynamicList = new ArrayList<>(Arrays.asList(fixedArray));
                    dynamicList.add("Харків"); dynamicList.add("Дніпро");
                    dynamicList.add(1, "Суми"); dynamicList.remove(0);
                    System.out.println("Масив: " + Arrays.toString(fixedArray) + "; ArrayList: " + dynamicList);
            }
        System.out.println("\n--- Завдання 10 ---");
            System.out.println("Ємності: " + traceArrayListCapacity(100));
        System.out.println("\n--- Завдання 11 ---");
            {
                    Object[] oldData = new Object[10];
                    for (int i = 0; i < oldData.length; i++) oldData[i] = i + 1;
                    Object[] newData = growArrayManually(oldData);
                    newData[10] = 11;
                    System.out.println("Було: " + Arrays.toString(oldData));
                    System.out.println("Стало: " + Arrays.toString(newData));
                    Object[] shifted = new Object[12];
                    System.arraycopy(newData, 0, shifted, 0, 11);
                    System.arraycopy(shifted, 2, shifted, 3, 9);
                    shifted[2] = 99;
                    System.out.println("Вставка на індекс 2: " + Arrays.toString(shifted));
            }
        System.out.println("\n--- Завдання 12 ---");
            {
                    ArrayList<String> pipeline = new ArrayList<>();
                    pipeline.add("Compile"); pipeline.add("Package"); pipeline.add("Deploy");
                    System.out.println(pipeline + ", size=" + pipeline.size());
                    pipeline.add(0, "Checkout Git"); System.out.println(pipeline + ", size=" + pipeline.size());
                    pipeline.add(2, "Run Unit Tests"); System.out.println(pipeline + ", size=" + pipeline.size());
            }
        System.out.println("\n--- Завдання 13 ---");
            {
                    ArrayList<Integer> speeds = new ArrayList<>(List.of(60, 85, 110, 95, 130));
                    System.out.println("Перший=" + speeds.get(0) + ", середній=" + speeds.get(speeds.size()/2) + ", останній=" + speeds.get(speeds.size()-1));
                    for (int i = 0; i < speeds.size(); i++)
                        if (speeds.get(i) > 100) System.out.println("Перевищення: " + speeds.set(i, 100) + " -> 100");
                    System.out.println(speeds);
            }
        System.out.println("\n--- Завдання 14 ---");
            {
                    SimpleArrayList list = new SimpleArrayList();
                    for (int i = 1; i <= 12; i++) list.add(i);
                    System.out.println("size=" + list.size() + ", capacity=" + list.getCapacity() + ", останній=" + list.get(11));
            }
        System.out.println("\n--- Завдання 15 ---");
            {
                    ArrayList<String> logs = new ArrayList<>(500);
                    logs.add("Start"); logs.add("Done");
                    logs.ensureCapacity(1000);
                    System.out.println("Після ensureCapacity(1000): " + logs + ", size=" + logs.size());
                    logs.trimToSize();
                    System.out.println("Після trimToSize(): " + logs + ", size=" + logs.size());
                    System.out.println("Ємність резервується заздалегідь, щоб скоротити копіювання масиву");
            }
        System.out.println("\n--- Завдання 16 ---");
            {
                    ArrayList<Integer> scores = new ArrayList<>(List.of(45, 88, 92, 59, 74, 100, 38, 65));
                    ArrayList<Integer> passed = extractPassedScores(scores, 60);
                    System.out.println("Всього: " + scores.size() + ", не пройшли: " + (scores.size()-passed.size()) + ", зараховано: " + passed);
            }
        System.out.println("\n========== БЛОК 3 ==========");
        System.out.println("\n--- Завдання 17 ---");
            {
                    ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 1, 40, 2));
                    numbers.remove(1); System.out.println("За індексом 1: " + numbers);
                    numbers.remove(Integer.valueOf(1)); numbers.remove(Integer.valueOf(2));
                    System.out.println("За значенням 1 та 2: " + numbers);
            }
        System.out.println("\n--- Завдання 18 ---");
            {
                    ArrayList<String> langs = new ArrayList<>(List.of("Java", "Python", "C++", "Java", "Kotlin", "Java"));
                    System.out.println("Kotlin? " + langs.contains("Kotlin") + ", Rust? " + langs.contains("Rust"));
                    System.out.println("Java: first=" + langs.indexOf("Java") + ", last=" + langs.lastIndexOf("Java") + ", count=" + countOccurrences(langs,"Java"));
            }
        System.out.println("\n--- Завдання 19 ---");
            {
                    ArrayList<String> cart = new ArrayList<>();
                    System.out.println("Порожній? " + cart.isEmpty() + ", size=" + cart.size());
                    cart.addAll(List.of("Хліб", "Молоко", "Чай", "Сир"));
                    System.out.println("Порожній? " + cart.isEmpty() + ", size=" + cart.size());
                    cart.clear();
                    System.out.println("Після clear(): " + cart + ", порожній? " + cart.isEmpty() + ", size=" + cart.size());
            }
        System.out.println("\n--- Завдання 20 ---");
            {
                    ArrayList<String> cities = new ArrayList<>(List.of("Київ", "Львів", "Одеса", "Харків", "Дніпро"));
                    Object[] objects = cities.toArray();
                    String[] strings = cities.toArray(new String[0]);
                    ArrayList<String> restored = new ArrayList<>(Arrays.asList(strings));
                    System.out.println(Arrays.toString(objects) + "\n" + Arrays.toString(strings) + "\n" + restored);
            }
        System.out.println("\n--- Завдання 21 ---");
            manageTaskList();
        System.out.println("\n--- Завдання 22 ---");
            {
                    System.out.println(deduplicate(List.of(5,12,5,8,12,20,5)));
                    System.out.println(deduplicate(List.of("Java", "SQL", "Java", "Git", "SQL")));
            }
        System.out.println("\n--- Завдання 23 ---");
            {
                    List<String> listA = List.of("Анна", "Богдан", "Олена", "Максим");
                    List<String> listB = List.of("Богдан", "Олена", "Ігор");
                    ArrayList<String> both = new ArrayList<>(listA); both.retainAll(listB);
                    ArrayList<String> onlyFirst = new ArrayList<>(listA); onlyFirst.removeAll(listB);
                    System.out.println("Обидва іспити: " + both + "; лише Java: " + onlyFirst);
            }
        System.out.println("\n--- Завдання 24 ---");
            {
                    List<String> names = new ArrayList<>(List.of("Java", "SQL", "Java", "Git", "Java"));
                    int changes = replaceAllValues(names, "Java", "Kotlin");
                    System.out.println("Замінено " + changes + ": " + names);
            }
        System.out.println("\n========== БЛОК 4 ==========");
        System.out.println("\n--- Завдання 25 ---");
            demonstrateTypeInference();
        System.out.println("\n--- Завдання 26 ---");
            demonstrateVarDiamondDanger();
        System.out.println("\n--- Завдання 27 ---");
            exploreCollectionHierarchy();
        System.out.println("\n--- Завдання 28 ---");
            {
                    List<List<String>> all = List.of(
                        new ArrayList<>(List.of("A", "B")), new LinkedList<>(List.of("C", "D")),
                        new Vector<>(List.of("E", "F")), new Stack<>());
                    all.get(3).addAll(List.of("G", "H"));
                    for (List<String> list : all) { printElements(list); printSummary(list); System.out.println("Останній=" + getFirstAndLast(list)); }
            }
        System.out.println("\n--- Завдання 29 ---");
            {
                    ArrayList<String> array = new ArrayList<>(List.of("Java", "Python"));
                    System.out.println("ArrayList get(1)=" + array.get(1));
                    LinkedList<String> linked = new LinkedList<>(); linked.addFirst("Перше"); linked.addLast("Останнє");
                    System.out.println("LinkedList: " + linked);
                    Vector<String> vector = new Vector<>(); vector.addElement("Vector"); System.out.println("Vector: " + vector.elementAt(0));
                    Stack<String> books = new Stack<>(); books.push("Книга 1"); books.push("Книга 2"); books.push("Книга 3");
                    System.out.println("Stack peek=" + books.peek());
                    while (!books.empty()) System.out.println("Stack pop=" + books.pop());
            }
        System.out.println("\n--- Завдання 30 ---");
            {
                    ArrayList<String> modules = new ArrayList<>(List.of("Core Java", "OOP", "Collections", "Streams", "Multithreading"));
                    Iterator<String> it = modules.iterator(); int length = 0;
                    while (it.hasNext()) { String module = it.next(); System.out.println(module); length += module.length(); }
                    System.out.println("Усього символів: " + length);
            }
        System.out.println("\n--- Завдання 31 ---");
            {
                    ArrayList<Integer> data = new ArrayList<>(List.of(15,-3,42,-10,8,-1,25));
                    try {
                        for (Integer x : data) if (x < 0) data.remove(x);
                    } catch (ConcurrentModificationException e) { System.out.println("Помилка: змінено список під час for-each"); }
                    data = new ArrayList<>(List.of(15,-3,42,-10,8,-1,25));
                    removeNegativesWithIterator(data); System.out.println("Після Iterator.remove(): " + data);
            }
        System.out.println("\n--- Завдання 32 ---");
            {
                    ArrayList<String> logs = new ArrayList<>(List.of("INFO: Start", "DEBUG: Init", "ERROR: Timeout", "DEBUG: Retry", "INFO: Done"));
                    Iterator<String> it = logs.iterator();
                    while (it.hasNext()) if (it.next().startsWith("DEBUG:")) it.remove();
                    ListIterator<String> listIt = logs.listIterator();
                    while (listIt.hasNext()) {
                        String line = listIt.next();
                        if (line.startsWith("ERROR")) listIt.set("CRITICAL " + line);
                    }
                    System.out.println("Вперед: " + logs);
                    while (listIt.hasPrevious()) System.out.println("Назад: " + listIt.previous());
            }
        System.out.println("\n========== БЛОК 5 ==========");
        System.out.println("\n--- Завдання 33 ---");
            {
                    List<Integer> evens = new ArrayList<>(), odds = new ArrayList<>();
                    splitEvenAndOdd(List.of(15,22,8,11,7,40,33), evens, odds);
                    System.out.println("Парні: " + evens + ", size=" + evens.size() + ", max=" + findMaximum(evens));
                    System.out.println("Непарні: " + odds + ", size=" + odds.size() + ", max=" + findMaximum(odds));
            }
        System.out.println("\n--- Завдання 34 ---");
            {
                    List<Integer> numbers = new ArrayList<>(List.of(5,12,17,20,23,27,30,35,40,45));
                    System.out.println("Видалено " + removeInRange(numbers, 17, 30) + ", залишилось " + numbers);
            }
        System.out.println("\n--- Завдання 35 ---");
            {
                    List<String> list = new ArrayList<>(List.of("A","B","C","D","E"));
                    reverseInPlace(list); System.out.println(list);
            }
        System.out.println("\n--- Завдання 36 ---");
            System.out.println(Arrays.toString(mergeUniqueToArray(List.of("Java", "SQL", "Git"), List.of("Git", "Python", "Java", "Docker"))));
        System.out.println("\n--- Завдання 37 ---");
            {
                    List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
                    rotateRight(list, 2); System.out.println(list);
            }
        System.out.println("\n--- Завдання 38 ---");
            {
                    List<String> receiptLines = List.of("Хліб: 35", "Молоко: 48", "Помилка сканера: N/A", "Кава: 240", "Пакет: 5", "Сир: 185");
                    var prices = new ArrayList<Integer>();
                    for (String line : receiptLines) {
                        try { prices.add(Integer.parseInt(line.substring(line.lastIndexOf(':') + 1).trim())); }
                        catch (NumberFormatException e) { System.out.println("Пропущено: " + line); }
                    }
                    Iterator<Integer> it = prices.iterator();
                    while (it.hasNext()) if (it.next() < 40) it.remove();
                    int total = 0; for (int price : prices) total += price;
                    System.out.println("Ціни після фільтрації: " + prices + ", сума=" + total + " грн");
            }
        System.out.println("\n--- Завдання 39 ---");
            compareListPerformance();
        System.out.println("\n--- Завдання 40 ---");
            System.out.println("Перевірка: javac -encoding UTF-8 -d . practice11/Practice11.java; після цього git add / commit / push (команди в README).");
        System.out.println("\n========== ВСІ ЗАВДАННЯ ЗАВЕРШЕНО ==========");
    }

    // Завдання 1
    public static void demonstrateWrapperTwins() {
        Object[] values = {Byte.valueOf((byte)10), Short.valueOf((short)500), Integer.valueOf(42),
            Long.valueOf(100L), Float.valueOf(3.14f), Double.valueOf(2.718),
            Character.valueOf('A'), Boolean.valueOf(true)};
        // ArrayList<int> bad = new ArrayList<>(); // Помилка: generic-тип не може бути примітивним.
        ArrayList<Integer> good = new ArrayList<>(); good.add(42);
        for (Object value : values) System.out.println(value.getClass().getSimpleName() + ": " + value);
        System.out.println("ArrayList<Integer>: " + good);
    }

    // Завдання 2
    public static void showCompilerUnderTheHood() {
        int a = 42;
        Integer boxed = a;
        ArrayList<Integer> list = new ArrayList<>(); list.add(100);
        int unboxed = list.get(0);
        Integer explicitBoxed = Integer.valueOf(a);
        ArrayList<Integer> explicitList = new ArrayList<>(); explicitList.add(Integer.valueOf(100));
        int explicitUnboxed = explicitList.get(0).intValue();
        Double d = Double.valueOf(3.14); double dv = d.doubleValue();
        Boolean b = Boolean.valueOf(true); boolean bv = b.booleanValue();
        System.out.println(boxed + ", " + unboxed + " = " + explicitBoxed + ", " + explicitUnboxed);
        System.out.println("Double=" + dv + ", Boolean=" + bv);
    }

    // Завдання 3
    public static List<Integer> parseNumbersFromStrings(String[] inputs) {
        List<Integer> result = new ArrayList<>(); int sum = 0;
        for (String str : inputs) {
            try { sum += Integer.parseInt(str); result.add(Integer.valueOf(str)); }
            catch (NumberFormatException e) { System.out.println("Некоректне число: '" + str + "'"); }
        }
        System.out.println("Сума: " + sum); return result;
    }

    // Завдання 4
    public static void findMinAndMax(List<Integer> numbers) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int x : numbers) { if (x < min) min = x; if (x > max) max = x; }
        System.out.println("Мінімум=" + min + ", максимум=" + max);
    }

    // Завдання 5
    public static void testIntegerPool() {
        Integer a = 100, b = 100, x = 250, y = 250;
        System.out.println("100: == " + (a == b) + ", equals " + a.equals(b));
        System.out.println("250: == " + (x == y) + ", equals " + x.equals(y));
        System.out.println("Для об'єктів Integer порівнюємо значення через equals, а не посилання через ==");
    }

    // Завдання 6
    public static int sumIgnoringNulls(List<Integer> list) {
        int sum = 0; for (Integer element : list) if (element != null) sum += element;
        return sum;
    }

    // Завдання 7
    public static List<Integer> extractDigitsFromText(String text) {
        List<Integer> digits = new ArrayList<>();
        for (char ch : text.toCharArray()) if (Character.isDigit(ch)) digits.add(Character.getNumericValue(ch));
        return digits;
    }

    // Завдання 8
    public static void convertNumberSystems(int number) {
        System.out.println("Двійкова: " + Integer.toBinaryString(number));
        System.out.println("Вісімкова: " + Integer.toOctalString(number));
        System.out.println("Шістнадцяткова: " + Integer.toHexString(number));
    }

    // Завдання 10
    public static List<Integer> traceArrayListCapacity(int elementsCount) {
        List<Integer> capacities = new ArrayList<>(); int capacity = 0;
        for (int size = 1; size <= elementsCount; size++) {
            if (size > capacity) {
                int previous = capacity;
                capacity = capacity == 0 ? 10 : capacity + (capacity >> 1);
                if (capacity < size) capacity = size;
                capacities.add(capacity);
                System.out.println("Елемент " + size + ": " + previous + " -> " + capacity);
            }
        }
        return capacities;
    }

    // Завдання 11
    public static Object[] growArrayManually(Object[] oldData) {
        Object[] newData = new Object[oldData.length + (oldData.length >> 1)];
        System.arraycopy(oldData, 0, newData, 0, oldData.length);
        return newData;
    }

    // Завдання 14
    public static class SimpleArrayList {
        private Object[] data = new Object[10];
        private int size = 0;
        public void add(Object element) {
            if (size == data.length) {
                Object[] expanded = new Object[data.length + (data.length >> 1)];
                System.arraycopy(data, 0, expanded, 0, size);
                data = expanded;
            }
            data[size++] = element;
        }
        public Object get(int index) {
            if (index < 0 || index >= size) throw new IndexOutOfBoundsException(index);
            return data[index];
        }
        public int size() { return size; }
        public int getCapacity() { return data.length; }
    }

    // Завдання 16
    public static ArrayList<Integer> extractPassedScores(List<Integer> allScores, int minPassScore) {
        ArrayList<Integer> passed = new ArrayList<>();
        for (int i = 0; i < allScores.size(); i++) if (allScores.get(i) >= minPassScore) passed.add(allScores.get(i));
        return passed;
    }

    // Завдання 18
    public static int countOccurrences(List<String> list, String target) {
        int count = 0; for (String s : list) if (Objects.equals(s, target)) count++;
        return count;
    }

    // Завдання 21
    public static void manageTaskList() {
        ArrayList<String> tasks = new ArrayList<>();
        System.out.println("Порожній? " + tasks.isEmpty());
        tasks.addAll(List.of("Код", "Тести", "README", "Git", "Звіт"));
        tasks.add(0, "Терміновий баг");
        System.out.println("Перший: " + tasks.get(0));
        tasks.set(0, "Виправити терміновий баг");
        System.out.println("Є README? " + tasks.contains("README"));
        tasks.remove("Тести"); tasks.remove(0);
        System.out.println("Фінальний size=" + tasks.size() + ", масив=" + Arrays.toString(tasks.toArray()));
        tasks.clear(); System.out.println("Після clear: " + tasks);
    }

    // Завдання 22
    public static <T> ArrayList<T> deduplicate(List<T> source) {
        ArrayList<T> unique = new ArrayList<>();
        for (T item : source) if (!unique.contains(item)) unique.add(item);
        return unique;
    }

    // Завдання 24
    public static int replaceAllValues(List<String> list, String oldValue, String newValue) {
        int replaced = 0;
        for (int i = 0; i < list.size(); i++) if (Objects.equals(list.get(i), oldValue)) {
            list.set(i, newValue); replaced++;
        }
        return replaced;
    }

    // Завдання 25
    public static void demonstrateTypeInference() {
        List<Integer> list1 = new ArrayList<>();
        var list2 = new ArrayList<Integer>();
        var names = new ArrayList<String>(List.of("Анна", "Богдан"));
        list1.add(10); list2.add(20); names.add("Олена");
        // list1.add("текст"); list2.add("текст"); names.add(42); // Не компілюється: невірний тип.
        System.out.println(list1 + " | " + list2 + " | " + names);
    }

    // Завдання 26
    public static void demonstrateVarDiamondDanger() {
        var unsafeList = new ArrayList<>(); // ArrayList<Object>
        unsafeList.add(42); unsafeList.add("Java"); unsafeList.add(true);
        try { for (Object o : unsafeList) System.out.println("Число=" + (Integer)o); }
        catch (ClassCastException e) { System.out.println("Помилка приведення типів: у списку не лише Integer"); }
        var safeList = new ArrayList<Integer>(); safeList.add(42);
        System.out.println("Безпечний список: " + safeList);
    }

    // Завдання 27
    public static void exploreCollectionHierarchy() {
        List<Collection<String>> collections = Arrays.asList(new ArrayList<String>(), new LinkedList<String>(),
            new Vector<String>(), new Stack<String>(), new HashSet<String>(), new ArrayDeque<String>());
        for (Collection<String> c : collections) {
            System.out.println(c.getClass().getSimpleName() + ": List=" + (c instanceof List)
                + ", Set=" + (c instanceof Set) + ", Queue=" + (c instanceof Queue)
                + ", Collection=" + (c instanceof Collection) + ", Iterable=" + (c instanceof Iterable));
        }
    }

    // Завдання 28
    public static <E> void printElements(Iterable<E> iterable) {
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();
    }
    public static <E> void printSummary(Collection<E> collection) {
        System.out.println("size=" + collection.size() + ", isEmpty=" + collection.isEmpty());
    }
    public static <E> E getFirstAndLast(List<E> list) {
        if (list.isEmpty()) return null;
        System.out.println("Перший=" + list.get(0));
        return list.get(list.size() - 1);
    }

    // Завдання 31
    public static void removeNegativesWithIterator(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) if (it.next() < 0) it.remove();
    }

    // Завдання 33
    public static void splitEvenAndOdd(List<Integer> source, List<Integer> evens, List<Integer> odds) {
        Iterator<Integer> it = source.iterator();
        while (it.hasNext()) {
            Integer n = it.next();
            if (n % 2 == 0) evens.add(n); else odds.add(n);
        }
    }
    public static int findMaximum(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (Integer n : list) if (n > max) max = n;
        return max;
    }

    // Завдання 34
    public static int removeInRange(List<Integer> list, int min, int max) {
        int removed = 0; Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int n = it.next();
            if (n >= min && n <= max) { it.remove(); removed++; }
        }
        return removed;
    }

    // Завдання 35
    public static <T> void reverseInPlace(List<T> list) {
        for (int i = 0; i < list.size()/2; i++) {
            int j = list.size() - 1 - i;
            T tmp = list.get(i);
            list.set(i, list.get(j)); list.set(j, tmp);
        }
    }

    // Завдання 36
    public static String[] mergeUniqueToArray(List<String> first, List<String> second) {
        var merged = new ArrayList<String>();
        for (String s : first) if (!merged.contains(s)) merged.add(s);
        for (String s : second) if (!merged.contains(s)) merged.add(s);
        return merged.toArray(new String[0]);
    }

    // Завдання 37
    public static <T> void rotateRight(List<T> list, int k) {
        if (list.isEmpty()) return;
        k = Math.floorMod(k, list.size());
        for (int i = 0; i < k; i++) {
            T last = list.remove(list.size()-1);
            list.add(0, last);
        }
    }

    // Завдання 39
    public static void compareListPerformance() {
        final int n = 20_000;
        List<Integer> arrayList = new ArrayList<>(), linkedList = new LinkedList<>();
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) arrayList.add(0, i);
        long arrayInsert = System.nanoTime() - start;
        start = System.nanoTime();
        for (int i = 0; i < n; i++) linkedList.add(0, i);
        long linkedInsert = System.nanoTime() - start;
        // Повторне читання із середини обох списків. volatile-подібний результат через друк checksum.
        long checksumA = 0, checksumL = 0;
        start = System.nanoTime();
        for (int i = 0; i < n; i++) checksumA += arrayList.get(arrayList.size()/2);
        long arrayRead = System.nanoTime() - start;
        start = System.nanoTime();
        for (int i = 0; i < n; i++) checksumL += linkedList.get(linkedList.size()/2);
        long linkedRead = System.nanoTime() - start;
        System.out.println("Вставка спочатку, ArrayList: " + arrayInsert/1_000_000.0 + " мс, LinkedList: " + linkedInsert/1_000_000.0 + " мс");
        System.out.println("Читання середини, ArrayList: " + arrayRead/1_000_000.0 + " мс, LinkedList: " + linkedRead/1_000_000.0 + " мс");
        System.out.println("Контроль: " + checksumA + ", " + checksumL);
        System.out.println("ArrayList зсуває елементи при add(0,e), LinkedList проходить по вузлах при get(index).");
        System.out.println("Час залежить від JVM та комп'ютера, один замір не є строгим benchmark.");
    }
}
