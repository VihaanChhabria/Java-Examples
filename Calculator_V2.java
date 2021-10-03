import java.util.Scanner;

public class Calculator_V2 {
        public static void main(String args[]){
            while (true) {
                Scanner choice = new Scanner(System.in);
                System.out.println("Type Add, Subtract, Multiply, Divide, or Quit");
                String choice1 = choice.nextLine();
                float calc = 0;

                if(choice1.equals("Quit") == true)
                {
                    System.exit(0);
                }

                System.out.println("First Number");
                Scanner FN1 = new Scanner(System.in);
                float FN = FN1.nextFloat();

                System.out.println("Second Number");
                Scanner SN1 = new Scanner(System.in);
                float SN = SN1.nextFloat();
                
                switch (choice1) {
                    case "Add":
                        calc = FN + SN;
                        break;

                    case "Subtract":
                        calc = FN - SN;
                        break;

                    case "Multiply":
                        calc = FN * SN;
                        break;

                    case "Divide":
                        calc = FN / SN;
                        break;
                }

                System.out.println("The result is: "+calc);

        }
    }
}