package Intefa;

public class Teacher implements Teachable{
    @Override
    public void teachCourse(String course) {
        System.out.println("Teaching " + course);

    }

}
