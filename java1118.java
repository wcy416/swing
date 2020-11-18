package pac;

import javax.swing.*;

public class App {
    private JPanel myPanel;
    void go(){
        JFrame frame = new JFrame("App");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,300);//方法一
       // frame.setBounds(200,100,600,300);//方法二 x=200意思是窗体距离桌面的距离，相当于magrin-left的效果
//        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
       new App().go();
    }
}
