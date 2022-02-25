package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 8;
		int f = 0;
		int s = 1;
		System.out.println(f);
		System.out.println(s);
	
		for(int i=1 ; i<=n-2; i++) {
			int t = f+s;
			f = s;
			s = t;
			System.out.println(t);
		}
						
	}

}
