package com.nextBaseCRM.test.VoteForAPoll;

import com.nextBaseCRM.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC99_HrTeamCanVoteAgain {
    public static void main(String[] args) throws InterruptedException {

        //HR team can Vote again
        // 1 - Action: Access CRM website
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login2.nextbasecrm.com/");
        // 1 - ER: User land on login page

        // 2- Action : User enter valid credentials and click Log In
        driver.findElement(By.name("USER_LOGIN")).sendKeys("hr21@cybertekschool.com");

        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");

        driver.findElement(By.className("login-btn")).click();
        Thread.sleep(3000);
        // 2 - ER: User land on the homepage of NextBaseCRM/Active stream


        // 3 - Action: select one answer from a Poll
        driver.findElement(By.cssSelector("tr[data-bx-vote-answer='323']")).click();
        Thread.sleep(3000);


        Thread.sleep(3000);
        // 4 - Action: Click on "Vote"
        driver.findElement(By.cssSelector("button[data-bx-vote-button='actVoting']")).click();

        // 4 - ER: Vote should be accepted
        Thread.sleep(3000);
        // 5 - Action Observe and Click "Vote Again"
        driver.findElement(By.cssSelector("button[data-bx-vote-button='showVoteForm']")).click();

        // 5 = ER: User able to click "Vote Again" and Observe option(s) to select

        //6 - Action: Select another option and click "Vote"

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("tr[data-bx-vote-answer='322']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[data-bx-vote-button='actVoting']")).click();

        //6 - ER: Able to Vote Again. Observe the vote accepted

    }
}
