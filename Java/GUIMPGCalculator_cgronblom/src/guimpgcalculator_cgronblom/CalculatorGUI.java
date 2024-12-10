package guimpgcalculator_cgronblom;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class CalculatorGUI extends JFrame {
    
    private int width = 600;
    private int height = 400;

    private JButton calculateButton;
    JLabel milesLabel;
    JTextField milesField;
    JLabel galLabel;
    JTextField galField;

    Container c;
    FlowLayout flowLayout;

    public CalculatorGUI(){

        c = getContentPane();

        flowLayout = new FlowLayout();

        c.setLayout(flowLayout);

        calculateButton = new JButton("Calculate");
        milesLabel = new JLabel("Miles traveled:");
        milesField = new JTextField(10);
        galLabel = new JLabel("Gallons used:");
        galField = new JTextField(10);
    }

    public void loadGUI(){
        setSize(width, height);
        setTitle("MPG Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loadButtonListeners();

        c.add(milesLabel);
        c.add(milesField);
        c.add(galLabel);
        c.add(galField);
        c.add(calculateButton);
        setVisible(true);
    }

    private void loadButtonListeners(){
        ActionListener calcListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                System.out.println("no");
            }
        };

        calculateButton.addActionListener(calcListener);
    }   
    
    
}
