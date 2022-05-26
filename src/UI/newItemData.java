/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class newItemData extends JDialog{
    
     private JTextField itemNameField;
    private JTextField itemQtyField;
    private JTextField itemPriceField;
    private JLabel itemNameLabel;
    private JLabel itemCountLabel;
    private JLabel itemPriceLabel;
    private JButton okButton;
    private JButton cancelButton;
      public newItemData(BillUi frame) {
        itemNameField = new JTextField(20);
        itemNameLabel = new JLabel("Item Name");
        
        itemQtyField = new JTextField(20);
        itemCountLabel = new JLabel("Item Count");
        
        itemPriceField = new JTextField(20);
        itemPriceLabel = new JLabel("Item Price");
        
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        
        okButton.setActionCommand("createOK");
        cancelButton.setActionCommand("createLineCancel");
        
        okButton.addActionListener(frame.getController());
        cancelButton.addActionListener(frame.getController());
        setLayout(new GridLayout(4, 2));
        
        add(itemNameLabel);
        add(itemNameField);
        add(itemCountLabel);
        add(itemQtyField);
        add(itemPriceLabel);
        add(itemPriceField);
        add(okButton);
        add(cancelButton);
        
        pack();
    }

    public JTextField getItemNameField() {
        return itemNameField;
    }

    public JTextField getItemQtyField() {
        return itemQtyField;
    }

    public JTextField getItemPriceField() {
        return itemPriceField;
    }
    
}
