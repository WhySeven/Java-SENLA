package Test_5;
import java.util.Scanner;
public class Test_5 {

	public static void main(String[] args) {
		System.out.print("Enter N for sequence [0 - 100]: ");
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();
        if (N >= 0 && N <= 100) 
        {
        	PrintAllPalindromes(N);
        }
        else
        	System.out.println("The number is incorrect, it must not be more than 100 and less than 0");
	}
	
    static void PrintAllPalindromes (int N) {
        System.out.println("All palindromes:");
        int temp = 1;
        for(int i = 0; i <= N; i+=temp)
        {
        	System.out.println(i);
        	if (i == 9)
        		temp = 2;
        	if (i==11)
        		temp = 11;
        }
        
    }

}
