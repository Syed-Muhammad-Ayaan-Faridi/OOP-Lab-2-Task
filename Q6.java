import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your roll number: ");
        String RollNumber = input.nextLine();
        System.out.print("Enter Course name to register: ");
        String Course = input.nextLine();

        //PRINTING
        System.out.println("Printing details....");
        System.out.println("Student Name: "+name);
        System.out.println("Student Roll Number: "+RollNumber);
        System.out.print("You have registered for: "+Course);

        input.close();
    }
}
