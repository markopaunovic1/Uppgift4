import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a number here");

        // skriv ut heltal 1-100

        Scanner input = new Scanner(System.in);
        int nb =  input.nextInt();
        

        for (int i = 0; i <= 100; i++); {
            if (nb % 3 == 0 && nb % 5 == 0) {
                System.out.println(nb + " - FizzBuzz");
            }
            else if (nb % 5 == 0) {
                System.out.println(nb + " - Fizz");
            }
            else if (nb % 3 == 0); {
                System.out.println(nb + " - Buzz");
            }
        }
    }
}