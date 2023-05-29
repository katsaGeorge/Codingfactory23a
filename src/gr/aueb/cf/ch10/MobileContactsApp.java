package gr.aueb.cf.ch10;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class MobileContactsApp {
    static Scanner in = new Scanner(System.in);
    final static String[][] contacts = new String[500][3];
    static int pivot = -1 ;
    final static Path path = Paths.get("C:/tmp/log-mobile.txt");

    public static void main(String[] args) {
        boolean quit = false;
        String s;
        int choice;
        String phoneNumber;

        do {

            printMenu();
            s = getChoice();
            if (s.matches("[Qq]")) quit = true;
            else {
                try {
                    choice = Integer.parseInt(s);
                    if(!isValid(choice)){
                        throw new IllegalArgumentException("Error - Choice must be betwwen 1-5");
                    }

                    switch (choice){
                        case 1 :
                            printContactMenu();
                            insertController(getFirstname(), getLastname(), getPhoneNumber());
                            break;
                        case 2:
                            phoneNumber = getPhoneNumber();
                            deleteController(phoneNumber);
                        case 3:
                            phoneNumber = getPhoneNumber();
                            printContactMenu();
                            upadateController(phoneNumber, getFirstname(), getLastname(), getPhoneNumber());
                        case 4:
                            phoneNumber = getPhoneNumber();
                            String[] contact = getOneController(phoneNumber);
                            break;
                        case 5:
                            String[][] allcontacts = getAllContactsController();
                            break;

                        default:
                            throw new IllegalArgumentException("Bad choice");
                    }


                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

        } while (!quit);
    }

    public static void printContact(String[] contact){
        for (String s: contact){
            System.out.print(s + " ");
        }
    }

    public static void printContacts(String[][] contacts){
        for (String[] contact: contacts){
            printContact(contact);
        }
    }
    public static boolean isValid(int choice){
                return (choice >=1 && choice <= 5);
        }



    public static void printMenu() {
        System.out.println("Eπιλέξτε ένα απο τα παρακάτω");
        System.out.println("1.Εισαγωγη επαφής");
        System.out.println("2.Διαγραφη επαφής");
        System.out.println("3.Ενημέρωση επαφης");
        System.out.println("4.Αναζήτηση επαφής");
        System.out.println("5.Εκτύπωση όλων των επαφών");
        System.out.println("Q.Έξοδος");
    }

    public static String getChoice(){
        System.out.println("Εισάγετε επιλογή");
        return in.nextLine().trim();
    }

    public static void printContactMenu(){
        System.out.println("Eισαγεται όνομα , Επώνυμο, και Τηλέφωνο");
    }
    public static String getFirstname(){
        System.out.println("Eισαγεται όνομα");
        return in.nextLine().trim();
    }
    public static String getLastname(){
        System.out.println("Eισαγεται όνομα");
        return in.nextLine().trim();
    }

    public static String getPhoneNumber(){
        System.out.println("Εισάγετε αριθμό τηλεφώνου");
        return  in.nextLine().trim();
    }

    /*
     *  Controllers
     */


    public static  void insertController (String firstname , String lastname, String phoneNumber){
        try{
           if (firstname == null || lastname == null || phoneNumber == null){
               throw new IllegalArgumentException("Nulls are not allowed");
           }
           if (firstname.length() < 2 || firstname.length() > 50){
               throw new IllegalArgumentException("Firstname is not Valid");
           }
            if (lastname.length() < 2 || lastname.length() > 50){
                throw new IllegalArgumentException("Firstname is not Valid");
            }
            if (phoneNumber.length() < 2 || phoneNumber.length() > 12){
                throw new IllegalArgumentException("Firstname is not Valid");
            }

            //Service call

            insertContactService(firstname.trim(), lastname.trim(), phoneNumber.trim());

        }catch (IllegalArgumentException e){
            e.printStackTrace();
            throw e;
        }
    }


    public static  void upadateController (String oldPhoneNumber, String firstname ,
                                           String lastname, String newphoneNumber){
        try{
            if (oldPhoneNumber == null || firstname == null || lastname == null || newphoneNumber == null){
                throw new IllegalArgumentException("Nulls are not allowed");
            }

            if (oldPhoneNumber.length() < 2 || oldPhoneNumber.length() > 12){
                throw new IllegalArgumentException("Firstname is not Valid");
            }
            if (firstname.length() < 2 || firstname.length() > 50){
                throw new IllegalArgumentException("Firstname is not Valid");
            }
            if (lastname.length() < 2 || lastname.length() > 50){
                throw new IllegalArgumentException("Firstname is not Valid");
            }
            if (newphoneNumber.length() < 2 || newphoneNumber.length() > 12){
                throw new IllegalArgumentException("Firstname is not Valid");
            }

            //Service call

            updateContactService(oldPhoneNumber.trim(), firstname.trim(), lastname.trim(), newphoneNumber.trim());

        }catch (IllegalArgumentException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static String[] deleteController(String phoneNumber){
        try{
            if(phoneNumber.length() < 2 || phoneNumber.length() > 12){
                throw new IllegalArgumentException("Phoe number is not valid");
            }
            return deleteContactService(phoneNumber);
        }catch (IllegalArgumentException e){
            throw  e;
        }
    }

    public static String[] getOneController (String phoneNumber){
        try{
            if(phoneNumber.length() < 2 || phoneNumber.length() > 12){
                throw new IllegalArgumentException("Phone number is not valid");
            }
            return getOneContact(phoneNumber);
        }catch (IllegalArgumentException e){
            throw e;
        }
    }

    public static String[][] getAllContactsController(){
        try{
            return getAllContactsService();
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            throw e;
        }
    }

    /*
     * Service lAYER
     */

    public static  String[] getOneContact(String phoneNumber) {
        try {
            String[] contact = getContactByPhoneNumber(phoneNumber);
            if (contact.length == 0) {
                throw new IllegalArgumentException("Contact not found");

            }

            return contact;

        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    public static String[][] getAllContactsService() throws IllegalArgumentException{
        try {
            String[][] contactsList = getAllContacts();
            if (contactsList.length == 0) {
                throw new IllegalArgumentException("List is empty");
            }
            return contactsList;
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    public static void insertContactService(String firstname , String lastname , String phoneNumber) {
        try {
            if (!insert(firstname, lastname ,phoneNumber)) {
                throw new IllegalArgumentException("Error in insert");

            }

        }catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }

     }


     public static void updateContactService(String oldPhoneNumber, String firstname , String lastname ,
                                             String newPhoneNUmber) {


         try {
             if (!(update(oldPhoneNumber, firstname, lastname, newPhoneNUmber))) {
                 throw new IllegalArgumentException("Error in update");
             }
             }catch (IllegalArgumentException e){

             log(e);
             throw e;
         }
     }

     public static String[] deleteContactService(String phoneNumber) {

        String[] contact;

        try {
                contact = delete(phoneNumber);
                if (contact.length == 0) {
                    throw new IllegalArgumentException("Error in Delete");
                }
                return contact;
        }catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
     }









    /*

   CRUD Services that are provided to
   Services Layer.

     */

    public static int getIndexByPhoneNuumber(String phonenumber){
        for (int  i = 0; i <= pivot; i++){
            if (contacts[i][2].equals(phonenumber)){
                return i;

            }
        }
        return -1; //if not found
    }

    public static boolean insert(String firstname , String lastname , String phoneNumber){
        // inserted = false;  δεν χρειαζεται
         if (isFull(contacts)){
             return false;
         }
         if (getIndexByPhoneNuumber(phoneNumber)!= -1 ) {
             return false;
        }

         pivot++;
         contacts[pivot] [0] = firstname;
         contacts[pivot] [1] = lastname;
         contacts[pivot] [2] = phoneNumber;
         return  true;
    }

    public static boolean update (String oldphoneNumber, String firstname, String lastname, String newPhoneNumber){
        int positionToupdate = getIndexByPhoneNuumber(oldphoneNumber);
       // String[] contact = new String[3];

        if(positionToupdate == -1) {
            return false;
           // return new String[] {};
            }


        contacts[positionToupdate] [0] = firstname;
        contacts[positionToupdate] [1] = lastname;
        contacts[positionToupdate] [2] = newPhoneNumber;
        return true;

    }

    public static String[] delete(String phoneNumber){
        int positionToDelete = getIndexByPhoneNuumber(phoneNumber);
        String[] contact = new String[3];

        if (positionToDelete == -1) {
            return new String[]{};
        }


        for(int i =0; i <contact.length; i++){
            contact[i] = contacts[positionToDelete][i];
        }

        if (positionToDelete == contact.length -1) {
            System.arraycopy(contacts, positionToDelete + 1, contacts, positionToDelete, pivot - positionToDelete);
        }
        pivot--;
        return contact;
    }

    public static String[] getContactByPhoneNumber(String phoneNumber){
        int positionToReturn = getIndexByPhoneNuumber(phoneNumber);

        if (positionToReturn == -1){
            return new String[] {};
        }
        return contacts[positionToReturn];
    }

    public static String[][] getAllContacts(){
        return Arrays.copyOf(contacts, pivot +1);
    }


    public static boolean isFull(String[][] arr){
        return pivot == arr.length -1;
    }


/*
  * logger
 */

    public static void log(Exception e, String...mesage){
            try (PrintStream ps = new PrintStream(new FileOutputStream(path.toFile(),true))){
        ps.println(LocalDateTime.now() + "\n" + e.toString());
        ps.printf("%s", (mesage.length == 1)? mesage[0] : "" );
            }catch (FileNotFoundException ex){
                ex.printStackTrace();
    }
}
}