package pkg;
import java.util.Scanner;


public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
	
		  
		   	return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	
	}
	public static void getSQ(int ducks){
	 
  int x = 0;
  int square = 1;
  int i = 1;
  int conscutive = 1;
  int add = 2;
 
 	while (x < ducks){
 	 square = i*i;
 	 for(int a = 0; a<square; a++){
 	  if(conscutive == square){
 	   System.out.print(square+ " is a special square");
 	   x ++;
 	   break;
 	  }
 	  conscutive += add;
 	  add++;
 	 }
 	 
i++;
conscutive = 1;
add = 2;
 	}
	
	}
    }



	
	

