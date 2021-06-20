package Questions;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower range: ");
		int low = sc.nextInt();
		System.out.println("Enter the higher range: ");
		int i = 0;
		int high = sc.nextInt();
		sc.close();
		System.out.println("Prime Numbers are: ");
		for(i=low; i <= high; i++) {
			int count = 0;
			for(int n=2; n*n<=i; n++){
				if(i%n==0)
					count++;
			}
			if (count == 0)
				System.out.println(i);
		}
		
		}

}
