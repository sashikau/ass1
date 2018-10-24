package com.cmb.controller;

import javax.swing.*;
import java.awt.*;

public class InputPanel extends JPanel{

    private JLabel name;
    private JTextField nameField;
    private JLabel phoneNumber;
    private JTextField phoneNumberField;
    private JButton saveButton;
    private JButton claerButton;

    public InputPanel(){
        Dimension dimension = getPreferredSize();
        dimension.width = 250;
        setPreferredSize(dimension);

        Dimension dimension1 = nameField.getPreferredSize();
        dimension1.width=10;
        dimension1.height=20;
        nameField.setPreferredSize(dimension1);

        Dimension dimension2 = phoneNumberField.getPreferredSize();
        dimension2.width=10;
        dimension2.height=20;
        phoneNumberField.setPreferredSize(dimension2);

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

        //First row

        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.NONE;

        gc.anchor = GridBagConstraints.LINE_START;
        add(name, gc);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        add(nameField, gc);

        //Second row

        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(phoneNumber, gc);

        gc.gridx = 1;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(phoneNumberField, gc);

        //
        gc.weightx = 1;
        gc.weighty = 2.0;

        gc.gridx = 2;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(saveButton, gc);


    }
}
