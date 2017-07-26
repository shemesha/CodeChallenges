import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NYTPCodingChallenge3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner file=new Scanner(new File("challenge3.txt"));  //Scanner used for file input
		int num=file.nextInt();
		file.nextLine();
		for(int x=0; x<num; x++){
			System.out.println(NYTPCodingChallenge3.findRoot(file.nextLine()));  //calls the find root method and passes a String argument to the method
			
		}

	}
	
	public static String findRoot(String word){
		
		//While loop to check the prefix - loops continues until all the prefixes are removed 
		while(word.startsWith("un")|| word.startsWith("re")||word.startsWith("ex")||word.startsWith("en")||word.startsWith("pre")|| word.startsWith("mis"))
		{
			if(word.startsWith("un")|| word.startsWith("re")||word.startsWith("ex")||word.startsWith("en"))
		      word=word.substring(2);  //removes the first two letters
	       
			if(word.startsWith("pre")|| word.startsWith("mis"))
			   word=word.substring(3);  //removes the first three letters
		}
		//While loop to check the suffix 
		while(word.endsWith("s")|| word.endsWith("ed")|| word.endsWith("or") || word.endsWith("ing")|| word.endsWith("ion") || word.endsWith("ist")){
		
			if(word.endsWith("s"))
			word=word.substring(0,word.length()-1);  //Removes the last letter
				
		if(word.endsWith("ed")|| word.endsWith("or"))
			word=word.substring(0,word.length()-2);  //Removes the last two letters
		
		
		if(word.endsWith("ing")|| word.endsWith("ion") || word.endsWith("ist") )
			word=word.substring(0,word.length()-3);  //Removes the last three letters
		}
		
		if(word.length()==0)
			word="VOID";   //word is changed to void if no letters remain
		
		return word;
	}

}
