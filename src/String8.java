import java.util.Scanner;

/**
 * 
 * 1. ���ĺ� �빮�� Ȥ�� �ҹ��ڷ� ���� + ���ĺ� �̿��� Ư�����ڴ� ����
 * 2. ���ĺ� ������
 * 
 */ 
 
public class String8 {
	public String solution(String str){
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");	//���Խ�
		String tmp = new StringBuilder(str).reverse().toString();
		if (str.equals(tmp))
			answer = "YES";
		
        return answer;
    }

    public static void main(String[] args){
    	String8 T = new String8();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        System.out.println(T.solution(str));
    }
}
