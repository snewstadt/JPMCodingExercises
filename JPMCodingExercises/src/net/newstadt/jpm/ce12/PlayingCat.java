package net.newstadt.jpm.ce12;

public class PlayingCat {

	public static void main(String[] args) {
			System.out.println(isCatPlaying(true, 10)); 	// should return false since temperature is not in range 25 - 45 

			System.out.println(isCatPlaying(false, 36)); 	//should return false since temperature is not in range 25 - 35 (summer parameter is false)

			System.out.println(isCatPlaying(false, 35)); 	//should return true since temperature is in range 25 - 35 

	}
	
	public static boolean isCatPlaying(boolean summer, int temperature) {
//		if (summer) {
//			return (temperature >= 25) && (temperature <= 45); 
//		} else {
//			return (temperature >= 25) && (temperature <= 35); 
//		}
	
	// or more consice (fewer lines of code) but a bit less readable, this also works:
	// return (summer) ? ((temperature >= 25) && (temperature <= 45)) : ((temperature >= 25) && (temperature <= 35)); 
		
		// or even better - suggestion from Q&A discussion
		
		int maxTemp = summer ? 45 : 35;
		return temperature >= 25 && temperature <= maxTemp;
	}

}
