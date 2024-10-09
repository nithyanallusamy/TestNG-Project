package testngexamples;

import org.testng.annotations.Test;

public class Exdependency {
	@Test
	public void highschool() {
		System.out.println("High School");
	}
	@Test(dependsOnMethods = "highschool")
	public void highersecondary() {
		System.out.println("Higher Secondary");
	}
	@Test(dependsOnMethods = "highersecondary")
	public void Engineering() {
		System.out.println("Engineerig");
	}
}
