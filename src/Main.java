import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SpecList<User> list = new SpecList<>();
        list.add(new User("Василий", 32));
        list.add(new User("Елена", 24));
        list.add(new User("Иван", 21));
        list.add(new User("Василий", 42));
        list.add(new User("Елена", 21));

        for (User item:list) {
            System.out.println(item);
        }

    }


}