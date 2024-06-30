package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {
		//TC  --BIG O --> It is represented by CAPITAL Letter O
		
		int i = 10;
		//O(1) -- Constant time
		System.out.println(i); //O(1)
		
		for(int k=1; k<=10; k++)
		{
			System.out.println(k);
		}
		
		//1+n+n+n ==>3n+1 -- linear equation
		//3n+1 ==>3n ==> n ==> O(n)
		
	}

}
