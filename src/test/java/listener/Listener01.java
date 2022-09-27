package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener01 implements ITestListener
{

	public void onTestStart(ITestResult result) {
		System.out.println("test case start "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test case success "+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
	System.out.println("test case failed "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test case skipped "+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("test case finish "+context.getName());
		
	}
	

}
