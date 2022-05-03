import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageActivities {
    private JPanel manageActivitesPanel;
    private JComboBox moduleCombo;
    private JComboBox dayCombo;
    private JComboBox timeCombo;
    private JComboBox durationCombo;
    private JComboBox optionalityCombo;
    private JButton addActivityButton;
    private JComboBox activityCombo;
    private JComboBox changeTypeCombo;
    private JComboBox changeModuleCombo;
    private JComboBox changeDayCombo;
    private JComboBox changeTimeCombo;
    private JComboBox changeDurationCombo;
    private JComboBox changeOptionalityCombo;
    private JButton confirmChangesButton;
    private JComboBox deleteActivityCombo;
    private JButton confirmDeleteButton;
    private JComboBox activityToChange;

    public ManageActivities() {
        addActivityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        confirmChangesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        confirmDeleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void startActivitiesGui(){
        JFrame frame = new JFrame("ManageActivities");
        frame.setContentPane(new ManageActivities().manageActivitesPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
