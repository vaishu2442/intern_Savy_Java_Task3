package java_task;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("select conversion from below:");
		System.out.println("1.US Doller to Rupees   2.Rupees to Doller 3.Pound to Rupees  4. Rupees to Pound");
		int choice=sc.nextInt();
		System.out.println("enter value");
		float value=sc.nextFloat();
		char r=(char)8377;
		char p=(char)163;
		char d=(char)36;
		switch(choice)
		{
		case 1:double r1 = value * 83.29;
		System.out.println("The value is "+r1+r);
		break;
		case 2 : float r2 = (float) (value / 83.29);
		System.out.println("The value is "+r2+d);
		break;
		case 3 : double r3 = value * 102.03;
		System.out.println("The value is "+r3+r);
		break;
		case 4 : float r4 = (float) (value / 102.03);
		System.out.println("The value is "+r4+p);
		break;
		default :
			System.exit(0);
		}
	}

}
