
package sinan.homeworks.homework02;

public class LoopNumber {
    
    static boolean isPower2(int n) {
        return (n & n - 1) == 0;
    }
     
    static void power2List(){
        for (int i=1; i<=100; i++){
    
        int a = (int)Math.pow(2, i); 
        System.out.println("2 nin "+i+". kuvveti= "+a);
        } 
    }
       
      
    public static void main(String[] args) {
        
        power2List();
        isPower2(2);
        
    }
    
    
}
