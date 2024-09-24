package org.launchcode;

import java.util.ArrayList;

public class ArrayListPractice {
	public static void main(String[] args){
		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		integers.add(5);
		integers.add(6);
		integers.add(7);
		integers.add(8);
		integers.add(9);
		integers.add(10);

		System.out.println(evenSum(integers));
	}
	public static int evenSum(ArrayList<Integer> integersArray){
		int sum = 0;
		for (int integers : integersArray){
			if(integers % 2 == 0){
				sum += integers;
			}
		}
		return sum;
	}
//	public static char wordByLength(String[] ){
//
//	}
}
