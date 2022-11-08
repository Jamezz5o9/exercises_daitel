package Chapter17;

public class Woman implements Comparable<Woman>{
    private String name;
    private int age;

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Woman o) {
        return o.getAge() - this.getAge();
    }
}
