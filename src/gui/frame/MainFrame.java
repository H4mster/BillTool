package gui.frame;
 
import java.awt.Color;

import javax.swing.JFrame;
 
import gui.panel.MainPanel;
import util.GUIUtil;
 
public class MainFrame extends JFrame{
    /**
     * @author H4mster
     */
    private static final long serialVersionUID = 1L;
    
    static{
        GUIUtil.useLNF();
    }
    
    public static MainFrame instance = new MainFrame();
     
    private MainFrame(){
        this.setBackground(Color.RED);
        this.setSize(500,450);
        this.setTitle("BillTool");
        this.setContentPane(MainPanel.instance);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     
    public static void main(String[] args) {
        instance.setVisible(true);
    }
     
}