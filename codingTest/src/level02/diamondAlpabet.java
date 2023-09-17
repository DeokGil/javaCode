package level02;
import java.util.*;

public class diamondAlpabet{
	
		public static void main(String[] args) {
			int startChar = 'a';
			int endChar = 'i';
			
			// 상단 
			for(int i = startChar; i<=endChar; i++) {
				// 앞공백 	
				for(int j = endChar; j>i; j--) {
					System.out.print(" ");
				}
				// 왼쪽 알파벳 
				for(int j = startChar; j<=i; j++) {
					System.out.print((char)j);
				}
				
				// 오른쪽 알파벳
				for(int j=i; j>=startChar; j--) {
					System.out.print((char)j);
				}
				System.out.println();
			}
				
			// 하단
			for(int i =endChar; i>=startChar; i--) {
				
				for(int j =i; j<=endChar; j++) {
					System.out.print(" ");
				}
				
				for(int j = startChar; j<i; j++) {
					System.out.print((char)j);
				}
				//오른쪽 알파벳
	
	            for(int j=i-1; j>=startChar; j--) {
	
	                System.out.print((char)j);
	
	            }
	
	            System.out.println();
				
			}
		
	}
	

}



