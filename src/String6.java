import java.util.Scanner;

/**
 * 
 *
 * 1. ���ڿ� �� ���ĺ��� ��ġ == �� ���ĺ��� ó�� �����ϴ� ��ġ -> �߰�
 * 
 *
 */

public class String6 {
	public String solution(String str){
		String answer = "";
		
		for (int i=0; i<str.length(); i++) {
			//System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
			if(str.indexOf(str.charAt(i)) == i)
				answer += str.charAt(i);
		}
		
        return answer;
    }

    public static void main(String[] args){
    	String6 T = new String6();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        System.out.println(T.solution(str));
        
    }
}
