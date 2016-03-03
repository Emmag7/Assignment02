
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author godie2014
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        new Wall(kw, 0, 0, Direction.WEST);
        new Wall(kw, 1, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.WEST);
        new Wall(kw, 3, 0, Direction.WEST);
        new Wall(kw, 4, 0, Direction.WEST);
        new Wall(kw, 5, 0, Direction.WEST);
        new Wall(kw, 6, 0, Direction.WEST);
        new Wall(kw, 7, 0, Direction.WEST);
        new Wall(kw, 8, 0, Direction.WEST);
        new Wall(kw, 9, 0, Direction.WEST);
        new Thing(kw, 1, 0);
        new Thing(kw, 2, 0);
        new Thing(kw, 3, 0);
        new Thing(kw, 4, 0);
        new Thing(kw, 0, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 7, 0);
        new Thing(kw, 7, 1);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 0, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 2, 1, Direction.EAST);
        new Wall(kw, 3, 1, Direction.EAST);

        new Wall(kw, 5, 1, Direction.EAST);


        new Thing(kw, 5, 1);
        new Thing(kw, 8, 1);
        new Thing(kw, 9, 1);
        new Thing(kw, 9, 0);
        new Wall(kw, 6, 1, Direction.EAST);
        new Wall(kw, 7, 1, Direction.EAST);
        new Wall(kw, 8, 1, Direction.EAST);
        new Wall(kw, 9, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 9, 2, Direction.SOUTH);
        new Wall(kw, 9, 2, Direction.EAST);
        new Wall(kw, 8, 3, Direction.SOUTH);
        new Wall(kw, 8, 4, Direction.SOUTH);
        new Wall(kw, 8, 5, Direction.SOUTH);
        new Wall(kw, 8, 6, Direction.SOUTH);
        new Wall(kw, 8, 7, Direction.SOUTH);
        new Wall(kw, 8, 7, Direction.EAST);
        new Wall(kw, 7, 7, Direction.EAST);

        new Wall(kw, 7, 3, Direction.NORTH);
        new Wall(kw, 7, 4, Direction.NORTH);
        new Wall(kw, 7, 5, Direction.NORTH);
        new Wall(kw, 7, 6, Direction.NORTH);
        new Wall(kw, 7, 7, Direction.NORTH);
        new Wall(kw, 6, 2, Direction.EAST);
        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Thing(kw, 9, 3);
        new Thing(kw, 9, 4);
        new Thing(kw, 9, 6);
        new Thing(kw, 8, 6);
        new Thing(kw, 8, 3);
        new Thing(kw, 8, 4);
        new Thing(kw, 7, 7);
        new Thing(kw, 7, 2);
        new Thing(kw, 7, 3);
        new Thing(kw, 4, 3);
        new Thing(kw, 4, 4);
        new Thing(kw, 4, 2);
        new Wall(kw, 4, 5, Direction.SOUTH);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 3, Direction.NORTH);
        new Wall(kw, 3, 2, Direction.EAST);
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 6, Direction.SOUTH);
        new Wall(kw, 2, 6, Direction.EAST);
        new Wall(kw, 1, 6, Direction.EAST);
        new Wall(kw, 1, 6, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 0, 2, Direction.EAST);
        Robot karel = new Robot(kw, 0, 2, Direction.SOUTH);
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 6);
        new Thing(kw, 3, 4);
        new Thing(kw, 0, 3);
        new Thing(kw, 0, 4);
        new Thing(kw, 4, 6);
        new Thing(kw, 4, 7);
        new Thing(kw, 0, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 5, 7);
        new Thing(kw, 5, 5);
        new Thing(kw, 6, 6);
        new Thing(kw, 6, 6);
        new Thing(kw, 6, 4);
        new Thing(kw, 9, 2);
        new Thing(kw, 3, 6);


        
        while (true)
                if (karel.canPickThing()&& karel.getAvenue()!=2){
                    karel.pickThing();
                } else if (karel.countThingsInBackpack()>0 && karel.getAvenue()==2){
                    karel.putThing();
                   
                }    else if(karel.getAvenue()==2 && karel.frontIsClear()== false && karel.getDirection()==Direction.SOUTH){
                        break;    
                } else if (karel.frontIsClear()==false){
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                     
                } else if (karel.frontIsClear()){
                    karel.move();
                    karel.turnLeft();
                    
                }
                    
                    Robot tina= new Robot (kw,0,2,Direction.SOUTH);
                    while (tina.frontIsClear()){
                        tina.move();
                        
                    while (tina.canPickThing()){
                        tina.pickThing();
                    
                }
                    
                    
                    
                    
                 
                    
                    
              
                      
                         
                    
                    
                            
                            
                            
                         
                        
                       
                } 
                } 
                    

    /*    while (karel.frontIsClear()) {

            karel.turnLeft();
            // found driveway
            if (karel.frontIsClear()) {
                // clean driveway
                karel.move();
                karel.pickThing();
                
                
                
    
                
                
                    // no driveway    
                } else {
                // turn back
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                // next spot
                karel.move();
                
                
                



            }*/












        }



    }
}
}
}
