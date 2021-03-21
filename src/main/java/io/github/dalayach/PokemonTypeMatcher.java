import java.util.EnumSet;
import java.util.Set;

public class PokemonTypeMatcher
{

   private PokemonTypeMatcher() {}

   public static Set<PokemonType> bestTypesForTarget (Set<PokemonType> targetTypesOfPokemon)
   {
   
      Set<PokemonType> bestTypesForTarget = EnumSet.noneOf(PokemonType.class);
      
      for (PokemonAffinity each : PokemonAffinity.values())
      {
      
         if (each.getStrongAgainst().containsAll(targetTypesOfPokemon))
         {
         
            bestTypesForTarget.add(each.getMatchingType());
         
         }
      
      }
      
      return bestTypesForTarget;
   
   }

}