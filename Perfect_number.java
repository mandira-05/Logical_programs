import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a no.");
        int n= scanner.nextInt();
        int ans=0;
        if (n>0) {
            for (int i=1;i<n;i++) {
                if (n%i==0){
                    System.out.println(i);
                    ans=ans+i;

                }

            }
            System.out.println("Sum is : " +ans);
        }
        if (ans == n) {
            System.out.println("No. id perfect");
        }
        else {
            System.out.println("no. is not perfect");
        }


    }
}
