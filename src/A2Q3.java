
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author godie2014
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //add new city
        City kw = new City();

        //add new robot 
        Robot karel = new Robot(kw, 0, 9, Direction.EAST);

        //if street isnt 0 
        if (karel.getStreet() > 0) {
            //if direction isnt north turn until north
            while (karel.getDirection() != Direction.NORTH) {
                karel.turnLeft();
            }
            //if street isnt 0 move until 0
            while (karel.getStreet() > 0) {
                karel.move();
            }
        }

        // if avenue isnt 0
        if (karel.getAvenue() > 0) {
            // if direction isnt west turn until west
            while (karel.getDirection() != Direction.WEST) {
                karel.turnLeft();
            }
            //if avenue isnt 0 move until 0
            while (karel.getAvenue() > 0) {
                karel.move();

            }
        }
    }
}
