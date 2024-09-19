import java.net.SocketOption;

public class Hello {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        System.out.println("Hello, Emeka");

        int topScore = 80;
        if (topScore > 100) {
            System.out.println("You got the highest score!");
        }

        if ((topScore > 90) || (100 < topScore)) ;
        {
            System.out.println("let the score show");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.print("This is not supposed to be true");
        }

        double myFirstValue = 20.00;
        double mySecondValue = 80.00;
        double myValueTotal = (myFirstValue + mySecondValue) * 100.00;
        System.out.println("myValueTotal = " + myValueTotal);
        double theRemainder = myValueTotal % 40.00; 
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.print("Got Some Remainder");
        }


    }
}





