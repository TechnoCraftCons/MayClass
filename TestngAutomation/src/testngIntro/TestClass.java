package testngIntro;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass {
	@Parameters({"url"})
	@Test
	public void TestMethod(String MyUrl) {
		System.out.println(MyUrl);
	}

}
