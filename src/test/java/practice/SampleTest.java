package practice;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SampleTest {
	@Test(priority = 1, testName = "To verify the test name", description = "This description")
	public void c() {
		System.out.println("Print c");
		// Reporter.log("Print c", true);

		// throw new NullPointerException("Null pointer expecton");
	}

	@Test(priority = 2, dependsOnMethods = { "c" }, alwaysRun = true)
	public void b() {
		System.out.println("Print B");

		// Reporter.log("Print B", true);
	}

	@Test(priority = 3)
	public void a() {
		System.out.println("Print A");

		// Reporter.log("Print A ", true);

	}

	@Test(priority = 4)
	public void d() {
		System.out.println("Print D");

		// Reporter.log("Print D", true);

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Please enter the data first data");
	}
}
