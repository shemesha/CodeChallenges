import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Not your typical programmer

public class CodingChallenge1 {

	public static void main(String[] args)throws IOException {
	Scanner file=new Scanner(new File("input.txt"));  //create a Scanner object to input data from a file
	int num=file.nextInt();   //receives first number from the file that denotes the number of data sets
	file.nextLine();
	for(int x=0; x<num; x++){  //Loop for the code to repeat
		
		System.out.println(CodingChallenge1.decode(file.nextLine()));  //Takes the data from the file, decodes the numbers, and outputs the coded word
	}

	}
	public static String decode(String numbers){
		String output="";
		Scanner sc=new Scanner(numbers); //Used to break a part the String into individual numbers for an unknown amount of numbers
		while(sc.hasNext()){     //While there is more numbers to evaluate
			int n=sc.nextInt();    //retrieves the number
			if(n<=13)
				output+=(char)(64+n);   //if the letter is A-M  the ASCII value of A is 65
			
			else
				output+=(char)(104-n);  //if the letter is N-Z then go in reverse and subtract
		}
		
		return output;
	}

}
