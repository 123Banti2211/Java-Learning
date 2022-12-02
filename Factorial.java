// Factorial of a given number
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        int n,i,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value to find its factorial:");
        n=sc.nextInt();
        for (i=1; i<=n; i++) {
            fact*=i;   
        }
        System.out.print("The Factorial of the given number is:" + fact);
    }
}
