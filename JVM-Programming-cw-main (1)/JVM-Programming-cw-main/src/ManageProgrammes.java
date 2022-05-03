import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageProgrammes {
    private JTextField nameField;
    private JButton addProgrammeButton;
    private JComboBox editProgrammeCombo;
    private JTextField changeNameField;
    private JTextField changeTypeField;
    private JTextField numberOfYearsField;
    private JComboBox deleteProgrammeCombo;
    private JButton confirmDeleteButton;
    private JButton confirmChangesButton;
    private JTextField typeField;
    private JPanel manageProgrammesPanel;

    public ManageProgrammes() {
        addProgrammeButton.addActionListener(new ActionListener() {
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

    public static void startProgrammesGui(){
        JFrame frame = new JFrame("ManageProgrammes");
        frame.setContentPane(new ManageProgrammes().manageProgrammesPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
