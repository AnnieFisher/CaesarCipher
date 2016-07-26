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
		int offset = ('z'-'A'); //subtracting whatever the first char input was from z
		
		//getting index to match numbers to chars
		for (int i = 0; i < originalMessageCharArray.length; i++) {
			
			char oldCharIndex = originalMessageCharArray[i]; //index now equals the letters
			int oldIndexInAlphabet = oldCharIndex - firstCharIndex; //shows how many letters are involved
			int newIndexInAlphabet = (oldIndexInAlphabet + shift) % offset; //shows the shift of 3 + the subtraction of first char from z
			char newCharIndex = (char)(firstCharIndex + newIndexInAlphabet);//show new chars after shift
			originalMessageCharArray[i] = newCharIndex; //represents the new chars after encryption
		}
		return new String(originalMessageCharArray);
	}
	
	//need to do something more here, just returned the original value for decryption
	static String decrypt(String encrypt, int shift) {
		
		return encrypt;
	}



}