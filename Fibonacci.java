public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        int previous=0;
        int current=1;

        System.out.println("Fibonacci series upto " +n+ " is: ");
        System.out.println(previous);
        System.out.println(current);

        for (int i=2;i<n;i++) {
            int nextNumber = previous + current;
            previous = current;
            current=nextNumber;
            System.out.println(nextNumber);
        }


    }
}
