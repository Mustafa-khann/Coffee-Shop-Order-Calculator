package com.company;

import javax.swing.*;
import java.awt.*;

public class CoffeePanel extends JPanel
{
    public final double no_coffee = 0.0;
    public final double regular_coffee = 1.25;
    public final double decaf_coffee = 1.25;
    public final double cappuccinoprice = 2.0;

    private JRadioButton noCoffee;
    private JRadioButton regularcoffee;
    private JRadioButton decafCoffee;
    private JRadioButton Cappuiccino;

    private ButtonGroup buttonGroup;
    public CoffeePanel()
    {
        setLayout(new GridLayout(4,1));

        noCoffee = new JRadioButton("No Coffee");
        regularcoffee = new JRadioButton("Regular ");
        decafCoffee = new JRadioButton("Decaf Coffee");
        Cappuiccino = new JRadioButton("Cappuccino");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(noCoffee);
        buttonGroup.add(regularcoffee);
        buttonGroup.add(decafCoffee);
        buttonGroup.add(Cappuiccino);

        add(noCoffee);
        add(regularcoffee);
        add(decafCoffee);
        add(Cappuiccino);

    }
    public double getCoffeeCost()
    {
        double coffeecost = 0.0;
        if(noCoffee.isSelected())
        {
            coffeecost = no_coffee;
        }
        else if(regularcoffee.isSelected())
        {
            coffeecost = regular_coffee;
        }
        else if(decafCoffee.isSelected())
        {
            coffeecost = decaf_coffee;
        }
        else if(Cappuiccino.isSelected())
        {
            coffeecost = cappuccinoprice;
        }
        return coffeecost;
    }
}
