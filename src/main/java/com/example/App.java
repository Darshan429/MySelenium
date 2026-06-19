package com.example;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class App {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArgument("--headless=new");
        options.addArgument("--no-sandbox");
        options.addargument("--disable-dev-shm-usage");
        options.addArgument("--disable-gpu");

        WebDriver driver = new ChromeDriver();

        driver.get("https://wwww.saucedemo.com");
        driver.System.out.println(driver.getTitle());
        driver.quit();

    }
}
