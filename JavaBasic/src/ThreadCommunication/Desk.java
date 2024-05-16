package ThreadCommunication;

import java.util.ArrayList;
import java.util.List;

public class Desk {
    private List<String> list = new ArrayList<>();

    //放一个包子
    public synchronized void put(){
        try {
            String name = Thread.currentThread().getName();
            if(list.size() == 0){
                list.add(name + "做的肉包子！");
                System.out.println(name + "做的肉包子！");
                Thread.sleep(2000);

                this.notifyAll();
                this.wait();

            }else {
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    吃货1，吃货2
    public synchronized void get(){
        String name = Thread.currentThread().getName();
        try {
            if(list.size() == 1){
                System.out.println(name + "吃了：" + list.get(0));
                list.clear();
                Thread.sleep(1000);
                this.notifyAll();
                this.wait();
            }else {
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
