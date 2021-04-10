/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import java.util.Random;

/**
 *
 * @author lucas
 */
public class Rectangle {
    
    private int height; //private mean they can not be accessed outside the class
    private int width;
    
//CONSTRUCTOR
    
    //create a default retangle

public Rectangle(){
    
    this.height = pickRandomInt();
    this.width = pickRandomInt();
    
}   

public Rectangle(int h, int w){
    
    this.height = h;
    this.width = w;
}




//METHODS
    public int getArea(){
        
        return (this.height * this.width);
    }
    
    public int getPerimeter(){
        
        return ( (this.height * 2) + (this.width *2) );
        
    }
    

        
    
    private int pickRandomInt(){
        
        Random r = new Random();
        
        return (r.nextInt(100));
    }
}
