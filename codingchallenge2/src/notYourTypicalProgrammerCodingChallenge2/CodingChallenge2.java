package notYourTypicalProgrammerCodingChallenge2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CodingChallenge2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner file=new Scanner(new File("challenge2.txt")); //created a Scanner object for file input
		int num=file.nextInt();  //reads in the first number to determine how many data sets there are
		file.nextLine();
		for(int x=0; x<num; x++){  //Loop to iterate through the data sets
			System.out.println(ReplaceLetters.modify(file.nextLine())); //calls the modify method and returns the value of the new word
		}

	}

}
class ReplaceLetters{
	
	public static String modify(String word){
		
		word=word.replaceAll("S", "1");     //using the String replaceAll method, you can replace all the occurences of a substring 
		word=word.replaceAll("AB","**");    //with a replacement value
		return word;
		
	}
}
