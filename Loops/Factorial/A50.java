/*
 * Factoirial
 */
import java.util.*;
public class A50{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int num = sc.nextInt();

        int fact = 1;

        for(int i=1; i<=num; i++){
            fact *= i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);

    }
}
