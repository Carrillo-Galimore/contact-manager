import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;

public class RunContactsApp {


    public static void addToTextFile(){
        System.out.println("Enter name: \n");
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();

        System.out.println("Enter phone number: \n");
        Scanner sc = new Scanner(System.in);
        String ph = sc.nextLine();
        String contactInfo = name + " " + ph;
        String contactsDirectory = "contactsData";
        String contactList = "contactsList.txt";

//        Path contactDataList = Paths.get(contactsDirectory);
        Path contactsFile = Paths.get(contactsDirectory, contactList);

        try{
            Files.write(contactsFile, Arrays.asList(contactInfo), StandardOpenOption.APPEND);
        } catch (IOException iox){
            iox.printStackTrace();
        }

    }


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
                    System.out.println("Returned to Menu.");
                    break;
                case 2:
                    addToTextFile();
                    System.out.println("Returned to Menu.");
                    break;
                case 3:
                    // add search contact by name method/function
                    System.out.println("Returned to Menu.");
                    break;
                case 4:
                    // delete contact (by name)
                    System.out.println("Returned to Menu.");
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

        String contactsDirectory = "contactsData";
        String contactList = "contactsList.txt";


        Path contactDataList = Paths.get(contactsDirectory);
        Path contactsFile = Paths.get(contactsDirectory, contactList);

        try{
            if (Files.notExists(contactDataList)){
                Files.createDirectories(contactDataList);
            }
        } catch (IOException iox){
            iox.printStackTrace();
        }

        try{
            if (Files.notExists(contactsFile)){
                Files.createFile(contactsFile);
            }
        } catch (IOException iox){
            iox.printStackTrace();
        }




        runContactsApp();


    }


}
