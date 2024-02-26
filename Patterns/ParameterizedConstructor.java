package Patterns;

public class ParameterizedConstructor {
    String name;
    int age;

    ParameterizedConstructor(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello from constructor");

    }

    public void greet() {
        System.out.println("name:" + this.name + "\nage:" + this.age);
    }

    public static void main(String[] args) {
        ParameterizedConstructor hc = new ParameterizedConstructor("rohit", 22);
        hc.greet();
    }
}
