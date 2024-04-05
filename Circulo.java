/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerenclaseb1;

/**
 *
 * @author LabSispc15
 */
public class Circulo {
    public double AreaYPerimetro (double radio){
       int  opcion = 0; 
    switch (opcion){
        case 1: 
            double area = Math.PI*Math.pow(radio, 2);
            return area;
        case 2:
            double perimetro = Math.PI*2*radio;
            return perimetro;
        default :
            System.out.println("eliga una opcion en parametros");
    }  
        return 0.0;
    }
}
