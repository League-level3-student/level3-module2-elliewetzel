package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).contentEquals("cracked")) {
				return i;
			}
		}
		return 0;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int h = 0;
		for(int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i).equals(true)) {
				h+=1;
			}
		}
		return h;
	}

	public static double findTallest(List<Double> peeps) {
		double h = Integer.MIN_VALUE;
		for(int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i) > h) {
				h = peeps.get(i);
			}
		}
		return h;
	}

	public static Object findLongestWord(List<String> words) {
		int length = 0;
		String longestWord = "";
		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).length() > length) {
				length = words.get(i).length();
				longestWord = words.get(i);
			}
		}
		return longestWord;
	}
	
	public static Object containsSOS1(List<String> message1) {
		boolean sos = false;
		for(int i = 0; i < message1.size(); i++) {
			if(message1.get(i).contains("... --- ...")) {
				sos = true;
			}
		}
		return sos;
	}
	
	public static Object containsSOS(List<String> message2) {
		boolean sos = false;
		for(int i = 0; i < message2.size(); i++) {
			if(message2.get(i).contains("... --- ...")) {
				sos = true;
			}
		}
		return sos;
	}

	public static List<String> sortScores(List<Double> results) {
		int score = 0;
		if(score < results.get(i)) {
			
		}
		
		
		
		double j = Integer.MIN_VALUE;
		for(int i = 0; i < results.size(); i++) {
			if(results.get(i) > j) {
				j = results.get(i);
			}
		}
		return j;
	}
	
	
}
