package Test_1;

import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        double check = in.nextDouble();
        in.close();
        
        if(Math.floor(check) != check) 
        	System.out.print("You entered not an integer");
        else {
        	int num = (int) check;
        	System.out.println("Your number is:");
        	if(num%2==0)
        		System.out.println("even");
        	else
        		System.out.println("odd");
        	if(IsPrime(num))
        		System.out.println("prime");
        	else
        		System.out.println("composite");
        }
	}
	
	static boolean IsPrime(int num)
    {
		for(int i = 2; i<num; i++)
			if(num%i==0)
				return false;
		for(int i = -2; i>num;i--)
			if(num%i==0) 
				return false;
    	return true;
    }

}
