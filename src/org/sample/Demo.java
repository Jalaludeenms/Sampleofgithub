package org.sample;

public class Demo {
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nijam\\eclipse-workspace\\google\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/?sk=nf");

driver.manage().window().maximize();


driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

Thread.sleep(4000);
driver.findElement(By.name("firstname")).sendKeys("jalaludeen");

driver.findElement(By.name("lastname")).sendKeys("jalalda");








}
}

}
