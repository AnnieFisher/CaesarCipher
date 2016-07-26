package ceasar;

import java.util.Scanner;

public class Cipher {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("enter what to encrypt ");   
		String originalMessage = kb.nextLine();
		
		kb.close();
		
		// prints out the encrypted message
		String encrypt = encrypt(originalMessage, 3);
		System.out.println("Encrypted message:"+encrypt);
		
		//prints out the decrypted message
		String decrypt = decrypt(originalMessage, 3);
		System.out.println("Decrypted Message "+decrypt);
	}
	// method to encrypt
	//create an array from the user input
	static String encrypt(String originalMessage, int shift) {
		char[] originalMessageCharArray = originalMessage.toCharArray();
		int firstCharIndex = 'A';   //create an index for the chars
		int offset = ('z'-'A'); //need to offset for the mod in next steps
		
		for (int i = 0; i < originalMessageCharArray.length; i++) {
			
			char oldCharIndex = originalMessageCharArray[i]; //index now equals the letters
			int oldIndexInAlphabet = oldCharIndex - firstCharIndex; //shows how many letters are involved
			int newIndexInAlphabet = (oldIndexInAlphabet + shift) % offset;
			char newCharIndex = (char)(firstCharIndex + newIndexInAlphabet);
			originalMessageCharArray[i] = newCharIndex;
		}
		return new String(originalMessageCharArray);
	}
	static String decrypt(String encrypt, int shift) {
		
		return encrypt;
	}



}	
