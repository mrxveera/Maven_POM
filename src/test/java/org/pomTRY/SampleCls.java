package org.pomTRY;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.baseCls.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.pom_findElements.FacebookLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleCls extends BaseClass {
	public static void main(String[] args) {
		WebDriver driver = chromeBrowser();
		ulrLaunch("https://www.facebook.com/", 15);

		// get Current URl
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String currentUrl2 = getCurrentUrl();
		System.out.println(currentUrl2);

		FacebookLoginPage l = new FacebookLoginPage();
		sendkeys(l.getTxtUserName(), "bala");

		sendkeys(l.getTxtPassWord(), "noom");
		click(l.getLoginclk());

		String title = driver.getTitle();
		System.out.println(title);

		System.out.println(driver.getTitle() + "----------");

		// System.out.println(getTagName(user));

		// String attribute = user.getAttribute("value");
		// System.out.println(attribute);
		// System.out.println("======"+getAttribute(user, "inner
		// text")+"-------------");

		// boolean displayed = user.isDisplayed();
		// System.out.println("====="+user.isSelected());
		// boolean displayed2 = isDisplayed("==========="+user);

		// int h=s.getWidth();
		// System.out.println(h+"=======999999");

	}
}
