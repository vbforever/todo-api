package com.cloudbees.examples.todo.api;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class ToDoApiTest extends TestCase {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\webdriver\\chromedriver.exe");// chromedriver服务地址
		driver = new ChromeDriver(); // 新建一个WebDriver 的对象，但是new 的是FirefoxDriver的驱动
		baseUrl="http://localhost:8090/todo-api/index.jsp";
	}

	@Test
	public void testSearchJunit() throws InterruptedException {
		driver.get(baseUrl);//打开指定的网站
        driver.findElement(By.name("username")).sendKeys(new  String[] {"Selenium"});//找到kw元素的id，然后输入hello
        driver.findElement(By.name("query")).click(); //点击按扭
        try {
            /**
             * WebDriver自带了一个智能等待的方法。
            dr.manage().timeouts().implicitlyWait(arg0, arg1）；
            Arg0：等待的时间长度，int 类型 ；
            Arg1：等待时间的单位 TimeUnit.SECONDS 一般用秒作为单位。
             */
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);        
        } catch (Exception e) {
            e.printStackTrace();
        }

	}
	
	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}
}
