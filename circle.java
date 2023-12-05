/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elang
 */
public class circle {
 public int radius = 14 ;
 public double pi = 3.14159265359 ;
    
        public int Area(){
            int Area;
            Area = this.pi * this.radius * this.radius ; //atribut milik kelas (this)
            return Area;
        }
        
        public int Perimeter(){
            int Perimeter;
            Perimeter = 2 * this.pi + this.radius;
            return Perimeter;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        circle lingkaran = new circle ();
        System.out.println("area circle adalah"+lingkaran.Area());
        System.out.println("perimeter circle adalah "+lingkaran.Perimeter());
        // TODO code application logic here
    }
    
}

    
