package com.nextBaseCRM.test.VoteForAPoll;

import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC72_MarketingTeamCanSelectAndVoteForASingleChoiceAnswerPoll {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //1-Action: User access the login page
        driver.get("http://login2.nextbasecrm.com");
        //1-ER: User land on login page
        driver.manage().window().maximize();

        Thread.sleep(3000);

        //2- Action: User enter valid credentials and click Log In
        driver.findElement(By.xpath("//*[@name='USER_LOGIN']")).sendKeys("marketing21@cybertekschool.com");
        driver.findElement(By.xpath("//*[@name='USER_PASSWORD']")).sendKeys("UserUser");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        //2-ER: User land on the homepage of NextBaseCRM/ Activity Stream

        Thread.sleep(3000);

        //3-Action: scroll down the activity and find any active poll with one selection and choose an answer.
        driver.findElement(By.className("bx-vote-block-inp-substitute")).click();
        //3-ER: User should be able to select one answer from an active poll

        Thread.sleep(3000);

        //4-Action: Click on "Vote"
       driver.findElement(By.xpath("//*[@id='vote-nSLjLH103']/form/div[2]/button[2]")).click();
        //4-ER: Vote should be accepted

    }
}



