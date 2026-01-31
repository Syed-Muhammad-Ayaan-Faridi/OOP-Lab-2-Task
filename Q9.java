import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        int passcount=0,failcount=0,marks,total=0;
        float Average;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students for grade processing: ");
        int ClassSize = input.nextInt();
        for (int i = 0; i < ClassSize; i++) {
            System.out.print("Enter marks of students: ");
            marks = input.nextInt();
            total += marks;
            if (marks > 60) passcount++;
            else failcount++;
        }
        Average = total/ClassSize;

        //PRINTING
        System.out.println("Printing details....");
        System.out.println("Class Average is: "+Average);
        System.out.println("Total Student Passed: "+passcount);
        System.out.print("Toatl Student Failed: "+failcount);

        input.close();
    }
}
