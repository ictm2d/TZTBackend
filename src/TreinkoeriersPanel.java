

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class TreinkoeriersPanel extends JDialog implements ActionListener{

    private JLabel lblTitel, lblNaam, lblAdres, lblPostcode, lblWoonplaats, lblTelnr, lblEmail, lblId, lblVerklaring;
    private JButton btnId, btnVerklaring, btnOpslaan;
    private JTextField txtNaam, txtAdres, txtPostcode, txtWoonplaats, txtTelnr, txtEmail;
    
    public TreinkoeriersPanel(){
    
        this.setTitle("Treinkoeriers Beheren");
        this.setSize(500, 600);
        this.setLayout(new GridLayout(0,4));
        

        this.lblTitel = new JLabel("Treinkoerier Wijzigen");
        this.lblNaam = new JLabel("Naam:");
        this.lblAdres = new JLabel("Adres:");
        this.lblPostcode = new JLabel("Postcode:");
        this.lblWoonplaats = new JLabel("Woonplaats:");
        this.lblTelnr = new JLabel("Telefoon Nummer:");
        this.lblEmail = new JLabel("Email:");
        this.lblId = new JLabel("Kopie ID:");
        this.lblVerklaring = new JLabel("Kopie verklaring:");
        
        this.txtNaam = new JTextField("");
        this.txtAdres = new JTextField("");
        this.txtPostcode = new JTextField("");
        this.txtWoonplaats = new JTextField("");
        this.txtTelnr = new JTextField("");
        this.txtEmail = new JTextField("");
               
        this.btnId = new JButton("Wijzigen");
        this.btnVerklaring = new JButton("Wijzigen");
        this.btnOpslaan = new JButton("Opslaan");
    
        this.add(lblTitel);
        this.add(lblNaam);
        this.add(lblAdres);
        this.add(lblPostcode);
        this.add(lblWoonplaats);
        this.add(lblTelnr);
        this.add(lblEmail);
        this.add(lblId);
        this.add(lblVerklaring);
        
        this.add(txtNaam);
        this.add(txtAdres);
        this.add(txtPostcode);
        this.add(txtWoonplaats);
        this.add(txtTelnr);
        this.add(txtEmail);
                
        this.add(btnId);
        this.add(btnVerklaring);
        this.add(btnOpslaan);
        
        
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
