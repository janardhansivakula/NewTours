package com.TestNGProgrammes;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class TestNG_Annotations 
{
	
   @BeforeTest
   public void browserLaunch()
   {
	   System.out.println("The Google Chrome Browser Opened");
   }
    
   @Test(priority=3)
   public void gmailLogin()
   {
    	System.out.println("The gmail Login page is Opened");
   }
    
   @Test(priority=2)
   public void inboxInGmail()
   {
	  System.out.println("Inbox is Opened By Gmail Application"); 
   }
   @Test(priority=1)
   public void OutboxInGmail()
   {
	   System.out.println("Oubox In Gmail Application");
   }
   @Test(enabled=false)
   public void gmailCompose()
   {
	   System.out.println("Gmail Compose mail is opened");
   }
   @AfterTest
   public void closeGmail()
   {
	   System.out.println("Gmail App Is Closed");
   }
   
}
