/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.hotelmain;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author seryi
 */
public class Cliente {

    private String DNI;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String email;
    private String telefono;
    private String fechaNacimiento;
    private boolean promocionado = false;
    
    public Cliente(String nDNI, String nNombre, String nApellidos, String nDireccion, String nEmail, String nTelefono, String nFechaNacimiento){
        
        this.DNI = nDNI;
        this.nombre = nNombre;
        this.apellidos = nApellidos;
        this.direccion = nDireccion;
        this.email = nEmail;
        this.telefono = nTelefono;
        this.fechaNacimiento = nFechaNacimiento;
        
    }
    
    public int getEdad(){

        int edad; 
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nacimiento = LocalDate.parse(fechaNacimiento, formato);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(nacimiento, ahora);
        edad = periodo.getYears();
        
        return edad;
        
    }
    
    public boolean tienepromocion(){
        
        boolean resultado;
        
        resultado = false;
        
        if(getEdad() >= 18 && getEdad() <= 25){
            promocionado = true;
            resultado = true;
        }
        
        return resultado;
        
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    
    public String mostrarDatosCliente
    
    
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
