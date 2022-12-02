// GCD & LCM of Two Numbers:
import java.util.*;
public class GcdandLcm{
    public static void main(String[] args){
        int gcd=0,lcm,a,b,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two numbers to find their GCD & LCM:");
        a= sc.nextInt();
        b= sc.nextInt();
        for ( i=1; i<a && i<b; i++) {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }  
        }
        System.out.println("The GCD of the given two numbers is:" + gcd);
        lcm=(a*b)/gcd;
        System.out.println("The LCM of the given two numbers is:" + lcm);
    }
    
}
