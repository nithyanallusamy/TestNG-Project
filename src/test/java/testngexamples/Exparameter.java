package testngexamples;

import java.security.PublicKey;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.github.dockerjava.api.command.PullImageCmd;

public class Exparameter {
	@Test
	@Parameters("name")
public void printname(String name) {

System.out.println("Name is" +name);	
}
	@Test
	@Parameters("name1")
	public void printname1(String name1) {

		System.out.println("Name is" +name1);	
		}
	

}
