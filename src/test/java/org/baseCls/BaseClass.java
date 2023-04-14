package org.baseCls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	// driver - METHODS-
	public static WebDriver driver;

	public static WebDriver chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;

	}

	public static void ulrLaunch(String url, int time) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public static void close() {
		driver.close();
	}

	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;

	}

	private void quit() {
		driver.quit();
	}

	// webelement-Methods
	public static void sendkeys(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void click(WebElement e) {
		e.click();
	}

	public static boolean isDisplayed(WebElement e) {

		boolean displayed = e.isDisplayed();
		return displayed;
	}

	public static boolean isEnabled(WebElement e) {
		boolean enabled = e.isEnabled();
		return enabled;

	}

	public static boolean isSelected(WebElement e) {
		boolean selected = e.isSelected();
		return selected;

	}

	public static String getAttribute(WebElement e, String arg) {
		String attribute = e.getAttribute(arg);
		return attribute;
	}

	public static String getTagName(WebElement e) {

		String tagName = e.getTagName();
		return tagName;
		
	}

	
	
}
