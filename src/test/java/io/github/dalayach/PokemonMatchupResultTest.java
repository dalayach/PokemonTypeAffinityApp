package io.github.dalayach;

import org.junit.Test;
import static org.junit.Assert.*;

public class PokemonMatchupResultTest
{

   /** Tests that each PokemonMatchupResult has a mapping for each PokemonType. */
   @Test
   public void testMappingExistsForAllMatchupResult()
   {
   
      for (PokemonMatchupResult eachResult : PokemonMatchupResult.values())
      {
      
         for (PokemonType eachType : PokemonType.values())
         {
         
            assertFalse(eachResult.getStatusEffect(eachType) == null);
         
         }
      
      }
   
   }
   
}
