package semester1.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework_11_Task_1_2<E> {
    public static void main(String[] args) {
        task1();
        System.out.println("\n");
        task2();
    }

    // Завдання 1
    public static void task1() {
        System.out.println("================ ДОСЛІДЖЕННЯ WRAPPER CLASSES ТА INTEGER CACHE ================");
        inspectIntegerCache(new int[]{-128, 127, 128, 500});
        demonstrateAutoboxingUnderTheHood();

        System.out.println("\n[3. ПАРСИНГ РЯДКІВ (Integer.parseInt) ТА ЕКСТРЕМУМИ (MAX_VALUE / MIN_VALUE)]:");
        System.out.println("  Початкові межі пошуку: min = " + Integer.MAX_VALUE
                + " (MAX_VALUE), max = " + Integer.MIN_VALUE + " (MIN_VALUE)");
        String[] rawPackets = {"  145 ", "-30", "ERR_404", "980", "", null, "2147483647", "-85"};
        List<Integer> validData = parseTelemetryStream(rawPackets);
        System.out.println("  Успішно розпізнаний список Integer: " + validData);
        printExtremesAndStats(validData);
        System.out.println("==============================================================================");
    }

    public static void inspectIntegerCache(int[] testValues) {
        System.out.println("[1. ЕКСПЕРИМЕНТ: INTEGER CACHE [-128..127] (== проти .equals())]:");
        for (int value : testValues) {
            Integer first = Integer.valueOf(value);
            Integer second = Integer.valueOf(value);
            boolean cached = value >= -128 && value <= 127;
            System.out.printf("  Значення: %5d | (a == b): %-5s | a.equals(b): %-5s | Джерело: %s%n",
                    value, first == second, first.equals(second),
                    cached ? "IntegerCache" : "Новий об'єкт у Heap!");
        }
    }

    public static void demonstrateAutoboxingUnderTheHood() {
        System.out.println("\n[2. AUTOBOXING / UNBOXING ПІД КАПОТОМ ТА ЗАХИСТ ВІД NULL]:");
        int original = 42;
        Integer implicitBox = original;
        int implicitUnbox = implicitBox;
        Integer explicitBox = Integer.valueOf(original);
        int explicitUnbox = explicitBox.intValue();
        System.out.println("  Явне пакування: Integer.valueOf(42) -> " + explicitBox
                + " | Розпакування: .intValue() -> " + explicitUnbox);

        double decimal = 3.14;
        Double implicitDouble = decimal;
        double implicitDoubleValue = implicitDouble;
        Double explicitDouble = Double.valueOf(decimal);
        double explicitDoubleValue = explicitDouble.doubleValue();
        boolean flag = true;
        Boolean implicitBoolean = flag;
        boolean implicitBooleanValue = implicitBoolean;
        Boolean explicitBoolean = Boolean.valueOf(flag);
        boolean explicitBooleanValue = explicitBoolean.booleanValue();
        // Перевірка, що явне та неявне пакування/розпакування дають однакові значення.
        if (implicitUnbox != explicitUnbox || implicitDoubleValue != explicitDoubleValue
                || implicitBooleanValue != explicitBooleanValue) {
            throw new IllegalStateException("Результати пакування не збігаються");
        }

        List<Integer> readings = Arrays.asList(45, null, -12, 88, null, 102);
        System.out.println("  Вхідний список із датчиків (з null): " + readings);
        int sum = 0;
        List<Integer> skipped = new ArrayList<>();
        for (int i = 0; i < readings.size(); i++) {
            Integer reading = readings.get(i);
            if (reading == null) {
                skipped.add(i);
                continue;
            }
            int value = reading;
            sum += value;
        }
        System.out.println("  ⚠️ Пропущено null-елемент на індексі " + skipped.get(0)
                + " та " + skipped.get(1)
                + " (запобігання NullPointerException при intValue()!)");
        System.out.println("  Сума валідних розпакованих елементів: " + sum);
    }

    public static List<Integer> parseTelemetryStream(String[] rawPackets) {
        List<Integer> result = new ArrayList<>();
        boolean warnedEmpty = false;
        for (String packet : rawPackets) {
            if (packet == null || packet.trim().isEmpty()) {
                if (!warnedEmpty) {
                    System.out.println(" Порожній або null-пакет відхилено");
                    warnedEmpty = true;
                }
                continue;
            }
            try {
                result.add(Integer.parseInt(packet.trim()));
            } catch (NumberFormatException e) {
                System.out.println(" Пакет '" + packet + "' відхилено (NumberFormatException)");
            }
        }
        return result;
    }

    public static void printExtremesAndStats(List<Integer> validData) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;
        if (validData.isEmpty()) {
            System.out.println("  Немає коректних даних для статистики.");
            return;
        }
        for (int value : validData) {
            if (value < min) min = value;
            if (value > max) max = value;
            sum += value;
        }
        System.out.println("  Знайдений мінімум: " + min + " | Знайдений максимум: " + max);

        // Демонстрація різниці між видаленням за індексом та за значенням.
        List<Integer> byIndex = new ArrayList<>(validData);
        byIndex.remove(0);
        List<Integer> byValue = new ArrayList<>(validData);
        byValue.remove(Integer.valueOf(-30));
        System.out.println("  Після remove(Integer.valueOf(-30)) (за значенням): " + byValue);
    }

    // Завдання 2
    public static void task2() {
        System.out.println("================ ЕМУЛЯТОР ВНУТРІШНЬОЇ БУДОВИ ARRAYLIST (ПІД КАПОТОМ) ================");

        var emulator = new Homework_11_Task_1_2<String>();
        // var raw = new ArrayList<>();  // Тут тип елементів буде Object.
        // var typed = new ArrayList<String>(); // А тут String.
        System.out.println("[ІНІЦІАЛІЗАЦІЯ]: Створено емулятор списку String | size = "
                + emulator.size() + " | capacity = " + emulator.getCapacity());

        System.out.println("\n--- Додавання 35 елементів у список ---");
        for (int i = 1; i <= 35; i++) {
            int previousCapacity = emulator.getCapacity();
            emulator.add("Block-" + i);
            if (emulator.getCapacity() != previousCapacity) {
                int copiedNow = previousCapacity;
                System.out.println("  [GROW #" + emulator.getResizeCount() + "] Переповнення при додаванні "
                        + i + "-го елемента! Ємність: " + previousCapacity + " -> "
                        + emulator.getCapacity() + " (System.arraycopy скопіював " + copiedNow + " ел.)");
            }
        }
        System.out.println("Стан після додавання 35 елементів: size = " + emulator.size()
                + " | capacity = " + emulator.getCapacity() + " (Вільний резерв: "
                + (emulator.getCapacity() - emulator.size()) + " комірок null)");

        System.out.println("\n--- Тестування вставки add(0, 'HEADER') та видалення remove(5) ---");
        int movedRight = emulator.size();
        emulator.add(0, "HEADER");
        System.out.println("  -> Вставлено 'HEADER' на індекс 0 (зсунуто праворуч "
                + movedRight + " елементів через System.arraycopy)");
        int movedLeft = emulator.size() - 5 - 1;
        String removed = emulator.remove(5);
        System.out.println("  -> Видалено елемент '" + removed + "' з індексу 5 (зсунуто ліворуч "
                + movedLeft + " елементів, хвіст занулено для GC)");
        System.out.println("  Поточний стан: size = " + emulator.size()
                + " | capacity = " + emulator.getCapacity()
                + " | Перший: '" + emulator.get(0)
                + "' | Останній: '" + emulator.get(emulator.size() - 1) + "'");

        System.out.println("\n--- Оптимізація пам'яті trimToSize() ---");
        int oldCapacity = emulator.getCapacity();
        emulator.trimToSize();
        System.out.println("  -> Викликано trimToSize(): буфер Object[" + oldCapacity
                + "] стиснуто рівно до Object[" + emulator.getCapacity() + "]!");
        System.out.println("  Фінальна телеметрія: size = " + emulator.size()
                + " | capacity = " + emulator.getCapacity()
                + " | Кількість розширень: " + emulator.getResizeCount());
        System.out.println("=======================================================================================");
    }

    // Методи власного динамічного списку для завдання 2
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size = 0;
    private int resizeCount = 0;
    private int totalElementsCopied = 0;

    public Homework_11_Task_1_2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacityInternal() {
        if (size == elementData.length) {
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            if (newCapacity <= oldCapacity) newCapacity = oldCapacity + 1;
            Object[] newBuffer = new Object[newCapacity];
            System.arraycopy(elementData, 0, newBuffer, 0, size);
            elementData = newBuffer;
            resizeCount++;
            totalElementsCopied += size;
        }
    }

    public void add(E element) {
        ensureCapacityInternal();
        elementData[size++] = element;
    }

    public void add(int index, E element) {
        checkPositionIndex(index);
        ensureCapacityInternal();
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = element;
        size++;
    }

    @SuppressWarnings("unchecked")
    public E remove(int index) {
        checkElementIndex(index);
        E oldElement = (E) elementData[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null;
        return oldElement;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        checkElementIndex(index);
        return (E) elementData[index];
    }

    @SuppressWarnings("unchecked")
    public E set(int index, E element) {
        checkElementIndex(index);
        E oldElement = (E) elementData[index];
        elementData[index] = element;
        return oldElement;
    }

    public int size() { return size; }
    public int getCapacity() { return elementData.length; }
    public int getResizeCount() { return resizeCount; }
    public int getTotalElementsCopied() { return totalElementsCopied; }

    public void trimToSize() {
        if (elementData.length != size) {
            Object[] newBuffer = new Object[size];
            System.arraycopy(elementData, 0, newBuffer, 0, size);
            elementData = newBuffer;
        }
    }

    private void checkElementIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index=" + index + ", size=" + size);
        }
    }

    private void checkPositionIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index=" + index + ", size=" + size);
        }
    }
}
