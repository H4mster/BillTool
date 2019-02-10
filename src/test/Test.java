package test;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import util.GUIUtil;

public class Test {
    public static void main(String[] args) {
        GUIUtil.useLNF();
        JDialog f = new JDialog();
        f.setTitle("刘晓兰是不是猪？");
        f.setLayout(null);
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        
        JButton b1 = new JButton("是");
        JButton b2 = new JButton("否");
        
        JLabel l = new JLabel("刘晓兰是不是猪？");
        
        f.add(l);
        f.add(b1);
        f.add(b2);
        
        l.setBounds(0, 0, 160, 30);
        b1.setSize(80, 30);
        b1.setPreferredSize(new Dimension(80, 30));
        b2.setSize(80, 30);
        
        l.setLocation(f.getWidth() / 2 - 60, f.getHeight() / 2 - 100);
        b1.setLocation(100, 150);
        b2.setLocation(220, 150);
        
        b1.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "好的呀");
            }
        });
        
        b2.addMouseListener(new MouseAdapter() {
            
            // 只有mouseEntered用到了
            public void mouseEntered(MouseEvent e) {
                int X = b2.getLocation().x;
                int Y = b2.getLocation().y;
                int x = 0;
                int y = 0;
                
                while (true) {
                    Random r = new Random();
                    x = r.nextInt(f.getWidth() - b2.getWidth() * 2);
                    y = r.nextInt(f.getHeight() - b2.getHeight() * 2);
                    if ((Math.sqrt(Math.abs(x*x-X*X))+Math.sqrt(Math.abs(y*y-Y*Y))) > 100) {
                        break;
                    }
                }
                
                b2.setLocation(x, y);
            }
        });
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(f, "请认真回答问题");
                return;
            }
        });
        
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setVisible(true);
    }
}