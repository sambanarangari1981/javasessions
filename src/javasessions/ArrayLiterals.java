package javasessions;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		
		
		//int array
		//1. using new;
		int i[] = new int[4]; // 0-3
		
		//2. array literals
		
		int p[] = {2,3,17,29,03,27,29,4,6};
		System.out.println(p.length);
		System.out.println("low index" + 0);
		System.out.println(("High index" + (p.length-1)));
		
		for(int e : p) {
			System.out.println(e);
		}
		
		System.out.println(Arrays.toString(p));
		

	}

}
