package Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import Pages.MethodFactory;


public class Health extends MethodFactory {
	
	
	Logger log = Logger.getLogger(getClass());

	By health = By.cssSelector("a._2aWH34._2By3bc._2a9xun[href=\"/health-insurance\"]");
	By singles = By.cssSelector("a._2aWH34._2By3bc._3p1IK6[href=\"/health-insurance/products/singles\"]");
	By singleTextVerification = By.xpath("//h2[normalize-space(text())='Qantas Assure Singles Cover']");
	By GetQuote = By.cssSelector("button.axGlUo._3CJ-Lc.KLSsCC.qlUEkv");
	By GetQuoteConfirmPage = By.xpath("//span[normalize-space(text()) = 'Your Details']");
	//By coverBasic = By.xpath("//h2[@class = '_1FGVhA _5xMp_B'][normalize-space(text())='Basic']");
	By coverBasic = By.cssSelector("css=h2._3g3v1r.yDOw4N");
	By viewFactsheet = By.cssSelector(
			"a[class='_2aWH34 _2By3bc _1w6EsJ _1p5x62 _1X6OjG _2By3bc _1IgOn9'][href = 'https://www.qantasassure.com/files/factsheets/QAssure_Factsheet_Basic Hospital.pdf']");

	public void verifyHeaderlinks() {
		
		log.info("Verify if health page is displayed");
		WebDriverWait waitforlink = new WebDriverWait(driver, 5);
		waitforlink.until(ExpectedConditions.presenceOfElementLocated(health));
		if (driver.findElement(health).isDisplayed())
			;
		{
			clickOn(driver, health);
		}
		log.info("Verify if singles page is displayed");
		if (driver.findElement(singles).isDisplayed())
			;
		{
			clickOn(driver, singles);
			waitForExpected(singleTextVerification);
			MethodFactory.waitForExpected(GetQuote);
			log.info("Verify if GetQuote button is functional");
			clickOn(driver, GetQuote);
			if (driver.findElement(GetQuoteConfirmPage).isDisplayed());
			{
				driver.navigate().back();

			}
			String Basic = driver.findElement(coverBasic).getText();
			System.out.println(Basic);
			if (Basic == "Basic") {
				clickOn(driver, viewFactsheet);

			}
		}
		

	}

}

