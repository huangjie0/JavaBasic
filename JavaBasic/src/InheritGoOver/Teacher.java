package InheritGoOver;

public class Teacher extends People {
        private String skill;

        public String getSkill() {
            return skill;
        }

        public void setSkill(String skill) {
            this.skill = skill;
        }

        public void printInfo(){
            System.out.println(getName() + "具备的技能是" + skill);
        }
}
