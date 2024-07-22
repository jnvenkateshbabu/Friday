package org.friday;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener{
	

    @Override
    public void onTestStart(ITestResult result) {
        
        System.out.println("Test started: " + result.getMethod().getMethodName());
        
    }

    @Override
    public void onTestSuccess(ITestResult result) {
       
        System.out.println("Test succeeded: " + result.getMethod().getMethodName());
        
      
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Called when a test method fails
        System.out.println("Test failed: " + result.getMethod().getMethodName());
        // You can also log additional information such as screenshots or error details here
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Called when a test method is skipped
        System.out.println("Test skipped: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Called when a test fails but is within the success percentage defined in the test configuration
        System.out.println("Test failed but within success percentage: " + result.getMethod().getMethodName());
    }

}
