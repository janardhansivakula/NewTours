package com.OnlineWebPagesOpen;

import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinePagesOpen 
{

	public static void main(String[] args) 
	{
		//ChromeDriver cd =null;
        System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
         
        ChromeDriver cd = new ChromeDriver();
        
        //ChromeDriver cd = new ChromeDriver();
        
         /*String shahid ="http://facebook.com";
         String shahid1 ="http://youtube.com";
         String shahid2 ="https://opensource-demo.orangehrmlive.com";*/
        String shahid3 ="https://bing.com";

        
              
                     
        //cd.navigate().to(shahid);
        //cd.navigate().to(shahid1);
        //cd.navigate().to(shahid2);
        cd.navigate().to(shahid3);
        
        
      
        
        
         
       
        

	}
}
