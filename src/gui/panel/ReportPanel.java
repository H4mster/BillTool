package gui.panel;
 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import entity.Record;
import service.ReportService;
import util.ChartUtil;
import util.GUIUtil;
 
public class ReportPanel extends WorkingPanel {
    /**
     * @author H4mster
     */
    private static final long serialVersionUID = 1L;

    static {
        GUIUtil.useLNF();
    }
 
    public static ReportPanel instance = new ReportPanel();
 
    public JLabel l = new JLabel();
 
    public ReportPanel() {
        Dimension d = MainPanel.instance.workingPanel.getSelfSize();
        this.setSize(d.width, d.height);
        this.setLayout(new BorderLayout());
        Image i = ChartUtil.getImage(this.getWidth(), this.getHeight());
        this.setBackground(Color.RED);
        ImageIcon icon= new ImageIcon(i);
        l.setIcon(icon);
        this.add(l);
    }
 
    public static void main(String[] args) {
        GUIUtil.showPanel(ReportPanel.instance, 1);
    }

    @Override
    public void updateData() {
        // TODO Auto-generated method stub
        List<Record> rs = new ReportService().listThisMonthRecords(); 
        Image i = ChartUtil.getImage(rs, this.getWidth(), this.getHeight());
        ImageIcon icon = new ImageIcon(i);
        l.setIcon(icon);
    }

    @Override
    public void addListener() {
        // TODO Auto-generated method stub
        
    }
 
}