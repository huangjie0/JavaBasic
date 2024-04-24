package AnonymousInnerClass;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * 匿名内部类的应用场景
 * */

public class test3 {
    public static void main(String[] args) {
        //拓展java桌面编程 GUI
        //创建窗口
        JFrame win = new JFrame("登录界面");
        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");
        panel.add(btn);

        //给按钮绑定单击事件
//        btn.addActionListener(new AbstractAction(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(win,"登录一下");
//            }
//        });
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win,"登录一下"));
        win.setSize(400,400);
//        居中
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}
