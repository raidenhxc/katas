package katas;

public class stringEndsWith {
	public static boolean solution(String str, String ending) {
	    if(ending.equals(""))
	        return true;
	      else if(ending.length()>str.length())
	        return false;
	      else
	        return str.substring(str.length()-ending.length(), str.length()).equals(ending);
	}
	
	public static void main(String args[]) {
		System.out.print(solution("prueba cadena","ena"));
		System.out.print(solution("prueba cadena","dena"));
		System.out.print(solution("prueba cadena","no"));
	}
}
