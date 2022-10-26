import java.util.Scanner;


public class Monthly_payment {
    public static void monthlyPayment (float p, float r, int y) {
        float n = 12 * y;
        float rate = r/(12*100);
        float payment;
        payment= (float) ((p*rate)/(1-Math.pow(1+rate, -n)));
        System.out.println("Monthly payment is: " +payment);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter principal amount");
        float p = scanner.nextInt();

        System.out.println("Enter interest rate");
        float r = scanner.nextInt();

        System.out.println("Enter years");
        int y = scanner.nextInt();

        monthlyPayment(p,r,y );


    }


}
