import java.util.*;
public class question_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int num = n;
		int sum = 0;
		int count=0;
		//Average of random numbers between 1 to n
		do {
			int random = (int)(Math.random()*n+1);
			System.out.println(random+" ");
			sum = sum+random;
			count++;
		}while(count<=n);
		int average = sum/n;
		System.out.println("The average of "+ num + "random numbers are "+ average );
		
	}

}
