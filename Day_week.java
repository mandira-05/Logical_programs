import java.util.Scanner;

public class Day_week {
    public static void dayOfWeek (int m, int d, int y) {
        int y0 = y - (14-m)/12;
        int x = y0+y0/4 - y0/100 + y0/400;
        int m0= m+12 * ((14-m)/12)-2;
        int d0 = (d+x+31*m0/12)%7;

        if (d0==0) {
                System.out.println("day is Sunday");
        } else if (d0==1){
                System.out.println("day is Monday");
        } else if (d0==2) {
                System.out.println("day is Tuesday");
        } else if (d0==3) {
                System.out.println("day is Wednesday");
        } else if (d0==4) {
                System.out.println("day is Thursday");
        } else if (d0==5) {
                System.out.println("day is Firday");
        } else if (d0==6) {
            System.out.println("day is Firday");
        }else {
            System.out.println("Invalid");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter data in mm-dd-yy format");

        System.out.println("enter month");
        int m = scanner.nextInt();

        System.out.println("enter date");
        int d = scanner.nextInt();

        System.out.println("enter year");
        int y = scanner.nextInt();

        dayOfWeek(m,d,y);


    }


}
