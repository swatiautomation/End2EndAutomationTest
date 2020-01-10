package com.qa.util;

import com.qa.config.TestBase;

public class TestUtil extends TestBase {
	public static int PAGE_LOAD_TIMEOUT =20;
	
public static	int IMPLICIT_WAIT = 30;

public void switchToFrame() {
	driver.switchTo().frame("mainpanel");
}

}
