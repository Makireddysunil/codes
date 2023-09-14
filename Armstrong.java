package Inheritance;
import java.util.Scanner;

public class Armstrong {

	private static int originalNumber;

	public static void main(String[] args) {
		int  originalNumber,number, result=0,digit=0, remainder = 0;
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the number:");
				number=sc.nextInt();
				originalNumber=number;
				while(originalNumber!=0) {
					originalNumber/=10;
					digit++;
				}
				originalNumber=number;
				while(originalNumber!=0)
				{
					remainder=originalNumber%10;
							
					result+=Math.pow(remainder,digit);
					originalNumber/=10;
				}
				if(result==number)
					System.out.println(number+"is an Armstrong number.");
				else
					System.out.println(number+"is not an Armstring number.");
	}
				

	}






