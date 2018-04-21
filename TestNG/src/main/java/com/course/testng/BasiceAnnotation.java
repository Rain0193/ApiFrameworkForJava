package com.course.testng;

import org.testng.annotations.*;

public class BasiceAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("Test-测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("Test-测试用例2");
    }

    @BeforeMethod
    public void  beforeMethod(){
        System.out.println("BeforMethod-测试方法之前运行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod-测试方法之后运行");
    }

    @BeforeClass
    public void beforClass(){
        System.out.println("BeforClass-在类运行之前的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass-在类运行之后的方法(Class之前)");
    }

    @BeforeSuite
    public void beforSuite(){
        System.out.println("BeforSuite-测试套件(Class之后)");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
        System.out.println("AfterSuite-测试套件");
    }
}
