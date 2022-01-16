import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Test {





        public static void main(String[] args) throws IOException {
            ArrayList<Object> ppl = new ArrayList<>();
            ppl.add("ddd");
            ppl.add(2);
            ppl.add(11122.33);
            System.out.println(ppl);


//        File creation


            String directory = "strangers";
            String filename = "contacts.txt";

            Path dataDirectory = Paths.get(directory);
            Path dataFile = Paths.get(filename);

            System.out.println(dataDirectory);
            System.out.println(dataFile);

            try{
                if(Files.notExists(dataDirectory)){
                    Files.createDirectory(dataDirectory);
                }
                if(Files.notExists(dataFile)) {
                    Files.createFile(dataFile);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            boolean run = true;
            while(run){



                Scanner sc = new Scanner(System.in);
                System.out.println("1. View contacts.");
                System.out.println("2. Add a new contact.");
                System.out.println("3. Search a contact by name.");
                System.out.println("4. Delete an existing contact.");
                System.out.println("5. Exit.");
                System.out.println("Enter an option (1, 2, 3, 4 or 5):");

                int userChoice = sc.nextInt();


                if(userChoice == 1){
                    Files.readAllLines(dataFile);
                    break;
                }
                if(userChoice == 2){
                    System.out.println("Please enter a name and number.");
                    String userInput = sc.nextLine();
                    Files.write(dataFile, List.of(userInput));

                    break;
                }
                if(userChoice == 3){
                    String userInput = sc.nextLine();
//            search function
                }
                if(userChoice == 4){
                    String userInput = sc.nextLine();
//            delete function
                }
                if(userChoice == 5){
                    String userInput = sc.nextLine();
//            exit function
                }else {
                    System.out.println("meh");
                }

            }



        }

    }




