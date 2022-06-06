import java.util.*;
import java.util. ArrayList;

class starter {
	//Methods go here

	public static void main(String args[]) {
		// Your code goes below here
			Scanner sc = new Scanner(System.in);
	
	System.out.println("how many valuez do u want the array list to be?");
			String n = sc.newLine();
		ArrayList <String> arr = new ArrayList<String>();
			addValuesArrayList(arr);
			PrintArrList(arr);


	public static void PrintArrList(ArrayList<Integer> po){
		for(int x = 0; x < po.Size();x++){
			System.out.println(po.get(x));
		}
	}
	public static void addValuesArrayList(int n,ArrayList<Integer> pe){
		// The method adds n values to the ArrayList. Values should be random between 1 and 100.

		for(int y=0; x<pe.Size();y++){
			int r = Math.Random()*100;
			
			System.out.println(pe.get(y)*r);
			}
		
	}
}
