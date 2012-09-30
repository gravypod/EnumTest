package com.gravypod.EnumTest;

public class EnumTest {
	
	enum pc {
		Hello, hello, asdf, allyourbase, nope, ls, ps, thwsgawekjhrojhgpajkf, everything_you_know_is_wrong, Melbourne, Vienna, Vancouver, Toronto, Calgary, Adelaide, Sydney, Helsinki, Perth, Auckland, Zurich, Munich, Düsseldorf, Frankfurt
	}
	
	public static String[] possible_commands = { "Hello", "hello", "asdf", "allyourbase", "nope", "ls", "ps", "thwsgawekjhrojhgpajkf", "everything_you_know_is_wrong", "Melbourne", "Vienna", "Vancouver", "Toronto", "Calgary", "Adelaide", "Sydney", "Helsinki", "Perth", "Auckland", "Zurich", "Munich", "Düsseldorf", "Frankfurt" };
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int how_many = 10000000;
		
		System.out.println(String.format("I have %d items to search through", pc.values().length));
		
		long running_time = 0;
		
		for (int i = 0; i < how_many; i++) {
			
			long start = System.currentTimeMillis();
			
			for (String s : possible_commands) {
				
				switch(pc.valueOf(s)) {
					case Hello:
						break;
					case hello:
						break;
					case asdf:
						break;
					case allyourbase:
						break;
					case nope:
						break;
					case ls:
						break;
					case ps:
						break;
					case thwsgawekjhrojhgpajkf:
						break;
					case everything_you_know_is_wrong:
						break;
					case Melbourne:
						break;
					case Vienna:
						break;
					case Vancouver:
						break;
					case Toronto:
						break;
					case Calgary:
						break;
					case Adelaide:
						break;
					case Sydney:
						break;
					case Helsinki:
						break;
					case Perth:
						break;
					case Auckland:
						break;
					case Zurich:
						break;
					case Munich:
						break;
					case Düsseldorf:
						break;
					case Frankfurt:
						break;
					default:
						break;
				}
				
			}
			
			long end = System.currentTimeMillis();
			long len = end - start;
			running_time += len;
			
			if (i % 100000 == 0) {
				
				float round_avg = ((float) running_time) / ((float) i + 1);
				System.out.println(String.format("Running average: %f ms", round_avg));
				
			}
			
		}
		
		float full_avg = ((float) running_time) / (float) (how_many * possible_commands.length);
		System.out.println(String.format("It took on average %f ms to search through %d items %d times", full_avg, possible_commands.length, how_many));
		System.out.println(String.format("I searched %d times", how_many * possible_commands.length));
		System.out.println(String.format("I took %d ms to do this", running_time));
		
	}
	
}
