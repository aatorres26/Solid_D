/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid_d;

import java.util.*;

/**
 *
 * @author labesp
 */
public class CalculoSargento extends Militar implements CalcularSalario, MostrarDatos {


    @Override
    public void ingresarMilitar() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar el nombre del militar: ");  
        nombre = sc.nextLine();
        System.out.println("Ingresa la especialidad: ");
        especialidad = sc.nextLine();
        System.out.println("Ingresa las semanas de trabajo: ");
        semanas = sc.nextDouble(); sc.nextLine();
    }

    @Override
    public double calcularSalario() {
        return semanas*90;
    }
    
    @Override
    public void mostrar() {
        System.out.println("====REPORTE DE EMPLEADO====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Departamento: " + especialidad);
        System.out.println("Salario: " + calcularSalario());
    }
}
