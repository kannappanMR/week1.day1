package week1.day1.assignments;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
int count = 1;
for (int i = 0; i < arr.length-1; i++) {
	for (int j = i+1; j < arr.length-1; j++) {
	if(arr[i] != i+count) {
		System.out.println(i+count);
	}
	}
	
}

	}

}
