import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers for calculation :\n");
        float a = input.nextFloat();
        float b = input.nextFloat();

        System.out.println("Enter the operation to perform\n1 for +\n2 for -\n3 for *\n4 for /");
        int op = input.nextInt();

        switch (op) {
            case 1:
                float sum = a + b;
                System.out.println("The sum is: " + sum);
                break;

            case 2:
                float diff = a - b;
                System.out.println("The difference is: " + diff);
                break;

            case 3:
                float pro = a * b;
                System.out.println("The product is: " + pro);
                break;

            case 4:
                float quo = a / b;
                System.out.println("The quotient is: " + quo);
                break;

            default:
                System.out.println("Please enter a valid operation (1 for +, 2 for -, 3 for *, 4 for /)");
                break;
        }
    }
}
