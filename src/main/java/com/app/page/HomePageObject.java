package com.app.page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage
{
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
   private WebElement Women;	

public HomePageObject()
{
	PageFactory.initElements(driver,this);
}

public WebElement WomenTab()

{
	return Women;
}

}
