package ATMGoOver;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts =  new ArrayList<>();
    private Scanner sc =  new Scanner(System.in);

    private  Account loginAcc;

    //启动
    public void start(){
        while (true) {
            System.out.println("欢迎您进入到了ATMx系统");
            System.out.println("1,用户登录");
            System.out.println("2,用户开户");
            System.out.println("请选择");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    login();
                    //用户登录
                    break;
                case 2:
                    //用户开户
                    createAccount();
                    break;
                default:
                    System.out.println("没有该操作");
            }
        }
    }
   //登录
   private void login(){
        System.out.println("===系统登录===");
        if(accounts.size() == 0){
            System.out.println("未开户，请去开户！");
           return;
        }
       while (true) {
           System.out.println("请您输入您的卡号");
           String cardId = sc.next();
           Account acc = getAccountByCardId(cardId);
           if(acc == null){
               System.out.println("您输入的登录卡号不存在，请确认！！！");
           }else {
               while (true) {
                   System.out.println("请您输入登录密码");
                   String password = sc.next();
                   if(acc.getPassword().equals(password)){
                        loginAcc = acc;
                        System.out.println("恭喜您：" + acc.getUserName() + "成功登录了系统，您的卡号是" + acc.getCardId());
                        //展示登录后操作界面
                       showUserInfo();
                       return;
                   }else {
                       System.out.println("您输入的密码不正确");
                   }
               }
           }
       }
   }

   private void showUserInfo(){
       while (true) {
           System.out.println(loginAcc.getUserName() + "您可以选择如下功能进行账户处理");
           System.out.println("1,查询 2,存款 3,取款 4,转账 5,密码修改 6,退出 7,注销当前用户");
           int command = sc.nextInt();
           switch (command){
               case 1:
                   showInfo();
    //               查询
                   break;
               case 2:
                   SavingsAccount();
    //               存款
                   break;
               case 3:
                   withdrawMoney();
    //               取款
                   break;
               case 4:
                   transferMoney();
    //               转账
                   break;
               case 5:
    //               密码修改
                   break;
               case 6:
                   System.out.println(loginAcc.getUserName() + "您退出系统成功！");
    //               退出
                   return;
               case 7:
    //               注销当前用户
                   break;
               default:
                   System.out.println("您当前输入的命令不存在，请确认！");
           }
       }
   }
   //展示当前的登录信息
    private void showInfo(){
        System.out.println("当前的信息如下：");
        System.out.println("卡号是" + loginAcc.getCardId());
        System.out.println("户主是" + loginAcc.getUserName());
        System.out.println("性别是" + loginAcc.getSex());
        System.out.println("余额是" + loginAcc.getMoney());
        System.out.println("每次最大额度" + loginAcc.getLimit());
    }
    //存款
    private void SavingsAccount(){
        System.out.println("存款操作");
        System.out.println("请您输入存款金额");
        double money = sc.nextDouble();

        //更新当前账户的余额
        loginAcc.setMoney(loginAcc.getMoney() + money);
        System.out.println("恭喜您，您的存款是余额是："+ loginAcc.getMoney());
    }

    //取款
    private void withdrawMoney(){
        System.out.println("取钱操作");
        if(loginAcc.getMoney() < 100){
            System.out.println("您的账户不足100元，不允许取钱！");
            return;
        }
        while (true) {
            System.out.println("请您输入取款金额");
            double m = sc.nextDouble();
            if(loginAcc.getMoney() >= m){
                if(m > loginAcc.getLimit()){
                    System.out.println("当前取款金额超过每次限额，每次最多可取" + loginAcc.getLimit());
                }else {
                    loginAcc.setMoney(loginAcc.getMoney() - m );
                    System.out.println("您取款" + m + "成功，取款后您的余额是" + loginAcc.getMoney());
                    break;
                }
            }else {
                System.out.println("余额不足，您的账户余额是" + loginAcc.getMoney());
            }
        }
    }
//    转账功能
    private void transferMoney(){
        System.out.println("==用户转账==");
        if(accounts.size() < 2){
            System.out.println("当前系统只有一个账户");
            return;
        }
//        判断账户是否有钱
        if(loginAcc.getMoney() == 0){
            System.out.println("您自己的账户都没有钱，就别转了");
        }

        while (true) {
            System.out.println("请您输入对方的卡号");
            String cardId = sc.next();

            Account acc = getAccountByCardId(cardId);
            if(acc == null){
                System.out.println("您输入的对方卡号不存在！");
            }else {
                String name = "*" + acc.getUserName().substring(1);

                System.out.println("请您输入" + name + "的姓氏");

                String preName = sc.next();
                //判断名字是否相等
                if(acc.getUserName().startsWith(preName)){
                    while (true) {
                        System.out.println("请您输入给对方转账的金额");
                        double money = sc.nextDouble();
                        if(loginAcc.getMoney() >= money){
                            loginAcc.setMoney(loginAcc.getMoney() - money);
                            acc.setMoney(acc.getMoney() + money);
                            return;
                        }else {
                            System.out.println("您的余额不足，无法给对方转账！" + loginAcc.getMoney());
                        }
                    }
                }else {
                    System.out.println("对不起，您认证的姓氏有问题！");
                }
            }
        }

    }
    //开户
    private void createAccount(){
        System.out.println("系统开户操作开始咯");
        //创建对象
        Account acc = new Account();
        //手动输入赋值
        System.out.println("请您输入账户名称");
        String userName = sc.next();
        acc.setUserName(userName);

        while (true) {
            System.out.println("请您输入账户性别");
            char sex = sc.next().charAt(0);
            if(sex == '男' || sex == '女'){
                acc.setSex(sex);
                break;
            }else {
                System.out.println("您输入的性别有误，只能是男或者女！");
            }
        }

        while (true) {
            System.out.println("请您输入账户密码");
            String password = sc.next();
            System.out.println("请您输入账户确认密码");
            String okPassword = sc.next();
            //判断俩次密码是否一致
            if(okPassword.equals(password)){
                acc.setPassword(okPassword);
                break;
            }else {
                System.out.println("您输入的俩次密码不一致！请重新输入");
            }
        }

        System.out.println("请您输入您的取现额度");
        double limit = sc.nextDouble();
        acc.setLimit(limit);
        //生成一个卡号
        String newCardId = setCard();
        acc.setCardId(newCardId);
        //将对象存入集合中去
        accounts.add(acc);
        System.out.println("恭喜您，" + acc.getUserName() + "开户成功，您的卡号是：" + acc.getCardId());
    }
    private String setCard (){
        while (true) {
            String CardId = "";
            Random r = new Random();
            for (int i = 0; i < 8; i++) {
               int data = r.nextInt(10);
                CardId += data;
            }
            //根据卡号查帐户账号
            Account acc = getAccountByCardId(CardId);
            if(acc == null){
                return CardId;
            }
        }
    }
    //根据用户对象查是否存在
    private Account getAccountByCardId(String cardId){
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if(cardId.equals(acc.getCardId())) return acc;
        }
        return null;
    }
}
