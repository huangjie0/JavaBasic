package Inherit3;

public class Test2 {
    public static void main(String[] args) {
        Teacher t = new Teacher("黄杰",20,"教书");
        System.out.println(t.getName());
        System.out.println(t.getAge());
        System.out.println(t.getSkill());
    }
}

//人类
class People{
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
//老师类
class Teacher extends People{
    private String skill;

    public Teacher(String name,int age,String skill) {
        //调用父类有参构造器
        super(name,age);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
