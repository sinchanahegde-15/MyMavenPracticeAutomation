package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {

        System.out.println("Starting Login Test...");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://practicetestautomation.com/practice-test-login/");
            driver.manage().window().maximize();

            // Enter username
            driver.findElement(By.id("username")).sendKeys("student");

            // Enter password
            driver.findElement(By.id("password")).sendKeys("Password123");

            // Click submit
            driver.findElement(By.id("submit")).click();

            // Small wait to see result
            Thread.sleep(3000);

            System.out.println("Login Test Completed!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
