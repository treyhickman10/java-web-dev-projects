package org.launchcode;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
		String[] characters = phrase.split("");
//		ArrayList<String> charArrayList = new ArrayList<>(List.of(characters));
		HashMap<String, Integer> charCount = new HashMap<>();
		for (String letter : characters){
			if(!charCount.containsKey(letter)){
				charCount.put(letter, 1);
			}else {f}

//			while(charArrayList.contains(letter)){
//
//				charCounter += 1;
//				charArrayList.remove(letter);
//			}
//			charCount.put(letter, charCounter);

		}
		System.out.println(charCount);

	}
}