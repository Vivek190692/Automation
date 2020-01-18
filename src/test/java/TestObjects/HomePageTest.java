package TestObjects;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.page.BasePage;
import com.app.page.HomePageObject;

public class HomePageTest {
	
	
	HomePageObject hpo;
	BasePage bp;

	public HomePageTest() {

		hpo = new HomePageObject();
		bp = new BasePage();

	}
	
//	@Test
//	public void verifyWomenTab()
//	{
//		Assert.assertTrue(bp.elementFound(hpo.WomenTab()),"Failed");
//	}
	
	@Test
	public void verifyTest(){
		System.out.println("Hello");
	}

}
