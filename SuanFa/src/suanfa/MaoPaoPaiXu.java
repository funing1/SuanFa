package suanfa;

import java.util.Arrays;

public class MaoPaoPaiXu {
	
    public static void main(String[] args) {
		
    	int[] arr = {1,7,3,7,11,9,10};
    	System.out.println(Arrays.toString(arr));
    	maopao(arr);   	
    	System.out.println(Arrays.toString(arr));
	}
    
    public static void maopao(int[] arr){  	
    	int temp = 0;
    	int size = arr.length;
    	for(int i = 0 ; i < size -1 ; i++){
    		for(int j = 0 ; j < size - 1 -i ; j++){
    			if(arr[j] > arr[j+1]){
    				temp = arr[j];
    				arr[j] = arr[j+1];
    				arr[j+1] = temp;
    			}
    		}
    	}
    }
}
