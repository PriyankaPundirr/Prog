
public class SelctionSort {

	
		 public static void main(String a[]){
	         
		        int[] array1 = {10,34,2,56,7,67,88,42};
		        int[] array2 = SelectionSrt(array1);
		        for(int i:array2){
		            System.out.print(i);
		            System.out.print("  ");
		        }
		    }
			 
	    public static int[] SelectionSrt(int[] array){
	         
	        for (int i = 0; i < array.length - 1; i++)
	        {
	            int k = i;
	            for (int j = i + 1; j < array.length; j++)
	                if (array[j] < array[k]) 
	                    k = j;
	      
	            int smallerNumber = array[k];  
	            array[k] = array[i];
	            array[i] = smallerNumber;
	        }
	        return array;
	    }
	     
	   
}
