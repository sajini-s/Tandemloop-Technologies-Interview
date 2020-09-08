import java.util.*;
public class program4 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
    int a[]= {1,2,8,9,12,46,76,82,15,20,30};
		int count;
		for(int i=1;i<=9;i++) {
			count =0;
			for(int j=0;j<a.length;j++) {
				if(a[j]%i==0) {
					count++;
				}
			}
			System.out.println(i + ":" +count);
			
		}
		
	}

}
