package com.prac;

public class Armstrong_Number {
	// a cube of its number is called Armstrong number 153
	
		public static void main(String[] args) {
			int a = 370; // 3*3*3 + 7*7*7 + 0*0*0 = 370
			int b = a;
			int c, sum = 0;
			while(a>0) {
				c = a%10;//3
				a = a/10;//15
				sum = sum + c*c*c;
			}
			if(sum==b) {
				System.out.println("Its a ArmStrong Number "+ sum);
			}
			else {
				System.out.println("Its not a ArmStrong Number");
			}
		}
}
