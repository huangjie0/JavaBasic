package UnitTest;

import org.junit.*;

public class StringTest {
    @Before
    public void test1(){
        System.out.println("------>test1在之前就执行了！");
    }

    @After
    public void test2(){
        System.out.println("------->after方法执行完成！");
    }

    @Test
    public void testPrintNumber(){
        StringUtil.printNumber("huangjie");
        StringUtil.printNumber(null);
    }

    @Test
    public void testGetMaxIndex(){
        int index1 =  StringUtil.getMaxIndex(null);
        int index2 =  StringUtil.getMaxIndex("admin");

        System.out.println(index1);
        System.out.println(index2);

        //断言机制，可以预测业务方法结果
//        Assert.assertEquals("方法内部有bug",4,index2);
    }

    @AfterClass
    public static void test11(){
        System.out.println("------->AfterClass方法执行了！");
    }

    @BeforeClass
    public static void test112(){
        System.out.println("------->BeforeClass方法执行了！");
    }
}
