package practice;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SampleTest2 {
	@Test(priority = 1, testName = "To verify the test name", description = "This description")
	public void c() {
		System.out.println("Print C");
		// throw new NullPointerException("Null pointer expecton");
	}

	@Test(priority = 2, dependsOnMethods = { "c" }, alwaysRun = true)
	public void b() {
		System.out.println("Print B");
	}

	@Test(priority = 3)
	public void a() {
		System.out.println("Print A");
	}

	@Test(priority = 4)
	public void d() {
		System.out.println("Print D");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Please enter the data");
	}

}
