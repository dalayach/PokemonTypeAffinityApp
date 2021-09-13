package io.github.dalayach;

import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/**
 * 
 * Enum that represents the different possible elemental Types in the Pokemon games. Since this is the most basic of the enums,
 * it serves as a corner stone of sorts. All the major functions are composited within this enum.
 * 
 */
public enum PokemonType
{

   NORMAL,
   FIRE,
   WATER,
   ELECTRIC,
   GRASS,
   ICE,
   FIGHTING,
   POISON,
   GROUND,
   FLYING,
   PSYCHIC,
   BUG,
   ROCK,
   GHOST,
   DRAGON,
   DARK,
   STEEL,
   FAIRY,
   ;
   
   /**
    * 
    * Fetches the matchups for a particular StatusEffect.
    * 
    * @param statusEffect     the StatusEffect we want to filter by
    * @return                 the PokemonTypes affiliated to that StatusEffect
    * @throws                 NullPointerException if StatusEffect is null
    * 
    */
   public Set<PokemonType> getTypesByStatusEffect(StatusEffect statusEffect)
   {
   
      Validator.checkForNulls(statusEffect);
   
      return PokemonMatchupResult.valueOf(this.name()).fetchByStatusEffect(statusEffect);
   
   }
   
   /**
    * 
    * Fetches the StatusEffect mapped to the given PokemonType.
    * 
    * @param type    the key we are using to find the value
    * @return        the StatusEffect we are looking for
    * @throws        NullPointerException if PokemonType is null
    * 
    */
   public StatusEffect getStatusEffect(PokemonType type)
   {
   
      Validator.checkForNulls(type);
   
      return PokemonMatchupResult.valueOf(this.name()).getStatusEffect(type);
   
   }
   
   /**
    * 
    * Returns true if the PokemonType that called this method has the given StatusEffect mapped to the given PokemonType.
    * 
    * @param statusEffect     the StatusEffect that we are validating
    * @param enemy            the PokemonType we are using as a key
    * @return                 the boolean result
    * @throws                 NullPointerException if either StatusEffect or PokemonType is null
    * 
    */
   public boolean isStatusEffectAccurateAgainstEnemy(StatusEffect statusEffect, PokemonType enemy)
   {
   
      Validator.checkForNulls(statusEffect);
      Validator.checkForNulls(enemy);
   
      return statusEffect == PokemonMatchupResult.valueOf(this.name()).getStatusEffect(enemy);
   
   }
   
   /**
    * 
    * Returns true if the PokemonType that called this method has matchup results for the given PokemonTypes that add up to the
    * given StatusEffect.
    * 
    * @param statusEffect     the StatusEffect that we are validating
    * @param enemy            the PokemonTypes we are fetching matchup results for
    * @return                 the boolean result
    * @throws                 NullPointerException if either StatusEffect or Collection<PokemonType> is null.
    *                             Will also throw the same exception if any element within the Collection is
    *                             null.
    * 
    */
   public boolean isStatusEffectAccurateAgainstEnemy(StatusEffect statusEffect, Collection<PokemonType> enemy)
   {
   
      Validator.checkForNulls(statusEffect);
      Validator.checkForNulls(enemy);
   
      StatusEffect result = StatusEffect.calculateStatusEffect(this, enemy);
      
      return statusEffect == result;
   
   }
   
   /**
    * 
    * Fetches the image associated to this enum value.
    * 
    * @return     the icon that will be used for the window
    * 
    */
   public Icon getMatchingIcon()
   {
   
      String sep = java.nio.file.FileSystems.getDefault().getSeparator();
   
      Icon icon = new ImageIcon(GUI.fetchImagePath(this.name() + sep + this.name() + ".png"));
   
      return icon;
   
   }
   
   /**
    * 
    * Updates all of the icons for the given button so that we can use our own custom icons.<br>
    * _p    = icon shown when pressing the button<br>
    * _di   = icon shown when the button is disabled<br>
    * _s    = icon shown when the button has already been selected/checkmarked<br>
    * _dis  = icon shown when the button has been both disabled and already selected/checkmarked<br>
    * _r    = icon shown when the button is being hovered over by a mouse<br>
    * _rs   = icon shown when the button has already been selected/checkmarked and the button is disabled<br>
    * 
    * @param button     the button whose icons we are modifying
    * @throws           NullPointerException if AbstractButton is null
    * 
    */
   public void updateIcons(AbstractButton button)
   {
   
      Validator.checkForNulls(button);
   
      String sep = java.nio.file.FileSystems.getDefault().getSeparator();
   
      button.setIcon(this.getMatchingIcon());
      button.setPressedIcon(new ImageIcon(GUI.fetchImagePath(this.name() + sep + this.name() + "_p.png")));
      button.setDisabledIcon(new ImageIcon(GUI.fetchImagePath(this.name() + sep + this.name() + "_di.png")));
      button.setSelectedIcon(new ImageIcon(GUI.fetchImagePath(this.name() + sep + this.name() + "_s.png")));
      button.setDisabledSelectedIcon(new ImageIcon(GUI.fetchImagePath(this.name() + sep + this.name() + "_dis.png")));
      button.setRolloverIcon(new ImageIcon(GUI.fetchImagePath(this.name() + sep + this.name() + "_r.png")));
      button.setRolloverSelectedIcon(new ImageIcon(GUI.fetchImagePath(this.name() + sep + this.name() + "_rs.png")));
   
   }
   
   /**
    * 
    * Finds the attacking PokemonTypes that would cause the given StatusEffect to the defending PokemonTypes.
    * 
    * @param statusEffect     the StatusEffect used
    * @param defendingTypes   the defending PokemonTypes
    * @return                 the set of PokemonTypes that cause the given StatusEffect against the given collection
    * @throws                 NullPointerException if either StatusEffect or Collection<PokemonType> is null. Will also
    *                             throw the same exception if any element within the Collection is null.
    * 
    */
   public static Set<PokemonType> calculateAttackingTypes(StatusEffect statusEffect, Collection<PokemonType> defendingTypes)
   {
   
      Validator.checkForNulls(statusEffect);
      Validator.checkForNulls(defendingTypes);
   
      Set<PokemonType> results = EnumSet.noneOf(PokemonType.class);
      
      for (PokemonType each : PokemonType.values())
      {
      
         if (each.isStatusEffectAccurateAgainstEnemy(statusEffect, defendingTypes))
         {
         
            results.add(each);
         
         }
      
      }
         
      return results;
   
   }
         
}
