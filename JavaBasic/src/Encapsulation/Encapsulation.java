package Encapsulation;

public class Encapsulation {
    private double score;

    public void setScore(double score){
        if(score >= 0 && score <=100 ){
            this.score = score;
        }else {
            System.out.println("数据非法！");
        }
    }

    public double getScore(){
        return this.score;
    }

    private void printScore(){
        System.out.println(score > 60 ? "成绩及格" : "挂科");
    }
}
