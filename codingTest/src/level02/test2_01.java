package level02;
import java.util.*;

public class test2_01{
// 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
// str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
// 예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
	public String solution(String s) {
        String answer = "";
        String str[] = s.split(" ");
        
        int arr[] = new int[str.length];
        
        for(int i =0; i<str.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(arr);
        
        int min = arr[0];
        int max = arr[str.length -1];
            
        answer = min + " " + max;
        return answer;
    }
}


