import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Test {


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
//    public  Contact (String name){
//    this.name = name;
//}
//
//    public String getName(Contact contact) {
//        return contact.name;
//    }

//    public static void contactSearch() throws IOException {
//
//        System.out.println("Please enter Name or Number you would like to search");
//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.nextLine();
//        String directory = "contactsData";
//        String filename = "contactsList.txt";
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//        List<String> contacts = Files.readAllLines(dataFile);
//        for (String contact : contacts) {
//            if (contact.equalsIgnoreCase(userInput)) {
//                System.out.print(contact);
//            } else {
//                System.out.println("This person does not exist");
//            }
//
//
//        }
//    }
//
//public static void contactSearch(){
//    viewList();
//    String directory = "contactsData";
//    String filename = "contactsList.txt";
//    Path dataFile = Paths.get(directory, filename);
//
//    boolean keepGoing = true;
//
//    do {
//        System.out.println("Please enter Name or Number you would like to search");
//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.nextLine();
//        try{
//
//            List<String> contacts = Files.readAllLines(dataFile);
//            boolean notFound = true;
//            for (String contact : contacts) {
//                if (userInput.equalsIgnoreCase(contact)) {
//                    System.out.println("Contact found: " + contact);
//                    keepGoing = false;
//                    notFound = false;
//                    break;
//                }
//            }
//            if (notFound){
//                System.out.println("not found");
//                System.out.println("try again? true/false");
//                Scanner sc = new Scanner(System.in);
//                keepGoing = sc.nextBoolean();
//            }
//        } catch (IOException iox){
//            iox.printStackTrace();
//        }
//    } while  (keepGoing);
//}


//        public static void deleteThem() throws IOException {
//            String directory = "contactsData";
//            String filename = "contactsList.txt";
//
//            Path dataDirectory = Paths.get(directory);
//            Path dataFile = Paths.get(directory, filename);
//
//            System.out.println("Who would you like to remove?");
//            Scanner scanner1  = new Scanner(System.in);
//            String userRemove = scanner1.nextLine();
//            StringBuilder stringBuilder = new StringBuilder(userRemove);
//            List<String> contacts = Files.readAllLines(dataFile);
//            for (String contact : contacts) {
//                if (userRemove.equalsIgnoreCase(contact)) {
//                    StringBuilder remove = stringBuilder.delete(0,300);
//                    System.out.println(contact + " has been removed.");
//
//                    break;
//                }
////                System.out.println(remove);
//
//            }
//
//        }






        public static void main (String[]args) throws IOException {
//            ArrayList<Object> ppl = new ArrayList<>();
//            ppl.add("ddd");
//            ppl.add(2);
//            ppl.add(11122.33);
//            System.out.println(ppl);
//            viewList();
//            contactSearch();
//            deleteThem();

        }


    }


