import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc extends JFrame {
    JTextField t1, t2 ;
    JLabel lblResult ;
    JButton btnAdd, btnSub;

    public calc() {
        t1 = new JTextField();
        t1.setBounds(10,50,100,20);

        t2 = new JTextField();
        t2.setBounds(150,50,100,20);

        lblResult = new JLabel();
        lblResult.setBounds(250,50,100,20);

        btnAdd = new JButton("+");
        btnAdd.setBounds(10,100,100,20);

        btnSub = new JButton("-");
        btnSub.setBounds(10,180,100,20);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt( t1.getText());
                int num2 = Integer.parseInt( t2.getText());
                int result = num1 + num2 ;
                lblResult.setText(" Result = " + result);
            }
        });

        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt( t1.getText());
                int num2 = Integer.parseInt( t2.getText());
                int result = num1 - num2 ;
                lblResult.setText(" Result = " + result);
            }
        });

        add(t1);
        add(t2);
        add(lblResult);
        add(btnAdd);
        add(btnSub);
        setSize(300,500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new calc();
    }
}