import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in); 
		System.out.print("Input an integer: ");
		String str = in.nextLine();
		str = "5" + str;
		int num = Integer.parseInt(str);
		System.out.println(num + 5);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in); 
		System.out.print("Input a number: ");
		String str = in.nextLine();
		str = "4" + str + "3";
		double doub1 = Double.parseDouble(str);
		System.out.println(doub1+3.4);
		
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in); 
		System.out.print("Input a boolean: ");
		String bool1 = in.nextLine();
		System.out.println(!Boolean.parseBoolean(bool1)); 
		
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in); 
		System.out.print("Input an integer: ");
		String str = in.nextLine();
		String num = str + "3";
		int num2 = Integer.parseInt(num);
		num2 = num2 + 2;
		System.out.println((char)num2);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in); 
		System.out.print("Input an integer: ");
		String str = in.nextLine();
		str = str + "1";
		int num = Integer.parseInt(str);
		num = num/2;
		System.out.println((double)num);
		
	}

	public static void q6() {
		//Write question 6 code here
		Scanner in = new Scanner(System.in); 
		System.out.print("Input a number: ");
		String str = in.nextLine();
		String num = "1" + str;
		double num2 = Double.parseDouble(num);
		System.out.println((int)num2);
	}
}
