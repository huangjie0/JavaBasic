package InterfaceCase;

import java.util.ArrayList;

public class ClassManager {
    private ArrayList<Student> students = new ArrayList<>();
    private StudentOperator studentOperator = new StudentOperatorImpl2();
    public ClassManager(){
        students.add(new Student("迪丽热巴",'女',99));
        students.add(new Student("杨幂",'女',98));
        students.add(new Student("洋洋",'男',95));
        students.add(new Student("刘德华",'男',90));
    }
    //打印全班全部信息
    public void printInfo(){
        studentOperator.printAllInfo(students);
    }
    //打印全班平均分
    public void printScore(){
        studentOperator.printAverageGrade(students);
    }
}
