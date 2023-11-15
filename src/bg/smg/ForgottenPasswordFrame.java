package bg.smg;

import javax.swing.*;

public class ForgottenPasswordFrame extends JFrame {

    ForgottenPasswordFrame(){

        JButton btn = new JButton("Set new password");
        btn.setBounds(130, 100, 100, 40);
        this.add(btn);
        this.setSize(400, 300);
        this.setLayout(null);
        this.setVisible(true);
    }
}
