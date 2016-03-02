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
public class Student {
    String Adi,Soyadi,Okulu,Bolumu;
    int numarasi;   
    public Student (String ad, String soyad, String okul,String bolum,int num){ 
this.Adi = ad;     
this.Soyadi = soyad;
this.Okulu = okul;  
this.Bolumu = bolum; 
this.numarasi = num;  
    }   
    public static void displayStudent(String ad, String soyad, String okul,String bolum,int num) { 
       System.out.println("Adi:"+ad+" Soyadi:"+soyad+" Okulu:"+okul+" Bolumu:"+bolum+" Numarası:"+num); 
    }    
     public static void main(String[] args) { 
         
         Student ogrenci1 = new Student("Sinan","Kurtalan","Okan Uni","Mobil tek",55);
         Student ogrenci2 = new Student("Emrah","Yıldız","Marmara Uni","Bilg. Müh.",75);         
         displayStudent(ogrenci1.Adi,ogrenci1.Soyadi,ogrenci1.Okulu,ogrenci1.Bolumu,ogrenci1.numarasi); 
         displayStudent(ogrenci2.Adi,ogrenci2.Soyadi,ogrenci2.Okulu,ogrenci2.Bolumu,ogrenci2.numarasi); 
         
         if (ogrenci1 == ogrenci2) {
         System.out.println("Eşit");
         }
         else {
         System.out.println("Eşit Değil");
         }    
     }   
}
