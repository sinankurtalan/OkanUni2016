/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinan.homeworks.homework03;

/**
 *
 * @author 'sinan
 */

public class Box {
    double height, width;

public Box(double h, double w){ 
this.height = h;  
this.width = w;
}
public Box(double h){ 
this.height = h; 
}

public double getHeight() {
return height;
}

public double getWidth() {
return width;    
}
  public static void main(String[] args) {   
    Box deger1 = new Box(10); 
    
    Box deger2 = new Box(10,11); 
    
    if (deger1 == deger2) {
    System.out.println("Nesneler Birbirini Doğruluyor");
    }
    else {
    System.out.println("Nesneler Birbirini Doğrulamıyor");
    }
    
    if (deger1.equals(deger2)) {
    System.out.println("İki nesne aynı");
    }
    else {
          System.out.println("İki nesne farklı");        
        }         
    }
}
