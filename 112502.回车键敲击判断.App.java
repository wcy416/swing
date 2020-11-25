import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Shubiao {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public Shubiao() {
        textArea_A.setText("我是谁");
        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (textArea_A.getText().equals("我是谁")){
                        textArea_B.setText("王彩艳\n");
                    }
                    else {
                        textArea_B.append("错误!\n");
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    textArea_A.setText("");
                    textArea_B.setText("");
                }

            }
        });
    }
    //显示窗体方法
    void go(){
        textArea_A.setBounds(100,100,256,128);
        textArea_A.setBackground(Color.PINK);
        myPanel.add(textArea_A);
        textArea_B.setBounds(100,300,256,128);
        textArea_B.setBackground(Color.green);
        myPanel.add(textArea_B);
        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Shubiao().go();
    }
}
