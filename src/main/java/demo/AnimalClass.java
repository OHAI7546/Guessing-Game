package demo;

public class AnimalClass {

    private String name;

    public AnimalClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound(){
        System.out.println("generic sound");
    }
}
