import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Construction {
    private static final Logger LOGGER=LogManager.getLogger(Main.class);
    String std;
    boolean automated;
    double tot_area;
    double h_c_cst;
    Construction(String x,double y,boolean z)
    {
        std=x;
        tot_area=y;
        automated=z;
    }
    double calculate()
    {
        LOGGER.info("Entered into calculate() method of Construction.java class\n");
        if(!automated) {
            if (std == "Normal") {
                h_c_cst = tot_area * 1200;
            } else if (std == "Above") {
                h_c_cst = tot_area * 1500;
            } else if (std == "High") {
                h_c_cst = tot_area * 1800;
            }
        }
        else {
            h_c_cst = tot_area * 2500;
        }
        LOGGER.info("Exited into calculate() method of Construction.java class\n");
        return h_c_cst;
    }



}
