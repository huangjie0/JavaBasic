package EntityClass;

public class StudentControls {
        private Student student;
        public StudentControls(Student student){
            this.student = student;
        }
        public void printScore(){
            if(student.getScore() >= 60){
                System.out.println(student.getName() + "成绩为" + student.getScore() + ",成绩合格！");
            }else {
                System.out.println(student.getName() + "成绩不及格！");
            }
        }
}
