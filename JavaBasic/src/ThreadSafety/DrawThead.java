package ThreadSafety;
/**
 * 线程类
 * */
public class DrawThead extends Thread{
    private Account account;
    @Override
    public void run(){
        //取钱
        account.drawMoney(100000);
    }
    public DrawThead(Account account,String name){
        super(name);
        this.account = account;
    }
}
