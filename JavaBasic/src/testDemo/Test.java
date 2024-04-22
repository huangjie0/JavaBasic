package testDemo;

import InheritGoOver.Fu;
/*

*
* protected修饰任意包的子类
*/

public class Test extends Fu {
    public void test(){
//        public修饰
        helloWord();
//        protected修饰
        helloWord_2();
    }
}
