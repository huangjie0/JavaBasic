package SetProgression;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Iterator;

/**
 * list接口
 */

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("蜘蛛侠");
        list.add("的奋斗");
        list.add("士大夫大师傅");
        list.add("的奋斗");
        System.out.println(list);

        //list接口的方法实现
//        1、add方法在其中插入数据
        list.add(2,"小明");
        System.out.println(list);
        //remove根据索引删除元素
        System.out.println(list.remove(2));
        System.out.println(list);
        //根据元素位置取元素
        String s = list.get(3);
        System.out.println(s);
        //修改某个元素值set
        list.set(2,"艾蓬");
        System.out.println(list);
        //list集合遍历方式list集合有索引可以使用for遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
//        ...其他几种与collection一致，迭代器，增强for循环遍历，foreach遍历
        for (String s1 : list) {
            System.out.println(s1);
        }

        list.forEach(System.out::println);
        System.out.println("---------------------------------------");
        Iterator<String> i = list.listIterator();
        while(i.hasNext()){
            String s1 = i.next();
            System.out.println(s1);
        }
        //ArrayList和LinkList集合特点和区别
//        ArrayList实现是数组扩容方式，LinkList实现方式是双链表实现（头尾增删最快）查询慢从头寻找
//        LinkList常用方法
        //创建队列
        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("第1号人");
        queue.addLast("第2号人");
        queue.addLast("第3号人");
        System.out.println(queue);
        //出队
        queue.removeFirst();
        queue.removeFirst();
        //栈

    }
}
