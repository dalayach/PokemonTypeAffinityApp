package io.github.dalayach;

/**
 * 
 * This program allows you to calculate the best attacking types to use against a Set of defending types. You simply select 
 * the types that the defending Pokemon has, then click the desired status effect against that Pokemon.
 * 
 * @see <a href="https://gamefaqs1.cbsistatic.com/faqs/32/76632-2.png">Pokemon Type Chart</a>
 * 
 */
public class Main
{

   /**
    * 
    * Main method.
    * 
    * @param args       If you wish to use the commandline version of this application, simply provide all the types of the
    *                   defending Pokemon (separated by spaces) as commandline arguments, then the program will return the
    *                   results.
    * 
    */
   public static void main(String[] args)
   {
   
      if (args.length >= 1)
      {
      
         new CommandLineApp(args);
      
      }
      
      else
      {
      
         new GUI();
      
      }
   
   }
}
