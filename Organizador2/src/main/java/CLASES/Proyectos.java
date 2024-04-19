/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

import CLASES.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author victo
 */
public class Proyectos {
    public String Proyectos;
    public String Admin;
    public Date Entrega;
    public ArrayList<Miembros> lMiembros;
    private static ArrayList<Proyectos> proyectosGenerados = new ArrayList<>();
    
    public Proyectos(String pAdmin, String pProyectos, Date pEntrega) {
        this.Admin = pAdmin;
        this.Proyectos= pProyectos;
        this.Entrega=pEntrega;
        this.lMiembros=new ArrayList<>();
        proyectosGenerados.add(this);
    }
    
    public String getAdmin() { return Admin; }
    public String getProyecto() { return Proyectos; }
    public Date getEntrega() { return Entrega; }
    
    public static ArrayList<Proyectos> ProyectosAdmin(String admin) {
        ArrayList<Proyectos> proyectosAdmin = new ArrayList<>();
        for (Proyectos proyecto : proyectosGenerados) {
            if (proyecto.getAdmin().equals(admin)) {
                proyectosAdmin.add(proyecto);
            }
        }
        return proyectosAdmin;
    }
    public ArrayList<Miembros> getMiembros() {
        return lMiembros;
    }
    public static void eliminarProyecto(Proyectos proyecto) {
        if (proyectosGenerados.contains(proyecto)) {
            proyectosGenerados.remove(proyecto);
        }
    }
}
