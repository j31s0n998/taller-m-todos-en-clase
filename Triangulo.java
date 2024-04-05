/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerenclaseb1;

/**
 *
 * @author LabSispc15
 */
public class Triangulo {
    public double AreaYPerimetro (double base, double altura, double lado){
       int  opcion = 0; 
    switch (opcion){
        case 1: 
            double area= base*altura/2;
            return area;
        
        case 2:
           double perimetro= base+lado+lado ;
           return perimetro;
        case 3:
            double hipotenusa = Math.sqrt(Math.pow(altura, 2)*Math.pow(base, 2));
            return hipotenusa;
        default :
            System.out.println("eliga una opcion en parametros");
    }  
        return 0.0;
    }
}
