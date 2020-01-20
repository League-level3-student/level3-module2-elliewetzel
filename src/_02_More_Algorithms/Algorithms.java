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

	public static List<Double> sortScores(List<Double> results) {
		int score = 0;
		while(score<results.size()) {
			for(int i = 0; i < results.size()-1; i++) {
				if(results.get(i) > results.get(i+1)) {
				score = 0;
				double switcher = results.get(i+1);
				results.set(i+1,  results.get(i));
				results.set(i, switcher);			
				}
				else {
					score+=1;
				}
			}
		}
		return results;
	}
	public static Object sortDNA(List<String> unsortedSequences) {
		int length = 0;
		while (length < unsortedSequences.size()) {
			for(int i = 0; i < unsortedSequences.size()-1; i++) {
				if(unsortedSequences.get(i).length() > unsortedSequences.get(i+1).length()) {
			length = 0;
			String r = unsortedSequences.get(i+1);
			unsortedSequences.set(i+1, unsortedSequences.get(i));
			unsortedSequences.set(i, r);
				}
				else {
				length =+1;
				}
			}
		}
		return unsortedSequences;
	}
	public static List<String> sortWords(List<String> words) {
		int letter = 0;
		while(letter < words.size()) {
			for(int i = 0; i < words.size()-1; i++) {
				if(words.get(i).compareTo(words.get(i+1))>= 0){
					letter = 0;
					String switcher = words.get(i);
					words.set(i, words.get(i+1));
					words.set(i+1, switcher);
			}
				else {
					letter+=1;
				}
		}
	}
		return words;
	}
	
	
	
	
}
