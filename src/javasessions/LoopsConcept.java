package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
//1. while loop
//1 to 10
		int i=1;
		while(i<=10) {
			System.out.println(i);
			if (i==5) {
				System.out.println("bye");
				break;
			}
			
			i++;
		}
		
		
		System.out.println("-------------");
		//10 to 1;
		int t=10;
		
		while(t<=1) {
			System.out.println(t);
			t--;
		}
		
		System.out.println("for loop-------------");
		for(int k=1; k<=10; k++) {
			System.out.println(k);
		}

		//a=97
		//b=98
		
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch +"="+ (int)ch);
		}
		
		//blank for loop is always true and it goes into infinite loop
		//
		for(;;) {
			System.out.println("hello-----");
			break;
		}
		
		System.out.println(10>5);
		System.out.println(10!=5);
		
		//while loop use cases: when number of iterations/cycles are not fixed
		//1. wait for element on the page: 10 seconds; 5 seconds; 3 seconds; 15 seconds
		//2. Wait for page loading scenarios
		//3. web table pagination
		//4. calendar handling
		//5. Carousel handling
		//6. Page scrolling: linkedin, facebook
		
		//for loop use cases: when number of iterations/cycles are fixed
		//1. month drop down: 1 to 12
		//2. array, arrayslist for loop
		//3. menu, sub menus
		//4. Footer of the page
		
		
		//do-while loop
		//print 1 to 10 numbers
		
		System.out.println("Do while loop concept");	
		
		int p=1;
		do {
			System.out.println("Do while loop1 "+p);
			p++;
		}while(p<=10);
		
		//use case for do while loop is 
		//if element is already present on the page, check it and click on it and exit the loop
		
		//for-each loop
		//streams with lambda
		
		
		
		
	}

}
