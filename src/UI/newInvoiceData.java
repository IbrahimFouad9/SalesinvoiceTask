/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import SalesModel.Invoice;
import java.util.ArrayList;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author Express
 */
public class newInvoiceData extends JDialog {
    private JTextField customerNameField;
    private JTextField invoiceDateField;
    private JLabel customerNameLabel;
    private JLabel invoiceDateLabel;
    private JButton okButton;
    private JButton cancelButton;    
    
     public newInvoiceData(BillUi frame) {
        customerNameLabel = new JLabel("Customer Name:");
        customerNameField = new JTextField(20);
        invoiceDateLabel = new JLabel("Invoice Date:");
        invoiceDateField = new JTextField(20);
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        
        okButton.setActionCommand("createInvoiceOK");
        cancelButton.setActionCommand("createInvoiceCancel");
        
        okButton.addActionListener(frame.getController());
        cancelButton.addActionListener(frame.getController());
        setLayout(new GridLayout(3, 2));
        
        add(invoiceDateLabel);
        add(invoiceDateField);
        add(customerNameLabel);
        add(customerNameField);
        add(okButton);
        add(cancelButton);
        
        pack();
        
    }
public JTextField getcustomerNameField() {
        return customerNameField;
    }

    public JTextField getinvoiceDateField() {
        return invoiceDateField;
    }
}
