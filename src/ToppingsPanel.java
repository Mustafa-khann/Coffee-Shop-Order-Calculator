package com.company;

import javax.swing.*;
import java.awt.*;

public class ToppingsPanel extends JPanel
{
    public final double cream_cheese = 0.50;
    public final double butter = 0.25;
    public final double peach_jelly = 0.75;
    public final double blueberry_jam = 0.75;

    private JCheckBox creamcheese;
    private JCheckBox Butter;
    private JCheckBox PeachJelly;
    private JCheckBox blueberryJam;

    public ToppingsPanel()
    {
        setLayout(new GridLayout(4,1));
        creamcheese = new JCheckBox("Cream Cheese");
        Butter = new JCheckBox("Butter");
        PeachJelly = new JCheckBox("Peach Jelly");
        blueberryJam = new JCheckBox("BlueBerry Jam");

        setBorder(BorderFactory.createTitledBorder("Toppings"));

        add(creamcheese);
        add(Butter);
        add(PeachJelly);
        add(blueberryJam);
    }
    public double getToppingsCost()
    {
        double toppingCost = 0.0;
        if(creamcheese.isSelected())
        {
            toppingCost+=cream_cheese;
        }
        if(Butter.isSelected())
        {
            toppingCost+=butter;
        }
        if(PeachJelly.isSelected())
        {
            toppingCost+=peach_jelly;
        }
        if(blueberryJam.isSelected())
        {
        toppingCost+=blueberry_jam;
        }
        return toppingCost;
    }

}
