import java.util.Scanner;

public class Trinomial_Factorer_Java {
    static int gcd(int a, int b){
        a = b;
        b = a%b;
        return a;
    }

    public static void main(String args[]){
        int factor_number = 1;
        boolean counter = true;
        int factor = 0;
        float factor_S = 0;
        float factor_number_S = 0;
        String factor_S_P = "";
        String factor_number_S_P = "";

        System.out.println("ax^2 + bx + c");

        System.out.print("Value for a: ");
        Scanner a_ = new Scanner(System.in);
        int a = a_.nextInt();
        

        System.out.print("Value for b: ");
        Scanner b_ = new Scanner(System.in);
        int b = b_.nextInt();
        

        System.out.print("Value for c: ");
        Scanner c_ = new Scanner(System.in);
        int c = c_.nextInt();
        

        a_.close();
        b_.close();
        c_.close();

        while (counter){
            factor = c/factor_number;
            if (factor + factor_number == b) {
                factor_S = factor/a;
                factor_number_S = factor_number/a;

                if ((factor_number_S - (int)(factor_number_S) == 0) && (factor_S - (int)(factor_S) == 0)){
                    factor_S_P = "(x + " + String.valueOf((int)factor) + ")";
                    factor_number_S_P = "(x + " + String.valueOf((int)factor_number) + ")";
                    counter = false;
                }
                else{
                    factor_S = gcd(factor, a);
                    factor_number_S = a/gcd(factor_number, a);

                    factor_S_P = "(" + String.valueOf((int)(a/gcd(factor, a))) + "x + " + String.valueOf((int)(factor/gcd(factor, a))) + ")";
                    counter = false;
                }
            }
            factor_number++;
        }

        System.out.println(factor_S_P);
        System.out.println(factor_number_S_P);

    }
}
