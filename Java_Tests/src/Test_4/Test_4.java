package Test_4;

import java.util.Scanner;

public class Test_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Input a text: ");
        String text = in.nextLine();
        System.out.print("Input a word: ");
        String word = in.nextLine();
        in.close();
		System.out.println(SearchWord(text,word));
	}
	static int SearchWord (String text, String word)
	{
		int count = 0;
		text.toLowerCase();
		word.toLowerCase();
		String[] split = text.split("[\\s,.?!:;+-=*/@#%^&(){}'']+");
		for(int i = 0; i < split.length; i++)
		{
			if(split[i].contentEquals(word))
			{
				count++;
			}
		}
		return count;
	}
}
