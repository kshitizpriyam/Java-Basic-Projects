//Kshitiz Priyam Area of Circle Assignment Code

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class area extends JFrame {
    JTextField rad;
    JLabel Lblresult;
    JButton btnarea;

    public area(){
        rad = new JTextField();
        rad.setBounds(100,50,100,20);

        JLabel lblName =  new JLabel("Enter a radius : ");
        lblName.setBounds(10,50,100,20);

        Lblresult = new JLabel();

        Lblresult.setBounds(100,150,250,20);

        btnarea = new JButton("Calculate");
        btnarea.setBounds(100,100,100,20);

        btnarea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double rad1  = Double.parseDouble(rad.getText());
                double area = 3.14*rad1*rad1;
                Lblresult.setText("Area of circle = "+ area);
            }
        });

        add(rad);
        add(Lblresult);
        add(btnarea);
        setSize(300,500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args){
        new area();
    }
}