package com.freeStyle;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class Test2 extends StartExample {
@Test
public void ExpTest1() {
	System.out.println("Test2 successufull executed");
	test.log(LogStatus.PASS, "second testcase");
}
}
