package constructioncost;
import java.util.Scanner;
import com.epam.sample.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Constructioncost extends App {
public static int costcalculation() {
Scanner ob = new Scanner(System.in);
int a[]= {1200,1500,1800,2500};
Logger LOGGER= LogManager.getLogger(App.class);
LOGGER.info("Enter the length of Rectangle:");
int length = ob.nextInt();
LOGGER.info("Enter the width of Rectangle:");
int width = ob.nextInt();
int area = length*width;
LOGGER.info("Enter the type of material to be used");
LOGGER.info("1. Standard materials");
LOGGER.info("2. Above standard materials");
LOGGER.info("3. High standard material");
LOGGER.info("4. High standard material and fully automated house");
int ch = ob.nextInt();
ob.close();
  return area*a[ch-1];
}
}