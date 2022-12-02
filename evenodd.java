// CHECK A NUMBER IS EVEN OR ODD:

import java.util.*;
class evenodd{
	public static void main(String[] args){
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number to check even or odd:");
		n=sc.nextInt();
		if(n%2==0)
			System.out.print("Even Number!");
		else
	 		System.out.print("Odd Number!");
	}
}