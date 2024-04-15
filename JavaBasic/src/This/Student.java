package This;

public class Student {
    //this，问题
    double score;
    public void printThis(){
        System.out.println(this);
    }
    public void printPass(double score){
        if(this.score > score){
            System.out.println("恭喜");
        }else {
            System.out.println("失败！");
        }
    }
}
