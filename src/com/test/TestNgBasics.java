package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	/*
@BeforeSuite -- setup system property for chrome -- 1.
@BeforeTest -- launch chrome Browser -- 2.
@BeforeClass -- login to app -- 3.

@BeforeMethod -- enter URL -- 4
@Test -- googleLogoTest
@AfterMethod -- logout from app

@BeforeMethod -- enter URL
@Test -- Google Title Test
@AfterMethod -- logout from app

@BeforeMethod -- enter URL
@Test -- serachTest
@AfterMethod -- logout from app

@AfterClass -- closeBrowser
@AfterTest -- deleteAllCookies
PASSED: googleLogoTest
PASSED: googleTitleTest
PASSED: serachTest
	 */

	// pre condition annotations -- starting with @Before

	@BeforeSuite // 1.
	public void setUp() {
		System.out.println("@BeforeSuite -- setup system property for chrome");
	}

	@BeforeTest // 2.
	public void launchBrowser() {
		System.out.println("@BeforeTest -- launch chrome Browser");
	}

	@BeforeClass // 3.
	public void login() {
		System.out.println("@BeforeClass -- login to app");
	}

	
	/* Sequence of Test cases run in pair  
@Before method
Test 1
@After Method

@Before method
Test 2
@After Method

@Before method
Test 3
@After Method
	 */

	
	@BeforeMethod // 4.
	public void enterURL() {
		System.out.println("@BeforeMethod -- enter URL");
	}

	// test case -- starting with @Test
	@Test // 5.
	public void googleTitleTest() {
		System.out.println("@Test -- Google Title Test");
	}

	@Test
	public void serachTest() {
		System.out.println("@Test -- serachTest");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("@Test -- googleLogoTest");
	}
	
	// Post conditions -- starting with @After

	@AfterMethod // 6.
	public void logoutfromapp() {
		System.out.println("@AfterMethod -- logout from app");
	}

	@AfterClass // 7.
	public void closeBrowser() {
		System.out.println("@AfterClass -- closeBrowser");

	}

	@AfterTest // 8.
	public void deleteAllCookies() {
		System.out.println("@AfterTest -- deleteAllCookies");
	}
}
