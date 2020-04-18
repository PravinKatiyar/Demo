package lab5.exercise1;
import java.util.Scanner;
public class TrafficLight {
public static void main(String[] args) {
	int f=0;
	while(f==0) {
	System.out.println("1)Red\n2)Yellow\n3)Green");
	System.out.println("0)Abort");
	Scanner scan=new Scanner(System.in);
	int x=scan.nextInt();
	
	switch(x) {
	case 1:
		System.out.println("stop");
		break;
	case 2:
		System.out.println("ready");
		break;
	case 3:
		System.out.println("go");
		break;
	case 0:
		f=1;
		break;
	default:
		System.out.println("Enter the valid option");
	}
	}}
}
