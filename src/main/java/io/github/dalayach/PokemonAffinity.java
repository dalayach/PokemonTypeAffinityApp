import java.util.EnumSet;
import java.util.Set;

public enum PokemonAffinity
{

   NORMAL(),
   FIRE(PokemonType.GRASS, PokemonType.ICE, PokemonType.BUG, PokemonType.STEEL),
   WATER(PokemonType.FIRE, PokemonType.GROUND, PokemonType.ROCK),
   ELECTRIC(PokemonType.WATER, PokemonType.FLYING),
   GRASS(PokemonType.WATER, PokemonType.GROUND, PokemonType.ROCK),
   ICE(PokemonType.GRASS, PokemonType.GROUND, PokemonType.FLYING, PokemonType.DRAGON),
   FIGHTING(PokemonType.NORMAL, PokemonType.ICE, PokemonType.ROCK, PokemonType.DARK, PokemonType.STEEL),
   POISON(PokemonType.GRASS, PokemonType.FAIRY),
   GROUND(PokemonType.FIRE, PokemonType.ELECTRIC, PokemonType.POISON, PokemonType.ROCK, PokemonType.STEEL),
   FLYING(PokemonType.GRASS, PokemonType.FIGHTING, PokemonType.BUG),
   PSYCHIC(PokemonType.FIGHTING, PokemonType.POISON),
   BUG(PokemonType.GRASS, PokemonType.PSYCHIC, PokemonType.DARK),
   ROCK(PokemonType.FIRE, PokemonType.ICE, PokemonType.FLYING, PokemonType.BUG),
   GHOST(PokemonType.PSYCHIC, PokemonType.GHOST),
   DRAGON(PokemonType.DRAGON),
   DARK(PokemonType.PSYCHIC, PokemonType.GHOST),
   STEEL(PokemonType.ICE, PokemonType.ROCK, PokemonType.FAIRY),
   FAIRY(PokemonType.FIGHTING, PokemonType.DRAGON, PokemonType.DARK),
   ;
   
   private final PokemonType matchingType;
   private final Set<PokemonType> strongAgainst = EnumSet.noneOf(PokemonType.class);
   
   PokemonAffinity(PokemonType... strongAgainst)
   {
   
      this.matchingType = PokemonType.valueOf(this.name());
         
      for (PokemonType each : strongAgainst)
      {
      
         this.strongAgainst.add(each);
      
      }
   
   }
   
   public PokemonType getMatchingType ()
   {
   
      return this.matchingType;
   
   }
   
   public Set<PokemonType> getStrongAgainst()
   {
   
      return this.strongAgainst;
   
   }
   
}