import java.util.*;

public class unit_converter {
    public static void main(String[] args) {

        System.out.println("choose type conversion:/n 1. Kilometers to Meters  \r\n" + //
                "2. Meters to Centimeters  \r\n" + //
                "3. Celsius to Fahrenheit  \r\n" + //
                "4. Fahrenheit to Celsius  \r\n" + //
                "5. metre to kilometre  \r\n" + //
                "6. centimetre to metres  \r\n" + //
                "7. Kilograms to Grams  \r\n" + //
                "8. Grams to kilogrammes  \r\n" + //

                "");

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter conersion type: ");
        int button = sc.nextInt();

        System.out.println("enter the digit :");
        Double a = sc.nextDouble();

        switch (button) {

            case 1:
                System.out.println(a * 1000 + "meters");
                break;

            case 2:
                System.out.println(a * 100 + "centimetrs");
                break;

            case 3:
                System.out.println((a * 1.5) + 32 + "fahrenhiet");
                break;

            case 4:
                System.out.println((a - 32) * (5 / 9) + "celcius");
                break;

            case 5:
                System.out.println(a / 1000 + "kilometer");
                break;

            case 6:
                System.out.println(a / 100 + "meters");
                break;

            case 7:
                System.out.println(a * 1000 + "grams");
                break;

            case 8:
                System.out.println(a / 1000 + "kilograms");
                break;

        }

    }

}
