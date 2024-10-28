package io.stage.hudinielevate.cms.tests;

import java.awt.AWTException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.pages.DesignConfigsPage;
import io.stage.hudinielevate.cms.pages.LoginPage;
import io.stage.hudinielevate.cms.pages.PropertiesPage;

public class DesignConfigsTest {

	public BaseClass baseClass;
	public Properties properties;
	public WebDriver driver;
	public LoginPage loginPage;
	public PropertiesPage propertiesPage;
	public DesignConfigsPage designConfigsPage;

	@BeforeMethod
	@Parameters("browserName")
	public void setUp(String browserName) {

		System.out.println("Browser name=" + browserName);

		baseClass = new BaseClass();
		properties = baseClass.initializeProperties();
		driver = baseClass.initializeBrowser(properties);
		System.out.println("Driver=" + driver);
		driver.get(properties.getProperty("appURL"));
		System.out.println("App URL=" + driver.getCurrentUrl());
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));
		System.out.println(properties.getProperty("superadminusername"));
		System.out.println(properties.getProperty("superadminpassword"));
		loginPage = new LoginPage(driver, properties);

	}

	@Test(enabled = false, priority = 1)
	public void verifyCreatePageTest() {
		loginPage.loginAsUser();
		propertiesPage = loginPage.navigateToPropertiesPage();
		designConfigsPage=new DesignConfigsPage(driver);
		designConfigsPage.navigateToDesignConfigPage();
		Boolean isPageCreated = designConfigsPage.createPage();
		Assert.assertTrue(isPageCreated, "Design Config page is not created");
	}

	@Test(enabled = false, priority = 2)
	public void verifyAddComponentsTest() throws AWTException {
		loginPage.loginAsUser();
		propertiesPage = loginPage.navigateToPropertiesPage();
		designConfigsPage=new DesignConfigsPage(driver);
		designConfigsPage.navigateToDesignConfigPage();
		designConfigsPage.addComponentsInAPage();
	}
	@Test(enabled = true, priority = 3)
	public void verifyupdateComponentsTest() throws AWTException {
		loginPage.loginAsUser();
		propertiesPage = loginPage.navigateToPropertiesPage();
		designConfigsPage=new DesignConfigsPage(driver);
		designConfigsPage.navigateToDesignConfigPage();
		designConfigsPage.updateComponentsInAPage();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
