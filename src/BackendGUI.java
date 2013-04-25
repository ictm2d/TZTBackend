import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BackendGUI extends JFrame implements ActionListener {
  
    private JButton btnTreinkoerier, btnOpdracht, btnBeheerder;
    private JPanel BackendNorth, BackendCenter;
    
    
    
    public BackendGUI()
      {
      setSize(800,600);
      setLayout(new BorderLayout());
      setDefaultCloseOperation( EXIT_ON_CLOSE );
      setVisible(true);
      
      
      
      BackendNorth = new JPanel();
      
      BackendNorth.setLayout(new FlowLayout());
      
      this.add(BackendNorth, BorderLayout.NORTH);
      
      btnTreinkoerier = new JButton("Treinkoerier");
      BackendNorth.add(btnTreinkoerier);
      
      btnOpdracht = new JButton("Opdracht");
      BackendNorth.add(btnOpdracht);
      
      btnBeheerder = new JButton("Beheerder");
      BackendNorth.add(btnBeheerder);
      
      btnTreinkoerier.addActionListener(this);
      btnOpdracht.addActionListener(this);
      
      
      
      }
    
    
    
    public  void actionPerformed(ActionEvent e)
    {
     if(e.getSource() == btnTreinkoerier){
     
         TreinkoeriersPanel treinkoerier = new TreinkoeriersPanel();
   }
   
    if(e.getSource() == btnOpdracht){
     
        OpdrachtenPanel opdracht = new OpdrachtenPanel();
     
   }
    
     if(e.getSource() == btnBeheerder){
     
        BeheerdersPanel beheerder = new BeheerdersPanel();
     
   }
    
    }
    

}
