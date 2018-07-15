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
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\webdriver\\chromedriver.exe");// chromedriver�����ַ
		driver = new ChromeDriver(); // �½�һ��WebDriver �Ķ��󣬵���new ����FirefoxDriver������
		baseUrl="http://localhost:8090/todo-api/index.jsp";
	}

	@Test
	public void testSearchJunit() throws InterruptedException {
		driver.get(baseUrl);//��ָ������վ
        driver.findElement(By.name("username")).sendKeys(new  String[] {"Selenium"});//�ҵ�kwԪ�ص�id��Ȼ������hello
        driver.findElement(By.name("query")).click(); //�����Ť
        try {
            /**
             * WebDriver�Դ���һ�����ܵȴ��ķ�����
            dr.manage().timeouts().implicitlyWait(arg0, arg1����
            Arg0���ȴ���ʱ�䳤�ȣ�int ���� ��
            Arg1���ȴ�ʱ��ĵ�λ TimeUnit.SECONDS һ��������Ϊ��λ��
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
