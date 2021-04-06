import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EnumSet;
import java.util.Set;

public class Main
{

   private JPanel panel = new JPanel();
   private JLabel label = new JLabel("Testing 123");

   public Main ()
   {
   
      JFrame frame = new JFrame("Pokemon Type Affinity App");
      
      panel.add(label);
      
      this.addCheckboxes(panel);
      this.addButtons(panel);
      
      frame.add(panel);
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(700, 400);
      frame.setLocation(200, 200);
      
      frame.setVisible(true);
      
   }
   
   public void addCheckboxes(JPanel panel)
   {
   
      for (PokemonType each : PokemonType.values())
      {
      
         panel.add(new JCheckBox(each.name()));
      
      }
   
   }
   
   public void addButtons(final JPanel panel)
   {
   
      JButton submitButton = new JButton("SUBMIT");
      submitButton.addActionListener(
         new ActionListener() {
         
            @Override
            public void actionPerformed(ActionEvent e)
            {
            
               Set<PokemonType> targetTypesOfPokemon = EnumSet.noneOf(PokemonType.class);
            
               for (Component component : panel.getComponents())
               {
               
                  if (component instanceof JCheckBox)
                  {
                  
                     JCheckBox checkBox = (JCheckBox) component;
                  
                     if (checkBox.isSelected())
                     {
                     
                        targetTypesOfPokemon.add(PokemonType.valueOf(checkBox.getText()));
                     
                     }
                  
                  }
               
               }
               
               label.setText(PokemonTypeMatcher.bestTypesForTarget(targetTypesOfPokemon).toString());
            
            }
         
         }
         );
         
      panel.add(submitButton);
   
   }

   public static void main(String[] args)
   {
   
      new Main();
   
   }

}
