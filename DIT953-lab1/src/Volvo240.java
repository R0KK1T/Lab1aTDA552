import java.awt.*;
/**
 * Represents a specific car model
 */
public class Volvo240 extends Car{

    public final static double trimFactor = 1.25;

    /**
     * Constructs a Volvo240
     */
    public Volvo240(){
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        x = 0;
        y = 0;
        direction = 0;
        stopEngine();
    }

    /**
     * Access the the speed factor based on engine power and trim factor
     * @return the speed factor
     */
    protected double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }
}
