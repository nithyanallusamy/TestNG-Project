package testngexamples;

import org.testng.annotations.Test;

public class Exgroups {
	@Test(groups={"apple1"})
	public void apple1() {
		System.out.println("Apple Testig");
	}
	@Test(groups={"apple1"})
	public void apple2() {
		System.out.println("Apple Testig");
	}
	@Test(groups={"moto1"})
	public void moto1() {
		System.out.println("Moto Testig");
	}
	@Test(groups={"moto2"})
	public void moto2() {
		System.out.println("Moto Testig");
	}
	@Test(groups={"samsung1"})
	public void samsung1() {
		System.out.println("samsung Testig");
	}
	@Test(groups={"samsung2"})
	public void samsung2() {
		System.out.println("samsung Testig");
	}
	@Test(groups={"lenevo1"})
	public void lenevo1() {
		System.out.println("lenevo Testig");
	}
	@Test(groups={"lenevo2"})
	public void lenevo2() {
		System.out.println("lenevo Testig");
	}
}


