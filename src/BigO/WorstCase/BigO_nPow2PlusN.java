package BigO.WorstCase;

//  We have to set of looping.
//        1. For loop from O(n^2) - (for loop inside for loop)
//        2. For loop

//        When we run this scenario, the number of operations is O(n^2) + O(n).

//        i.e. O(n^2 + n) -> n^2 is dominant, so drop "n" => O(n^2)

public class BigO_nPow2PlusN {

    public static void printNumbers(int number){
        for (int i=0; i<number; i++){
            for (int j=0; j<number; j++){
                System.out.println(i + " " + j);
            }
        }

        for (int j=0; j<number; j++){
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        printNumbers(10);
    }

}
