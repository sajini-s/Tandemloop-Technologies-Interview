import java.util.*;
public class program3 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		if(n%2==0) {
			n=n-1;
		}
		for(int i=0;i<n*2;i++) {
			if(i%2!=0) {
				System.out.println(" "+ i +" ");
			}
		}
	}
	}

