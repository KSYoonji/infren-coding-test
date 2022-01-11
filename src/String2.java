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
        	
        	// 2-(1)
        	if(Character.isLowerCase(x)) 	answer += Character.toUpperCase(x);
        	else  	answer += Character.toLowerCase(x);
        	
        	//2-(2) �ƽ�Ű �ڵ� 65~90: �빮��, 97~122: �ҹ���
        	if(x>=97 && x<=122) 	answer += (char)(x-32);
        	else  	answer += (char)(x+32);
//        	if(Character.isLowerCase(x)) 	answer += Character.toUpperCase(x);
//        	else  	answer += Character.toLowerCase(x);
        	
        	//2-(2) �ƽ�Ű �ڵ� 65~90: �빮��, 97~122: �ҹ���
        	if(x>=97 && x<=122) 	answer += (char)(x-32);
        	else  	answer += (char)(x+32);
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