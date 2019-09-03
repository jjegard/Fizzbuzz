/**
 * 
 * @author John Jegard
 *
 *The goal of Fizzbuzz is to count numbers but replace every number divisible by
 *3 to fizz, every number divisible by 5 to buzz, and every number divisible by
 *3 and 5 to fizzbuzz
 */
public class FizzBuzz
{
	public static void main(String[] args)
	{
		//create a loop to count from 1 to 100
		for(int i = 1; i < 101; i++)
		{
			//create an empty string which can be concatenated on to
			String word = "";
			
			//if current number is divisible by 3, concatenate "fizz" to word
			if(i%3 == 0)
			{
				word += "fizz";
			}
			//if current number is divisible by 5, concatenate "buzz" to word
			if(i%5 == 0)
			{
				word += "buzz";
			}
			
			//if word is empty string, print the current number, else print the word
			if(word.equals(""))
			{
				System.out.println(i);
			}
			else
			{
				System.out.println(word);
			}
		}
	}
}
