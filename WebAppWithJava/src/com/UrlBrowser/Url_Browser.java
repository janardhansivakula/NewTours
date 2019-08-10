package com.UrlBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Url_Browser {

	public static void main(String[] args) 
	{
	    //Automation the browser 
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		
		ChromeDriver cd = new ChromeDriver();
		/*cd.get("http://livetech.co.in");
		cd.get("http://www.Gmail.com");
		cd.get("http://youtube.com");
		cd.get("http://yahoo.com");
		cd.get("http://facebook.com");
		cd.get("http://instagram.com");
		cd.get("http://airtel.com");
		cd.get("http://idea.com");
		cd.get("http://reliance.com");
		cd.get("http://jio.com");
		cd.get("http://vodafone.com");*/
		
        //String url1 ="http://www.facebook.com";
       
		String url3 ="http://www.Gmail.com";
       
       cd.navigate().to(url3);
       
      String expected_GmailHomePageTitle="Gmail";
      System.out.println("The Expected gmail Home Page Title is:" +expected_GmailHomePageTitle);
      
      String actual_GmailHomePageTitle=cd.getTitle();
      System.out.println("The Expected GmailHomePageTitle is:"+actual_GmailHomePageTitle);
      
      if(actual_GmailHomePageTitle.equals(expected_GmailHomePageTitle))
      {
    	 System.out.println("The Gmail Title Is matched--PASS...."); 
      }
      else
      {
    	 System.out.println("The Title is not matched----FAIL...."); 
    	 
      }
      
      String url2 ="http://www.youtube.com";
      cd.navigate().to(url2);
      
      String expected_YoutubeHomePageTitle="YouTube";
      System.out.println("The Expected Youtube Home Page Title is:"+expected_YoutubeHomePageTitle);
      
      String actual_YoutubeHomePageTitle=cd.getTitle();
      System.out.println("The Actual Youtube Home Page Title is:"+actual_YoutubeHomePageTitle);
      
      if(actual_YoutubeHomePageTitle.equals(expected_YoutubeHomePageTitle))
      {
    	  System.out.println("The Youtube title is matched-----PASS....");
      }
      else
      {
    	  System.out.println("The Youtube is not matched---FAIL...");  
      }
        
           /*cd.get(url1);
           cd.get(url2);
           cd.get(url3);*/
        
        //cd.navigate().to(url3);
        
        
		
		   cd.close();
	}

}
