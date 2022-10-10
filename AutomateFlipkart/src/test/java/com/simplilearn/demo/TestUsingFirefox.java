package com.simplilearn.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestUsingFirefox {

  @Test
  public void Product() {
	  
	  try {
	  
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div:nth-child(1) > input")).sendKeys("7291076677");
		
		driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div:nth-child(2) > input")).sendKeys("Ankit@1108");
		
		driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div._1D1L_j > button")).submit();
		
	
		
		
				WebElement product= driver.findElement(By.name("q"));
				product.sendKeys("Iphone13");
				
				WebElement button=driver.findElement(By.className("L0Z3Pu"));
				button.submit();
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				WebElement element=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[25]/div/div/div/a/div[2]/div[1]/div[1]"));
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
				
				System.out.println(element.getText());
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
  }
}
