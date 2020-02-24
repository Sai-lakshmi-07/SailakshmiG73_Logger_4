import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    static double simple_interest,construction_cost,compound_interest;
    public static void main(String[] args)
    {
        LOGGER.info("Entered into main() method\n");
        LOGGER.info("Created an Interest.java class Object ");
        Interest s=new Interest(1234,72,50);
        LOGGER.info("To find Simple Interest:\n");
        simple_interest=s.simple_display();
        LOGGER.info("SimpleInterest : "+simple_interest+"/-");
        LOGGER.info("To find Compound Interest:\n");
        compound_interest=s.compound_display(3);
        LOGGER.info("CompoundInterest : "+compound_interest+"/-");
        LOGGER.info("Created an Construction.java class Object ");
        Construction c = new Construction("Low",73,true);
        LOGGER.info("To find House Construction Cost :\n");
        construction_cost=c.calculate();
        LOGGER.info("Total House Construction Cost : "+construction_cost+"/-");
        LOGGER.info("Exited from main() method\n");

    }

}