package EnumerationApplicationScenario;

public class test {
    public static void main(String[] args) {
        check(Index2.GIRL);
    }
    public static void check(Index2 sex){
        switch (sex){
            case BOY:
                System.out.println("展示一些美女图片@@");
                break;
            case GIRL:
                System.out.println("展示一些帅哥图片！~！！");
                break;
            }
    }
}
