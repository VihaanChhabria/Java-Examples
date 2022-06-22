import java.util.*;
import java.util.Scanner;

public class Student_Container {
    public static void main(String args[]){
        List<String> names = new ArrayList<>();
        List<String> IDs = new ArrayList<>();
        List<String> grades = new ArrayList<>();
        List<String> addresses = new ArrayList<>();
        
        while (true){
            Scanner choice1 = new Scanner(System.in);
            System.out.println("Type 1 to Enter Details for a Student, Type 2 to Find a Student by their ID, Type 3 to Display all Students, or 4 to Exit");
            String choice = choice1.nextLine();
            
            switch (choice) {
                case "1":
                    Scanner Name1 = new Scanner(System.in);
                    System.out.println("Name: ");
                    String Name = Name1.nextLine();
                    names.add(Name);

                    Scanner ID1 = new Scanner(System.in);
                    System.out.println("ID: ");
                    String ID = ID1.nextLine();
                    IDs.add(ID);

                    Scanner Grade1 = new Scanner(System.in);
                    System.out.println("Grade: ");
                    String Grade = Grade1.nextLine();
                    grades.add(Grade);

                    Scanner Address1 = new Scanner(System.in);
                    System.out.println("Address: ");
                    String Address = Address1.nextLine();
                    addresses.add(Address);
                    break;
                
                case "2":
                    Scanner ID_Check1 = new Scanner(System.in);
                    System.out.println("ID: ");
                    String ID_Check = ID_Check1.nextLine();

                    boolean check = IDs.contains(ID_Check);

                    if (check == true){
                        int pos = IDs.indexOf(ID_Check);
                        String nameS = names.get(pos);
                        String IDS = IDs.get(pos);
                        String gradeS = grades.get(pos);
                        String addressS = addresses.get(pos);
                        System.out.println("Name: " + nameS + "     ID: " + IDS + "     Grade: " + gradeS + "     Address: " + addressS);
                    }
                    break;
                

                case "3":
                    int i = 0;
                    int size = names.size();
                    while (i < size){
                        String nameP = names.get(i);
                        String IDP = IDs.get(i);
                        String gradeP = grades.get(i);
                        String addressP = addresses.get(i);
                        System.out.println("Name: " + nameP + "     ID: " + IDP + "     Grade: " + gradeP + "     Address: " + addressP);
                        System.out.println("");
                        i++;
                    }
                    break;

                case "4":
                    System.exit(0);
            }
            choice1.close();
        }
    }
}