package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class Actionwords 
{
	WebDriver driver=null;

    public Actionwords() {
     driver = new FirefoxDriver();
    }
	
    public void openP1(String p1) 
	{
		driver.get(p1);
    }

    public void searchForP1(String p1) 
	{
	   WebElement element = driver.findElement(By.name("q"));
       element.clear();
       element.sendKeys(p1);
       element.submit();
     }

    public void aLinkToP1(String p1) 
	{
		
    final String matcher = p1;

    (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
        public Boolean apply(WebDriver d) {
        return d.findElements(By.linkText(matcher)).size() != 0;
        }
      });
    }
}

