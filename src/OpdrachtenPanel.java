
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class OpdrachtenPanel extends JDialog implements ActionListener {

    private JLabel lbTf;
    private JLabel lbId;
    private JLabel lbKlant;
    private JLabel lbTreinkoerier;
    private JLabel lbStatus;
    private JLabel lbBewerken;
    private JLabel lbVerwijderen;
    private JLabel lbInfo;
    private JButton btnVoegToe;

    public OpdrachtenPanel() {

        this.setTitle("Opdrachten Beheren");
        this.setSize(500, 600);
        this.setLayout(new BorderLayout());

        this.lbTf = new JLabel("Beheer hier uw Opdrachten");
        this.lbId = new JLabel("ID");
        this.lbKlant = new JLabel("Klant");
        this.lbTreinkoerier = new JLabel("Treinkoerier");
        this.lbStatus = new JLabel("Status");
        this.lbBewerken = new JLabel("Bewerken");
        this.lbVerwijderen = new JLabel("Verwijderen");
        this.lbInfo = new JLabel("Info");
        this.btnVoegToe = new JButton("Voeg opdracht toe");

        btnVoegToe.addActionListener(this);

        this.add(lbTf);
        this.add(lbId);
        this.add(lbKlant);
        this.add(lbTreinkoerier);
        this.add(lbStatus);
        this.add(lbBewerken);
        this.add(lbVerwijderen);
        this.add(lbInfo);
        this.add(btnVoegToe, BorderLayout.NORTH);
        
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
    }
}