import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    JPanel panel ;
    JLabel lbl1, lbl2, lblMessage ;

    JTextField tfUserName ;
    JPasswordField pfPassword ;
    JButton btnLogin, btnCancel ;

    public login () {
        lbl1 = new JLabel("User Name ");
        tfUserName = new JTextField();

        lbl2 = new JLabel("Password ");
        pfPassword = new JPasswordField();

        btnLogin = new JButton("Login") ;
        btnCancel = new JButton("Cancel") ;

        panel = new JPanel(new GridLayout(3,1));

        lblMessage = new JLabel("");

        panel.add(lbl1);
        panel.add(tfUserName);
        panel.add(lbl2);
        panel.add(pfPassword);
        panel.add(btnLogin);
        panel.add(btnCancel);
        panel.add(lblMessage);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = tfUserName.getText();
                String password = pfPassword.getText();

                if(username.equals("admin") && password.equals("123"))
                {
                    lblMessage.setText("Log in successfully");
                }
                else
                {
                    lblMessage.setText("Invalid username / password");
                }
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        add(panel,BorderLayout.CENTER);
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new login();
    }
}