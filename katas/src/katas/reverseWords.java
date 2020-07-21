package katas;

public class reverseWords {

	public static String reverseWords(final String original) {
		int lastPosition = 0;
		int originalLength = original.length();
		String subString = "";
		String result = "";
		
		if(originalLength>0)
		{
			for(int i=0;i<originalLength;i++)
			{
				if(original.charAt(i)==' ') {
					subString = original.substring(lastPosition,i);
					lastPosition = i+1;
					result += reverse(subString) + " ";
				}else if(i==originalLength-1) {
					subString = original.substring(lastPosition,i+1);
					result += reverse(subString);
				}
			}
		}
		
		return result;
	}
	
	public static String reverse(final String original) {
		String result = "";
		for(int i=original.length()-1;i>=0;i--) {
			result += original.charAt(i);
		}
		return result;
	}
	
	public static void main(String args[]) {
		System.out.println(reverseWords("Hello world"));
		System.out.println(reverseWords("ehT kciuq nworb xof spmuj revo eht yzal .god"));
		System.out.println(reverseWords("double  spaced  words"));
	}
}
