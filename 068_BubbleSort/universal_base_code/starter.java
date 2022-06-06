import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();


		int[] arr = new int[200];
		// int  x = (int)(Math.random()*100);
		
		for (int i = 0; i < arr.length; i++) {
			int  x = (int)(Math.random()*200);
			arr[i] = x;
			System.out.print(arr[i] + " ");
		}
		
		for(int outer = 0; outer < arr.length-1;outer++){
			for(int inner = 0; inner<arr.length-outer-1;inner++){
				if(arr[inner]>arr[inner+1]){
					int temp = arr[inner];
					arr[inner]=arr[inner+1];
					arr[inner+1] = temp;
				}
			}
		}
				
		System.out.println("");
		System.out.println("");
		System.out.println("The sorted arrya list is;");



		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
}
