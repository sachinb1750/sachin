package suiteBase;

import org.testng.annotations.BeforeTest;

public class RESTAPI {
	@BeforeTest(groups="postJira")
	public void postJira() {
		System.out.println("postJira");
	}
	@BeforeTest(groups="deleteTwitter")
	public void deleteTwitter() {
		System.out.println("deleteTwitter");
	}
}
