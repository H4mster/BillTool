package gui.listener;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
 
import gui.panel.BackupPanel;
import gui.panel.CategoryPanel;
import gui.panel.ConfigPanel;
import gui.panel.SpendPanel;
import gui.panel.MainPanel;
import gui.panel.RecordPanel;
import gui.panel.RecoverPanel;
import gui.panel.ReportPanel;
 
public class ToolBarListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        MainPanel p = MainPanel.instance;
        JButton b = (JButton) e.getSource();
        p.workingPanel.setRate(0.8);
        
        if (b == p.bReport) {
            p.workingPanel.setRate(1);
            MainPanel.showPanel(ReportPanel.instance);
        }
        
        if (b == p.bCategory) {
            MainPanel.showPanel(CategoryPanel.instance);
        }
        
        if (b == p.bSpend) {
            MainPanel.showPanel(SpendPanel.instance);
        }
            
        if (b == p.bRecord) {
            MainPanel.showPanel(RecordPanel.instance);
        }
            
        if (b == p.bConfig) {
            MainPanel.showPanel(ConfigPanel.instance);
        }
            
        if (b == p.bBackup) {
            MainPanel.showPanel(BackupPanel.instance);
        }
            
        if (b == p.bRecover) {
            MainPanel.showPanel(RecoverPanel.instance);
        }

    }
}