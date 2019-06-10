
public class InsertionSort {

	
		 
	    public static void main(String a[]){
	        int[] array1 = {10,34,2,56,7,67,88,42};
	        int[] array2 =InsertionSrt(array1);
	        for(int i:array2){
	            System.out.print(i);
	            System.out.print("  ");
	        }
	    }
	     
	    public static int[] InsertionSrt(int[] input){
	         
	        int temp;
	        for (int i = 1; i < input.length; i++) {
	            for(int j = i ; j > 0 ; j--){
	                if(input[j] < input[j-1]){
	                    temp = input[j];
	                    input[j] = input[j-1];
	                    input[j-1] = temp;
	                }
	            }
	        }
	        return input;
	    }
	}

