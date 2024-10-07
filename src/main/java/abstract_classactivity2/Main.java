package abstract_classactivity2;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mrs Ogodinma", 100);

        Student student = new Student("Emeka", 35);

        System.out.println("---TEACHER BIO:--- ");
        System.out.println("NAME: " + teacher.getName());
        System.out.println("AGE: " + teacher.getAge());

        System.out.println("------------------");

        System.out.println("---STUDENT BIO:--- ");
        System.out.println("NAME: " + student.getName());
        System.out.println("AGE: " + student.getAge());





    }
}


