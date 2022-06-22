import java.util.Scanner;

public class Area_Permeter {
    static void length() {
        Scanner mearsure_ = new Scanner(System.in);
        System.out.println("Whats your one side of lenght?");
        float mearsure1 = mearsure_.nextFloat();

        Scanner change1 = new Scanner(System.in);
        System.out.println("Do you want to convert your length to a different measurement (yes/no)");
        String change = change1.nextLine();

        if (change.equals("yes") == true){
        Scanner mearsure__ = new Scanner(System.in);
        System.out.println("What type of measurement are you using? (1 for kilometer, 2 for meter, 3 for centimeter)");
        int mearsure2 = mearsure__.nextInt();
        }
      }
}
