package com.selenity.ngta;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NgtaApplicationTests {

	@Test
	void contextLoads() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Samet\\OneDrive\\Masaüstü\\setek\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--start-maximized");

		ChromeDriver chromeDriver = new ChromeDriver();


		chromeDriver.get("https://www.google.com");

		chromeDriver.manage().window().maximize();

		Thread.sleep(5000);

		WebElement aramaCubugu = chromeDriver.findElement(By.id("APjFqb"));

		aramaCubugu.sendKeys("LinkedIn");

		Thread.sleep(150);

		WebElement araButonu  = chromeDriver.findElement(By.name("btnK"));

		araButonu.click();


		Thread.sleep(2000);

		chromeDriver.close();



	}

}
