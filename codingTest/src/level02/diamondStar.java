package level02;
import java.util.*;

public class diamondStar{
	
		public static void main(String[] args) {
			System.out.println("방법 1------------");
			// 상단 
			for(int i =1; i<=5; i++) {
				
				for(int j=1; j<=5-i; j++) {
					System.out.print(" ");
				}
				
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				for (int j=2; j<=i; j++) {
		            System.out.print("*"); //나머지 별반틈.
		        }
		            System.out.println();
			}
			
			for(int i=1; i<=5; i++) {   
	            for (int j=1; j<=i; j++) {
	                System.out.print(" ");
	            }
	            for (int j=1; j<=5-i; j++) {
	                System.out.print("*");
	            }
	            for (int j=3; j>=i; j--) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
			
			  //방법 2. 공백찍고, 나머지 별 한방에 채우기. (총 4파트로 나누어 생각. ) 
		    System.out.println("방법2 ------------");
		    
		    for(int i=1; i<=5; i++) {
		    	
		    	for(int j =1; j<=5-i; j++) {
		    		System.out.print(" ");
		    	}
		    	
		    	for(int j =1; j<=i*2-1;j++) {
		    		System.out.print("*");
		    	}
		    	System.out.println(" ");
		    	
		    }
		    
		    for(int i=4; i>0; i--) {
		    	
		    	for(int j=4; j>=i; j--) {
		    		System.out.print(" ");
		    	}
		    	
		    	for(int j =1; j<=i*2-1; j++) {
		    		System.out.print("*");
		    	}
		    	
		    	System.out.println(" ");
		    }
			
		}
	
	    
	    

}



