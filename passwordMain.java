/*
This class is the main class which is for user to use
*/
import java.util.Scanner;

public class passwordMain {
    public static void main(String[] args) {
        passwordManager myPasswordManager = new passwordManager();
        passwordCreator myNewPassword = new passwordCreator();
        Scanner input = new Scanner(System.in);
        int choice = 9;
        System.out.println("Welcome to password manager");

        //repeat until user allow to exit
        while (choice == 9) {
            System.out.println("==============================================");
            System.out.println("Choose your operation: ");
            System.out.println("(Enter the number)");
            System.out.println("1) add a new password file");
            System.out.println("2) delete a password file");
            System.out.println("3) show password list");
            System.out.println("4) find a password file");
            System.out.println("5) make a new password");
            System.out.println("6) see how many password files");
            System.out.println("==============================================");
            int option = input.nextInt();
            //find which option that user choosen
            if (option == 1) {
                System.out.print("Enter the name of web: ");
                String a = input.next();
                System.out.println();
                System.out.print("Enter the link of web: ");
                String b = input.next();
                System.out.println();
                System.out.print("Enter the account of web: ");
                String c = input.next();
                System.out.println();
                System.out.print("Enter the password of web: ");
                String d = input.next();
                input.nextLine();
                System.out.println();
                myPasswordManager.addNewPassword(a, b, c, d);
            }else if (option == 2) {
                System.out.print("Enter the name of link of web that you want to delete: ");
                String a = input.next();
                System.out.println();
                myPasswordManager.deletePassword(a);                
            }else if (option == 3) {
                myPasswordManager.printListOfPassword();
            }else if (option == 4) {
                System.out.print("The enter the link, name, account or password: ");
                String a = input.next();
                System.out.println();
                myPasswordManager.findPassword(a);
                System.out.println();
            }else if (option == 5) {
                System.out.print("Enter the length of the password: ");
                int a = input.nextInt();
                System.out.println();
                System.out.println("Choose the type of password you want: ");
                System.out.println("1) Pure numbers");
                System.out.println("2) Mixed");
                int b = input.nextInt();
                if (b == 1) {
                    myNewPassword.makeNewNumPassword(a);
                    System.out.println(myNewPassword.getMyNewPassword());
                }
                if (b == 2) {
                    myNewPassword.makeNewMixPassword(a);
                    System.out.println(myNewPassword.getMyNewPassword());
                }  
            }else if (option == 6) {
                System.out.println(myPasswordManager.numOfPassword());
            }else {
                System.out.println("Please enter right option");
            }
            //choose to continue or not
            System.out.println("Enter 9 to continue, 0 to exit");
            choice = input.nextInt();
        }
        //end of the program
        System.out.println("Thanks for your using");
    }
}
