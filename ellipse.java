/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elang
 */
public class ellipse {
 public int a = 14 ;
 public int b = 12 ;
 public double pi = 3.14159265359 ;
    
        public int Area(){
            int Area;
            Area = math.pi * this.a * this.b ; //atribut milik kelas (this)
            return Area;
        }
        
        public int Perimeter(){
            int Perimeter;
            Perimeter = math.pi * (this.a +this.b) * (1 + (3 * ((this.a -this.b))) ;;
            return Perimeter;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ellipse elips = new ellipse ();
        System.out.println("area ellipse adalah"+elips.Area());
        System.out.println("perimeter ellipse adalah "+elips.Perimeter());
        // TODO code application logic here
    }
    
}

    
