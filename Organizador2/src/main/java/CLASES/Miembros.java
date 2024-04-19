/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author victo
 */
public class Miembros {
    public String Miembros;
    public String Proyecto;
    public Date fecha;
    public ArrayList<Asignaciones> lAsignaciones;
    
    public Miembros(String pproyecto, String pmiembro, Date pfecha)
    {
        this.Proyecto=pproyecto;
        this.Miembros=pmiembro;
        this.fecha=pfecha;
        this.lAsignaciones=new ArrayList<>();
    }
    
    public String getMiembro() { return Miembros; }
    public String getProyecto() { return Proyecto; }
    public Date getEntrega() { return fecha; }
    
    
    
}
