import javax.swing.*;

public class JFrameAltas extends JFrame
{
   PanelAltas mostrar = new PanelAltas();
   
    public JFrameAltas()
   {  
      //super.setVisible(false);
     //super.dispose();
      initComponents();
   }
   
   private void initComponents()
   {
      //super.setVisible(false);
      //super.dispose();
      this.setBounds(580,180,300,200);
      setSize(300, 200);
      setTitle("AGENDA");
      //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);
       
   }   
}
