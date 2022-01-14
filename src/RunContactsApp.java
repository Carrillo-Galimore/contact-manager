import java.util.Scanner;

public class RunContactsApp {

    public static void runContactsApp(){
        boolean run = true;
        while(run){
            System.out.println("1. View Contacts\n");
            System.out.println("2, Add a new Contact.\n");
            System.out.println("3. Search a contact by name.\n");
            System.out.println("4. Delete an existing contact.\n");
            System.out.println("5. Exit\n");
            System.out.println("Enter an option: (1, 2, 3, 4, or 5\n");
            Scanner scn = new Scanner(System.in);
            int userinput = scn.nextInt();
            switch (userinput){
                case 1:
                    // view contact/function
                    System.out.println("Returned to Menu.\n");
                    break;
                case 2:
                    // add contact method/function
                    System.out.println("Returned to Menu.\n");
                    break;
                case 3:
                    // add search contact by name method/function
                    System.out.println("Returned to Menu.\n");
                    break;
                case 4:
                    // delete contact (by name)
                    System.out.println("Returned to Menu.\n");
                    break;
                case 5:
                    // exit function/app
                    System.out.println("Exiting application. ");
                    run = false;
                    break;
            }
        }
    }


    public static void main(String[] args) {



        runContactsApp();


    }


}
