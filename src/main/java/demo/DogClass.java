package demo;

public class DogClass extends AnimalClass{

    public DogClass(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        super.makeSound();
    }


    public void fetch(){
        String name = null;
        String fetch = null;
        System.out.println(name + "is " + fetch +"ing the ball" );
    }
}
