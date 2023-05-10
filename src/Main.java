import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Student [] arrayStudent = new Student[10];
        Date birthday = new Date(3,5,2021);
        Person p1 = new Person("trang",birthday,"hưng yên", 3.5F, 2.3F);
        Student s1 = new Student("hang",birthday,"hung yen",3.5F,3.0F,"1011","hahah",1990,5.6F);
        System.out.println(s1.toString());

        //System.out.println(p1.toString());



    }
}