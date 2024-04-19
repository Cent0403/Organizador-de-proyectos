package CLASES;

import java.util.ArrayList;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author victo
 */
public class Asignaciones {
    public String Asignación;
    public String Miembro;
    public String Estado;
    public String Proyecto;
    public Date Entrega;
    public Asignaciones(String pproyecto, String pmiembro, String pasignacion, Date pentrega, String pestado)
    {
        this.Proyecto = pproyecto;
        this.Miembro=pmiembro;
        this.Asignación=pasignacion;
        this.Entrega =pentrega;
        this.Estado=pestado;
    }
    public void setEstado() {
        this.Estado = "Completado";
    }
    public String getAsignacion() { return Asignación; }
    public String getProyecto() { return Proyecto; }
    public Date getEntrega() { return Entrega; }
    public String getMiembro() { return Miembro; }
    public String getEstado() { return Estado; }
}
