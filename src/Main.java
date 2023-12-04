import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a numerical value");
        double value = in.nextDouble();

        if (value % 3 == 0&& value%5==0){
            System.out.println("FIZZBUZZ");
        }
        else if (value%3==0){
            System.out.println("FIZZ");
        } else if (value%5==0) {
            System.out.println("BUZZ");
        }else{
            System.out.println(value);
        }
    }
}// made by Juan Santhosh