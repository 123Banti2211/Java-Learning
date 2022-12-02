// Check a character vowel or consonant

import java.util.*;

class Vowelconsonant{
	public static void main(String[] args){
	char ch;
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a character to check vowel or consonant:");
	ch=sc.next().charAt(0);
	if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'|| ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
		System.out.println("VOWEL!");
	else
		System.out.println("CONSONANT!");
	}
}	