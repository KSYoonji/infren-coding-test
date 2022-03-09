import java.util.*;


public class Dynamic1 {
	static int[] dy;
	
	public int solution(int n) {
		dy[1] = 1;
		dy[2] = 2;
		
		for(int i=3; i<=n; i++) {
			dy[i] = dy[i-2]+dy[i-1];
		}
		
		return dy[n];
	}

	public static void main(String[] args) {
		Dynamic1 T = new Dynamic1();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		dy = new int[n+1];
		System.out.print(T.solution(n));

	}

}
