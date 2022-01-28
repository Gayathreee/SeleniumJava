package weeek1.day2;

public class PrintNumbers {

	int sumOfRange = 0;

	public static void main(String[] args) {


		//1. To print numbers from 1-100

		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}

		//2. print odd number from 1-100

		System.out.println("The following are the odd numbers between 1-100");
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {				
				System.out.println(i);
			}
		}
		//3. To print squares of the even numbers from 38 - 59

		System.out.println("The following are the square of even numbers between 38 - 59");
		for(int j = 59;j>=38;j--) {
			if(j%2==0) {
				System.out.println(j*j);
			}
		}

		//4. Add two numbers

		PrintNumbers obj = new PrintNumbers();
		System.out.println(obj.addTwoNumbers(100, 1));

		//5. Sum of a range
		System.out.println(obj.sumOfRange(100));
	}

	public int addTwoNumbers(int a,int b) {
		return a+b;
	}


	public int sumOfRange(int range) {
		for(int k=1;k<=range;k++) {
			sumOfRange = sumOfRange+k;

		}
		return sumOfRange;
	}
}
