package ThreadSafety;
/**
 * 账户类
 * */

public class Account {
    private double money; //余额
    private String carId;//卡号

    public Account(double money, String carId) {
        this.money = money;
        this.carId = carId;
    }

    public Account() {
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
    public void drawMoney(double money){
        String name = Thread.currentThread().getName();
        if(this.money >= money){
            System.out.println(name + "来取钱" + money + "成功！");
            this.money-=money;
            System.out.println(name + "取钱后余额剩余" + this.money);
        }else {
            System.out.println(name + "余额不足");
        }
    }
}
