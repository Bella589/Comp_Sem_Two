import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();

		int[] arr = new int[200];
	
		for (int i = 0; i < arr.length; i++) {
			int  x = (int)(Math.random()*200);
			arr[i] = x;
			System.out.print(arr[i] + " ");
		}
	int outer;
	int inner;
	int key;
	
	for(outer = 1; outer < arr.length; outer++){
		key = arr[outer];
		inner = outer- 1;
		
		while(inner >= 0 && arr[inner] > key){
			arr[inner + 1] = arr[inner];
			inner = inner - 1;
		}
		arr[inner + 1] = key;
	}
	
		System.out.println("");
		System.out.println("");
		System.out.println("The sorted arrya list is;");
			
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
	}

	}
}
