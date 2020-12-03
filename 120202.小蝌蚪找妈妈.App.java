import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_son=new JLabel();
    JLabel label_monther=new JLabel();
    JLabel label_bj=new JLabel();
    int aa=64;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()==e.VK_UP){
                    label_son.setBounds(label_son.getX(),label_son.getY()-aa,aa,aa);
                }
                if (e.getKeyCode()==e.VK_DOWN){
                    label_son.setBounds(label_son.getX(),label_son.getY()+aa,aa,aa);
                }
                if (e.getKeyCode()==e.VK_LEFT){
                    label_son.setBounds(label_son.getX()-aa,label_son.getY(),aa,aa);
                }
                if (e.getKeyCode()==e.VK_RIGHT){
                    label_son.setBounds(label_son.getX()+aa,label_son.getY(),aa,aa);
                }
                if(label_monther.getX()==label_son.getX()&&label_monther.getY()==label_son.getY()){
                    System.out.println("恭喜你们相遇了！");
                }
            }
        });

    }
    //显示窗体方法
    void go(){
//        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);
//显示青蛙妈妈的图片
        java.net.URL imgURL = App.class.getResource("img/mother.png");
        label_monther.setIcon(new ImageIcon(imgURL));
        label_monther.setBounds(130,500,aa,aa);
        myPanel.add(label_monther);
//显示蝌蚪的图片
        java.net.URL imgURL2 = App.class.getResource("img/son.png");
        label_son.setIcon(new ImageIcon(imgURL2));
        label_son.setBounds(0,0,aa,aa);
        myPanel.add(label_son);
//显示背景图图片
        myPanel.setLayout(null);
        java.net.URL imgURL1 = App.class.getResource("img/background.png");
        label_bj.setIcon(new ImageIcon(imgURL1));
        label_bj.setBounds(0,0,1024,768);
        myPanel.add(label_bj);



        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1024,768);
        //frame.pack();
        frame.setVisible(true);

        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以


    }
    public static void main(String[] args) {
        new App().go();
    }
}
