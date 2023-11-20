class Student{
    int id;
    String name;
}
public class TestStudent {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();

        s1.id=101;
        s1.name="Rakesh";

        s2.id=102;
        s2.name="Rahul";

        System.out.println(s1.id);
        System.out.println(s1.name);

        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}
