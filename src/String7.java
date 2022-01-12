import java.util.Scanner;

/**
 * [1]
 * 1. ���ڿ� �빮�� Ȥ�� �ҹ��ڷ� �����ϱ�
 * 2. lt�� ���ڿ� rt�� ���ڰ� ������ ���ϱ�
 * 3. ���ٸ� yes, �ƴϸ� for�� �������ͼ� no ����ϱ�
 *
 * [2]
 * 1. ���ڿ� stringbuilder�� ������
 * 2. ���ڿ��� ������ ���ڿ� ��: equalsIgnoreCase() ���
 * 
 */

public class String7 {
	public String solution(String str){
		
		// [1]
//		String answer = "YES";
//		int len = str.length();
//		str = str.toUpperCase();
//		
//		for (int i=0; i<len/2; i++) {
//			if(str.charAt(i) != str.charAt(len-1-i)) {
//				return "NO";
//			}
//		}
		
		// [2]
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp))
			answer = "YES";
		
        return answer;
    }

    public static void main(String[] args){
    	String7 T = new String7();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        System.out.println(T.solution(str));
    }
}
