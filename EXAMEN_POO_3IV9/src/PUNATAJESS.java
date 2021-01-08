/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ulises
 */
public class PUNATAJESS {
    
    String Nombre;
    String Edad;
    String Puntaje;

    public PUNATAJESS(String Nombre, String Edad, String Puntaje) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Puntaje = Puntaje;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getPuntaje() {
        return Puntaje;
    }

    public void setPuntaje(String Puntaje) {
        this.Puntaje = Puntaje;
    }
    
    
}
