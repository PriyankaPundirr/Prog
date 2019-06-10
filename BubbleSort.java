
public class BubbleSort {
	
	
	  	public static void main(String[] args) {
	        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
	        bubblesrt(input);
	   }

	    public static void bubblesrt(int array[]) {
	        int n = array.length;
	        int k;
	        for (int m = n; m >= 0; m--) {
	            for (int i = 0; i < n - 1; i++) {
	                k = i + 1;
	                if (array[i] > array[k]) {
	                    swapN(i, k, array);
	                }
	            }
	        }
	        
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + ", ");
	        }
	        System.out.println("\n");
	    
	    }
	  
	    private static void swapN(int i, int j, int[] array) {
	  
	        int temp;
	        temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	  
	}