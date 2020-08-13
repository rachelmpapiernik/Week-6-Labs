public class sortAlgorithm {

	public static void main(String[] args) {
		
		int [] array = {1,29,14,15,94};
			   int temp;
			   for (int i = 1; i < array.length; i++) {
			    for (int j = i; j > 0; j--) {
			     if (array[j] < array [j - 1]) {
			      temp = array[j];
			      array[j] = array[j - 1];
			      array[j - 1] = temp;
			     }
			    }
			   }
			   for (int i = 0; i < array.length; i++) {
			     System.out.println(array[i]);
			   }
			  }
			

public static int[] doSelectionSort(int[] arr){
	
    for (int i = 0; i < arr.length - 1; i++)
    {
        int index = i;
        for (int j = i + 1; j < arr.length; j++)
            if (arr[j] < arr[index]) 
                index = j;
 
        int smallerNumber = arr[index];  
        arr[index] = arr[i];
        arr[i] = smallerNumber;
    }
    return arr;
}
	
	int[] arr1 = {1, 29, 14, 15, 96};
	int[] arr2 = doSelectionSort(arr1); {
	for(int i:arr2){
		System.out.print(i);
		System.out.print(", ");
	}
}
}