import java.util.Scanner;

public class Question2PGDC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter a positive number: ");
        num1 = sc.nextInt();
        System.out.println("Enter a positive number: ");
        num2 = sc.nextInt();

        int pgcd = 1;

        for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
                pgcd = i;
        }

        System.out.printf("The largest common divisor of %d and %d is: %d", num1, num2, pgcd);
    }
}
