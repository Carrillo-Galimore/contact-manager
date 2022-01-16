import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {


    public static void createDirFile(String nameDirectory, String textFile){

        Path directory = Paths.get(nameDirectory);
        Path contactsFile = Paths.get(nameDirectory, textFile);

        try {
            if(Files.notExists(directory)){
                Files.createDirectories(directory);
            }
        } catch (IOException iox){
            iox.printStackTrace();
        }

        try{
            if (Files.notExists((contactsFile))){
                Files.createFile(contactsFile);
            }
        } catch (IOException iox){
            iox.printStackTrace();
        }
    }

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


    public static void main(String[] args) {
//        createDirFile("contactsDirectory", "contactList.txt");
//    String contactsDirectory = "contactsData";
//    String contactList = "contactsList.txt";
//
//    Path contactDataList = Paths.get(contactsDirectory);
//    Path contactsFile = Paths.get(contactsDirectory, contactList);
//
//    try{
//        if (Files.notExists(contactDataList)){
//            Files.createDirectories(contactDataList);
//        }
//    } catch (IOException iox){
//        iox.printStackTrace();
//    }
//
//    try{
//        if (Files.notExists(contactsFile)){
//            Files.createFile(contactsFile);
//            Files.write(contactsFile, Arrays.asList("Joe - 123-456-7891", "JoeAnn - 234-567-8910"));
//        }
//    } catch (IOException iox){
//        iox.printStackTrace();
//    }
//
//    try{
//        List<String> contacts = Files.readAllLines(contactsFile);
//        for(String contact : contacts){
//            System.out.println(contact);
//        }
//    } catch (IOException iox){
//        iox.printStackTrace();
//    }

        addToTextFile();

//        createDirFile("testDirector", "text.tx");




    }
}

