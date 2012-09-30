package com.gravypod.EnumTest;

/**
 * 
 * @author indrora
 * 
 * This is a simple String Lookup table example.
 * 
 * You could easily use this to generate a lookup table for a switch statement,
 * especially if your table is going to never change.
 * 
 * Works really great if you have a tokenizer on the other end too!
 *
 */
public class bench {

	public static String[] possible_commands = {
		"Hello",
		"hello",
		"asdf",
		"allyourbase",
		"nope",
		"ls",
		"ps",
		"/usr/bin/asdfmovie",
		"everything you know is wrong",
		/* Top 10 livable cities */
		"Melbourne","Vienna","Vancouver","Toronto","Calgary","Adelaide","Sydney","Helsinki", "Perth", "Auckland",
		/* Quality of Living survey. */
		"Zurich", "Munich", "Düsseldorf", "Frankfurt"

	};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int how_many = 10000000;
		
		System.out.println(String.format("I have %d items to search through", possible_commands.length));
		
		long running_time = 0;
		
		for(int i=0; i<how_many; i++)
		{
			long start = System.currentTimeMillis();

			for(String s: possible_commands)
			{
				int index = 0;
			
				index = lookup(s); // yum.
				assert(possible_commands[index].equals(s));
			

			}
			long end = System.currentTimeMillis();
			long len = end - start;
			running_time += len;
			if(i % 100000 == 0)
			{
				float round_avg = ((float)running_time)/((float)i+1);
				System.out.println(String.format("Running average: %f ms", round_avg));
			}
			
		}
		
		float full_avg = ((float) running_time )/ (float)( how_many * possible_commands.length );
		System.out.println(String.format("It took on average %f ms to search through %d items %d times", full_avg, possible_commands.length, how_many));
		System.out.println(String.format("I searched %d times", how_many * possible_commands.length));
		System.out.println(String.format("I took %d ms to do this", running_time));
		
	}
	
	public static int lookup(String value)
	{
		int action = 0;
		for(;action< possible_commands.length;action++)
			if(possible_commands[action].equals(value))
				break;
		return action;
	}

}