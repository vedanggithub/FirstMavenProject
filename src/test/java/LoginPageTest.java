import org.junit.*;
import org.junit.rules.Timeout;

import javax.xml.bind.annotation.XmlSchemaType;

public class LoginPageTest {
    @After
    public  void after(){
        System.out.println("After ");
        //close the browser
    }
    @Before
    public  void before() {
        System.out.println("before ");
        //open the browser
    }
   // @Test //(priority=1)
    public void test2(){
        System.out.println("Second test");
        //TESTCASES
    }
    @Test
    public void test1(){
        System.out.println("First test");
        //login test fun
    }



}
