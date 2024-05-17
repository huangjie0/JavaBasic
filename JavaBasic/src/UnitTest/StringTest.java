package UnitTest;

import org.junit.Assert;
import org.junit.Test;

public class StringTest {
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
        Assert.assertEquals("方法内部有bug",4,index2);

    }
}
