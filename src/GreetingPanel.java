package com.company;

import javax.swing.*;

public class GreetingPanel extends JPanel
{
    private final JLabel greeting;

    public GreetingPanel()
    {
        greeting = new JLabel("Welcome to IMCafee");
        add(greeting);
    }
}
