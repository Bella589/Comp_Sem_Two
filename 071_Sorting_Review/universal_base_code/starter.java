import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {

	//Precondition: A and B are presorted in ascending order. 
	//Sort A and B into C.
	public void mergeSort(int [] A, int []B, int [] C){
		 
		 C = new int[((A.length)+(B.length))];
		 
		 
	}
	
		//A is the full array unsorted. 
	//First is the beginning index of the array A, last is the last index of the array.
	//Split A in two halves and sort independently. Then merge back into A.
	public void mergeSort(int [] A, int first, int last){
		first = 0;
		last = 0;
	
		}
	public void Random(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			int  x = (int)(Math.random()*4);
			arr[i] = x;
			System.out.print(arr[i] + " ");
		}
	}
	public void Sort(int [] arr){

			for(int outer = 0; outer < arr.length-1;outer++){
			for(int inner = 0; inner<arr.length-outer-1;inner++){
				if(arr[inner]>arr[inner+1]){
					int temp = arr[inner];
					arr[inner]=arr[inner+1];
					arr[inner+1] = temp;
				}
			}
		}
}
	
	
	
	public static void main(String args[]) {
		// while(first < A.length && last <B.length){
		// 	if(arr[A])
		// }
	}
}
