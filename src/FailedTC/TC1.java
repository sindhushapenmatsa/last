package FailedTC;

import org.testng.annotations.Test;

public class TC1 {
	
	@Test(retryAnalyzer = FailedTC.retryanalyzer.class)
	public void TC1(){
		System.out.println("executed TC1");
	}
		
	@Test(retryAnalyzer = FailedTC.retryanalyzer.class)
	public void TC2(){
		System.out.println("executed TC2");
		System.out.println(1/0);
	}
	

}
