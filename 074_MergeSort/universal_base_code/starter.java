import pkg.*;
import java.util.*;


class starter {
	public static void Sort(int [] arr, int l, int r){
			if(l <r){
				int m = 1+ (r-l)/2;
				Sort(arr, l, m);
				Sort(arr, m + 1, r);
				

			}
	}
	
	public static void main(String args[]) {
		
		
	}
}
