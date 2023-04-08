import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SpecList<Tester> list = new SpecList<>();
        list.add(new Tester("Андрей", 1));
        list.add(new Tester("Юлия", 2));
        list.add(new Tester("Иван", 3));
        list.add(new Tester("Василий", 4));
        list.add(new Tester("Елена", 5));

        for (Tester item:list) {
            System.out.println(item);
        }

        System.out.println();
        System.out.println("=============================");
        System.out.println();
        list.remove(2);

        for (Tester item:list) {
            System.out.println(item);
        }

        System.out.println("0");
        System.out.println(list.getByIndex(0));
        System.out.println(list.getNodeByIndex(0));
        System.out.println("\n1");
        System.out.println(list.getByIndex(1));
        System.out.println(list.getNodeByIndex(1));
        System.out.println("\n2");
        System.out.println(list.getByIndex(2));
        System.out.println(list.getNodeByIndex(2));
        System.out.println("\n3");
        System.out.println(list.getByIndex(3));
        System.out.println(list.getNodeByIndex(3));
        System.out.println("\n4");
        System.out.println(list.getByIndex(4));
        System.out.println(list.getNodeByIndex(4));

    }


}