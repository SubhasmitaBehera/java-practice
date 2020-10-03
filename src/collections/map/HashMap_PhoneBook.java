//package collections.map;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class HashMap_PhoneBook {
//    private static String name;
//    private static String phoneNumber;
//
//    public static void main(String[] args) {
//        System.out.println("\t\t\t\t\t ~~~~~~ WELCOME TO PHONE BOOK ~~~~~~");
//        HashMap<String, String> phoneBook = new HashMap<>();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your choice below:- ");
//        while (true) {
//            System.out.println("Enter 1 to SEE your all contact...");
//            System.out.println("Enter 2 to CREATE contact...");
//            System.out.println("Enter 3 to SEARCH contact...");
//            System.out.println("Enter 4 to DELETE contact...");
//            System.out.println("Enter 5 to QUITE... \n");
//            System.out.print("Enter Your Choice:- ");
//            int choice = sc.nextInt();
//            switch (choice) {
//                case 1:
//                    try {
//
//                        if (phoneBook.isEmpty())
//                            System.out.println("\n Phone Book is empty !!! Add contacts to the Phone Book first...\n");
//                        else {
//                            System.out.println("All Contacts:-");
//                            for (Map.Entry contact : phoneBook.entrySet())
//                                System.out.println(contact.getKey() + " : " + contact.getValue());
//                            System.out.println();
//                        }
//                        break;
//                    }
//                    catch (Exception e){
//                        System.out.println("Please enter correct choice...");
//                    }
//                case 2:
//                    try {
//
//                        CreateContact();
//                        phoneBook.put(name, phoneNumber);
//                        System.out.println("Phone Book Updated Successfully...\n");
//                        while (true) {
//                            System.out.print("Do you want to add more contact ? [yes/no] ");
//                            String inp = sc.next();
//                            if (inp.equals("yes")) {
//                                CreateContact();
//                                phoneBook.put(name, phoneNumber);
//                                System.out.println("Phone Book Updated Successfully...\n");
//                            } else
//                                break;
//                        }
//                        break;
//                    }
//                    catch (Exception e){
//                        System.out.println("Please enter correct choice...");
//                    }
//                case 3:
//                    try {
//
//                        System.out.print("Enter the Name you want to search:");
//                        name = sc.next();
//                        int temp=1;
//                        for (Map.Entry contact : phoneBook.entrySet()) {
//                            if (name.equals(contact.getKey())) {
//                                System.out.println(name+ " : "+phoneBook.get(name) +"\n");
//                                temp=0;
//                                break;
//                            }
//                        }
//                        if(temp==1)
//                            System.out.println("This contact does not exist...\n");
//                        break;
//                    }
//                    catch (Exception e){
//                        System.out.println("Please enter correct choice...");
//                    }
//                case 4:
//                    try{
//
//                        System.out.print("Enter the Name of the Contact you want to delete :");
//                        name = sc.next();
//                        int temp1=1;
//                        for (Map.Entry contact : phoneBook.entrySet()) {
//                            if (name.equals(contact.getKey())) {
//                                phoneBook.remove(name);
//                                System.out.println("This contact "+name+" deleted succussully...\n");
//                                temp1=0;
//                                break;
//                            }
//                        }
//                        if(temp1==1)
//                            System.out.println("This contact does not exist...\n");
//                        break;
//                    }
//                    catch (Exception e){
//                        System.out.println("Please enter correct choice...");
//                    }
//                case 5:
//                    try {
//
//                        while (true) {
//                            System.out.print("Are you sure you want to exit ? [yes/no]");
//                            String input = sc.next();
//                            if (input.equals("yes")) {
//                                System.exit(0);
//                            }
//                            else
//                                break;
//                        }
//                    }
//                    catch (Exception e){
//                        System.out.println("Please enter correct choice...");
//                    }
//            }
//        }
//    }
//
//    private static void CreateContact() {
//        System.out.println("Create Contact...");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Name : ");
//        name = sc.next();
//        System.out.print("Enter Phone Number : ");
//        phoneNumber = sc.next();
//    }
//}
