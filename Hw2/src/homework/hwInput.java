package homework;

import java.util.Scanner;


public class hwInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num from 1-20!");
		int num = scan.nextInt();
		fibonacci(num);
		System.out.println(); 
		System.out.println("Input a Number!");
		armstrongNum();
		System.out.println(); 
		System.out.println("Enter your String here!");
		palindromeCheck(); 
		scan.close();
	}
	public static void fibonacci(int n) {
//		first two numbers are give of the sequence.
		int num1 = 0, num2 = 1; 
//		for loop setup to iterate 
		for(int i=0; i<n; i++) {
			
			System.out.print(num1 + ", ");
			
			int num3 = num1 + num2;
			num1 = num2; 
			num2 = num3;
					
		}
		
	}
	public static void armstrongNum () {
/*	How to breakdown an Armstrong number. What is Armstrong number?
Armstrong number is determined when the cube of those digits to the number given
equal up to the original number. 

371
Modules is used to separate the last integer from the original number it is the Remainder
371%10=1
Take that integer and cube it to get the sum
sum = sum +(1*1*1)=1
Must then divide the original number by 10 to break it down to the next power
371/10=37
Repeat process above.  

37%10=7
sum=sum+(7*7*7)=1+343=344(new value of sum)
37/10=3

3%10=3
sum= sum+(3*3*3)=344(value of sum)+27(value of 3 cubed)=371
3/10=0 */
Scanner input = new Scanner(System.in);
int number = input.nextInt();//original num
int tmp = number; 
int r=0; //remainder
int sum=0;//starting sum
while(number>0) {
	r=number%10;
	sum=sum+(r*r*r);
	number=number/10;
}
if(tmp ==sum) {
	System.out.println("This is an Armstrong number!");
}
else {
	System.out.println("This is definitely not an Armstrong number!");
}
input.close(); 

////		System.out.println();
////		System.out.println("inside Armstrong!");

}
	
public static String palindromeCheck() {
	Scanner sc = new Scanner(System.in);
	
	
	String str = sc.next(); //this is user input
	String origStr=str;  // taking the str and setting it equal to original
	
	String reverse = "";
	
	
	int length = str.length(); //checking the length of the string (char)
	
	//for loop decrementing through the string provided 
	for(int i = length-1; i>=0; i--) 
	{
		reverse=reverse+str.charAt(i);//this will check each character input to verify Palinedrome
		
	}
	if(origStr.equals(reverse)) {
		System.out.println(origStr + " is definitely a Palindrome!");
	}
	else {
		System.out.println(origStr + " no way this is a Palindrome!");
		
		}
	sc.close();
	return reverse;	
	
}
}
	
	
	
	
	


