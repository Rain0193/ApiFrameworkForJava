package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age){
        System.out.println("name = " + name + "; age = " + age);
    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] obj = new Object[][]{
                {"jojo", 10},
                {"mimi", 20},
                {"ahua", 30}
        };
        return obj;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age){
        System.out.println("test1--: name = " + name + "; age = " + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age){
        System.out.println("test2--: name = " + name + "; age = " + age);
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;

        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"One", 20},
                    {"Two", 22}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"Three", 15},
                    {"Four", 25}
            };
        }
        return  result;
    }
}
