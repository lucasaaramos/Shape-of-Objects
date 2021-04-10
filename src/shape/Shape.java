/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author lucas
 */
public class Shape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangle myRectangle = new Rectangle();
        
        Rectangle myRectangle2 = new Rectangle();

        Rectangle myRectangle3;
        
        System.out.println("The area of my rectangle is " + myRectangle.getArea());
       
        System.out.println("The perimeter of my rectangle is " + myRectangle.getPerimeter());
       
        System.out.println("The area of my rectangle 2 is " + myRectangle2.getArea());

        System.out.println("");//jumping a line to let clear
        
        /*Scanner myKb = new Scanner (System.in);
       
        System.out.println("What is the height of your rectangle?" );
        int height = myKb.nextInt();
       
        System.out.println("What is the width of your rectangle?" );
        int width = myKb.nextInt();
       
        myRectangle3 = new Rectangle (height, width);
       
        System.out.println("The area of the rectangle 3 is: " + myRectangle3.getArea() );*/
       
                
        
        Circle myCircle = new Circle();
        
        DecimalFormat df = new DecimalFormat ("##.###");//formating the value for 3 number after ","
        
        System.out.println("The area of my circle is " + df.format(myCircle.getArea()));//getting the information from the methods in the class Circle
       
        System.out.println("The perimeter of my circle is " + df.format(myCircle.getPerimeter()));//getting the information from the methods in the class Circle

    }   
}
        //PRACTICE
        /*String r = getInput("Please enter radius circle: ");//getting the radius of the circle
            double area = 0; //considering initial value as 0 to make the calc
            double per = 0;
       
        area =  Circle.getArea(r); //getting value from class circle/getArea Method
        per = Circle.getPerimeter(r); //getting value from class circle/getPerimeter Method
        
        DecimalFormat df = new DecimalFormat ("##.###"); //formating the value for 3 number after ","
        System.out.println("The circle area is: " + df.format(area)); //printing the area value as calculated in the method
        System.out.println("The perimeter area is: " + df.format(per));//printing the perimeter value as calculated in the method
    }*/