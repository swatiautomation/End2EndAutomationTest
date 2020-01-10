package com.qa.TestRunner;

import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

//import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


import java.io.File;

import org.junit.AfterClass;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/hp/eclipse-workspace/CucumberPOM/src/main/java/com/qa/feature/End2End_Tests.feature", //the path of the feature files
		glue={"com/qa/stepdefination"}, //the path of the step definition files
		plugin= {"pretty","json:target/cucumber-json/cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml", "html:target/cucumber-reports",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/cucumber-reports/ExtentReport.html"},
			
		monochrome =true,//display the console output in readable form
		strict=false,//it will check if any step is not defined in step defination file
		dryRun = false // to check the mapping with proper between feature file and step defination file.
		//tags= {"@SmokeTest"}
	    //tags = {"@SmokeTest ,@RegressionTest"} // execture all the tests tagged as @Smoke OR @Regression
		//tags = {"@SmokeTest" , "@RegressionTest"} // execture all the test tagged as @Smoke And @Regression
		//tags  = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}  // to ignore the specific test cases with the mentioned tag use the special character.
)

public class TestRunner  {
	
	@AfterClass
	public static void reportSetup()
	{
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"\\Config\\extent-config.xml"));
		Reporter.setSystemInfo("64 Bit", "Windows 10");
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", 	"Windows 7" + "64 Bit");
		Reporter.setSystemInfo("Selenium", "3.11");
		Reporter.setSystemInfo("Maven", "3.1.2");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}


	
}

//C:/Users/hp/eclipse-workspace/CucumberPOM/src/main/java/com/qa/feature/End2End_Tests.feature