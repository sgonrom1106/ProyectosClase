/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.hotelmain;
import java.util.ArrayList;

/**
 *
 * @author seryi
 */
public class Hotel {

    private String descripcion;
    private String nombre;
    private String direccionPostal;
    private String telefono;
    private String email;
    private ArrayList<Cliente> cliente;
    
    public Hotel(String nDescripcion, String nNombre, String nDireccionPostal, String nTelefono, String nEmail) {

        this.descripcion = nDescripcion;
        this.nombre = nNombre;
        this.direccionPostal = nDireccionPostal;
        this.telefono = nTelefono;
        this.email = nEmail;
        cliente = new ArrayList<Cliente>();
        
    }
    
    public int buscarCliente(String DNI){
        
        for(int i = 0; i < cliente.size(); i++){
            
            if(cliente.get(i).getDNI().contentEquals(DNI)){
                
              return i;  
                
            }
            
        }
        
        return -1;
        
    }

    
    public String mostrarClienteDNI(String DNI){
        
            if(buscarCliente(DNI) != -1){
                return cliente.get(this.buscarCliente(DNI)).getDNI();
            }
        
        return null;
    }
    

    public void crearCliente(String DNI, String nombre, String apellidos, String direccion, String email, String telefono,boolean promocionado, String fechaNacimiento){
       
        Cliente miCliente = new Cliente(DNI,nombre,apellidos,direccion,email,telefono,fechaNacimiento);
        cliente.add(miCliente);
    }   

    public void eliminarCliente(String DNI){
        
        Cliente clientefuera = new Cliente(DNI);
        cliente.remove(clientefuera);
    
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

}
