package ATM;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accountList = new ArrayList();
    private Scanner sr = new Scanner(System.in);
    private Account loginAcc;
    public void start(){
        while (true) {
            System.out.println("----欢迎来到ATM系统------");
            System.out.println("1、用户登录 2、开户 3、退出");
            System.out.println("请选择");
            String command = sr.next();
            switch (command){
                case "1":
                    //用户登录
                    login();
                    break;
                case "2":
                    //开户
                    addAccount();
                    break;
                case "3":
                    System.out.println("退出成功！");
                    return;
                default:
                    System.out.println("暂无业务操作");
            }
        }
    }
    //开户
    private void addAccount(){
        System.out.println("您已经进入系统开户功能");
//        1、创建一个对象
        Account account = new Account();
//        2、输入信息

        System.out.println("请输入姓名");
        String userName = sr.next();
        account.setUsername(userName);

        while (true) {
            System.out.println("请输入性别");
            char sex = sr.next().charAt(0);
            if(sex =='男' || sex =='女'){
                account.setSex(sex);
                break;
            }else {
                System.out.println("输入性别有误");
            }
        }

        while(true) {
            System.out.println("请输入密码");
            String passWord = sr.next();
            System.out.println("请输入确认密码");
            String rePassword = sr.next();
            //判断密码是否一样
            if(passWord.equals(rePassword)){
                account.setPassword(passWord);
                break;
            }else {
                System.out.println("您输入密码不正确");
            }
        }

        System.out.println("请输入金额");
        double money = sr.nextDouble();
        account.setMoney(money);

        System.out.println("请输入最大额度");
        double limit = sr.nextDouble();
        account.setLimit(limit);

        //生成一个卡号自动生成
        String newCardId = addCardId();
        account.setCardId(newCardId);

//        存入到用户对象里面去
        accountList.add(account);
        System.out.println("恭喜" + account.getUsername() + "开户成功！" + "卡号为" + account.getCardId());
    }
    //返回一个8位数字卡号
    private String addCardId(){
        while (true) {
            //定义一个string变量
            String cardId = "";
            Random r = new Random();
            for (int i = 0; i < 8; i++) {
                int data = r.nextInt(10);
                cardId += data;
            }
            //判断卡号是否重复
            Account acc = getAccountById(cardId);
            if(acc == null){
                return cardId;
            }
        }
    }
//    根据卡号查询对象返回
    private Account getAccountById(String cardId){
        for (int i = 0; i < accountList.size(); i++) {
            Account ac = accountList.get(i);
            //判断账号对象卡号
            if(ac.getCardId().equals(cardId)){
                return ac;
            }
        }
        return null;
    }
    //登录
    private void login(){
        System.out.println("=========系统登录=============");
        //存在才能登录
        if(accountList.size() == 0){
            System.out.println("当前系统无任何账户！！！");
            return;
        }
        //存在账户对象
        while (true) {
            System.out.println("请输入卡号");
            String cardId = sr.next();
            Account acc = getAccountById(cardId);
            if(acc == null){
                System.out.println("您输入的登录卡号不存在，请确认！");
            }else {
                while (true) {
                    System.out.println("请您输入登录密码");
                    String passWord = sr.next();
                    if(acc.getPassword().equals(passWord)){
                        System.out.println("恭喜"+ acc.getUsername() +  "登录成功，卡号是" + acc.getCardId());
                        loginAcc = acc;
                        //展示登录后操作界面
                        showUserCommand();
                        return;
                    }else {
                        System.out.println("您输入密码不一致");
                    }
                }

            }
        }
    }
    private void showUserCommand(){
        while (true) {
            System.out.println(loginAcc.getUsername() + "您可以输入如下功能，进行账户处理");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、密码修改");
            System.out.println("6、退出");
            System.out.println("7、注销当前账户");
            System.out.println("请选择");
            String command = sr.next();
            switch (command){
                case "1":
                    showLoginAccount();
                    //查询账户
                    break;
                case "2":
                    //存款
                    SavingsAccount();
                    break;
                case "3":
                    WithdrawMoney();
                    //取款
                    break;
                case "4":
                    TransferMoney();
                    //转账
                    break;
                case "5":
                    updatePassword();
                    return;
                    //密码修改
                case "6":
                    System.out.println(loginAcc.getUsername() + "您退出系统成功！");
                    //退出
                    return;
                case "7":
                    if(AccountCancellation()){
                        return;
                    }
                    //注销当前账户
                    break;
                default:
                    System.out.println("当前输入账户不存在");
            }
        }
    }

    //展示用户信息
    private void showLoginAccount() {
        System.out.println("当前您的账户信息如下：");
        System.out.println("卡号是" + loginAcc.getCardId() + "户主" + loginAcc.getUsername() +
                "余额" + loginAcc.getMoney() + "每次取现额度" + loginAcc.getLimit());
    }
    //存款
    private void SavingsAccount(){
        System.out.println("===存钱操作===");
        System.out.println("请输入存款金额");
        double money = sr.nextDouble();
        loginAcc.setMoney(loginAcc.getMoney() + money);
        System.out.println("恭喜您，您存钱" + money + "成功！" + "存钱后余额为" + loginAcc.getMoney());
    }

    //取款
    private void WithdrawMoney(){
        System.out.println("==取钱操作==");
        //判断是否大于100元，如果不够100不让用户取钱
        if(loginAcc.getMoney() < 100){
            System.out.println("您的账户余额不足100元,不允许");
            return;
        }

        while (true) {
            System.out.println("请您输入取款金额");
            double money = sr.nextDouble();
            if(loginAcc.getMoney() >= money){
                if(money > loginAcc.getLimit()) {
                    System.out.println("超过最大额度，每次最多可取" + loginAcc.getLimit());
                }else {
                    loginAcc.setMoney(loginAcc.getMoney() - money);
                    System.out.println("您取款为" + money + "元成功，取款后剩余为" + loginAcc.getMoney());
                    break;
                }
            }else{
                System.out.println("余额不足，您的账户中的余额是" + loginAcc.getMoney());
            }
        }
    }
    //转账
    private void TransferMoney(){
        //判断系统有无其他账户
        if(accountList.size() < 2){
            System.out.println("当前系统只有一个账户");
            return;
        }
        if(loginAcc.getMoney() == 0){
            System.out.println("自己没钱别转了！！！");
        }

        while (true) {
            System.out.println("请您输入对方卡号");
            String cardId = sr.next();
            Account acc = getAccountById(cardId);
            if(acc == null){
                System.out.println("您输入对方卡号不存在");
            }else {
                //对方账户存在，继续验证
                String name = "*" + acc.getUsername().substring(1);
                System.out.println("请您输入" + name + "姓氏");
                String preName = sr.next();
                if(acc.getUsername().startsWith(preName)){
                    while (true) {
                        System.out.println("请输入转账金额");
                        double money = sr.nextDouble();
                        if(loginAcc.getMoney() >= money){
                            loginAcc.setMoney(loginAcc.getMoney() - money);
                            acc.setMoney(acc.getMoney() + money);
                            return;
                        }else {
                            System.out.println("余额不足，无法转给对方钱，最多转" + loginAcc.getMoney());
                        }
                    }
                }else {
                    System.out.println("对不起，您验证的姓氏有问题！");
                }
            }
        }
    }
//    更改密码
    private void updatePassword(){
        System.out.println("账户密码修改操作");
        while (true) {
            System.out.println("请您输入当前账户密码");
            String passWord = sr.next();
            if(loginAcc.getPassword().equals(passWord)){
                while (true) {
                    System.out.println("请您输入新密码");
                    String newPassWord = sr.next();
                    System.out.println("请您输入确认密码");
                    String okPassWord = sr.next();
                    if(newPassWord.equals(okPassWord)){
                        loginAcc.setPassword(newPassWord);
                        System.out.println("恭喜您,密码修改成功");
                        return;
                    }else {
                        System.out.println("您输入俩次密码不一致！");
                    }
                }
            }else {
                System.out.println("您当前输入的密码不正确！");
            }
        }
    }
    //销户功能
    private boolean AccountCancellation(){
        System.out.println("===进行销户操作====");
        System.out.println("请问你确定销户吗？Y/N");
        String command = sr.next();
        switch (command){
            case "Y":
                if(loginAcc.getMoney() == 0){
                    accountList.remove(loginAcc);
                    System.out.println("您的账户已经成功销户");
                    return true;
                }else {
                    System.out.println("对不起，您的账户中存着钱呢不允许销户");
                    return false;
                }
            default:
                System.out.println("好的，您的账户保留");
                return false;
        }
    }
}
