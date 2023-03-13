package com.tmobile.canvas.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Baseclass {
		  
	    public static WebDriver driver;
	    public static Properties prop;
	    
		
	    
		public Baseclass() {
//			Logger log = LogManager.getLogger("devpinoyLogger");
			try {
				 prop = new Properties();
		   
			File src =new File("C:\\Users\\piktor\\Documents\\CANVAS Project\\Canvas_BDDFramework\\src\\main\\java\\com\\ca\\config\\Configure.properties");
			FileInputStream input = new FileInputStream(src);
					
			prop.load(input);
			//String Browsername = prop.getProperty("browser");
			//System.out.println(Browsername);
			}catch (FileNotFoundException e) {
			}
			catch (IOException e) {
			}
		}	
		
		
		
		
			public static void Initialisation() {
				
				
			//System.setProperty("webdriver.chrome.silentOutput","true");
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver V95.exe");
				
//			 WebDriverManage0r.chromedriver().setup();
			 
				// SSL certificate bypass
				ChromeOptions Options = new ChromeOptions();
				Options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				Options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
				
				driver = new ChromeDriver(Options);
			
	
			//System.out.println("browser started");	
		     
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Testutil.page_load_timeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Testutil.Implicit_Wait, TimeUnit.SECONDS);
			driver.get(prop.getProperty("weburl"));
		
			}
		}
			

