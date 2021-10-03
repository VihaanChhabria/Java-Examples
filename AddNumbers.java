import java.util.Scanner;
public class AddNumbers {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      float calc = 0;
      System.out.print("Functions: type 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division and 5 to exit ");
      int choice = in.nextInt();

      while (choice != 5)
      {
         System.out.printf("Enter value Number1 ");
         float Number1 = in.nextFloat();        
         System.out.printf("Enter value Number2 ");
         float Number2 = in.nextFloat();  
         if (choice == 1)
         {
            calc = Number1 + Number2;
         }
         else if(choice == 2)
         {
            calc = Number1 - Number2;
         }
         else if(choice == 3)
         {
            calc = Number1 * Number2;
         }
         else if(choice == 4)
         {
            calc = Number1 / Number2;
         }

         System.out.println("The result is: "+calc);

         System.out.print("Functions: type 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division and 5 to exit ");
         choice = in.nextInt();
      }
   }
}