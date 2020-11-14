package findElement;

import org.testng.annotations.*;

public class TestNgDemo {
    @BeforeSuite
    void beforeSuit(){

    }
    @BeforeTest
    void beforeTest(){
        System.out.println("before test");
    }
    @BeforeClass
    void beforeClass(){
        System.out.println("before class");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("after method");
    }
    @Test
    void tc01(){
        System.out.println("tc01");
    }
    @Test
    void tc02(){
        System.out.println("tc02");
    }
    @Test
    void tc03(){
        System.out.println("tc03");
    }
    @Test
    void tc04(){
        System.out.println("tc04");
    }
    @Test
    void tc05(){
        System.out.println("tc05");
    }


}
