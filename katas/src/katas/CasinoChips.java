package katas;

import java.util.Arrays;

public class CasinoChips {

    public static int solve(int [] arr){
        int result=0;
        
        Arrays.sort(arr);
        while(arr[1]>0 && arr[2]>0) {
        	arr[1]-=1;
        	arr[2]-=1;
        	Arrays.sort(arr);
        	result+=1;
        }
        
        return result;    	
    }
	public static void main (String args[]) {
		System.out.println(solve(new int[] {7,4,10}));
		System.out.println(solve(new int[] {12,12,12}));
	}
}
