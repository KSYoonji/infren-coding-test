import java.util.*;

/**
 * 
 *
 * 1. �Է¹��� ���ڿ� �迭�� �ֱ�
 * 2. ������
 * 		(1) StrigBuilder�� reverse() �޼ҵ�
 * 		(2) �ڵ�� ���� ������ (���ڿ����� Ư�� ���ڸ� ������ ���� ���)
 *
 */

public class String4 {
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		
		// (1)
//		for (String x:str) {
//			String tmp = new StringBuilder(x).reverse().toString();		//String�� ���� ���ο� ��ü�� ������ �޸� ���� �߻�
//			answer.add(tmp);
//		}
		
		// (2)
		for(String x:str) {
			char[] s = x.toCharArray();
			int lt = 0;			int rt = x.length()-1;
			
			while(lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++; rt--;
			}
			
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		
		
        return answer;
    }

    public static void main(String[] args){
    	String4 T = new String4();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] str=new String[n];
        for(int i =0; i<n; i++) {
        	str[i] = scan.nextLine();
        }
        
        for (String x: T.solution(n, str) ) {
        	System.out.println(x);
        }

    }
}
