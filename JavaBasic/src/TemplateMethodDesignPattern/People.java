package TemplateMethodDesignPattern;

public abstract class People {
    //设计模板方法
    public void write(){
        System.out.println("我的爸爸");
        writeMain();
        System.out.println("我的爸爸好啊！！");
    }
    //设计抽象方法
    public abstract void writeMain();
}
