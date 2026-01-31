import java.util.Scanner;

public class Q3 {
    void Calculator(int Num1,int Num2, String Operator)
    {
        switch (Operator) {
            case "+":
                System.out.println("Sum of "+Num1+" and "+Num2+" is"+(Num1+Num2));
                break;
            case "-":
                System.out.println("Difference of "+Num1+" and "+Num2+" is "+(Num1-Num2));
                break;
            case "*":
                System.out.println("Product of "+Num1+" and "+Num2+" is "+(Num1*Num2));
                break;
            case "/":
                System.out.println("Division of "+Num1+" and "+Num2+" is "+(Num1/Num2));
                break;
            
            case "%":
                System.out.println("Remainder of "+Num1+" and "+Num2+"  "+(Num1%Num2));
                break;
            
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
    public static void main(String[] args) {
        //Datatypes
        Q3 obj = new Q3();
        Scanner newInt = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int Num1 = newInt.nextInt();
        System.out.print("Enter Second Number: ");
        int Num2 = newInt.nextInt();
        System.out.print("Enter Operator (% for remainder): ");
        String Operator = newInt.next();
        obj.Calculator(Num1, Num2, Operator);
        newInt.close();
    }
}
