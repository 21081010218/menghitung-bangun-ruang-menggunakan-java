/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elang
 */
public class rectangle {
 public int width = 8 ;
 public int height = 6 ;
    
        public int Area(){
            int Area;
            Area = this.width * this.height; //atribut milik kelas (this)
            return Area;
        }
        
        public int Perimeter(){
            int Perimeter;
            Perimeter = 2 * this.width + this.height;
            return Perimeter;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rectangle persegipanjang = new rectangle();
        System.out.println("area rectangle adalah"+persegipanjang.Area());
        System.out.println("perimeter rectangle adalah "+persegipanjang.Perimeter());
        // TODO code application logic here
    }
    
}
