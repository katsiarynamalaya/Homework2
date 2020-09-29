import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char operation;
        double a;
        double b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (that doesn't exceeds 1.7976931348623157E+308 value) and press 'Enter' key: ");

        if (sc.hasNextDouble()) {

            a = sc.nextDouble();
            if (a > 1.7976931348623157E+308)
             {
                System.out.println("Number shouldn't exceed 1.7976931348623157E+308.");
            } else {

                System.out.println("Enter a number (that doesn't exceeds 1.7976931348623157E+308 value) and press 'Enter' key: ");

            if (sc.hasNextDouble()) {
                b = sc.nextDouble();

                if (b > 1.7976931348623157E+308)
                // b < 4.9E−324 - System doesn't allow to enter this boundary value. So it's skipped for now.
                {
                    System.out.println("Number shouldn't exceed 1.7976931348623157E+308.");
                } else {

                System.out.print("Select any from following operators (+, -, *, /) and press 'Enter': ");
                operation = sc.next().charAt(0);
                switch (operation) {
                    case '+':
                        System.out.println(new Plus(a,b).calc());
                        break;
                    case '-':
                        System.out.println(new Minus(a,b).calc());
                        break;
                    case '*':
                        System.out.println(new Multiply(a,b).calc());
                        break;
                    case '/':
                        if (b==0) {
                            System.out.println("You can't divide by zero.");
                        } else {
                            System.out.println(new Division(a,b).calc());
                            break;}
                    default:
                        System.out.println("Rerun the program. Enter 2 numbers and any from following operators (+, -, *, /).");
                        }
            }
            }else
                System.out.println("Rerun the program. Enter a number.");
        }
        }else{
            System.out.println("Rerun the program. Enter a number.");
        }
    }
}