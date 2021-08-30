import jdk.swing.interop.SwingInterOpUtils;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // public - is an access modifier

        int myFirstnumber = (10 + 5) + (2 * 10);
        int mySecondnumber = 12;
        int myThirdnumber = 6;

        // exercises
        // create new variable myTotal
        int myTotal = myFirstnumber + mySecondnumber + myThirdnumber;
        System.out.println(myTotal);

        // create new variable myLastOne less than 1000
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);

    }

}
