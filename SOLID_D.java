/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solid_d;
import java.util.*;
/**
 *
 * @author labesp
 */
public class SOLID_D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. cabo");
        System.out.println("2. sargento");
        System.out.println("3. suboficial");
        System.out.println("4. Salir");
        int op = sc.nextInt();
        sc.nextLine();
        
        Militar militar = null;
        
        switch(op){
            case 1: militar = new CalculoCabo();
            case 2: militar = new CalculoSargento();
            case 3: militar = new CalculoSuboficial();
            case 4: break;
            default: System.out.println("Opcion Inválida¡¡");
        }
        
        GuardarMilitar guardar = new GuardarMongo();
        service.procesarEmpleado(militar);
    }  
}
