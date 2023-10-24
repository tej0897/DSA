package BigO.WorstCase;

public class DiffTermsForInputsDropConstant {

    public static void printNumbers(int a, int b){
        for (int i=0; i<a; i++){
            System.out.println(i);
        }

        for (int j=0; j<b; j++){
            System.out.println(j);
        }
    }

    // the complexity in this scenario will change cause
    // a = 1, b = 120
    // we cannot just say O(n+n) => O(2n) => O(n)
    // correct one is O(a+b)

    public static void main(String[] args) {
        printNumbers(1, 123);
    }
}
