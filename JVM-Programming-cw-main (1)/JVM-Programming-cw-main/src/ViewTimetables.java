import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewTimetables {
    private JPanel viewTimetablePanel;
    private JTextArea txtTimetables;
    private JComboBox selectProgrammeCombo;
    private JComboBox selectModuleCombo;
    private JButton homePageButton;
    private JButton manageProgrammeModuleButton;
    private JComboBox selectYearCombo;
    private JButton viewButton;
    private JComboBox selectTermCombo;

    public ViewTimetables() {
        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void startTimetablesGui(){
        JFrame frame = new JFrame("viewTimetables");
        frame.setContentPane(new ViewTimetables().viewTimetablePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
