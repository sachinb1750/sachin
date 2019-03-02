package moduleRESTAPI;

import org.testng.annotations.Test;

import suiteBase.RESTAPI;

public class ModuleRESTAPIFirstTest extends RESTAPI{
	@Test
	public void RESTAPIpostJira() {
		System.out.println("ModuleRESTAPIFirstTest");
		postJira();
	}
	@Test
	public void RESTAPIdeleteTwitter() {
		System.out.println("ModuleRESTAPIFirstTest");
		deleteTwitter();
	}
}
