package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class DealStepDefnition {
	//Thread.sleep(2000);  - All such static waits are kept for sake of video recording and execution flow to be visible 
	 WebDriver driver;
	 @Given("^user opens twitter Login Page$")
	 public void user_opens_twitter_login_page(){
	  System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
		 
	 driver = new ChromeDriver();
	 driver.get("https://twitter.com/");
	 driver.manage().window().maximize();
		//Thread.sleep(5000);
		 String title = driver.getTitle();
		 System.out.println(title);
		 	 Assert.assertEquals("Twitter. It’s what’s happening / Twitter", title);
		 	
		 
	 }
	 
	 @When("^user enters username and password and clicks on login button$")
	 public void user_enters_username_and_password(DataTable credentials){
		List<List<String>> data = credentials.raw();
	 driver.findElement(By.xpath("//input[@name='session[username_or_email]']")).sendKeys(data.get(1).get(2));
	 driver.findElement(By.xpath("//input[@name='session[password]']")).sendKeys(data.get(1).get(1));
	 WebElement loginBtn =
			 driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[1]/div[1]/div/form/div/div[3]/div/div"));
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", loginBtn);
			 
	 }
	
	
	 @When("^Navigate profile page of logged user and upload a profile picture$")
	 public void user_clicks_on_login_button() throws Throwable {
	 //Click Profile
	 WebDriverWait wait = new WebDriverWait(driver,30);
	 WebElement Profile;
	 Profile= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(normalize-space(),'Profile')]"))); 
	 Profile.click();
	 
	 WebElement EditProfile;
	 EditProfile= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Edit profile')]"))); 
	 EditProfile.click();
	 Thread.sleep(2000);
	//Upload image
	 JavascriptExecutor jse = (JavascriptExecutor) driver; 
	 jse.executeScript("arguments[0].setAttribute('style', arguments[1])", driver.findElement(By.xpath("/descendant::input[@type='file'][1]")), "0");
	 jse.executeScript("arguments[0].setAttribute('class', arguments[1])", driver.findElement(By.xpath("/descendant::input[@type='file'][1]/../../div[2]")), "a");
	 driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\eclipse-workspace\\CucumberSeleniumFramework-master\\resources\\TwitterDP2.JPG");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
	 Thread.sleep(6000);
	 }
	
	 @When("^user Update BIO field in profile section as Selenium Automation user$")
	 public void user_enters_bio_on_profile_page() {
		 WebDriverWait wait = new WebDriverWait(driver,30);
	 //BIO
	 WebElement TextBio;
	 TextBio=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[4]/label[1]/div[1]/div[2]/div[1]/textarea[1]")));
	 TextBio.click();
	 TextBio.sendKeys(Keys.CONTROL+"A" + Keys.BACK_SPACE);
	 TextBio.sendKeys("Selenium Automation user");
	 }
	 
	 @When("^user Update Location field in profile section as Houston, Texas$")
	 public void user_enters_Location_on_profile_page() {
	 //Location
		 WebDriverWait wait = new WebDriverWait(driver,30);
	 WebElement Location;
	 Location=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/label[1]/div[1]/div[2]/div[1]/input[1]")));
	 Location.click();
	 Location.sendKeys(Keys.CONTROL+"A" + Keys.BACK_SPACE);
	 Location.sendKeys("Houston, Texas");
	 }
	 
	 @When("^user Update Website field in profile section as twitter.com$")
	 public void user_enters_Website_on_profile_page() {
	//Website
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 WebElement Website;
		 Website=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/label[1]/div[1]/div[2]/div[1]/input[1]")));
		 Website.click();
		 Website.sendKeys(Keys.CONTROL+"A" + Keys.BACK_SPACE);
		 Website.sendKeys("https://twitter.com");
		 
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
	 
	 }
	 @Then("^user Fetch BIO field ,location and website and check if the submit values got updated on the profile page$")
	 public void fetch_and_veify_user_details(DataTable userdata) throws InterruptedException {
		 List<List<String>> data = userdata.raw();
		 driver.navigate().refresh();
		 Thread.sleep(6000);
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 WebElement UserBioelem;
		 UserBioelem=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/span[1]")));
		// Fetch and Assert User details update is success
		 String UserBio = UserBioelem.getText();
		 System.out.println("UserBio ::"+ UserBio);
		 String UserLoc = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/span[1]/span[1]/span[1]")).getText();
		 System.out.println("UserLoc ::"+ UserLoc);
		 String UserWebsite = driver.findElement(By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a[1]")).getText();
		 System.out.println("UserWebsite ::"+ UserWebsite);
		 Assert.assertEquals(data.get(1).get(0), UserBio);
		 Assert.assertEquals(data.get(1).get(1), UserLoc);
		 Assert.assertEquals(data.get(1).get(2), UserWebsite);
	 }
	 
	 
	 @Then("^user Opens the twitter page of The Times of India and retrieve the tweets that were published in last 2 hrs$")
	 public void user_opens_TOI_Website() {
		 WebDriverWait wait = new WebDriverWait(driver,30);
	 
	 //TOI
	 WebElement SearchBox;
	 SearchBox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/input[1]")));
	 
	 SearchBox.sendKeys("The Times of India"+ Keys.ARROW_DOWN+Keys.ARROW_DOWN+Keys.ENTER);
	 /*********** 
	  *Get all the tweets 
	  * WebElements TOItweets = driver.findelements(By.Xath("Locator to fetch tweets"));
	  * Time currenttime = datetime.now()
	  * Time difftime = currenttime -120minutes; // to calculate time before 2 hours
	  *  for(int i=0, i<TOItweets.length(); i++){
	  *    if (TOItweets.get(i).getpagesource().getDateTimeStamp() >difftime){ ;
	  *    Save these tweets which were done in last 2 hours;
	  *    }
	  *  
	  *  }
	  * 
	  */
	 
	 }
	 
	 @Then("^Close the browser$")
	 public void close_the_browser() throws Throwable{
		 Thread.sleep(6000);
		 driver.quit();
	 }
	
	
	
	

}
