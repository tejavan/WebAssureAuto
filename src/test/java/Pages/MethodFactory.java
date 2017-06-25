package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MethodFactory {

	protected static WebDriver driver;

	public static void accessBaseURL(String url) {
		try {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static void enterText(WebDriver driver, By locator, String sendText) {
		try {
			driver.findElement(locator).sendKeys(sendText);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void newTab(WebDriver driver) {

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");

	}

	public static void readText(WebDriver driver, By locator) {
		WebDriverWait t = new WebDriverWait(driver, 10);
		t.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		String r = driver.findElement(locator).getText();
		// r.replaceAll("\\s", "");
		// String ss = r.replaceAll("-", "");
		// System.out.println(ss.replaceAll("\\s", ""));
		System.out.println(r);

	}

	public static void clickOn(WebDriver driver, By locator) {

		try {
			driver.findElement(locator).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void waitFor(double seconds) {
		try {
			Thread.sleep((long) seconds);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	public static void waitForExpected(By locator) {
		try {
			WebDriverWait waitforAnything = new WebDriverWait(driver, 10);
			waitforAnything.until(ExpectedConditions.presenceOfElementLocated(locator)).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
