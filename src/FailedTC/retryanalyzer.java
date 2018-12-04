package FailedTC;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryanalyzer implements IRetryAnalyzer {
	
	public boolean retry(ITestResult result)
	{
		
		int count = 0;
		int limit = 3;
		
		if(count<limit)
		{
			count++;
			
			
		}
		return false;
		
	}

}
