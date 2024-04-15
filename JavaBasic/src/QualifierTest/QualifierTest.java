package QualifierTest;

import PermissionModifier.Fu;

public class QualifierTest extends Fu {
    public void test(){
        //缺省和私有不可以访问

        protectedMethod();
        publiceMethod();
    }
}
