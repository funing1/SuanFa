package suanfa;
//git
public class ErFenChaZhao {
	
    public static void main(String[] args) {
		
    	int[] arr = {1,2,3,7,8,9,10};
    	int ys = 99;
    	System.out.println(binarySearch(arr, ys));
    	
	}
    
    public static int binarySearch(int[] arr , int key){  	
    	int start = 0;
    	int end = arr.length-1;
    	
    	while(start<=end){
    		int mid = (start+end)/2;
    		if(arr[mid] == key){
    			return mid;
    		}else if(arr[mid] < key){
    			start = mid+1;
    		}else if(arr[mid] > key){
    			end = mid-1;
    		}  		
    	}   	
    	return -1;    	
    }
}
