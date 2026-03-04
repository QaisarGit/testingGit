package PROJECTS;

import org.testng.annotations.Test;

public class ReverseStringNumbers {

	@Test(description="using string builder")
	public void reversedSTRING() {
		System.out.println("reversed word ");
		String str= "I write a program that match the requirements";
		StringBuilder sb= new StringBuilder(str);
		sb.reverse();
		System.out.println("reversed str is ==\n"+sb);
		
	}
	@Test(description="using for loop")
	public void reversedStringLoop() {
		System.out.println("using  for loop ");
	}

}
