import java.util.Scanner;


/**

 *

 * Name: Dylan Fyvie

 * Teacher: Mr.Hardman

 * Assignment #Final, Program #Final

 * Date Last Modified: 1/12/17

 *

 */

/**
 * @author d.fyvie
 *
 */
public class PalindromeChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		String checkWord;
		boolean isPalindrome = false;
		//This take the word from the user for checking
		System.out.println("Please Enter A Word To See If Its A Palindrome?");
		checkWord=userInput.next();
		
		isPalindrome = checkPalindrome(checkWord);
		//This will tell the user if the word they enter is a Palindrome or not
		if( isPalindrome == true){
			System.out.println(String.format("%20s", "This is a Palindrome "));
		}
			
			else{
				System.out.println(String.format("%24s", "This is Not a Palindrome "));
			}
	userInput.close();
	}
	/**
	 * checkPalindrome will return if the word the 
	 * user entered is a palindrome or not
	 * 
	 * @param word
	 * @return result
	 */
	private static boolean checkPalindrome(String word){
		
		boolean result = true;
		
		int firstPosition;
		int secondPosition;
		
		// This is the code that checks if the first & last are the same
		//then it will continue thought the letter until the loop has gone
		// thought each letter or the code found a difference between letters
		
		for(int i=0; result == true && i<= word.length() /2; i++){
			
			//this variable is to place the variable at the first letter then move it 
			// if the last letter is the same, then the secondPosition variable is doing the same but on the last letter first
			
			firstPosition = i;
			secondPosition = word.length()-1 -i;
			
			//this is the code that tells isPalindrome if its true or false so if can send 
			//out the appropriate statement
			
			if(word.charAt(firstPosition) == word.charAt(secondPosition)){
				result = true;
			}
				else{
					result = false;
				}
			
		}
		
		
		return result;
	}
		
	
	
}
