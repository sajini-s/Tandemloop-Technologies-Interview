import java .util.*;
public class program2 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt();
		for(int i=0;i<n*2;i++) {
			if(i%2!=0) {
				System.out.print(" "+ i+ " ");
			}
		}

	}

}
