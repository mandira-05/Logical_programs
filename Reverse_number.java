import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a no. ");
        int n = scanner.nextInt();
        int reverse=0;

        while (n>0) {
            int remainder = n%10;
            reverse = (reverse*10)+remainder;
            n=n/10;
        }
        System.out.println("Reversed no. is : " +reverse);
    }
}
