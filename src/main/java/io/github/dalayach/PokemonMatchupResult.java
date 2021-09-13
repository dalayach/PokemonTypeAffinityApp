package io.github.dalayach;

import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/** Enum that contains the results of every possible matchup between 2 PokemonTypes. */
public enum PokemonMatchupResult
{
  
   NORMAL {
      /**
       * 
       * Creates the matchups for the respective PokemonType.
       * 
       * @return     the created matchups
       * 
       */
      public Map<PokemonType, StatusEffect> createMatchup() {
         Map<PokemonType, StatusEffect> map = new EnumMap<PokemonType, StatusEffect>(PokemonType.class);
         map.put(PokemonType.NORMAL,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIRE,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.WATER,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ELECTRIC, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GRASS,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ICE,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIGHTING, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.POISON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GROUND,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FLYING,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.PSYCHIC,  StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.BUG,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ROCK,     StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.GHOST,    StatusEffect.NO_EFFECT);
         map.put(PokemonType.DRAGON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DARK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.STEEL,    StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.FAIRY,    StatusEffect.EVENLY_MATCHED);
         return Collections.unmodifiableMap(map);
      }
   },
   /** Let's see if this shows up. */
   FIRE {
      /**
       * 
       * Creates the matchups for the respective PokemonType.
       * 
       * @return     the created matchups
       * 
       */
      public Map<PokemonType, StatusEffect> createMatchup() {
         Map<PokemonType, StatusEffect> map = new EnumMap<PokemonType, StatusEffect>(PokemonType.class);
         map.put(PokemonType.NORMAL,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIRE,     StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.WATER,    StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.ELECTRIC, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GRASS,    StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.ICE,      StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.FIGHTING, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.POISON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GROUND,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FLYING,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.PSYCHIC,  StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.BUG,      StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.ROCK,     StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.GHOST,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DRAGON,   StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.DARK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.STEEL,    StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.FAIRY,    StatusEffect.EVENLY_MATCHED);
         return Collections.unmodifiableMap(map);
      }
   },
   WATER {
      /**
       * 
       * Creates the matchups for the respective PokemonType.
       * 
       * @return     the created matchups
       * 
       */
      public Map<PokemonType, StatusEffect> createMatchup() {
         Map<PokemonType, StatusEffect> map = new EnumMap<PokemonType, StatusEffect>(PokemonType.class);
         map.put(PokemonType.NORMAL,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIRE,     StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.WATER,    StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.ELECTRIC, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GRASS,    StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.ICE,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIGHTING, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.POISON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GROUND,   StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.FLYING,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.PSYCHIC,  StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.BUG,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ROCK,     StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.GHOST,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DRAGON,   StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.DARK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.STEEL,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FAIRY,    StatusEffect.EVENLY_MATCHED);
         return Collections.unmodifiableMap(map);
      }
   },
   ELECTRIC {
      /**
       * 
       * Creates the matchups for the respective PokemonType.
       * 
       * @return     the created matchups
       * 
       */
      public Map<PokemonType, StatusEffect> createMatchup() {
         Map<PokemonType, StatusEffect> map = new EnumMap<PokemonType, StatusEffect>(PokemonType.class);
         map.put(PokemonType.NORMAL,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIRE,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.WATER,    StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.ELECTRIC, StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.GRASS,    StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.ICE,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIGHTING, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.POISON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GROUND,   StatusEffect.NO_EFFECT);
         map.put(PokemonType.FLYING,   StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.PSYCHIC,  StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.BUG,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ROCK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GHOST,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DRAGON,   StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.DARK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.STEEL,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FAIRY,    StatusEffect.EVENLY_MATCHED);
         return Collections.unmodifiableMap(map);
      }
   },
   GRASS {
      /**
       * 
       * Creates the matchups for the respective PokemonType.
       * 
       * @return     the created matchups
       * 
       */
      public Map<PokemonType, StatusEffect> createMatchup() {
         Map<PokemonType, StatusEffect> map = new EnumMap<PokemonType, StatusEffect>(PokemonType.class);
         map.put(PokemonType.NORMAL,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIRE,     StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.WATER,    StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.ELECTRIC, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GRASS,    StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.ICE,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIGHTING, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.POISON,   StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.GROUND,   StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.FLYING,   StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.PSYCHIC,  StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.BUG,      StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.ROCK,     StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.GHOST,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DRAGON,   StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.DARK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.STEEL,    StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.FAIRY,    StatusEffect.EVENLY_MATCHED);
         return Collections.unmodifiableMap(map);
      }
   },
   ICE {
      /**
       * 
       * Creates the matchups for the respective PokemonType.
       * 
       * @return     the created matchups
       * 
       */
      public Map<PokemonType, StatusEffect> createMatchup() {
         Map<PokemonType, StatusEffect> map = new EnumMap<PokemonType, StatusEffect>(PokemonType.class);
         map.put(PokemonType.NORMAL,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIRE,     StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.WATER,    StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.ELECTRIC, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GRASS,    StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.ICE,      StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.FIGHTING, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.POISON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GROUND,   StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.FLYING,   StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.PSYCHIC,  StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.BUG,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ROCK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GHOST,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DRAGON,   StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.DARK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.STEEL,    StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.FAIRY,    StatusEffect.EVENLY_MATCHED);
         return Collections.unmodifiableMap(map);
      }
   },
   FIGHTING {
      /**
       * 
       * Creates the matchups for the respective PokemonType.
       * 
       * @return     the created matchups
       * 
       */
      public Map<PokemonType, StatusEffect> createMatchup() {
         Map<PokemonType, StatusEffect> map = new EnumMap<PokemonType, StatusEffect>(PokemonType.class);
         map.put(PokemonType.NORMAL,   StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.FIRE,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.WATER,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ELECTRIC, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GRASS,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ICE,      StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.FIGHTING, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.POISON,   StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.GROUND,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FLYING,   StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.PSYCHIC,  StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.BUG,      StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.ROCK,     StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.GHOST,    StatusEffect.NO_EFFECT);
         map.put(PokemonType.DRAGON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DARK,     StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.STEEL,    StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.FAIRY,    StatusEffect.NOT_VERY_EFFECTIVE);
         return Collections.unmodifiableMap(map);
      }
   },
   POISON {
      /**
       * 
       * Creates the matchups for the respective PokemonType.
       * 
       * @return     the created matchups
       * 
       */
      public Map<PokemonType, StatusEffect> createMatchup() {
         Map<PokemonType, StatusEffect> map = new EnumMap<PokemonType, StatusEffect>(PokemonType.class);
         map.put(PokemonType.NORMAL,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIRE,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.WATER,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ELECTRIC, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GRASS,    StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.ICE,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIGHTING, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.POISON,   StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.GROUND,   StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.FLYING,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.PSYCHIC,  StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.BUG,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ROCK,     StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.GHOST,    StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.DRAGON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DARK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.STEEL,    StatusEffect.NO_EFFECT);
         map.put(PokemonType.FAIRY,    StatusEffect.SUPER_EFFECTIVE);
         return Collections.unmodifiableMap(map);
      }
   },
   GROUND {
      /**
       * 
       * Creates the matchups for the respective PokemonType.
       * 
       * @return     the created matchups
       * 
       */
      public Map<PokemonType, StatusEffect> createMatchup() {
         Map<PokemonType, StatusEffect> map = new EnumMap<PokemonType, StatusEffect>(PokemonType.class);
         map.put(PokemonType.NORMAL,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIRE,     StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.WATER,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ELECTRIC, StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.GRASS,    StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.ICE,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIGHTING, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.POISON,   StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.GROUND,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FLYING,   StatusEffect.NO_EFFECT);
         map.put(PokemonType.PSYCHIC,  StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.BUG,      StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.ROCK,     StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.GHOST,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DRAGON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DARK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.STEEL,    StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.FAIRY,    StatusEffect.EVENLY_MATCHED);
         return Collections.unmodifiableMap(map);
      }
   },
   FLYING {
      /**
       * 
       * Creates the matchups for the respective PokemonType.
       * 
       * @return     the created matchups
       * 
       */
      public Map<PokemonType, StatusEffect> createMatchup() {
         Map<PokemonType, StatusEffect> map = new EnumMap<PokemonType, StatusEffect>(PokemonType.class);
         map.put(PokemonType.NORMAL,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIRE,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.WATER,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ELECTRIC, StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.GRASS,    StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.ICE,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIGHTING, StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.POISON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GROUND,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FLYING,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.PSYCHIC,  StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.BUG,      StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.ROCK,     StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.GHOST,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DRAGON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DARK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.STEEL,    StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.FAIRY,    StatusEffect.EVENLY_MATCHED);
         return Collections.unmodifiableMap(map);
      }
   },
   PSYCHIC {
      /**
       * 
       * Creates the matchups for the respective PokemonType.
       * 
       * @return     the created matchups
       * 
       */
      public Map<PokemonType, StatusEffect> createMatchup() {
         Map<PokemonType, StatusEffect> map = new EnumMap<PokemonType, StatusEffect>(PokemonType.class);
         map.put(PokemonType.NORMAL,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIRE,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.WATER,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ELECTRIC, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GRASS,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ICE,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIGHTING, StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.POISON,   StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.GROUND,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FLYING,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.PSYCHIC,  StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.BUG,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ROCK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GHOST,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DRAGON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DARK,     StatusEffect.NO_EFFECT);
         map.put(PokemonType.STEEL,    StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.FAIRY,    StatusEffect.EVENLY_MATCHED);
         return Collections.unmodifiableMap(map);
      }
   },
   BUG {
      /**
       * 
       * Creates the matchups for the respective PokemonType.
       * 
       * @return     the created matchups
       * 
       */
      public Map<PokemonType, StatusEffect> createMatchup() {
         Map<PokemonType, StatusEffect> map = new EnumMap<PokemonType, StatusEffect>(PokemonType.class);
         map.put(PokemonType.NORMAL,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIRE,     StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.WATER,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ELECTRIC, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GRASS,    StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.ICE,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIGHTING, StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.POISON,   StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.GROUND,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FLYING,   StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.PSYCHIC,  StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.BUG,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ROCK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GHOST,    StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.DRAGON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DARK,     StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.STEEL,    StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.FAIRY,    StatusEffect.NOT_VERY_EFFECTIVE);
         return Collections.unmodifiableMap(map);
      }
   },
   ROCK {
      /**
       * 
       * Creates the matchups for the respective PokemonType.
       * 
       * @return     the created matchups
       * 
       */
      public Map<PokemonType, StatusEffect> createMatchup() {
         Map<PokemonType, StatusEffect> map = new EnumMap<PokemonType, StatusEffect>(PokemonType.class);
         map.put(PokemonType.NORMAL,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIRE,     StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.WATER,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ELECTRIC, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GRASS,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ICE,      StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.FIGHTING, StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.POISON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GROUND,   StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.FLYING,   StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.PSYCHIC,  StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.BUG,      StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.ROCK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GHOST,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DRAGON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DARK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.STEEL,    StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.FAIRY,    StatusEffect.EVENLY_MATCHED);
         return Collections.unmodifiableMap(map);
      }
   },
   GHOST {
      /**
       * 
       * Creates the matchups for the respective PokemonType.
       * 
       * @return     the created matchups
       * 
       */
      public Map<PokemonType, StatusEffect> createMatchup() {
         Map<PokemonType, StatusEffect> map = new EnumMap<PokemonType, StatusEffect>(PokemonType.class);
         map.put(PokemonType.NORMAL,   StatusEffect.NO_EFFECT);
         map.put(PokemonType.FIRE,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.WATER,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ELECTRIC, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GRASS,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ICE,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIGHTING, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.POISON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GROUND,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FLYING,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.PSYCHIC,  StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.BUG,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ROCK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GHOST,    StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.DRAGON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DARK,     StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.STEEL,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FAIRY,    StatusEffect.EVENLY_MATCHED);
         return Collections.unmodifiableMap(map);
      }
   },
   DRAGON {
      /**
       * 
       * Creates the matchups for the respective PokemonType.
       * 
       * @return     the created matchups
       * 
       */
      public Map<PokemonType, StatusEffect> createMatchup() {
         Map<PokemonType, StatusEffect> map = new EnumMap<PokemonType, StatusEffect>(PokemonType.class);
         map.put(PokemonType.NORMAL,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIRE,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.WATER,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ELECTRIC, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GRASS,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ICE,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIGHTING, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.POISON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GROUND,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FLYING,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.PSYCHIC,  StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.BUG,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ROCK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GHOST,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DRAGON,   StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.DARK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.STEEL,    StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.FAIRY,    StatusEffect.NO_EFFECT);
         return Collections.unmodifiableMap(map);
      }
   },
   DARK {
      /**
       * 
       * Creates the matchups for the respective PokemonType.
       * 
       * @return     the created matchups
       * 
       */
      public Map<PokemonType, StatusEffect> createMatchup() {
         Map<PokemonType, StatusEffect> map = new EnumMap<PokemonType, StatusEffect>(PokemonType.class);
         map.put(PokemonType.NORMAL,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIRE,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.WATER,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ELECTRIC, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GRASS,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ICE,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIGHTING, StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.POISON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GROUND,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FLYING,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.PSYCHIC,  StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.BUG,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ROCK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GHOST,    StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.DRAGON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DARK,     StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.STEEL,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FAIRY,    StatusEffect.NOT_VERY_EFFECTIVE);
         return Collections.unmodifiableMap(map);
      }
   },
   STEEL {
      /**
       * 
       * Creates the matchups for the respective PokemonType.
       * 
       * @return     the created matchups
       * 
       */
      public Map<PokemonType, StatusEffect> createMatchup() {
         Map<PokemonType, StatusEffect> map = new EnumMap<PokemonType, StatusEffect>(PokemonType.class);
         map.put(PokemonType.NORMAL,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIRE,     StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.WATER,    StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.ELECTRIC, StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.GRASS,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ICE,      StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.FIGHTING, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.POISON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GROUND,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FLYING,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.PSYCHIC,  StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.BUG,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ROCK,     StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.GHOST,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DRAGON,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DARK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.STEEL,    StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.FAIRY,    StatusEffect.SUPER_EFFECTIVE);
         return Collections.unmodifiableMap(map);
      }
   },
   FAIRY {
      /**
       * 
       * Creates the matchups for the respective PokemonType.
       * 
       * @return     the created matchups
       * 
       */
      public Map<PokemonType, StatusEffect> createMatchup() {
         Map<PokemonType, StatusEffect> map = new EnumMap<PokemonType, StatusEffect>(PokemonType.class);
         map.put(PokemonType.NORMAL,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIRE,     StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.WATER,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ELECTRIC, StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GRASS,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ICE,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FIGHTING, StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.POISON,   StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.GROUND,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.FLYING,   StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.PSYCHIC,  StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.BUG,      StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.ROCK,     StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.GHOST,    StatusEffect.EVENLY_MATCHED);
         map.put(PokemonType.DRAGON,   StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.DARK,     StatusEffect.SUPER_EFFECTIVE);
         map.put(PokemonType.STEEL,    StatusEffect.NOT_VERY_EFFECTIVE);
         map.put(PokemonType.FAIRY,    StatusEffect.EVENLY_MATCHED);
         return Collections.unmodifiableMap(map);
      }
   },
   ;
     
      /** The matchups for the respective PokemonType. */
   private final Map<PokemonType, StatusEffect> pokemonTypeMatchup;
     
     /** Constructor. */
   PokemonMatchupResult()
   {
    
      this.pokemonTypeMatchup = createMatchup();
    
   }

   /**
    * 
    * Method that will create the matchup.
    * 
    * @return     a map containing the matchup results
    * 
    */
   public abstract Map<PokemonType, StatusEffect> createMatchup();

   /**
    * 
    * Fetches the matchups for a particular StatusEffect.
    * 
    * @param method     the StatusEffect we want to filter by
    * @return           the PokemonTypes affiliated to that StatusEffect
    * 
    */
   public Set<PokemonType> fetchByStatusEffect(StatusEffect method)
   {
   
      Set<PokemonType> result = EnumSet.noneOf(PokemonType.class);
   
      for (Map.Entry<PokemonType, StatusEffect> each : this.pokemonTypeMatchup.entrySet())
      {
      
         if (each.getValue() == method && each.getKey() instanceof PokemonType)
         {
         
            result.add(each.getKey());
         
         }
      
      }
   
      return Collections.unmodifiableSet(result);
   
   }
   
   /**
    * 
    * Fetches the StatusEffect mapped to the given PokemonType.
    * 
    * @param type    the key we are using to find the value
    * @return        the StatusEffect we are looking for
    * 
    */
   public StatusEffect getStatusEffect(PokemonType type)
   {
   
      return this.pokemonTypeMatchup.get(type);
   
   }
     
}
