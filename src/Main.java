import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SpecList<Tester> list = new SpecList<>();
        list.add(new Tester("Василий", 1));
        list.add(new Tester("Елена", 2));
        list.add(new Tester("Иван", 3));
        list.add(new Tester("Василий", 4));
        list.add(new Tester("Елена", 5));

        for (Tester item:list) {
            System.out.println(item);
        }

    }


}