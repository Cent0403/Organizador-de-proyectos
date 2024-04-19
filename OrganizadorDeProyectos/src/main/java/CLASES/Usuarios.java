/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

/**
 *
 * @author cente
 */
public class Usuarios {
    String username;
    String name;
    String password;
    public Usuarios(String tusername, String tname, String tpassword){
        this.username = tusername;
        this.name = tname;
        this.password = tpassword;

    }
    public String getUsername() {
        return username;
    }
    
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

}
