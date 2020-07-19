package katas;

public class pairIntegers {
	public static int solve(int[] arr) {
		int result = 0;
		
		int i=0;
		int j=0;
		boolean found = true;
		
		while(i<arr.length && found==true) {
			found = false;
			
			j=0;
			while(j<arr.length && found==false) {
				if(arr[j]==(arr[i]*-1))
					found = true;
				j+=1;
			}
			
			if (found==false)
				result = arr[i];

			i+=1;
		}

		return result;
	}

	public static void main(String args[]) {
		System.out.print(solve(new int [] {-110,110,-38,-38,-62,62,-38,-38,-38}));
		System.out.print(solve(new int [] {-9,-105,-9,-9,-9,-9,105}));
	}
}
