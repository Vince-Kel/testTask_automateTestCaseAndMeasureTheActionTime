package Tests;

import dataGenerator.UserGenerator;
import objects.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

import static driver.MyDriverManager.getWebDriver;

public class AtlassianLoginPageActionTimeMeasurement {
    long chromeCommonTestRunExecutionTime;
    long ieCommonTestRunExecutionTime;
    long chromeSingleSessionExecutionTime;
    long ieSingleSessionExecutionTime;
    List<String> usedEmails = new LinkedList<>();

    public AtlassianLoginPageActionTimeMeasurement() {
    }

    @Test(description = "LoginPage test in 1 thread", threadPoolSize = 1, priority = 1)
    public void testForOneThread() {
        WebDriver ieDriver = null;
        WebDriver chromeDdriver = null;
        try {
            chromeDdriver = getWebDriver("chrome");
            User currentUser = UserGenerator.generateNewUser();
            String userEmail = currentUser.userEmail;
            chromeDdriver.get("https://id.atlassian.com/login");
            long startTimePosition = System.currentTimeMillis();
            chromeDdriver.findElement(By.cssSelector("#username")).sendKeys(userEmail);
            chromeDdriver.findElement(By.cssSelector("#login-submit")).click();
            WebDriverWait wait = new WebDriverWait(chromeDdriver, 15);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
            long stopTimePosition = System.currentTimeMillis();
            chromeCommonTestRunExecutionTime += stopTimePosition - startTimePosition;
            chromeSingleSessionExecutionTime = stopTimePosition - startTimePosition;
            usedEmails.add(userEmail);

            ieDriver = getWebDriver("ie");
            currentUser = UserGenerator.generateNewUser();
            userEmail = currentUser.userEmail;
            ieDriver.get("https://id.atlassian.com/login");
            startTimePosition = System.currentTimeMillis();
            ieDriver.findElement(By.cssSelector("#username")).sendKeys(userEmail);
            ieDriver.findElement(By.cssSelector("#login-submit")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
            stopTimePosition = System.currentTimeMillis();
            ieCommonTestRunExecutionTime += stopTimePosition - startTimePosition;
            ieSingleSessionExecutionTime = stopTimePosition - startTimePosition;
            usedEmails.add(userEmail);
        } finally {
            if (ieDriver != null) {
                ieDriver.quit();
            }
            if (chromeDdriver != null) {
                chromeDdriver.quit();
            }
        }
    }

    @Test(description = "LoginPage test in 2 threads", invocationCount = 2, threadPoolSize = 2, priority = 2)
    public void testForTwoThreads() {
        WebDriver ieDriver = null;
        WebDriver chromeDdriver = null;
        try {
            chromeDdriver = getWebDriver("chrome");
            User currentUser = UserGenerator.generateNewUser();
            String userEmail = currentUser.userEmail;
            chromeDdriver.get("https://id.atlassian.com/login");
            long startTimePosition = System.currentTimeMillis();
            chromeDdriver.findElement(By.cssSelector("#username")).sendKeys(userEmail);
            chromeDdriver.findElement(By.cssSelector("#login-submit")).click();
            WebDriverWait wait = new WebDriverWait(chromeDdriver, 15);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
            long stopTimePosition = System.currentTimeMillis();
            chromeCommonTestRunExecutionTime += stopTimePosition - startTimePosition;
            usedEmails.add(userEmail);

            ieDriver = getWebDriver("ie");
            currentUser = UserGenerator.generateNewUser();
            userEmail = currentUser.userEmail;
            ieDriver.get("https://id.atlassian.com/login");
            startTimePosition = System.currentTimeMillis();
            ieDriver.findElement(By.cssSelector("#username")).sendKeys(userEmail);
            ieDriver.findElement(By.cssSelector("#login-submit")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
            stopTimePosition = System.currentTimeMillis();
            ieCommonTestRunExecutionTime += stopTimePosition - startTimePosition;
            usedEmails.add(userEmail);
        } finally {
            if (ieDriver != null) {
                ieDriver.quit();
            }
            if (chromeDdriver != null) {
                chromeDdriver.quit();
            }
        }
    }

    @Test(description = "LoginPage test in 5 threads", invocationCount = 5, threadPoolSize = 5, priority = 3)
    public void testForFiveThreads() {
        WebDriver ieDriver = null;
        WebDriver chromeDdriver = null;
        try {
            chromeDdriver = getWebDriver("chrome");
            User currentUser = UserGenerator.generateNewUser();
            String userEmail = currentUser.userEmail;
            chromeDdriver.get("https://id.atlassian.com/login");
            long startTimePosition = System.currentTimeMillis();
            chromeDdriver.findElement(By.cssSelector("#username")).sendKeys(userEmail);
            chromeDdriver.findElement(By.cssSelector("#login-submit")).click();
            WebDriverWait wait = new WebDriverWait(chromeDdriver, 15);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
            long stopTimePosition = System.currentTimeMillis();
            chromeCommonTestRunExecutionTime += stopTimePosition - startTimePosition;
            usedEmails.add(userEmail);

            ieDriver = getWebDriver("ie");
            currentUser = UserGenerator.generateNewUser();
            userEmail = currentUser.userEmail;
            ieDriver.get("https://id.atlassian.com/login");
            startTimePosition = System.currentTimeMillis();
            ieDriver.findElement(By.cssSelector("#username")).sendKeys(userEmail);
            ieDriver.findElement(By.cssSelector("#login-submit")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
            stopTimePosition = System.currentTimeMillis();
            ieCommonTestRunExecutionTime += stopTimePosition - startTimePosition;
            usedEmails.add(userEmail);
        } finally {
            if (ieDriver != null) {
                ieDriver.quit();
            }
            if (chromeDdriver != null) {
                chromeDdriver.quit();
            }
        }
    }

    @Test(description = "LoginPage test in 10 threads", invocationCount = 10, threadPoolSize = 10, priority = 4)
    public void testForTenThreads() {
        WebDriver ieDriver = null;
        WebDriver chromeDdriver = null;
        try {
            chromeDdriver = getWebDriver("chrome");
            User currentUser = UserGenerator.generateNewUser();
            String userEmail = currentUser.userEmail;
            chromeDdriver.get("https://id.atlassian.com/login");
            long startTimePosition = System.currentTimeMillis();
            chromeDdriver.findElement(By.cssSelector("#username")).sendKeys(userEmail);
            chromeDdriver.findElement(By.cssSelector("#login-submit")).click();
            WebDriverWait wait = new WebDriverWait(chromeDdriver, 15);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
            long stopTimePosition = System.currentTimeMillis();
            chromeCommonTestRunExecutionTime += stopTimePosition - startTimePosition;
            usedEmails.add(userEmail);

            ieDriver = getWebDriver("ie");
            currentUser = UserGenerator.generateNewUser();
            userEmail = currentUser.userEmail;
            ieDriver.get("https://id.atlassian.com/login");
            startTimePosition = System.currentTimeMillis();
            ieDriver.findElement(By.cssSelector("#username")).sendKeys(userEmail);
            ieDriver.findElement(By.cssSelector("#login-submit")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
            stopTimePosition = System.currentTimeMillis();
            ieCommonTestRunExecutionTime += stopTimePosition - startTimePosition;
            usedEmails.add(userEmail);
        } finally {
            if (ieDriver != null) {
                ieDriver.quit();
            }
            if (chromeDdriver != null) {
                chromeDdriver.quit();
            }
        }
    }

    @AfterTest(description = "Output for execution time and used emails")
    public void outputResults() {
        System.out.println("Test run results");
        System.out.println("  Chrome execution time for single specific test run: " + chromeSingleSessionExecutionTime + " ms");
        System.out.println("  Chrome average execution time: " + chromeCommonTestRunExecutionTime / 18 + " ms" + "\r\n");
        System.out.println("  IE execution time for single specific test run: " + ieSingleSessionExecutionTime + " ms");
        System.out.println("  IE average execution time: " + ieCommonTestRunExecutionTime / 18 + " ms" + "\r\n");
        System.out.println("  Average execution time for both browsers: " + Long.sum(chromeCommonTestRunExecutionTime, ieCommonTestRunExecutionTime) / 36 + " ms" + "\r\n");
        System.out.println("  Used emails list: ");
        if (usedEmails.size() > 0) {
            for (String usedEmail : usedEmails) {
                System.out.println("  " + usedEmail);
            }
        } else {
            System.out.println("the list is empty");
        }
    }
}
