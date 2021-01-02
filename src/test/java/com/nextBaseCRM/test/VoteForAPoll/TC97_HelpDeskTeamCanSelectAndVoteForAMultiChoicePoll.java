package com.nextBaseCRM.test.VoteForAPoll;

import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC97_HelpDeskTeamCanSelectAndVoteForAMultiChoicePoll {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().fullscreen();
        //1 - Action: User access the login page

        driver.get("https://login2.nextbasecrm.com/");

        //1 - ER: User land on login page


        //2 - User enter valid credentials and click Log In

        driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk21@cybertekschool.com");

        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");

        Thread.sleep(3000);
        driver.findElement(By.className("login-btn")).click();
        Thread.sleep(3000);

        // 2 - ER: User land on the homepage of NextBaseCRM/ Activity Stream


        // 3 - Action: Scroll down the "Activity stream" and find any active Poll with multiple choice answers and select
        // multiple answers

        driver.findElement(By.cssSelector("tr[data-bx-vote-answer='321']")).click();


        Thread.sleep(2000);
        driver.findElement(By.cssSelector("tr[data-bx-vote-answer='322']")).click();

        // 3 - ER: User should be able to select  multiple answers from the Poll

        // 4- Action Click on "Vote"

        driver.findElement(By.cssSelector("button[data-bx-vote-button='actVoting']")).click();

        // 4 - ER: Vote should be accepted


    }
}
