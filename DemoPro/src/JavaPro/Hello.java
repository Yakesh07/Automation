package JavaPro;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {

		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		
		switch (num) {
		case 10:
			System.out.println("Number 10 is available");
			break;
			
		case 20:
			System.out.println("Number 20 is available");
			break;
			
		case 30:
			System.out.println("Number 30 is available");
			break;

		default:
			System.out.println("Invalid");
			break;
		}

	}
}
