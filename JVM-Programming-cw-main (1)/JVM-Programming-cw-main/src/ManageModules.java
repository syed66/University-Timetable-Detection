import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageModules {
    private JPanel manageModulesPanel;
    private JTextField addModuleField;
    private JComboBox programmeCombo;
    private JComboBox yearCombo;
    private JButton addModuleButton;
    private JComboBox editModuleCombo;
    private JComboBox termCombo;
    private JComboBox changeProgrammeCombo;
    private JTextField changeNameField;
    private JComboBox changeYearCombo;
    private JComboBox changeTermCombo;
    private JButton confirmChangesButton;
    private JComboBox deleteModuleCombo;
    private JButton confirmDeleteButton;

    public ManageModules() {
        addModuleButton.addActionListener(new ActionListener() {
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

    public static void startModulesGui(){
        JFrame frame = new JFrame("ManageModules");
        frame.setContentPane(new ManageModules().manageModulesPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
