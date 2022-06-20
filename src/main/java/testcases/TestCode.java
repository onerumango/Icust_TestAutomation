package testcases;



import java.io.IOException;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;



public class TestCode {

	/**

	 * @param args

	 * @throws InterruptedException

	 * @throws IOException

	 */

	public static void main(String[] args) throws InterruptedException, IOException {



		// TODO Auto-generated method stub

		

				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");

				  

				/*

				 * HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

				 * chromePrefs.put("profile.default_content_settings.popups", 1); // 0,1,2

				 */			

				  ChromeOptions options = new ChromeOptions();

				  options.addArguments(

						   "--disable-web-security",

						   "--ignore-certificate-errors",

						   "--allow-running-insecure-content",

						   "--allow-insecure-localhost",

						   "--disable-gpu"

						  );

				 

				  //options.setExperimentalOption("prefs", chromePrefs);

				  options.addArguments("user-data-dir=C:/User/Admin/AppData/Local/Google/Chrome/User Data");

				  

				  ChromeDriver driver = new ChromeDriver(options);

				// open chrome driver

				//to maximize the window

						driver.manage().window().maximize();

						driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);

				driver.get("http://icust.rumango.com/development/iCust-Teller/#/sessions/signin");

				Thread.sleep(1000);

				driver.findElementByXPath("//input[@formcontrolname='username']").sendKeys("QEA1");

				driver.findElementByXPath("//input[@formcontrolname='password']").sendKeys("Password@12");

				Thread.sleep(1000);

				driver.findElementByXPath("//span[text( )='Sign In']").click();

				Thread.sleep(1000);

				driver.findElementByXPath("(//mat-icon[@role='img'][normalize-space()='search'])[2]").click();

				driver.findElementByXPath("//input[@type='text']").click();
				
				driver.findElementByXPath("//input[@name='lawyerName']").sendKeys("1952");


				driver.findElementByXPath("//mat-icon[normalize-space()='chevron_right']").click();

				Thread.sleep(15000);
				driver.findElementByXPath("//span[normalize-space()='View Profile']").click();

				driver.findElementByXPath("//mat-icon[normalize-space()='close']").click();

				driver.close();

	}



}