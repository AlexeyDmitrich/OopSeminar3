public class Tester {
    String name;
    int id;

    public Tester(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("тест: %s %d", name, id);
    }
}
