package week1.day1.assignments;

public class MyCalc {

	public static void main(String[] args) {
Calculator obj = new Calculator();
int sum = obj.addNumbers(2,4,6);
System.out.println(sum);
int minus = obj.subNumbers(2,4);
System.out.println(minus);
float multiply = obj.multiplyNumbers(2.34f,4.34f);
System.out.println(multiply);
double divide = obj.divideNumbers(2136.346464,412.567910);
System.out.println(divide);
	}
	
	}

