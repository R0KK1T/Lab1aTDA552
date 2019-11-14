import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class CarTest {
    @Test
    public void TestTurbo() {
        Saab95 saab = new Saab95(Color.black);
        saab.startEngine();
        saab.setTurboOn();
        saab.gas(0.5);
        assertTrue(saab.getCurrentSpeed() == 0.9125);
    }

    @Test
    public void StartAndGasTest() {
        Saab95 saab = new Saab95(Color.black);
        Volvo240 volvo = new Volvo240(Color.red);
        saab.startEngine();
        volvo.startEngine();
        saab.gas(0.5);
        volvo.gas(0.5);
        assertTrue(saab.getCurrentSpeed() == 0.725);
        assertTrue(volvo.getCurrentSpeed() == 0.725);
        saab.gas(1);
        volvo.gas(1);
        assertTrue(saab.getCurrentSpeed() == 1.975);
        assertTrue(volvo.getCurrentSpeed() == 1.975);

    }

    @Test
    public void TurnAndMoveTest() {
        Saab95 saab = new Saab95(Color.black);
        Volvo240 volvo = new Volvo240(Color.red);
        saab.startEngine();
        volvo.startEngine();
        saab.turnLeft(Math.PI / 2);
        volvo.turnRight(Math.PI);
        saab.move();
        volvo.move();
        assertTrue(saab.getY() == 0.1);
        assertTrue(volvo.getX() == -0.1);
    }

    @Test
    public void BreakTest(){
        Saab95 saab = new Saab95(Color.black);
        Volvo240 volvo = new Volvo240(Color.red);
        saab.gas(1);
        volvo.gas(0.25);
        saab.brake(1);
        volvo.brake(0.25);
        assertTrue(saab.getCurrentSpeed() == 0);
        assertTrue(volvo.getCurrentSpeed() == 0);
    }

    /*
    @Test
    public void GasTest(){
        Saab95 saab = new Saab95();
        Volvo240 volvo = new Volvo240();
    }
     */
}