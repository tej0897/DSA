package pointers;

public class WithoutPointers {
    public static void main(String[] args) {

        int numberOne = 11;
        int numberTwo = numberOne;

        System.out.println(numberOne);
        System.out.println(numberTwo);


        System.out.println("After reassigning");
        numberOne = 22;

        System.out.println(numberOne);
        System.out.println(numberTwo);
    }
}
