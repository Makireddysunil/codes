 package DailyAssignment;

public class ReverseNumber {
	public static void main(String[] args) {
		int  num =1234567, rev=0;
		for(;num !=0; num /=10) {
			int digit = num % 10;
			rev =rev * 10 + digit;
		}
				
				
				System.out.println("rev num: "+ rev);
	}
		
				
				
	}


