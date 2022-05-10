/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

/**
 *
 * @author Anto
 */
public class Colegio {
     public static void main(String[] args) {
        
        Materia inglesUno = new Materia(1, "Ingles I", 1);
        Materia matematicasUno = new Materia(2, "Matematicas I", 1);
        Materia laboratorioUno = new Materia(3, "Laboratorio 1", 1);

        Alumno tobar = new Alumno(1001, "Tobar", "Gala");
        Alumno calibar = new Alumno(1002, "Calibar", "Camila");

        
        tobar.agregarMateria(inglesUno);
        tobar.agregarMateria(matematicasUno);
        tobar.agregarMateria(laboratorioUno);
        
        
        calibar.agregarMateria(inglesUno);
        calibar.agregarMateria(matematicasUno);
        calibar.agregarMateria(laboratorioUno);
        calibar.agregarMateria(laboratorioUno);
       
        calibar.agregarMateria(inglesUno);
        System.out.println("Tobar: " + tobar.cantidadMaterias());
        System.out.println("Calibar: " + calibar.cantidadMaterias());

    }
    
}

