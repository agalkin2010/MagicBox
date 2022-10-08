public class Main {

    public static void main(String[] args) {

        MagicBox<Number> numbers = new MagicBox<>(7);
        MagicBox<String> strings = new MagicBox<>(5);
        MagicBox<String> strings2 = new MagicBox<>(3);

        numbers.add(3);
        numbers.add(3.45);
        numbers.add(5);
        numbers.add(6.57);
        numbers.add(8);
        numbers.add(9.32);
        System.out.println(numbers.add(10));
        System.out.println(numbers.add(11));
        System.out.println(numbers.pick());
        System.out.println(numbers.pick());
        System.out.println(numbers.pick());

        strings.add("Petya");
        strings.add("Kolya");
        strings.add("Tanya");
        strings.add("Ivan");
        System.out.println(strings.add("Tolik"));
        System.out.println(strings.pick());
        System.out.println(strings.pick());
        System.out.println(strings.pick());

        strings2.add("str1");
        strings2.add("str2");
        System.out.println(strings2.pick());

    }
}
