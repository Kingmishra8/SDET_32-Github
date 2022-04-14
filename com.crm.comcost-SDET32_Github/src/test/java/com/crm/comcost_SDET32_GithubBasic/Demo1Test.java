package com.crm.comcost_SDET32_GithubBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1Test
{
	@Test
	public void DemeoTest1()
	{
		WebDriver driver=new ChromeDriver();
		String BROWSER= System.getProperty("browser");
		String URL= System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URL);
		driver.get(URL);
		System.out.println("Pushing 2nd class");
		System.out.println("Parameterrization");
	}

}
