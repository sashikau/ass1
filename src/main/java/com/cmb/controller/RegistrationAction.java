package com.cmb.controller;

import javax.swing.*;
import java.awt.*;

public class RegistrationAction extends JPanel{

    private JPanel inputPanel;
    private JPanel buttonPanel;
    private JPanel searchCriteriaPanel;
    private JPanel patientListView;

    public RegistrationAction(){

        Dimension dimension = getPreferredSize();
        dimension.width = 250;
        setPreferredSize(dimension);

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

        gc.gridx=0;
        gc.gridy=0;
        gc.weightx=1;
        gc.weighty=1;
        gc.fill = GridBagConstraints.NONE;

    }

}
