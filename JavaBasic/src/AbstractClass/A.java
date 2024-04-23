package AbstractClass;
/*
* 抽象类,,,,不能创建对象
* */
public abstract class A {
    private String name;
    public static String schoolName;
//    抽象方法，不能有方法体，只有签名
    public abstract void run();

    public A(String name) {
        this.name = name;
    }

    public A() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        A.schoolName = schoolName;
    }
}
