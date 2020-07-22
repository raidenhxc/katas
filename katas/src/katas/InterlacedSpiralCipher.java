package katas;

public class InterlacedSpiralCipher {

    public static String encode(String s) {
    	String result = "";
        int i = 0;
		int j = 0;
		int k = 0;
		int cycle = 0;
		
		int rows = 0;
		int cols = 0;
		
		int range = (int)Math.ceil(Math.sqrt(s.length()));
		double original_range = range;
		char[][] text = new char[range][range];
		
		// We use this as a position counter in 's'
		int charCounter=0;
		
		// Create a char array with the correct size
		char[] charArray = new char[range*range];
		for(i=0;i<charArray.length;i++)
			charArray[i]=' ';
		
		// Move the s parameter to our charArray
		for(i=0;i<s.length();i++)
			charArray[i]=s.charAt(i);
		
		for(k=0;k<original_range;k+=2) {
			range=(int)original_range-(cycle*2);
			if (range<1)
				range=1;
			
			if(range==1) {
				rows=cycle+1;
				cols=cycle+1;
				text[rows-1][cols-1]=charArray[charCounter];
			}else {
		        for(i=0;i<range-1;i++) {
		        	for(j=0;j<4;j++) {
		        		if(j==0) {
		        			rows=1+cycle;
		        			cols=1+cycle;
		        			cols+=i;
		        		}
		        		else if (j==1) {
		        			rows=1+cycle;
		        			cols=range+cycle;
		        			rows+=i;        			
		        		}
		        		else if (j==2) {
		        			rows=range+cycle;
		        			cols=range+cycle;
		        			cols-=i;
		        		}
		        		else {
		        			rows=range+cycle;
		        			cols=1+cycle;
		        			rows-=i;
		        		}

		        		text[rows-1][cols-1]=charArray[charCounter];
		        		charCounter++;
		        	}
		        }
		        cycle++;
			}

		}
		
		for(i=0;i<original_range;i++)
			for(j=0;j<original_range;j++)
				result += text[i][j];
		
        return result;
    }
    
    public static String decode(String s) {
    	String result = "";
    	int range = (int)Math.ceil(Math.sqrt(s.length()));
    	double original_range = range;
    	
        char text[][]=new char[range][range];
        int i = 0;
        int j = 0;
        int k = 0;
		int cycle = 0;
		
		int rows = 0;
		int cols = 0;
        
        for(i=0;i<range;i++)
        	for(j=0;j<range;j++)
        		text[i][j]=' ';
        
        for(i=0;i<s.length();i++) {
        	text[i/range][i%range]=s.charAt(i);
        }
        
        for(k=0;k<original_range;k+=2) {
			range=(int)original_range-(cycle*2);
			
			if (range<1)
				range=1;
			
			if(range==1) {
				rows=cycle+1;
				cols=cycle+1;
				result += text[rows-1][cols-1];
			}else {
		        for(i=0;i<range-1;i++) {
		        	for(j=0;j<4;j++) {
		        		if(j==0) {
		        			rows=1+cycle;
		        			cols=1+cycle;
		        			cols+=i;
		        		}
		        		else if (j==1) {
		        			rows=1+cycle;
		        			cols=range+cycle;
		        			rows+=i;        			
		        		}
		        		else if (j==2) {
		        			rows=range+cycle;
		        			cols=range+cycle;
		        			cols-=i;
		        		}
		        		else {
		        			rows=range+cycle;
		        			cols=1+cycle;
		        			rows-=i;
		        		}
		        		result += text[rows-1][cols-1];
		        	}
		        }
		        cycle++;
			}

		}
        
        // Remove ending spaces
        i = result.length();
        while(i>0 && result.charAt(i-1)==' ') {
        	i--;
        }
        return result.substring(0,i);
    }
	
	public static void main (String args[]) {
		System.out.println(encode("Romani ite domum"));
		System.out.println(encode("Sic transit gloria mundi"));
		System.out.println("");
		System.out.println(decode("z$W(=EBK:kL.BFzoM/H@  (k@_zN)*(:.TLs"));
	}
}
