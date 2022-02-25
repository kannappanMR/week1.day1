package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
int input  = 13;
boolean flag = true;
for(int i = 2; i<13; i++) {
	if(input % i == 0) {
		flag = false;
		break;	
	}
}
if(flag == true)
	System.out.println(input + " is a prime number");
else
	System.out.println(input + " is not a prime number");

	}

}
