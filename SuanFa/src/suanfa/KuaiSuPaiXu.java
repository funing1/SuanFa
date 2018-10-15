package suanfa;

import java.util.Arrays;

public class KuaiSuPaiXu {

	public static void main(String[] args) {
		int[] arr = {1,7,3,7,11,9,10};
    	System.out.println(Arrays.toString(arr));
    	sort(arr,0,arr.length-1);   	
    	System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int[] arr,int start,int end){
		if(start >= end){
			return;
		}else{
			int divide = divide(arr, start,end);
			sort(arr, start,divide-1);
			sort(arr,divide+1,end);
		}
	}

	public static int divide(int[] arr, int start, int end) {

		int base = arr[end];

		while (start < end) {
		
			while (start < end && arr[start] <= base) {
				start++;
			}

			if (start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				end--;
			}
			
			while(start<end && arr[end] >=base){
				end--;
			}
			
			if (start < end) {
				int temp = arr[end];
				arr[end] = arr[end];
				arr[end] = temp;
				start++;
			}

		}

		return end;
	}

}
