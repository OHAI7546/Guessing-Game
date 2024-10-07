package oop_classexample1;

public class Student {
    public static void main(String[] args) {

        ApplicationForm student = new ApplicationForm("emeka", 24, "male");



        System.out.println("-----Student Information Form----- ");
        System.out.println("NAME: " +student.getName());
        System.out.println("AGE: " + student.getAge());
        System.out.println("GENDER: " + student.getGender());

    }

}
