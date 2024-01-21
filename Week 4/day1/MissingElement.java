package week4.day1;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;



public class MissingElement {

	public static void main(String[] args) {
		
		
		List<Integer> numbers = new ArrayList<>();
		Collections.addAll(numbers,1, 2, 3, 4, 10, 6, 8);
		Collections.sort(numbers);
		for (int i = 0; i < numbers.size()-1; i++) {
		if(numbers.get(i)+1 != numbers.get(i+1))
		{
		for(int m=numbers.get(i)+1;m<numbers.get(i+1);m++) {
		System.out.println(m);
				}
			}
		}
			
		}
	}


