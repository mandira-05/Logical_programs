import java.util.Scanner;

public class Temperature_conv {
    public static void celiusToFarenheit(float temparature) {
        float temparatureInFarenheit = (temparature*9/5)+32;
        System.out.println(temparatureInFarenheit+ " is in Farenheit");
    }
    public static void farenheitToCelius(float temparature) {
        float temparatureInCelsius = (temparature - 32) * 5 / 9;
        System.out.println(temparatureInCelsius + " is in Celcius");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a temparature in Celsuis or Farenheit");
        float temparature = scanner.nextInt();

        System.out.println("Enter 1 to convert Celsius to Farenheit or Enter 2 to covert Farenheit to Celsius");
        int option = scanner.nextInt();

        if (option == 1) {
            System.out.println("Enter temparature in Celsius");
            celiusToFarenheit(temparature);
            //System.out.println();

        } else if (option == 2) {
            System.out.println("Enter temparature in Farenheit");
            farenheitToCelius(temparature);
        } else {
            System.out.println("Enter valid option");
        }
    }
}
