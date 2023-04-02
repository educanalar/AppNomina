package com.appnomina.empleados.info;

public class EmpleadoFijo extends Empleado{
    float diasLaborados;
    float precioDia;
    float salarioTotal;

    public EmpleadoFijo() {
    }

    public EmpleadoFijo(String nombre, String apellidos, String numeroSeguro, float diasLaborados, float precioDia, float salarioTotal) {
        super(nombre, apellidos, numeroSeguro);
        this.diasLaborados = diasLaborados;
        this.precioDia = precioDia;
        this.salarioTotal = salarioTotal;
    }

    public float getDiasLaborados() {
        return diasLaborados;
    }

    public void setDiasLaborados(float diasLaborados) {
        this.diasLaborados = diasLaborados;
    }

    public float getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(float precioDia) {
        this.precioDia = precioDia;
    }

    public float getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(float salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    @Override
    public float calcularSalarioTotal() {
        return 0;
    }


}
