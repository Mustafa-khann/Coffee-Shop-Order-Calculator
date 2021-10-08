package com.company;

import javax.swing.*;
import java.awt.*;

public class Bagel extends JPanel
{
    public double white_bagel = 1.25;
    public double wheat_bagel = 1.50;
    public double brown_bagel = 2.10;

    private JRadioButton whitebagel;
    private JRadioButton wheatbagel;
    private JRadioButton brownbagel;

    ButtonGroup buttonGroup;

    public Bagel()
    {
        setLayout(new GridLayout(3,1));

        whitebagel = new JRadioButton("White",true);
        wheatbagel = new JRadioButton("Wheat");
        brownbagel = new JRadioButton("Brown");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(wheatbagel);
        buttonGroup.add(whitebagel);
        buttonGroup.add(brownbagel);

        setBorder(BorderFactory.createTitledBorder("Bagel"));

        add(wheatbagel);
        add(wheatbagel);
        add(brownbagel);
    }
    public double getbagelcost()
    {
        double bagelcost = 0.0;

        if(whitebagel.isSelected())
        {
            bagelcost=white_bagel;
        }
        else if (wheatbagel.isSelected())
        {
            bagelcost=wheat_bagel;
        }
        else
        {
            bagelcost=brown_bagel;
        }
        return bagelcost;
    }

}
