import cl.praxis.model.Estudiante;
import cl.praxis.model.Persona;
import cl.praxis.model.Profesor;
import cl.praxis.model.ProfesorAyudante;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    /*
    List<Profesor> profesores = new ArrayList<Profesor>();
    List<Estudiante> estudiantes = new ArrayList<Estudiante>();
    */
    List<Persona> personas = new ArrayList<Persona>();

    personas.add(new Profesor("Maria", "1-1", true));
    personas.add(new Estudiante("Rogelio", "2-2", true, 20000));
    personas.add(new Estudiante("Amaranta", "3-3", false, 25000));
    personas.add(new Estudiante("Cristian", "4-4", true, 34000));

    personas.add(new ProfesorAyudante("Lucy", "5.5", false));

    for (Persona persona : personas) {
      if (persona instanceof Estudiante){
        System.out.printf("La deuda es de : $%.2f \t",((Estudiante)persona).getDeuda());
      }


      System.out.println(persona.toString());
      // System.out.println(((Estudiante)persona)); <- ClassCastException
    }

    /*for (Estudiante estudiante : estudiantes) {
      System.out.println(estudiante.toString());
    }

    for (Profesor profesor : profesores) {
      System.out.println(profesor.toString());
    }*/


  }
}