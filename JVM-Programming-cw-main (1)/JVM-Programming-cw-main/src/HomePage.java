import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage {
    private JButton btnViewTimetables;
    private JButton btnManageProgrammes;
    private JButton manageModulesButton;
    private JButton manageActivitiesButton;
    private JPanel homePanel;


    public HomePage() {
        btnViewTimetables.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewTimetables viewTimetables = new ViewTimetables();
                viewTimetables.startTimetablesGui();
            }
        });
        btnManageProgrammes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManageProgrammes manageProgrammes = new ManageProgrammes();
                manageProgrammes.startProgrammesGui();
            }
        });
        manageModulesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManageModules manageModules = new ManageModules();
                manageModules.startModulesGui();
            }
        });
        manageActivitiesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManageActivities manageActivities = new ManageActivities();
                manageActivities.startActivitiesGui();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HomePage");
        frame.setContentPane(new HomePage().homePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
