package notyourtypicalprogrammer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NYTPCodingChallenge4 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner file=new Scanner(new File("challenge4.txt"));  //Scanner used for file input
		int num=file.nextInt();
		
		for(int x=0; x<num; x++){
			System.out.println(NYTPCodingChallenge4.findPalindrome(file.nextInt()));  //calls the find root method and passes a String argument to the method
			

		}
	}
		
	public static int findPalindrome(int num){  
		boolean found=false;   //loop control variable 
		do{
		String num1=Integer.toString(num);  //Changes the num to a String
		String num2="";
	
		for(int x=num1.length()-1; x>=0;x--){  //Reverse the String to use for String comparison
			num2=num2+num1.charAt(x);
		}

		if(num1.equals(num2))  //If the reversed String is equal to the original then the number is a palindrome
			found=true;
		else     //If not continue on to the next number until a number is found
			num++;
		
		}while(found==false);
		
		return num;  //returns the first palindrome that is greater than or equal to the original number
		
		}
		

}
