package CodeBlock;

public class Test {
    public static void main(String[] args) {
        System.out.println(CodeBlock.number);
        System.out.println(CodeBlock.number);
        System.out.println(CodeBlock.number);
        System.out.println(CodeBlock.school);
        System.out.println("------------------------");
//        先执行实例代码块再执行构造器
        CodeBlock c = new CodeBlock();
        CodeBlock c1 = new CodeBlock("黄杰");
    }
}
