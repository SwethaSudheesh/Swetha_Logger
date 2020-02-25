package simpleinterest;
import java.util.Scanner;
import com.epam.sample.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Simpleinterest extends App{
public static int simpleinterestcalculation()
{
int principalamount,rateperannum,timeinyears;
Scanner object=new Scanner(System.in);
Logger LOGGER= LogManager.getLogger(App.class);
LOGGER.info("enter the value of initial amount of the loan taken");
principalamount = object.nextInt();

LOGGER.info("enter the of rate of interest");
rateperannum = object.nextInt();

LOGGER.info("enter the of term of loan in deposit (time in years)");
timeinyears = object.nextInt();

int totalsimpleintrest = (principalamount * rateperannum *timeinyears)/100;
object.close();

return totalsimpleintrest;

}
}
