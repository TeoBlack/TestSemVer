public class Dog {
    private String name;
    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println("Гав");
    }

    public String getName() {
        return name;
    }
}