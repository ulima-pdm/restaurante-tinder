package pe.edu.ulima.experienciaul.beans;

import java.io.Serializable;

/**
 * Created by hernan on 10/27/16.
 */

public class Restaurante implements Serializable{
    private long id;
    private String nombre;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Restaurante() {

    }

    public Restaurante(long id, String nombre) {

        this.id = id;
        this.nombre = nombre;
    }
}
