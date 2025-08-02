package Swaglab_Websitetesting;


import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class SwagLabswebsitetesting {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--incognito"); // Optional: avoids saved state and popups
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

     //   try {
            // Open SauceDemo site
            driver.get("https://www.saucedemo.com/");

            // Fill in login fields
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
/*
            // Wait for page to load (simplified)
            Thread.sleep(2000);

            // Check successful login by verifying presence of product container
            WebElement productsTitle = driver.findElement(By.className("title"));
            if (productsTitle.getText().equals("Products")) {
                System.out.println("✅ Login successful!");
            } else {
                System.out.println("❌ Login failed or incorrect page.");
            }

        } catch (Exception e) {
            
    
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for(int i=1; i<=3;i++)
		{
			
		WebElement Username=driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		Username.sendKeys("performance_glitch_user");
		Password.sendKeys("secret_sauce");
		loginbutton.click();
		driver.switchTo().alert().accept();*/
		WebElement Backpack=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		WebElement boltTshirt=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
		WebElement onesie=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
		WebElement Bikelight=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
		WebElement fleecejacket=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"));
		WebElement allthethings=driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
		Backpack.click();
		Thread.sleep(1000);
		WebElement removebutton=driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
		boolean removestatu=removebutton.isDisplayed();
		Assert.assertTrue(removestatu);
		System.out.println("remove status is present");
		
		System.out.println("Backpack got selected");
		
		boltTshirt.click();
		System.out.println("boltTshirt got selected");
		onesie.click();
		System.out.println("onesie got selected");
		Bikelight.click();
		System.out.println("Bikelight got selected");
		fleecejacket.click();
		System.out.println("fleecejacket got selected");
		allthethings.click();
		System.out.println("allthethings got selected");
		
		WebElement shoppingcart=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		shoppingcart.click();
		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
		System.out.println("backpack got removed");
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		WebElement Firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
		WebElement Lastname=driver.findElement(By.xpath("//input[@id='last-name']"));
		WebElement Zipcode=driver.findElement(By.xpath("//input[@id='postal-code']"));
		String str=RandomStringUtils.randomAlphabetic(5);
		String num=RandomStringUtils.randomNumeric(5);
		Firstname.sendKeys(str);
		Lastname.sendKeys(str);
		Zipcode.sendKeys(num);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		WebElement successmsg=driver.findElement(By.xpath("//h2[text()='Thank you for your order!']"));
		if(successmsg.isDisplayed()){
			System.out.println("Order been placed successfully");
		}
		else
		{
			System.out.println("Order didn't placed");
		}
		WebElement backhomebtn=driver.findElement(By.xpath("//button[text()='Back Home']"));
		Assert.assertEquals(backhomebtn.isDisplayed(), true);
		backhomebtn.click();
		WebElement menubar=driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		menubar.click();
		
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
			
        }}
		
	
	


