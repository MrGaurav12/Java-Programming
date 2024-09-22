import java.util.Scanner;

class Calculator {

    static double sum(double num1, double num2) {
        return num1 + num2;
    }

    static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Errror : It is not divided by Zero");
        }
        return num1 / num2;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("**** Welcome to a New Calculator ****");

        System.out.print("Please enter your first number : ");
        double num1 = input.nextDouble();
        input.nextLine();

        System.out.print("Please enter your operation( + - X / ) : ");
        String operator = input.nextLine();

        System.out.print("Please entr your second number : ");
        double num2 = input.nextDouble();

       

        double result = 0;

        switch (operator) {
          case "+" : result = sum(num1,num2);
                    break;
          case "-" : result = subtraction(num1, num2);
                   break;
          case "*" : result = multiplication(num1, num2);
                   break;                
         case "/" : result = division(num1, num2);
                   break;
         default : System.out.println("Invalid operator Try Again !");
                }
        System.out.println("The result of "+num1 +" "+operator+" "+ num2 +" = "+result);        
    }
}