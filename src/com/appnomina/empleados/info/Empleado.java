package com.appnomina.empleados.info;
import com.appnomina.empleados.info.Empleado;
public abstract class Empleado {
    String nombre;
    String apellidos;
    String numeroSeguro;

    public Empleado() {
    }
    public Empleado(String nombre, String apellidos, String numeroSeguro) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroSeguro = numeroSeguro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroSeguro() {
        return numeroSeguro;
    }

    public void setNumeroSeguro(String numeroSeguro) {
        this.numeroSeguro = numeroSeguro;
    }
    public abstract float calcularSalarioTotal();
}
