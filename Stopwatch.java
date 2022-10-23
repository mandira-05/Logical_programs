import java.util.*;

public class Stopwatch {
    public static void main(String[] args) {

        System.out.println("Enter 1 to start");

        Scanner scanner = new Scanner(System.in);
        int option= scanner.nextInt();
         long startTime=0;
         long stopTime=0;

         if (option == 1) {

             startTime = System.currentTimeMillis();
         } else {
             System.out.println("Entered wrong option, enter 1 to start");
         }

        System.out.println("Enter 2 to stop");
        option= scanner.nextInt();

         if (option == 2 )  {
             stopTime = System.currentTimeMillis();
         }

         long timeElapsed = (stopTime - startTime)/1000 ;
         System.out.println("Time Elapsed is in seconds " +timeElapsed);





    }
}
