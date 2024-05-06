import javax.swing.*;

public class GUIForm {
    private JPanel panel;
    private JTextField var1;
    private JTextField var2;
    private JButton submitButton;
    private JLabel answer;

    public JTextField getVar1() {
        return var1;
    }

    public JTextField getVar2() {
        return var2;
    }

    public JLabel getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer.setText(answer);
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public JPanel getPanel() {
        return panel;
    }
}
