package FailedTC;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Anno implements IAnnotationTransformer {
	
	public void transform(ITestAnnotation annotation,Class Testclass,Constructor testconstructor,Method testmethod)
	{
		
		annotation.setRetryAnalyzer(retryanalyzer.class);
		
	}

	

}
