package sorting1;

public class NewSort {
	public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int b = array[j];  
            int k = j-1;  
            while ( (k > -1) && ( array [k] > b ) ) {  
                array [k+1] = array [k];  
                k--;  
            }  
            array[k+1] = b;  
        }  
    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr1 = {9,14,3,2,43,11,58,22};    
	     System.out.println("Before Insertion Sort");    
	     for(int i=0; i<arr1.length;i++){    
	         System.out.print(arr1[i]+" ");    
	     }    
	     System.out.println();    
	     insertionSort(arr1);//sorting array using insertion sort    
	           
	     System.out.println("After Insertion Sort");    
	     for(int i=0; i<arr1.length;i++){    
	         System.out.print(arr1[i]+" ");    
	     }    
	}

}
