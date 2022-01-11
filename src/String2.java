import java.util.Scanner;


/**
 * @author YJ
 *
 * 1. �Է¹��� ���ڿ� �迭�� �ٲٱ�
 * 2. �ҹ����̸� �빮�ڷ�, �빮���̸� �ҹ��ڷ� ��ȯ
 * 		(1) Character.toUpperCase(), Character.toLowerCase()
 * 		(2) �ƽ�Ű �ڵ�
 *
 */

class String2{
    public String solution (String str){
        String answer="";
        
        // 1.
        for (char x : str.toCharArray()) {
        	
        	// 2.
        	if(Character.isLowerCase(x)) 	answer += Character.toUpperCase(x);
        	else  	answer += Character.toLowerCase(x);
        }

		return answer;
    }

    public static void main(String[] args){
    	String2 T = new String2();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        System.out.print(T.solution(str));
    }
}