package com.appnomina.empleados.operaciones;
import com.appnomina.empleados.info.Empleado;

import java.util.Scanner;

public class Operaciones {
    Empleado empleado = new Empleado() {

        @Override
        public float calcularSalarioTotal() {
            return 0;
        }
    };
    Scanner scanner = new Scanner(System.in);
    byte opcion = scanner.nextByte();

    public static void menu() {

        System.out.println("Elija una opción del menú de usuarios" +
                "\n\t1. Registrar usuario" +
                "\n\t2. Listar usuarios registrados" +
                "\n\t3. Ver información del usuario seleccionado" +
                "\n\t4. Editar información del usuario seleccionado" +
                "\n\t5. Eliminar el usuario seleccionado");

    }
}


