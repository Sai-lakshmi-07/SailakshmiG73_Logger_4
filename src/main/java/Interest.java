
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Interest {
    private static final Logger LOGGER= LogManager.getLogger(Main.class);
    double p;
    double t;
    double r;
    Interest(double x,double y,double z)
    {
        p=x;
        t=y;
        r=z;
    }
    double simple_display()
    {
        LOGGER.info("Entered into simple_display() method of Interest.java class\n");
        LOGGER.info("Exited from simple_display() method of Interest.java class\n");
        return (p*t*r)/100;
    }
    double compound_display(int n)
    {
        LOGGER.info("Entered into compound_display() method of Interest.java class\n");
        LOGGER.info("Exited from compound_display() method of Interest.java class\n");
        return (p*Math.pow((1+(r/n)),(n*t)))-p;
    }


}
