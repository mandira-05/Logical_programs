import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a no.");
        int n= scanner.nextInt();

        int t1=0;
        for (int i=2;i<=n/2;i++) {
            if (n%i==0){
                t1=1;
                break;
            }

        }
    if (t1!=1) {
        System.out.println(n+ " number is prime " );

    } else {
        System.out.println(n+ " number is not prime");
    }
    }


}
