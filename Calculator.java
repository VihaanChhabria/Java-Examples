import java.util.Scanner;

public class Calculator {
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
                

                if (choice1.equals("Add") == true){
                    calc = FN + SN;
                }
                else if(choice1.equals("Subtract") == true)
                {
                    calc = FN - SN;
                }
                else if(choice1.equals("Multiply") == true)
                {
                    calc = FN * SN;
                }
                else if(choice1.equals("Divide") == true)
                {
                    calc = FN / SN;
                }
                else
                {
                    System.out.println("ERROR");
                    continue;
                }

                System.out.println("The result is: "+calc);

        }
    }
}