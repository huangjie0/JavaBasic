package returnDemo;

public class returnDemo {
    public static void main(String[] args) {
//        return单独使用在无返回值作用，立即跳出程序
        System.out.println("程序开始---");
        chu(10,0);
        System.out.println("程序结束---");
    }
    public static void chu(int a,int b){
        if(b == 0){
            System.out.println("分母不能为0");
            return;
        }
        int c = a/b;
        System.out.println("除法结果是" + c);
    }
}
