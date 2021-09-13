package io.github.dalayach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

/** This is a Scratch pad that I use to test out functionality before implementing it. */
public class ScratchPad
{
     
   /** This a dummy enum I put together to test how it would work to have all the effects grouped into a single enum. */
   public enum TestEnum
   {
   
      /** Attribute A. */
      A(
         Arrays.asList(
            "A1",
            "A2",
            "A3",
            "A4",
            "A5"
         ),
         Arrays.asList(
            "A1",
            "A2",
            "A3",
            "A4",
            "A5"
         )
      ),
   
      /** Attribute B. */
      B(
         Arrays.asList(//subcomponent
            "B1",
            "B2",
            "B3",
            "B4",
            "B5"
         ),
         Arrays.asList(//subcomponent
            "B1",
            "B2",
            "B3",
            "B4",
            "B5"
         )
      ),
   
      /** Attribute C. */
      C(
         //subcomponent
         Arrays.asList(
            "C1",
            "C2",
            "C3",
            "C4",
            "C5"
         ),
         Arrays.asList(//subcomponent
            "B1",
            "B2",
            "B3",
            "B4",
            "B5"
         )
      ),
   
      ;
   
      /** Private field. */
      private final Collection<String> strings;
   
      /** Private field. */
      private final Collection<String> strings2;
   
      /**
       * 
       * Constructor.
       * 
       * @param strings    strings
       * @param strings2   strings
       * 
       */
      TestEnum(Collection<String> strings, Collection<String> strings2)
      {
      
         this.strings = strings;
         this.strings2 = strings2;
      
      }
   
      /**
       * 
       * Getter.
       * 
       * @return     the strings
       * 
       */
      public Collection<String> getStrings()
      {
      
         return this.strings;
      
      }
   
   }

   /**  */
   public enum Test2 implements PrintA
   {
   
      A
      {
         /**  */
         public void init()
         { 
            System.out.println("a - " + a);
            a = 10;
            System.out.println("b - " + a);
         }
      },
      // B,
      // C,
      // D,
      ;
      
      /***/
      int a = 15;
      
      Test2()
      {
         System.out.println("c - " + a);
         init();
         System.out.println("d - " + a);
      }
      
      public void init()
      {
         System.out.println("e - " + a);
         a = 5;
         System.out.println("f - " + a);
      }
      
   }
   
   interface PrintA
   {
      
      int a = -5;
      
      public void init();
      
   }
   
   public enum Test3 implements Test3Interface
   {
   
      A
      {
         public int initA()
         { 
            return 10;
         }
      },
      ;
   
      private final int a;
      
      Test3()
      {
      
         a = initA();
      
      }
      
      public int getA()
      {
      
         return a;
      
      }
   
   }
   
   public interface Test3Interface
   {
   
      int initA();
   
   }
   
   public interface Test4
   {
   
      public enum Test4Enum implements Test4
      {
      
         A{
            public void initA() {}},
         ;
      
      }
      
      public void initA();
   
   }
   
      /** Constructor. */
   @Test
   public void scratchPad()
   {
   
      //this.testArraysAsList();
      //this.testAddingNullToSet();
      //this.testFreakyEnumAbilities();
      //this.testStringIndexOf();
   
   }
   
   @Test(expected = NullPointerException.class)
   public void testNullPointerException()
   {
   
      List<String> strings = new ArrayList<>();
      strings.add(null);
      strings.get(0).substring(2);
      
   }
   
   public void testStringIndexOf()
   {
   
      String test = "ABC.png";
   
      System.out.println(test);
      System.out.println(test.indexOf('.'));
      System.out.println(test.substring(0, test.indexOf('.')));
   
   }
   
   /** Java enums are extremely powerful. */
   public void testFreakyEnumAbilities()
   {
   
      System.out.println(Test3.A.getA());
      System.out.println(Test4.Test4Enum.A);
   
   }
   
   /** Let's see if we can add a null to a Set. */
   public void testAddingNullToSet()
   {
   
      Set<TestEnum> values = EnumSet.noneOf(TestEnum.class);
   
      values.add(null); 
   
   }
   
   /** Let's learn how flexible Arrays.asList() is. */
   public void testArrayAsList()
   {
   
      System.out.println(Arrays.asList("A", "B", "C"));
      System.out.println(Arrays.asList("A"));
      System.out.println(Arrays.asList());
   
   }
   
   /**
    * 
    * Main method.
    * 
    * @param args    will never need command line functionality for this class, so this parameter is redundant.
    * 
    */
   public static void main(String[] args)
   {
   
      new ScratchPad();
   
   }

}
