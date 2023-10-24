package BigO.WorstCase;

public class DiffTermsForInputsDropNonDominant {
    public static void printNumbers(int a, int b){
        for (int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.println(i + " " + j);
            }
        }
    }

    // the complexity in this scenario will change cause
    // a = 10, b = 230
    // we cannot just say O(n*n) => O(n^2) => O(n^2)
    // correct one is O(a*b)

    public static void main(String[] args) {
        printNumbers(10, 230);
    }
}
