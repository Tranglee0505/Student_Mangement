
import java.util.Date;
public class Person {
    private static int id = 0;

    private String name;

    private Date birthday;

    private String address;

    private float height;

    private float weight;


    public Person(String name, Date birthday, String address, float height, float weight) {
        this.id ++;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.height = height;
        this.weight = weight;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}


