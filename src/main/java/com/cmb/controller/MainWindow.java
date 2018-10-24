package com.cmb.controller;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private InputPanel inputPanel;
    private ButtonPanel buttonPanel;
    private  SearchCriteriaPanel searchCriteriaPanel;
    private PatientListView patientListView;

    public MainWindow(){

        super("Patient Registration");

        inputPanel = new InputPanel();
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(inputPanel, BorderLayout.WEST);

        setSize(600,500);
        setVisible(true);

    }
}
