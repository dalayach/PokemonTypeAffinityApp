package io.github.dalayach;

import java.util.Collection;

/** Simple class for providing basic validations to various methods. */
public class Validator
{

   /** Throws an exception if object is null. */
   public static <T> void checkForNulls(T type)
   {
   
      if (type == null)
      {
      
         throw new NullPointerException("Type is null!");
      
      }
   
   }

   /** Throws an exception if array is null. */
   public static <T> void checkForNulls(T[] types)
   {
   
      if (types == null)
      {
      
         throw new NullPointerException("Types are null!");
      
      }
   
      for (T each : types)
      {
      
         if (each == null)
         {
         
            throw new NullPointerException("Type is null!");
         
         }
      
      }
   
   }

   /** Throws an exception if the Collection or any of the elements within it are null. */
   public static <T> void checkForNulls(Collection<T> types)
   {
   
      if (types == null)
      {
      
         throw new NullPointerException("The collection is null!");
      
      }
   
      for (T each : types)
      {
      
         if (each == null)
         {
         
            throw new NullPointerException("Type is null!");
         
         }
      
      }
   
   }

}
