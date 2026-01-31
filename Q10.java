import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        int Money=0, Balance = 1000;
        Scanner input = new Scanner(System.in);
        String Username = "user1",Password = "pass123", Option;
        //Taking input from user
        System.out.print("Enter Username: ");
        String userName = input.nextLine();
        System.out.print("Enter Password: ");
        String passWord = input.nextLine();
        //Logining in
        if (userName.equals(Username) && passWord.equals(Password)) {
            System.out.println("Logged in...");
            
            do {
                //Printing Main menu and taking Input
                System.out.println("----------------Main Menu----------------");
                System.out.println("Welcome to Bank of Pakistan");
                System.out.println("Press D to Deposit Amount");
                System.out.println("Press W to Withdraw amount");
                System.out.println("Press A to Account Status");
                System.out.print("Enter your Choice: ");
                Option = input.nextLine().toUpperCase();
                //Doing Tasks
                switch (Option) {
                    case "D":
                        System.out.print("Enter the amount to deposit: ");
                        Money = input.nextInt();
                        input.nextLine();
                        Balance += Money;
                        break;
                    case "W":
                        System.out.print("Enter the amount to withdraw: ");
                        Money = input.nextInt();
                        input.nextLine();
                        if (Money <= Balance) {
                            Balance -= Money;
                            System.out.println("Please collect your amount!");
                        } else{
                            System.out.println("Insufficient Balance!!!");
                            System.out.println("Balance: " + Balance);
                        }
                        break;
                    case "A":
                        System.out.println("Account Holder: " + userName);
                        System.out.println("Current Balance: " + Balance);
                        break;
                
                    default:
                        System.out.println("Ivalid Option selected");
                        break;
                }
                System.out.println("\nRemaining Balance: " + Balance);
                System.out.print("Do you want to continue? (y/Y): ");
                Option = input.nextLine().toUpperCase();
            } while (Option.equals("Y"));
            System.out.println("Thank you for using Bank of Pakistan!");
        } else {
            System.out.println("Invalid Login details");
        }
        input.close();
    }
}
