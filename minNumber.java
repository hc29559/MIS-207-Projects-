package assignment1;
import java.util.Scanner;
public class minNumber {
	public static void main(String[] args) {
		System.out.println("Enter three whole numbers: ");
		int num1;
		int num2;
		int num3;
		Scanner stin= new Scanner(System.in);
		num1= stin.nextInt();
		num2= stin.nextInt();
		num3= stin.nextInt();
		if ((num1<=num2) && (num1<=num3)) {System.out.println(num1 + " is the minimum number.");}
		else if ((num2<=num1) && (num2<=num3)) {System.out.println(num2 + " is the minimum number.");}
		else {System.out.println(num3 + " is the minimum number");}//end if else
	}
}
