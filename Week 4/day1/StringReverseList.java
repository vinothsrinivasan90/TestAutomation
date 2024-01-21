package week4.day1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringReverseList {

	public static void main(String[] args) {
	
		String[] name = {"HCL", "Wipro", "Aspire Systems","CTS"};
		List <String> names = new ArrayList<>();
		Collections.addAll(names, name);
		
		Collections.sort(names);
		
		System.out.println("Before sorting" +names);
		
		for (int i = names.size()-1;i>=0;i--) {
			System.out.println(names.get(i));
		}
			
		}
	}


