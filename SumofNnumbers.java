// Sum of n natural numbers:
import java.util.*;
public class SumofNnumbers {
    public static void main(String[] args){
        int j,n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range to add:");
        n= sc.nextInt();
        for (j=0; j<n; j++) {
            sum+=j;
        }
        System.out.print("The sum of the given range is:" + sum);
    }
}
