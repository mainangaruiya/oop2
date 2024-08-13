import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GenderSelectionUI {

    public static void main(String[] args) {
        // Create a JFrame instance
        JFrame frame = new JFrame("Gender Selection");

        // Create a JPanel to hold components
        JPanel panel = new JPanel();

        // Create radio buttons for Male and Female
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");

        // Group the radio buttons
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        // Create a submit button
        JButton submitButton = new JButton("Submit");

        // Add components to the panel
        panel.add(maleButton);
        panel.add(femaleButton);
        panel.add(submitButton);

        // Add panel to the frame
        frame.add(panel);

        // Set up the frame
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Add action listener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check which radio button is selected
                if (maleButton.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "Selected: Male");
                } else if (femaleButton.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "Selected: Female");
                } else {
                    JOptionPane.showMessageDialog(frame, "No gender selected");
                }
            }
        });
    }
}
