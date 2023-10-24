package BigO;

public class BigO_n {
    public static void printNumbers(int number){
        for (int i = 0; i < number; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printNumbers(10);
    }
}