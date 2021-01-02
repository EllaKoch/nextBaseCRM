package com.nextBaseCRM.test;

import com.nextBaseCRM.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
      WebDriver driver =   WebDriverFactory.getDriver("chrome");

      driver.manage().window().fullscreen();

      driver.get("http://login2.nextbasecrm.com");


      driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk21@cybertekschool.com");


    }
}
