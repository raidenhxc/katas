package katas;

public class Thirteen {
	
    public static long thirt(long n) {
        long sum = 0;
        long localSum = 0;
        
        String numberToString = String.valueOf(n);
        //System.out.println(numberToString);
        int positions = numberToString.length();
        int[] remainders = new int[positions];
        
        for(int i=0;i<positions;i++) {
        	remainders[i]=(int)Math.pow(10, i)%13;
        }
        
        do {
            sum = localSum;
            localSum = 0;
            positions = numberToString.length();
            for(int i=0;i<positions;i++) {
            	//System.out.println("Remainder: " + remainders[i]);
            	//System.out.println("Número: " + Character.getNumericValue(numberToString.charAt(positions-1-i)));
            	localSum+=Character.getNumericValue(numberToString.charAt(positions-1-i))*remainders[i];
            }
            numberToString = String.valueOf(localSum);
        }while(sum!=localSum);
        
        return sum;
    }

	public static void main (String args[]) {
		System.out.println(thirt(8529));
		//System.out.println(thirt(1234567));
		System.out.println(thirt(987654321));
	}
}
