/**
* BrowserLaunch


package org.demo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ag.bhavatharini\\Documents\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/"); 
		WebElement userName = driver.findElement(By.id("email")); 
		WebElement passWord = driver.findElement(By.id("pass")); 
		userName.sendKeys("Bhavatharini"); 
		passWord.sendKeys("ergfkwef");
		Thread.sleep(3000);
		userName.clear();
//		userName.click(); 
		Thread.sleep(3000);
//		driver.close();
		driver.quit();
		
	}
}


* WebdriverMethods

package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	public static void main(String[] args) throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ag.bhavatharini\\Documents\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		
		
		
//		driver.navigate().to("https://www.ebay.com/");
//		Thread.sleep(3000);
//		String title = driver.getTitle();
//		System.out.println(title);
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		
		
//		driver.navigate().to("https://www.facebook.com/");
//		Thread.sleep(4000);
//		driver.navigate().back();
//		Thread.sleep(5000);
//		driver.navigate().forward();
//		Thread.sleep(5000);
//		driver.navigate().refresh();
	}
}


* WebElementMethods

package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementMethods {
	public static void main(String[] args) throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ag.bhavatharini\\Documents\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@id='pass']"));
		userName.sendKeys("Bhavatharini");
		passWord.sendKeys("ftgrvdfgt");
		Thread.sleep(3000);
		userName.clear();
		WebElement login = driver.findElement(By.name("login"));
		String cssValue = login.getCssValue("font-size");
		System.out.println(cssValue);
		
		
		
//		driver.get("https://demoqa.com/select-menu");
//		driver.manage().window().maximize();
//		WebElement dropDown = driver.findElement(By.xpath("//*[@id='oldSelectMenu']"));
//		Select select = new Select(dropDown);
//		List<WebElement> options = select.getOptions();
//		for (WebElement webElement : options) {
//			String text = webElement.getText();
//			System.out.println(text);
//			if(text.contains("Green")) {
//				select.selectByVisibleText(text);
//			}
				
				
				
//		driver.navigate().to("http://www.gmail.com");
//		Boolean Display = driver.findElement(By.xpath("//input[@id='identifierId']")).isDisplayed();
//		System.out.println("Element displayed is :"+Display);
//		Boolean Enable = driver.findElement(By.xpath("//*[@id='identifierId']")).isEnabled();
//		System.out.println("Element enabled is :"+Enable);
		
		
		
//		String Url = "http://www.gmail.com";
//		driver.get(Url);
//		WebElement sigin = driver.findElement(By.id("identifierId"));
//		Point location = sigin.getLocation();
//		System.out.println("Location of X :"+ location.getX()+ "," +"Location of Y :" +location.getY());
//		Dimension size = sigin.getSize();
//		System.out.println("Width :"+size.getWidth()+ "," +"Height : "+size.getHeight());
//		String text = sigin.getText();
//		System.out.println("Text :" +text);
//		String tagName = sigin.getTagName();
//		System.out.println("Tagname :"+tagName);
//		driver.close();
		
		

	}
	}


* SelectClass

package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	public static void main(String[] args) throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ag.bhavatharini\\Documents\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
//		driver.get("http://demo.guru99.com/test/newtours/register.php");
//		driver.manage().window().maximize();
//		WebElement dropdown = driver.findElement(By.name("country"));
//		Select select = new Select(dropdown);
//		select.selectByIndex(3);
//		Thread.sleep(3000);
//		driver.close();
		
		
		
//		String baseURL = "http://demo.guru99.com/test/newtours/register.php";
//		driver.get(baseURL);
//		driver.manage().window().maximize();
//		Select drpCountry = new Select(driver.findElement(By.name("country")));
//		drpCountry.selectByVisibleText("ANTARCTICA");
//		driver.get("http://jsbin.com/osebed/2");
//		Select fruits = new Select(driver.findElement(By.id("fruits")));
//		fruits.selectByVisibleText("Banana");
//		fruits.selectByIndex(1);

		
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.name("coffee2"));
		Select select = new Select(dropdown);
		boolean multiple = select.isMultiple();
		System.out.println(multiple);
		select.selectByIndex(3);
		select.selectByValue("5");
		select.selectByVisibleText("Purple");
		Thread.sleep(4000);
		driver.close();

}
}


* ActionClass

package org.demo;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ag.bhavatharini\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://meesho.com/");
//		driver.manage().window().maximize();
//		Actions action =  new Actions(driver);
//		WebElement collections = driver.findElement(By.xpath("//span[text()='Women Ethnic']"));
//		collections.click();
//		WebElement kurtis = driver.findElement(By.xpath("//p[text()='All Kurtis']"));
//		kurtis.click();
//		action.moveToElement(collections).perform();
//		action.moveToElement(kurtis).click().perform();
		
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Actions action =  new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(source).perform();
		
		
//		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
//		driver.manage().window().maximize();
//		Actions action =  new Actions(driver);
//		WebElement source = driver.findElement(By.id("draggable"));
//		WebElement destination = driver.findElement(By.id("droppable"));
//		action.dragAndDrop(source, destination).perform();

}
}


* RobotClass

package org.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ag.bhavatharini\\Documents\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("Bhavatharini");
    Robot robot = new Robot();  
    Thread.sleep(2000); 
    robot.keyPress(KeyEvent.VK_DOWN);
    Thread.sleep(2000); 
    robot.keyPress(KeyEvent.VK_TAB);	
    Thread.sleep(2000);	
    robot.keyPress(KeyEvent.VK_TAB);	
    Thread.sleep(2000);	
    robot.keyPress(KeyEvent.VK_TAB);	
    Thread.sleep(2000);	
    robot.keyPress(KeyEvent.VK_ENTER);	
}

}


* Alerts

package org.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException  {									
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ag.bhavatharini\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");			
		driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();			      
        Alert alert = driver.switchTo().alert();		  
        String alertMessage= driver.switchTo().alert().getText();			
        System.out.println(alertMessage);	
        Thread.sleep(5000);	
        alert.accept();		
    }	
		
		
		
		
		
//        driver.get("http://demo.automationtesting.in/Alerts.html");	
//        driver.manage().window().maximize();
//        WebElement simple = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
//        simple.click();
//        WebElement button = driver.findElement(By.xpath("(//button[onclick='promptbox()']"));
//        button.click();
//       	
//    }	



}


* JavaScriptExecutor

package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	public static void main(String[] args) throws InterruptedException  {									
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ag.bhavatharini\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("PocoF1");
		driver.findElement(By.cssSelector("#gh-btn")).click();
		js.executeScript("window.scrollBy(0,300)");
	

}
}

*/
