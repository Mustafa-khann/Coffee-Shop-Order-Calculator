package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderCalculatorGUI extends JFrame
{
    private Bagel bagels;
    private ToppingsPanel toppings;
    private CoffeePanel Coffee;
    private GreetingPanel banner;
    private JPanel buttonPanel;
    private JButton calcbutton;
    private JButton exitButton;
    private final double tax_rate = 0.06;

    public OrderCalculatorGUI()
    {
        setTitle("Order Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        banner = new GreetingPanel();
        bagels = new Bagel();
        toppings = new ToppingsPanel();
        Coffee = new CoffeePanel();

        buildbuttonpanel();

        add(banner, BorderLayout.NORTH);
        add(bagels, BorderLayout.WEST);
        add(toppings, BorderLayout.CENTER);
        add(Coffee, BorderLayout.EAST);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public void buildbuttonpanel()
    {
        buttonPanel = new JPanel();

        calcbutton = new JButton("Calculate");
        exitButton = new JButton("Exit");

        calcbutton.addActionListener(new buttonlistener());
        exitButton.addActionListener(new ExitButtonListener());

        buttonPanel.add(calcbutton);
        buttonPanel.add(exitButton);
    }
    private class buttonlistener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double subtotal, tax, total;
            subtotal = bagels.getbagelcost() + toppings.getToppingsCost() +
                    Coffee.getCoffeeCost();
            tax = subtotal * tax_rate;
            total = subtotal + tax;
            JOptionPane.showMessageDialog(null,
                    String.format("Subtotal : $%,.2f\n" +
                            "Tax : $%,.2f\n" +
                            "Total : $%,.2f",subtotal,tax,total));

        }

    }
    private class ExitButtonListener implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            System.exit(0);
        }
    }

}
