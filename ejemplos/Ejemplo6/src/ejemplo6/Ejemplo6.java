/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo6;


import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author UTPL
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    
    String nombre;
    String apellido;
    String usuario;
    String parroquia;
    int edad;
    int diaPago;
    double total;
    double costoFijo = 25;
    double descuento =0.5 ;
    
    System.out.println("Ingrese el nombre: ");
    nombre = entrada.nextLine();
    System.out.println("Ingrese el apellido: ");
    apellido = entrada.nextLine();
    System.out.println("Ingrese el usuario: ");
    usuario = entrada.nextLine();
    System.out.println("Ingrese el parroqui: ");
    parroquia = entrada.nextLine();
    System.out.println("Ingrese su edad: ");
    edad = entrada.nextInt();
    System.out.println("Ingrese el dia de pago: ");
    diaPago = entrada.nextInt();
    
    
    if( (diaPago <= 10) && (parroquia.equals("El Valle")||parroquia.equals("El Sagrario"))){
        descuento = costoFijo * descuento;
        total = costoFijo - descuento;
        System.out.printf("Gimnasio \n Nombre: %s\nApellido: %s\nUsuario: %s\nParroquia: "
                + "%s\nEdad: %d\nDia Pago: %d\nTotal: %.2f\nDescuento : $%.2f\nTotal a"
                + "Pagar: $%.2f )", nombre,apellido,usuario,parroquia,edad,diaPago,
                costoFijo,descuento,total);
       
    }else{
        total = costoFijo;
        System.out.printf("Gimnasio \n Nombre: %s\nApellido: %s\nUsuario: %s\nParroquia: "
                + "%s\nEdad: %d\nDia Pago: %d\nTotal a Pagar: $%.2f )", nombre,apellido,usuario,parroquia,edad,diaPago,total);
    }
    
    
    
    
    
   
    }
    
}
