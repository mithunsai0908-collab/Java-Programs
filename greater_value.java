package uniflow;
import java.util.Scanner;

public class greater value {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if (a>b&&b>c){
		System.out.println("a is big");
	}
	else if (b>c){
		System.out.println("b is big");
	}
	else System.out.println("c is big");
	}

}
