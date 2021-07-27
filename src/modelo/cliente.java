/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import modelo.cliente;

/**
 *
 * @author 50254
 */
public class cliente extends persona {
    private String nit;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

 @Override
 public void agregar (){
 System.out.println("Nit: " + getNit());
 System.out.println("Nombre: " + this.getNombre());
 System.out.println("Apellido : " + this.getApellido());
 System.out.println("Direccion: " + this.getDireccion());
 System.out.println("Telefono: " + this.getTelefono());
 System.out.println("Fecha nacimiento : " + this.getFecha_nacimiento());
 }
    
}
