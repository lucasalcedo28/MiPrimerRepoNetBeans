package ejercicio1;

import java.util.*;

public class GestionEmpleados {
    private ArrayList<Empleado> empleados = new ArrayList<>();

    // Agregar empleado
    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    
    
    // Mostrar todos
    public void mostrarEmpleados() {
        empleados.forEach(System.out::println);
    }

    // Eliminar por legajo usando Iterator
    public void eliminarPorLegajo(int legajo) {
        Iterator<Empleado> it = empleados.iterator();
        boolean encontrado = false;
        while (it.hasNext()) {
            Empleado e = it.next();
            if (e.getLegajo() == legajo) {
                it.remove();
                encontrado = true;
                System.out.println("Empleado con legajo " + legajo + " eliminado.");
            }
        }
        if (!encontrado) {
            System.out.println("No existe empleado con legajo " + legajo);
        }
    }

    // Ordenar por nombre alfabéticamente
    public void ordenarPorNombre() {
        empleados.sort(Comparator.comparing(Empleado::getNombre));
        mostrarEmpleados();
    }

    // Ordenar por sueldo (de mayor a menor)
    public void ordenarPorSueldoDesc() {
        empleados.sort((a, b) -> Double.compare(b.getSueldo(), a.getSueldo()));
        mostrarEmpleados();
    }
}
