package InterfaceCase;

import java.util.ArrayList;

public class StudentOperatorImpl1 implements StudentOperator{
    @Override
    public void printAllInfo(ArrayList<Student> students){
        System.out.println("----------全班全部信息如下----------");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("姓名"+s.getName() + ",性别" + s.getSex() + ",分数" + s.getScore());
        }
    }

    @Override
    public void printAverageGrade(ArrayList<Student> students){
        System.out.println("----------全班平均分如下----------");
        double allScore = 0.0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            allScore += s.getScore();
        }
        System.out.println("平均分" + (allScore) / students.size());
    }
}
