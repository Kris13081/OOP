package Inheritance.RandomArrayList;

public class Main {
    public static void main(String[] args) {

       RandomArrayList<Object> list = new RandomArrayList<>();

        list.add(13);
        list.add(42);

        System.out.println(list.getRandomElement());

    }
}
