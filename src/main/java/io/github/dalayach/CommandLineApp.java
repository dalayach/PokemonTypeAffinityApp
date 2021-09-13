package io.github.dalayach;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

/** Class that runs a small portion of the GUI version of this app as a command line version of this app. */
public class CommandLineApp
{

   /**
    * 
    * Constructor that takes in command line arguments from the Main class.
    * 
    * @param args    the command line arguments
    * 
    */
   public CommandLineApp(String[] args)
   {
   
      runCommandLineVersion(args);
   
   }

   /**
    * 
    * Method to run the command line version of this application. Will print the output to the terminal.
    * 
    * @param args    the command line arguments. Must be a PokemonType.
    * 
    */
   public void runCommandLineVersion(String[] args)
   {
   
      try
      {
      
         printResults(StatusEffect.SUPER_EFFECTIVE, args);
         printResults(StatusEffect.EVENLY_MATCHED, args);
         printResults(StatusEffect.NOT_VERY_EFFECTIVE, args);
         printResults(StatusEffect.NO_EFFECT, args);
         
      } catch (IllegalArgumentException iae)
      {
      
         System.err.println(
               "Invalid value - either run without arguments (GUI version), or use only the following inputs (you can choose "
               + "multiple)\n" + Arrays.asList(PokemonType.values()));
      
      }
   
   }
   
   /**
    * 
    * Prints results from the command line run of the program.
    * 
    * @param method     the form of comparison used to create the results
    * @param args       the original inputs the user provided
    * 
    */
   public void printResults(StatusEffect method, String[] args)
   {
   
      Set<PokemonType> types = EnumSet.noneOf(PokemonType.class);
      
      for (String each : args)
      {
         
         types.add(PokemonType.valueOf(each.toUpperCase()));
         
      }
         
      Set<PokemonType> results = fetchComparisonResults(method, args);
   
      String output = results.toString();
   
      switch (method)
      {
         case NO_EFFECT:
            output += (results.size() > 0 ? " have " : " has ");
            break;
         default:
            output += (results.size() > 0 ? " are " : " is ");
            break;
      }
      
      System.out.println(
            output
            + method
            + " against a Pokemon with the following types "
            + Arrays.asList(args));
      
   }

   /**
    * 
    * Fetches the comparison results.
    * 
    * @param method     the StatusEffect that we will be using to perform comparisons
    * @param args       the commandline arguments that will be converted into PokemonTypes
    * @return           the results of the comparison
    * 
    */
   private Set<PokemonType> fetchComparisonResults(StatusEffect method, String[] args)
   {
   
      Set<PokemonType> types = EnumSet.noneOf(PokemonType.class);
      
      for (String each : args)
      {
         
         types.add(PokemonType.valueOf(each.toUpperCase()));
         
      }
         
      return PokemonType.calculateAttackingTypes(method, types);
   
   }   

}
