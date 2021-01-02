package com.nextBaseCRM.test.VoteForAPoll;

import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC74_PollOwnerMarketingTeamCanStopAPoll {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //1-Action: User access the login page
        driver.get("http://login2.nextbasecrm.com");
        //1-ER: User land on login page
        driver.manage().window().maximize();


        //2- Action: User enter valid credentials and click Log In
        driver.findElement(By.xpath("//*[@name='USER_LOGIN']")).sendKeys("marketing21@cybertekschool.com");
        driver.findElement(By.xpath("//*[@name='USER_PASSWORD']")).sendKeys("UserUser");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        //2-ER: User land on the homepage of NextBaseCRM/ Activity Stream



        //3 - Action : Scroll down the "Activity stream" and find Poll created by marketing21 and click "Stop"
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='vote-nSLjLH103']/form/div[2]/span/button[1]")).click();
        //3 - ER: User should be able to stop the Poll successfully.



    }
}
