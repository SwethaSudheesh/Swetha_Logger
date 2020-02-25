package compoundinterest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
import com.epam.sample.*;
public class Compoundinterest extends App {
public static int compoundinterestcalculation()
{
int principalinvestment,rateofinterest,numberoftimescompounded,time;
Scanner object =new Scanner(System.in);
Logger LOGGER= LogManager.getLogger(App.class);
LOGGER.info("Enter the principal investment amount (the initial deposit or loan amount) (p)");
principalinvestment = object.nextInt();

LOGGER.info("Enter the annual interest rate (in decimal) (r)");
rateofinterest = object.nextInt();

LOGGER.info("Enter the number of times that interest is compounded per unit time (n)");
numberoftimescompounded = object.nextInt();

LOGGER.info("enter the time the money is invested or borrowed for (t)");
time = object.nextInt();

object.close();
int finalamount = (principalinvestment* (1 + rateofinterest/numberoftimescompounded))^ (numberoftimescompounded*time);

return finalamount;

}
}
