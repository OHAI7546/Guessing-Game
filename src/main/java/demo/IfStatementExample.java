package demo;

public class IfStatementExample {
    public static void main(String[] args) {
        String cityA = "Lagos";
        String cityB = "Ibadan";
        String cityC = "Benin";
        String cityD = "Enugu";

        if((cityA == cityB)){
            System.out.println("city is Ibadan");
        }else if((cityA == cityC)){
            System.out.println("city is Benin");
        }else if((cityA == cityD)){
            System.out.println("city is equal to Enugu");
        }else{
            System.out.println("Lagos");
        }


    }


}
