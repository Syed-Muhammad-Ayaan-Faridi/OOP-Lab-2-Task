
public class Q8 {
    public static void main(String[] args) {
        int evenSum = 0, oddSum=0;
        for (int i = 1; i <= 100; i++) {
            if (i%2 == 0) evenSum += i;
            else oddSum += i ;
        }
        System.out.println("Sum of even numbers is: "+evenSum);
        System.out.println("Sum of odd numbers is: "+oddSum);
    }
}
