package testngexamples;

import static org.testng.Assert.assertFalse;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.testng.annotations.Test;

public class Expriority{
	@Test(priority = 0)
	public void startcar() {
		System.out.println("Start the car");
	}
	@Test(priority = 1)
	public void startfirstgear() {
		System.out.println(" first gear");
	}
	@Test(priority = 3)
	public void stopthecar() {
		System.out.println("Stop the car");
	}
	@Test(priority = 2,enabled = false)
	public void Musicon() {
		System.out.println("Music started");
	}
}
