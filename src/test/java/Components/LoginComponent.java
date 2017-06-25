package Components;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Pages.MethodFactory;



public class LoginComponent extends MethodFactory {

	String url = "https://www.qantasassure.com/";

	public void accessURL() {

		{
			accessBaseURL(url);
			waitFor(5);

		}

	}
}
