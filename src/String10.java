import java.util.Scanner;

/**
 * 
 * 1. p = 1000
 * 2. �������κ���: ���ڿ��� �� ���ĺ��� target�� ������ 0, �ٸ��� answer�� p++ �� ����
 * 3. ���������κ���: ���ڿ��� �� ���ĺ��� target�� ������ 0, �ٸ��� answer ������ ������ p++ ������ ��ü
 * 
 */ 
 
public class String10 {
	public int[] solution(String str, char t){
		int[] answer = new int[str.length()];
		int p = 1000;
		
		for (int i=0; i<str.length(); i++) {
			if(str.charAt(i) == t) {		
				p = 0;
				answer[i] = p;
			}
			else {
				p++;
				answer[i] = p;
			}
		}
		
		p = 1000;
		for (int i=str.length()-1; i>=0; i--) {
			if (str.charAt(i) == t) 	p = 0;
			else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}	
		}
		
		return answer;
    }

    public static void main(String[] args){
    	String10 T = new String10();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);
        
        for (int x:T.solution(str, c)) {
            System.out.print(x + " ");
        }
        
    }
}
