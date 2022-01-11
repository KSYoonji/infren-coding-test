import java.util.*;


/**
 * @author YJ
 *
 * 1. �Է¹��� ���ڿ��� ���ڸ� �빮�� Ȥ�� �ҹ��ڷ� ��ȯ
 * 2. for���� ���� ���ڿ��� ���ڸ� ���Ͽ� ���� ����
 *
 */

class String1{
    public int solution(String str, char t){
        int answer=0;

        // 1.
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        // 2.
//        for (int i=0; i<str.length(); i++) {
//            if(str.charAt(i) == t)	answer++;
//        }
        for (char x : str.toCharArray()) {
        	if(x == t)	answer++;
        }

        //System.out.println(answer);
        return answer;
    }

    public static void main(String[] args){
    	String1 T = new String1();
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        char ch = scan.next().charAt(0);

        System.out.print(T.solution(str, ch));
    }
}