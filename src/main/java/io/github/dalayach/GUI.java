package io.github.dalayach;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ToolTipManager;
import java.awt.Component;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/** Class that creates and populates all the components of the GUI. */
public class GUI
{

   /** Panel that all the upper visual components of the GUI will be placed into. */
   private final JPanel topHalfPanel = new JPanel(new GridBagLayout());
   /** Panel that all the upper visual components of the GUI will be placed into. */
   private final JPanel bottomHalfPanel = new JPanel(new GridBagLayout());
   /** Text Area that the calculation results will be placed into. */
   private final JLabel textArea = new JLabel("Your results will show up here!");
   /** ScrollPane that I'm putting in place in case we need it in the future. */
   private final JScrollPane scrollPane = new JScrollPane();
   /** Checkbox grid width. */
   private final int checkboxGridWidth = 23;

   /** Constructor. */
   public GUI()
   {
   
      JFrame frame = this.createFrame();
      
      this.configureScrollPane();
      
      this.addPokemonTypeCheckboxes();
      
      this.addResultTextArea();
      
      this.addStatusEffectButtons();
      
      frame.add(scrollPane);
      
      frame.setVisible(true);
      
   }
   
   /**
    * 
    * Creates a JFrame with the necessary configurations.
    * 
    * @return     the configured JFrame
    * 
    */
   public JFrame createFrame()
   {
   
      JFrame frame = new JFrame("Pokemon Type Affinity App");
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setMinimumSize(new Dimension(600, 350));
      frame.setSize(300, 350);
      frame.setLocation(200, 200);
      frame.setIconImage(new ImageIcon(fetchImagePath("PokemonIconImage.png")).getImage());
      
      return frame;
      
   }
   
   /** Modifies ScrollPane to organize components effectively. */
   public void configureScrollPane()
   {
   
      JPanel mainPanel = new JPanel();
      mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
      mainPanel.add(topHalfPanel);
      mainPanel.add(bottomHalfPanel);
   
      this.scrollPane.setViewportView(mainPanel);
      this.scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                  
   }
   
   /** Adds checkboxes to the topHalfPanel. */
   public void addPokemonTypeCheckboxes()
   {
   
      int counterX = 0;
      int counterY = 1;
      
      GridBagConstraints grid = new GridBagConstraints();
      
      grid.gridx = 0;
      grid.gridy = 0;
      grid.gridwidth = 24;
      grid.gridheight = 1;
      grid.weightx = 1.0;
      grid.fill = GridBagConstraints.BOTH;
      
      String text = "<html>Select the Defending Pokemon's types, then click one of the status effects buttons.";
         
      topHalfPanel.add(new JLabel(text), grid);
      
      ToolTipManager.sharedInstance().setDismissDelay(100_000);
      
      for (PokemonType each : PokemonType.values())
      {
      
         JCheckBox checkBox = new JCheckBox();
         checkBox.setActionCommand(each.name());
         each.updateIcons(checkBox);
         checkBox.setToolTipText(createCheckBoxToolTipText(each));
         
         checkBox.addActionListener(
            new ActionListener()
            {
               @Override
               public void actionPerformed(ActionEvent ae)
               {
               
                  updateEnabledForStatusEffectButtons();
               
               }
            });
         
         grid.gridx = counterX;
         grid.gridy = counterY;
         grid.gridwidth = (counterX == checkboxGridWidth ? GridBagConstraints.REMAINDER : 4);
         grid.gridheight = 1;
         grid.weightx = 1.0;
         
         topHalfPanel.add(checkBox, grid);
         
         counterX += 4;
         
         if (counterX >= checkboxGridWidth)
         {
         
            counterX = 0;
            counterY++;
         
         }
      
      }
   
   }
   
   /** Adds text area to the topHalfPanel. */
   public void addResultTextArea()
   {
   
      GridBagConstraints grid = new GridBagConstraints();
      
      grid.gridx = 0;
      grid.gridy = 5;
      grid.gridwidth = 24;
      grid.fill = GridBagConstraints.BOTH;
      
      Border blackline = BorderFactory.createLineBorder(Color.black);
      
      textArea.setBorder(blackline);
         
      topHalfPanel.add(textArea, grid);
      
      // textArea.setLineWrap(true);
      // textArea.setWrapStyleWord(true);
      // textArea.setEditable(false);
      
   }
   
   /** Adds buttons to the topHalfPanel. */
   public void addStatusEffectButtons()
   {
   
      int counterX = 8;
   
      for (StatusEffect method : StatusEffect.values())
      {
      
         GridBagConstraints grid = new GridBagConstraints();
      
         grid.gridx = counterX;
         grid.gridy = 0;
         grid.gridwidth = 4;
         grid.gridheight = 1;
         grid.weightx = 1.0;
         grid.fill = GridBagConstraints.BOTH;
         
         JButton button = new JButton(method.name());
         button.setEnabled(false);
         button.addActionListener(
            new ActionListener() {
            
               @Override
               public void actionPerformed(ActionEvent e)
               {
               
                  Collection<PokemonType> targetTypesOfPokemon = fetchCheckedBoxes();
                  
                  JButton source = (JButton) e.getSource();
                  StatusEffect method = StatusEffect.valueOf(source.getText());
               
                  Set<PokemonType> results = PokemonType.calculateAttackingTypes(method, targetTypesOfPokemon);
                  
                  textArea.setText("");
                  textArea.setText(
                     "<html>"
                     + results
                     + "<br>"
                     + method.against(results.size() > 1)
                     + "<br>"
                     + targetTypesOfPokemon
                     + "</html>");
               
               }
            
            });
         
         bottomHalfPanel.add(button, grid);
         
         counterX += 4;
      
      }
   
   }
   
   /**
    * 
    * Fetches the collection of PokemonTypes that the user selected.
    * 
    * @return     The set of PokemonTypes that the user selected on the GUI. No duplicates.
    * 
    */
   public Set<PokemonType> fetchCheckedBoxes()
   {
   
      Set<PokemonType> targetTypesOfPokemon = EnumSet.noneOf(PokemonType.class);
            
      for (final Component component : topHalfPanel.getComponents())
      {
               
         if (component instanceof JCheckBox)
         {
                  
            JCheckBox checkBox = (JCheckBox) component;
                  
            if (checkBox.isSelected())
            {
                     
               targetTypesOfPokemon.add(PokemonType.valueOf(checkBox.getActionCommand()));
                     
            }
         
         }
               
      }
      
      return targetTypesOfPokemon;
               
   }

   /**
    * 
    * Fetches the path to images in the resource folder for various components of the GUI.
    * 
    * @param imageFileName    The name of the image file.      Ex. "FIRE.png"
    * @return                 Returns the ABSOLUTE path to the file.    Ex. C:/Users/.......src/main/res/FIRE.png
    *                         (Please note - the absolute path will use the local systems file separator for the path)
    * 
    */
   public static String fetchImagePath(String imageFileName)
   {
   
      File f = new File(new File("").getAbsolutePath());
   
      while (!f.getName().contains("PokemonTypeAffinityApp"))
      {
      
         f = f.getParentFile();
      
      }
      
      String sep = java.nio.file.FileSystems.getDefault().getSeparator();
      
      String newPath = f.getAbsolutePath() + sep + "src" + sep + "main" + sep + "res" + sep + imageFileName;
      
      return newPath;
           
   }
   
   /**
    * 
    * Returns a String containing the tool tip text for a JCheckBox housing a PokemonType.
    * 
    * @param each    the PokemonType
    * @return        the toolTipText
    * 
    */
   public String createCheckBoxToolTipText(PokemonType each)
   {
   
      String toolTipText = "<html>";
         
      int counter = StatusEffect.values().length;
      
      for (StatusEffect method : StatusEffect.values())
      {
            
         toolTipText += each.name() + method.against(false) + each.getTypesByStatusEffect(method);
         counter--;
         toolTipText += (counter == 0 ? "" : "<br>");
         
      }
         
      return toolTipText + "</html>";
         
   }
   
   /** Enables/disables the StatusEffect buttons based on whether or not a type is currently selected. */
   public void updateEnabledForStatusEffectButtons()
   {
   
      boolean enabled = !fetchCheckedBoxes().isEmpty();
      
      for (final Component component : bottomHalfPanel.getComponents())
      {
      
         if (component instanceof JButton)
         {
         
            ((JButton) component).setEnabled(enabled);
            
         }
      
      }
      
   }
	
}
