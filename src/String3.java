import java.util.Scanner;

/**
 * @author YJ
 *
 * 1. �Է¹��� ���ڿ��� �ܾ�� ������ �迭�� �ֱ�
 * 2. for���� ����� ó������ ���� �ܾ��� ���̿� ���ϱ� 
 * 		(1) split()
 * 		(2) indexOf() + substring()
 *
 */

public class String3 {
	public String solution(String str){
		String answer = "";
		// (1)
//		int m = -1;
//		String[] arr = str.split(" ");
//		
//		for (String s:arr) {
//			int len = s.length();
//			
//			if(len > m) {
//				m = len;
//				answer = s;
//			}
//		}
		
		// (2)
		int m = Integer.MIN_VALUE, pos;
		while ((pos = str.indexOf(' ')) != -1) {
			String tmp = str.substring(0,pos);
			int len = tmp.length();
			
			if (len >= m) {
				m = len;
				answer = tmp;
			}
			
			str = str.substring(pos + 1);
		}
		
		if (str.length() > m) 	answer = str;
		
        return answer;
    }

    public static void main(String[] args){
    	String3 T = new String3();
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();			// ����!!! ���� ġ�� �� ���� ��ü�� �޾ƾ� �ϴϱ�!

        System.out.print(T.solution(str));
    }
}
