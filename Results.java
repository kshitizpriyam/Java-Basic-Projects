//Kshitiz Priyam Grades of STudents Assignment Code

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Results extends JFrame{

    JTextField m1, m2, m3, m4, m5;
    JLabel lblResult, lblm1, lblm2, lblm3, lblm4, lblm5;
    JButton btnResult;

    public Results(){

        m1 = new JTextField();
        m1.setBounds(150,50,100,10);
        m2 = new JTextField();
        m2.setBounds(150,70,100,10);
        m3 = new JTextField();
        m3.setBounds(150,90,100,10);
        m4 = new JTextField();
        m4.setBounds(150,110,100,10);
        m5 = new JTextField();
        m5.setBounds(150,130,100,10);

        lblm1 = new JLabel("Enter marks of subject-1: ");
        lblm1.setBounds(50,50,100,10);
        lblm2 = new JLabel("Enter marks of subject-2: ");
        lblm2.setBounds(50,70,100,10);
        lblm3 = new JLabel("Enter marks of subject-3: ");
        lblm3.setBounds(50,90,100,10);
        lblm4 = new JLabel("Enter marks of subject-4: ");
        lblm4.setBounds(50,110,100,10);
        lblm5 = new JLabel("Enter marks of subject-5: ");
        lblm5.setBounds(50,130,100,10);

        btnResult = new JButton("Calculate");
        btnResult.setBounds(100,150,100,20);

        btnResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(m1.getText());
                int n2 = Integer.parseInt(m2.getText());
                int n3 = Integer.parseInt(m3.getText());
                int n4 = Integer.parseInt(m4.getText());
                int n5 = Integer.parseInt(m5.getText());

                int total = n1 + n2 + n3 + n4 + n5;
                lblResult.setText("Total Marks = " + total);

                int percentage = (total/500)*100;
                lblResult.setText("Percentage = "+percentage);

                if(percentage >= 95){
                    lblResult.setText("Grade = A");
                }

                else if(85 <= percentage && percentage < 95){
                    lblResult.setText("Grade = B");
                }

                else if(75 <= percentage && percentage< 85){
                    lblResult.setText("Grade = C");
                }

                else if(65 <= percentage && percentage< 75){
                    lblResult.setText("Grade = D");
                }

                else if(55 <= percentage && percentage < 65){
                    lblResult.setText("Grade = E");
                }

                else{
                    lblResult.setText("Grade = F");
                }
            }
        });
    }

}
