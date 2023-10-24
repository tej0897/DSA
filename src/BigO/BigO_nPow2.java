package BigO;

public class BigO_nPow2 {
    //program for O(n^2)

    public static void printNumbers(int number){
        for (int i=0; i<number; i++){
            for (int j=0; j<number; j++){
                System.out.println(i + " " + j);
            }
        }
    }

    public static void main(String[] args) {
        printNumbers(10);
    }
}
