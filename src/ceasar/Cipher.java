package ceasar;

import java.util.Scanner;

public class Cipher {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter message");
		String msg = kb.next();
		int encryption = msg.length();
		int shift = 3;
		
		//cipher()
	//	System.out.println(cipher("abc", 3);  //prints def
	//	System.out.println(cipher("xyz", shift);  //prints abc
		
	}

	String cipher(String msg, int shift){
	    String s = "";
	    int len = msg.length();
	    for(int x = 0; x < len; x++){
	        char c = (char)(msg.charAt(x) + shift);
	        if (c > 'z')
	            s += (char)(msg.charAt(x) - (26-shift));
	        else
	            s += (char)(msg.charAt(x) + shift);
	    }
	    return s;
	}
}