package bg.smg;

import javax.swing.*;

public class LoginFrame extends JFrame {

    LoginFrame(){
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(40,20,100,20);
        this.add(usernameLabel);
        JTextField usernameInput = new JTextField();
        usernameInput.setBounds(140, 20, 100, 20);
        this.add(usernameInput);
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(40,60,100,20);
        this.add(passwordLabel);
        JPasswordField passwordInput = new JPasswordField();
        passwordInput.setBounds(140, 60, 100, 20);
        this.add(passwordInput);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(140, 120, 100, 20);
        this.add(loginBtn);

        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(40, 160, 100, 20);
        this.add(registerBtn);

        JButton fpBtn = new JButton("Forgotten password");
        fpBtn.setBounds(180, 160, 180, 20);
        this.add(fpBtn);

        this.setTitle("Login");
        this.setSize(400, 300);
        this.setLayout(null);
        this.setVisible(true);
    }
}
