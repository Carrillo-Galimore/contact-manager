import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    public static void viewList() {
        String directory = "contactsData";
        String filename = "contactsList.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);


        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectory(dataDirectory);
            }
            if (Files.notExists(dataFile)) {
                Files.createFile(dataFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            List<String> contacts = Files.readAllLines(dataFile);
            for (String contact : contacts) {
                System.out.println(contact);
            }
        } catch (IOException iox) {
            iox.printStackTrace();
        }
    }
public static void contactSearch(){
        String directory = "contactsData";
        String filename = "contactsList.txt";
//
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        System.out.println("Please enter Name or Number you would like to search");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        String keepGoing = "yes";

        do {
        try{
        List<String> contacts = Files.readAllLines(dataFile);
        for (String contact : contacts) {
        if (userInput.equalsIgnoreCase(contact)) {
        System.out.println("The contact info you entered matches: " + contact);
        break;
        } else {
        System.out.println("Did not find a match.");
        }

        }

        } catch (IOException iox){
        iox.printStackTrace();
        }

        System.out.println("Try again? yes/no");
        Scanner scn = new Scanner(System.in);
        keepGoing = scn.next();
        if(keepGoing.equalsIgnoreCase("no")){
        break;
        }


        System.out.println("enter a name.");
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextLine();
        } while  (keepGoing.equalsIgnoreCase("yes") );
        }

    public static void removeContact(){
        viewList();
        String contactsDirectory = "contactsData";
        String contactList = "contactsList.txt";
        Path contactsFile = Paths.get(contactsDirectory, contactList);
        System.out.println("Please enter the contact you would like to remove.");
        Scanner scn = new Scanner(System.in);
        String userInput = scn.nextLine();
        try{
            List<String> contacts = Files.readAllLines(Paths.get(contactsDirectory, contactList));
            List<String> bucket = new ArrayList<>();
            for(String contact : contacts){
                if(!contact.equalsIgnoreCase(userInput)){
                    bucket.add(contact);
                }
                System.out.println(bucket);
                Files.write(contactsFile, bucket);
            }
        }catch(IOException iox){
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
                    viewList();
                    System.out.println("Returned to Menu.");
                    break;
                case 2:
                    addToTextFile();
                    System.out.println("Returned to Menu.");
                    break;
                case 3:
                     contactSearch();
                    System.out.println("Returned to Menu.");
                    break;
                case 4:
                    removeContact();
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
