package Enumeration;

public enum enumeration {
    //注意枚举的第一行必须罗列是枚举对象的名字,都是常量，枚举类的构造器都是私有的，不能被继承，第二行可以定义其他成员
    X,Y,Z;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
