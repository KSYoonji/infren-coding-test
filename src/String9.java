import java.util.Scanner;

/**
 * 
 * 1. ������ �� ���ĺ��� �迭�� �ֱ�
 * 2. ���ڶ��, �ڿ����� �����
 * 		(1) �ƽ�Ű�ڵ� �̿�
 * 		(2) isDigit Ȱ�� (��, ���߿� parseInt�� ��ȯ �ʿ�)
 * 
 */ 
 
public class String9 {
	public int solution(String str){
		//int answer = 0;
		String answer = "";
		
		for (char x : str.toCharArray()) {
			// (1)
//			if (x>=48 && x<=57)		// ���� �ƽ�Ű �ڵ�: 48 ~ 57
//				answer = answer*10 + (x-48);
			
			// (2) 
			if (Character.isDigit(x)) 
				answer += x;
		}
		
        //return answer;
		return Integer.parseInt(answer);
    }

    public static void main(String[] args){
    	String9 T = new String9();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        System.out.println(T.solution(str));
    }
}
