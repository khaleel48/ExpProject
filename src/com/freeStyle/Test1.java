package com.freeStyle;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

public class Test1 extends StartExample {
@Test
public void expMethod() {
	System.out.println("Test1 Expmethod");
	test.log(LogStatus.PASS, "Firts testcase");
}
@Test
public void ExpTest1() {
	System.out.println("Test2 successufull executed");
	test.log(LogStatus.PASS, "second testcase");
	/*SoftAssert ass=new SoftAssert();
	ass.assertEquals("jafar", "khaleel");
	ass.assertAll();*/
	
}
}
