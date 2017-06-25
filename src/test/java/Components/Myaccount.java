package Components;

import org.openqa.selenium.By;

import Pages.MethodFactory;

public class Myaccount extends MethodFactory {
	
	public void verifyMyAccount()
	{
		
		By myAccount = By.cssSelector("a._2aWH34._2By3bc._1kQyyg");
		By Health = By.xpath("html/body//div//li[1]//a[@class='_2aWH34 _2By3bc _6g8l1l']");
		By myAccountpopUp = By.cssSelector("h1._3ZxsIl");
		By myAccountClose = By.cssSelector("button.axGlUo._11vaan._3JzMs0._1052Ny[type='button']");

		if (driver.findElement(myAccount).isDisplayed()) {
			System.out.println("Assure page opened successfully");
			clickOn(driver, myAccount);
			if(driver.findElement(myAccountpopUp).isDisplayed());
			{
			clickOn(driver, myAccountClose);
			}
	}
	}
}
