package suanfa;

import java.util.Arrays;

public class ShellPaiXun {

	public static void main(String[] args) {
		int[] arr = {2,2,1,7,11,9,10};
    	System.out.println(Arrays.toString(arr));
    	ShellSort(arr);   	
    	System.out.println(Arrays.toString(arr));
	}

	private static void ShellSort(int[] arr) {
		
		for(int step = arr.length/2;step>0;step /= 2){
			for(int i = step; i<arr.length;i++){
				int j = i;
				int temp = arr[j];
				while(j-step>=0 && arr[j-step]>temp){
					arr[j] = arr[j-step];
					j = j - step;
				}
				arr[j] = temp;
			}
		}
		
	}

}
