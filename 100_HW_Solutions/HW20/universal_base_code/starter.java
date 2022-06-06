import java.util.*;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	    Random rand = new Random();

	    ArrayList<Integer> arr = new ArrayList<Integer>();
	        
	     //int x= (int)(Math.random() * arr.size());
	     
	           for (int i = 0; i < 200;i++){ 
	  	     arr.add(rand.nextInt(100));
	          System.out.print(arr.get(i) + " "); 		
	      }
	      	//Bubble sourt
		for (int x=0; x<arr.size(); x++) // bubble sort outer loop
        {
            for (int i=0; i < arr.size()-i; i++) {
                if (arr.get(i).compareTo(arr.get(i+1)) > 0)
                {
                   int temp = arr.get(i);
                    arr.set(i,arr.get(i+1) );
                    arr.set(i+1, temp);
                }
            }
        }
            
       System.out.println("");
		System.out.println("");
		System.out.println("The Bubble sorted array list is;");



		for (int i = 0; i <arr.size(); i++) {
	          System.out.print(arr.get(i) + " "); 
	          	break;
	     
		}
			for(outer = 1; outer < arr.length; outer++){
			key= arr.size;
			inner = outer-1;
			
			while(inner >= 0 && arr.size>key){
				arr.set(inner+ 1] = arr.set(inner);
				inner = inner - 1;
			}
			arr.set(inner + 1)= key;
			}
			
	        
       System.out.println("");
		System.out.println("");
		System.out.println("The Selection sorted array list is;");



		for (int i = 0; i <arr.size(); i++) {
	          System.out.print(arr.get(i) + " "); 
	          	break;
	     
		}
			for(int outer = 0; outer < arr.length-1;outer++){
			for(int inner = 0; inner<arr.length-outer-1;inner++){
				if(arr.size>arr.siz([inner+1)){
					int temp = arr.set(inner);
					ar.set(inner)=arr.set(inner+1);
					arr.set(inner+1) = temp;
				}
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("The Insertion sorted array list is;");



		for (int i = 0; i <arr.size(); i++) {
	          System.out.print(arr.get(i) + " "); 
	          	break;
	     
		}
			
	}
	
}

