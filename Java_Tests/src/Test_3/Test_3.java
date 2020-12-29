package Test_3;

import java.util.Scanner;

public class Test_3 {

	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String s = in.nextLine();
        in.close();*/
		String s = "va av 1 vb";
        String [] split = s.split(" ");
        System.out.println("Number of words = " + split.length);
        String [] out = UppercaseFirstSymbol(split);
        out = Sort(out);
        for(int i = 0; i < split.length;i++)
        {
        	System.out.println(out[i]);
        }
	}
	static String[] UppercaseFirstSymbol(String[] strArr)
	{
		for(int i = 0; i< strArr.length;i++)
		{
			strArr[i] = strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1);
		}
		return strArr;
	}
	static String [] Sort (String[] strArr)
	{
		int size = strArr.length;  
		for(int i = 0; i<size-1; i++)   
		{  
			for (int j = i+1; j<strArr.length; j++)   
			{  
				if(strArr[i].compareTo(strArr[j])>0)   
				{
					strArr = SwapWords(i,j,strArr); 
				}
			}  
		}  
		return strArr;
	}
	static String[] SwapWords (int a, int b, String[] strArr)
	{
		String temp = strArr[a];
		strArr[a] = strArr[b];
		strArr[b] = temp;
		return strArr;
	}
}
