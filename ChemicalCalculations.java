
package chemicalcalculations;

import java.util.Scanner;

public class ChemicalCalculations {
   
    public static void main(String[] args) {
     
       int chois ;
    
     do {
             
         Scanner input = new Scanner(System.in);
         
             double weightG ;
             double molecularWeight ;
             double WeightSolvent ;
              double mollSolute;
             double moll ;
             double valueL ;
             double mollElement ;
             double TotalMoll;
            double Weightsolute5;
                  double   WeightSolvent5;
             int calculation;
       int chois6;
              System.out.println("         Wellcom to Chemical Calculation");
              
              //-------------------------------------------------------------------\\
         System.out.print("Choose your calculation"
                 +  "\n1- Find moll by using weight (g) "
                 + " \n2- Find Molality"
                 + " \n3- Find Molarity"
                 + "\n4- Find Mole Fraction "
                 + "\n5- find weight percentage"
                 + " \n6- Find M1 , v1 , M2 Or V2 by dilution low \n");
              
         
//-------------------------------------------------------------------\\
               calculation = input.nextInt();
       switch (calculation) {
           case 1:
                System.out.println(" Enter the  weight  and  molecular Weight " );
               weightG = input.nextDouble();
               molecularWeight = input.nextDouble();
              
               System.out.println("The number of moll is:  " + (weightG / molecularWeight));
               break;
           case 2:
              System.out.println(" Enter the Enter the  moll of solute and Weight of the solvent : " );
                mollSolute = input.nextDouble();
              WeightSolvent = input.nextDouble();
               System.out.println("The Molality :  " +  (mollSolute / WeightSolvent)*100 + "Mol/Kg");
               break;
           case 3:
               System.out.println(" Enter the  moll of solute and value(L) " );
               moll = input.nextDouble();
               valueL = input.nextDouble();
               System.out.println("The Molarity is:  " + ( moll / valueL) + "Mole/L");
               break;
                case 4:
               System.out.println(" Enter the  moll of Element and Total Moll " );
               mollElement = input.nextDouble();
               TotalMoll = input.nextDouble();
               System.out.println("The Mole Fraction is:  " + ( mollElement / TotalMoll) + "Mole");
               break;
                case 5:
               System.out.println(" Enter the  Weight of solute and Weight of Solvent " );
               Weightsolute5 = input.nextDouble();
               WeightSolvent5 = input.nextDouble();
               System.out.println("The weight percentage is:  " + ( Weightsolute5 / WeightSolvent5)*100 + "%");
               break;
              case 6:
              System.out.println(" What do you want to calculate \n ( 1- M1 , 2- V1 , 3- M2 ,4-  v2 ) ?  " );
     chois6 = input.nextInt();  
     if (chois6  == 1 ) {
               System.out.println(" Enter the V1 , M2 , V2 ");
      double V1  = input.nextDouble();
      double M2  = input.nextDouble(); 
      double V2 = input.nextDouble();
            
  System.out.println(" M1 = " + (M2*V2)/V1 + "Molar") ;
          }
  if (chois6  == 2 ){
               System.out.println(" Enter the M1 , M2 , V2 ");
      double M1  = input.nextDouble();
      double M2  = input.nextDouble(); 
      double V2 = input.nextDouble();
            
 System.out.println(" M1 = " + (M2*V2)/M1 + "Molar") ;
  
  
          }
   if (chois6  == 3 ){
               System.out.println(" Enter the M1 , V1 , V2 ");
      double M1  = input.nextDouble();
      double V1  = input.nextDouble(); 
      double V2 = input.nextDouble();
            
  System.out.println(" M1 = " + (M1*V1)/V2 + "Molar") ;
  
  
          }
    if (chois6  == 4 ){
               System.out.println(" Enter the M1 , V1 , M2 ");
      double M1  = input.nextDouble();
      double V1  = input.nextDouble(); 
      double M2 = input.nextDouble();
            
  System.out.println(" M1 = " + (M1*V1)/M2 + "Molar") ;
  
  
          }
     
     
           default:
               System.out.println("Incorrect chois" );
               break;
       }
        
     System.out.println(" Do you want other Calculations ? \n 1- Yes  2- No" );
     chois = input.nextInt(); 
   } 
     while( chois == 1 ); 
     
    }
    
}

    

