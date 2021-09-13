package io.github.dalayach;

import java.util.Collection;

/** Enum that describes all possible results of a matchup between any 2 PokemonTypes. {@link #SUPER_EFFECTIVE} */
public enum StatusEffect
{
   /** StatusEffect that represents when an attackingType causes a Super Effective status effect on a defendingType. */
   SUPER_EFFECTIVE
   {
      /** {@inheritDoc} */
      public boolean isMatchupValueInBounds(Integer matchupValue)
      {
         return matchupValue != null && matchupValue > 0;
      }
   },
   
   EVENLY_MATCHED
   {
      /** {@inheritDoc} */
      public boolean isMatchupValueInBounds(Integer matchupValue)
      {
         return matchupValue != null && matchupValue == 0;
      }
   },
   
   NOT_VERY_EFFECTIVE
   {
      /** {@inheritDoc} */
      public boolean isMatchupValueInBounds(Integer matchupValue)
      {
         return matchupValue != null && matchupValue < 0;
      }
   },
   
   NO_EFFECT
   {
      /** {@inheritDoc} */
      public boolean isMatchupValueInBounds(Integer matchupValue)
      {
         return matchupValue == null;
      }
   },
   ;
   
   /**
    * 
    * Returns true if the given matchupValue matches the bounds of the StatusEffect.
    * 
    * @param matchupValue     the given matchupValue
    * @return                 the boolean result
    * 
    */
   public abstract boolean isMatchupValueInBounds(Integer matchupValue);
   
   /**
    * 
    * Returns an Integer that quantifies the match up viability of a specific PokemonType vs a Collection of other PokemonTypes.
    * 
    * @param move    the PokemonType representing the type of the attack move
    * @param types   the Collection of PokemonTypes representing the type of the defending Pokemon
    * @return        a number that represents how good the match up is
    *                <br> - a positive number means the attacking move will result in a Super Effective attack
    *                <br> - a zero means the attacking move will be (relatively) Equally Matched
    *                <br> - a negative number means the attacking move will result in a Not Very Effective attack
    *                <br> - a null means the attacking move will have No Effect on the defending Pokemon
    * 
    */
   public static Integer getMatchupValue(PokemonType move, Collection<PokemonType> types)
   {
   
      Validator.checkForNulls(move);
      Validator.checkForNulls(types);
   
      int matchUpValue = 0;
   
      for (PokemonType type : types)
      {
      
         switch (move.getStatusEffect(type))
         {
            case SUPER_EFFECTIVE:
               matchUpValue++;
               break;
            case EVENLY_MATCHED:
               //do nothing
               break;
            case NOT_VERY_EFFECTIVE:
               matchUpValue--;
               break;
            case NO_EFFECT:
               return null;
            default:
               throw new IllegalArgumentException("We should not be able to get here!");
               
         }
      
      }
      
      return matchUpValue;
   
   }

   /**
    * 
    * Deduces the correct StatusEffect for the matchup between the attackingType and the multiple defendingTypes.
    * 
    * @param attackingType    the type that creates the StatusEffect
    * @param defendingTypes   the types that serve as input for creating the StatusEffect
    * @return                 the StatusEffect generated from comparisons between the attackingType and all the defendingTypes
    * 
    */
   public static StatusEffect calculateStatusEffect(PokemonType attackingType, Collection<PokemonType> defendingTypes)
   {
   
      Validator.checkForNulls(attackingType);
      Validator.checkForNulls(defendingTypes);
   
      Integer matchupValue = getMatchupValue(attackingType, defendingTypes);
   
      for (StatusEffect each : StatusEffect.values())
      {
      
         if (each.isMatchupValueInBounds(matchupValue))
         {
         
            return each;
         
         }
      
      }
   
      throw new IllegalArgumentException("We should not be able to get here!");
   
   }
   
   /**
    * 
    * Generates a common String segment used to describe the StatusEffect.
    * 
    * @param plural     boolean field that lets me know if the subject is plural or not.
    * @return           the String segment
    * 
    */
   public String against(boolean plural)
   {
   
      switch (this)
      {
      
         case NO_EFFECT:
            return (plural ? " have " : " has ") + this.name() + " against ";
         default:
            return (plural ? " are " : " is ") + this.name() + " against ";
      
      }
   
   }

}
