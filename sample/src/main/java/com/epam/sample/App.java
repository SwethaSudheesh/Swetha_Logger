package com.epam.sample;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
import compoundinterest.Compoundinterest;
import constructioncost.Constructioncost;
import simpleinterest.Simpleinterest;
public class App {
public static void main(String[] args)
{
	Scanner ob=new Scanner(System.in);
	Logger LOGGER= LogManager.getLogger(App.class);
     LOGGER.info("Calculate Simple intrest and Compound interest ");
     LOGGER.info("1. Simple intrest");
     LOGGER.info("2. Compound intrest");
     LOGGER.info("3. Construction Cost");
     int ch = ob.nextInt();
     if(ch==1)
      {
       LOGGER.info(Simpleinterest.simpleinterestcalculation());
      
      }
       if(ch==2)
     {
       LOGGER.info(Compoundinterest.compoundinterestcalculation());
     }
       if(ch==3)
       {
         LOGGER.info(Constructioncost.costcalculation());
       }
       ob.close();
}
}