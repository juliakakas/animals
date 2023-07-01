import java.util.Locale;

public class Dogy implements Animal {
    private String name;
    private int age;
    private String color;

    public Dogy(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dogy " + name + " " + age + " " + color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
