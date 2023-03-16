import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        userName = input.nextLine();
        System.out.print("Enter your password: ");
        password = input.nextLine();

        if (userName.equals("zeynep") && password.equals("java101")) {
            System.out.println("Succesfully logged in.");
        }else {
            System.out.println("Entered wrong password or username. Do you want to reset your password? \nYes=>1\nNo=>2");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    Scanner input2 = new Scanner(System.in);
                    System.out.print("Enter your new password: ");
                    String newPassword = input2.nextLine();
                        if (newPassword.equals("password")) {
                            System.out.print("Your new password cannot be the same as your old password. Could not create password, please enter another password!");
                        }else {
                            System.out.println("Password created.");
                        }
                    break;
                case 2:
                    System.out.println("Terminated.");
                    break;
                default:
                    System.out.println("Wrong login, Please try again");
            }
        }
    }
}