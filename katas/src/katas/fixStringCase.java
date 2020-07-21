package katas;

import java.util.Arrays;

public class fixStringCase {
	public static String solve(final String str) {
		String result = "";
		
		if(str.length()>0) {
			char[] characters = str.toCharArray();
			Arrays.sort(characters);
			
			if(characters[characters.length/2]>90)
				result = str.toLowerCase();
			else
				result = str.toUpperCase();
		}

		return result;
	}
	
	public static void main(String args[]) {
        System.out.println(solve("codeE"));
        System.out.println(solve("CODe"));
        System.out.println(solve("COde"));
        System.out.println(solve("Code"));
        System.out.println(solve(""));
	}
}
