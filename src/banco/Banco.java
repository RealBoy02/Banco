/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author ismae
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HELLO WORLD");
        
        Scanner ic = new Scanner(System.in);
        double sueldo;
        double saldo;
        double saldo1;
        
        
        Trabajador t1 = new Trabajador();
        t1.setTelefono(762101729);
        int telefono = t1.getTelefono();
        System.out.println("este es el numero del empleado> " + telefono);
        t1.setNombre("ismael cortez aguilar");
        String nombre = t1.getNombre();
        System.out.println("este es el nombre del empleado> " + nombre);
        t1.setCurp("COAI11122HGRRGSA8");
        String curp = t1.getCurp();
        System.out.println("este es la curp del empleado> " + curp);
        sueldo = t1.calsueldo(15, 170, 0 );
        System.out.println("ESTE ES EL SUELDO> " + sueldo);
        
        Cliente p1 = new Cliente();
        p1.setNombre("ismael");
        String nombreq = p1.getNombre();
        System.out.println("despues de retirar> " + nombreq);
        saldo = p1.retiro(2550, 1000);
        System.out.println("despues de invertir> " + saldo);
        saldo1 = p1.inver(1000, 1000, 0);
        System.out.println("este es el numero del empleado> " + saldo1);
        
        
        
    }
    
}
