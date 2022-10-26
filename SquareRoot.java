import java.util.Scanner;

public class SquareRoot {

    public static void sqrt(float c) {
        float t = c;
        float epsilon = (float) (1*Math.exp(-15));

        while ( Math.abs(t-c/t)>epsilon * t) {
            t = ((c/t) + t )/2;
        }
        System.out.println("Square root of " +c+ " is " +t );

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        float c = scanner.nextInt();

        sqrt(c);

    }

}
