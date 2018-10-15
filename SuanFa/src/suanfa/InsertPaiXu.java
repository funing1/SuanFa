package suanfa;

import java.util.Arrays;

public class InsertPaiXu {
	
    public static void main(String[] args) {
		
    	int[] arr = {2,2,1,7,11,9,10};
    	System.out.println(Arrays.toString(arr));
    	insertSort(arr);   	
    	System.out.println(Arrays.toString(arr));
	}
    
    public static void insertSort(int[] arr){  	
    	for(int i = 0 ; i < arr.length ; i++){
    		for(int j = i ; j>0;j--){
    			if(arr[j] < arr[j-1]){ 
    				int temp = arr[j];
    				arr[j] = arr[j-1];
    				arr[j-1] = temp;
    			}else{
    				break;
    			}
    		}
    	}
    }
}
