package PermissionModifier;
/*
* 同一个包下面访问
*
* */

public class Demo {
    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.publiceMethod();
        fu.protectedMethod();
        fu.method();
    }
}
