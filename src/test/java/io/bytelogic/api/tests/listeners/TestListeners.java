package io.bytelogic.api.tests.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.bytelogic.api.tests.BaseTest;
import io.bytelogic.api.util.Logger;


public class TestListeners extends BaseTest
implements ITestListener{
	
	
	@Override
	public void onTestStart(ITestResult result) {
		Logger.logConsoleMessage("=================== TEST " + result.getName() + " STARTED =================");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Logger.logMessage("========SUCCESS========");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Logger.logConsoleMessage("=================== TEST " + result.getName() + " FAILED =================");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		Logger.logMessage("==========TESTS STARTING=========");
		Logger.disableLog4JConsoleOutput();
	}

	@Override
	public void onFinish(ITestContext context) {
		Logger.logMessage("==========TEST COMPLETE=========");
		}
}
