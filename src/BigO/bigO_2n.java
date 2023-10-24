package BigO;

public class bigO_2n {
    // we drop the constants, so the complexity will be
    // O(n)

    public static void printNumbers(int number){
        for (int i=0; i<number; i++){
            System.out.println(i);
        }

        for (int j=0; j<number; j++){
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        printNumbers(10);
    }
}
