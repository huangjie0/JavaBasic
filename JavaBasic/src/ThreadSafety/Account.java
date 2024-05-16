package ThreadSafety;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 账户类
 * */

public class Account {
    private double money; //余额
    private String carId;//卡号
    //锁对象，多态写法
    private final Lock lk = new ReentrantLock();

    public Account(double money, String carId) {
        this.money = money;
        this.carId = carId;
    }

    public Account() {
    }

    public static void test(){
        synchronized (Account.class){

        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }
    //使用同步方法进行加锁操作
    public void drawMoney(double money){
        String name = Thread.currentThread().getName();
        lk.lock(); //加锁
//        this代表共享资源
//        synchronized (this) {
        try {
            if(this.money >= money){
                System.out.println(name + "来取钱" + money + "成功！");
                this.money-=money;
                System.out.println(name + "取钱后余额剩余" + this.money);
            }else {
                System.out.println(name + "余额不足");
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            //解锁
            lk.unlock();
        }
//        }

    }
}
