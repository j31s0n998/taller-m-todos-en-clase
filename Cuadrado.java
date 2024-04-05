/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerenclaseb1;


public class Cuadrado {
    public double AreaYPerimetro (double lado){
       int  opcion = 0; 
    switch (opcion){
        case 1: 
            double area= Math.pow(lado, 2);
            return area;
        
        case 2:
           double perimetro = lado*4;
           return perimetro;
        default :
            System.out.println("eliga una opcion en parametros");
    }  
        return 0.0;
    }
}
