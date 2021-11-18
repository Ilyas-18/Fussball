package Soccer5;

public class Person {

    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{ " +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
