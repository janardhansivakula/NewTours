package com.TestNGProgrammes;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_BeforeMethod_AfterMethod 
{
  @BeforeMethod
  public void browserLaunch()
  {
	  System.out.println("FireFox Bowser opened");
  }
  @Test(enabled=false)
  public void gmailLogin()
  {
   	System.out.println("The gmail Login page is Opened");
  }
   
  @Test(priority=1)
  public void inboxInGmail()
  {
	  System.out.println("Inbox is Opened By Gmail Application"); 
  }
  @Test(priority=2)
  public void OutboxInGmail()
  {
	   System.out.println("Oubox In Gmail Application");
  }
  @Test(priority=3)
  public void gmailCompose()
  {
	   System.out.println("Gmail Compose mail is opened");
  }
  @AfterMethod
  public void browserClosed()
  {
	  System.out.println("Browser Is closed");
  }
}
