package com.atmecs.practo.testscripts;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.atmecs.practo.constants.PageActions;
import com.atmecs.practo.helpers.ReadPropertiesFile;
import com.atmecs.practo.testbase.InvokeBrowser;

public class AddToCart extends InvokeBrowser {
	ReadPropertiesFile path = new ReadPropertiesFile();

	@Test(priority = 1)
	public void diagnostics() throws Exception {

		
		Properties locators = new Properties();
		ReadPropertiesFile read = new ReadPropertiesFile();

		String diagnostics = path.readPropertiesFile("loc.btn.diagnostics.xpath");
		PageActions.ClickElement(driver, diagnostics);

		String selectcity = path.readPropertiesFile("loc.field.selectanycityorlocality.xpath");
		PageActions.ClickElement(driver, selectcity);

		String searchtest = path.readPropertiesFile("loc.field.searchfortestsandprofiles.xpath");
		PageActions.ClickElement(driver, searchtest);
		
		WebElement element = driver.findElement(By.xpath(("loc.field.cbctest.xpath")));
		Select drptest = new Select(element);
		drptest.selectByVisibleText("CBC Test");
		PageActions.ClickElement(driver, "loc.field.cbctest.xpath");

		//String cbctest = path.readPropertiesFile("loc.field.searchfortestsandprofiles.xpath");

		// String cbctest = path.readPropertiesFile("loc.field.cbctest.xpath");
		// PageActions.ClickElement(driver, cbctest);
	}

}