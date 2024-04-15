package EntityClass;
/*
* 实体类
* */
public class Student {
    private String name;
    private double score;
    //实体类私有，公开无参数构造器


    public Student() {
        //无参数构造器
    }

    public Student(String name, double score) {
        //有参数构造器
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
