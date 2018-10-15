package suanfa;

import java.util.Arrays;

public class XuanZePaiXu {
	
    public static void main(String[] args) {
		
    	int[] arr = {2,2,1,7,11,9,10};
    	System.out.println(Arrays.toString(arr));
    	xuanze(arr);   	
    	System.out.println(Arrays.toString(arr));
	}
    
    public static void xuanze(int[] arr){  	
    	for(int i = 0 ; i < arr.length;i++){
    		int min_index = 0;
			int min = Integer.MAX_VALUE;
    		for(int j = i ; j < arr.length;j++){   			  			
    			if(arr[j] < min){
    				min_index = j;
    				min = arr[j];
    			}   			
    		}
    		int temp = arr[i];
    		arr[i] = arr[min_index];
    		arr[min_index]=temp;
    	}
    }
}
