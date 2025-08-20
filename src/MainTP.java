import ejercicio1.*;

public class MainTP {
    public static void main(String[] args) {
        GestionEmpleados ge = new GestionEmpleados();

        // Agregamos empleados de prueba
        ge.agregarEmpleado(new Empleado("Lucas", 1, 500000));
        ge.agregarEmpleado(new Empleado("Ana", 2, 650000));
        ge.agregarEmpleado(new Empleado("Pedro", 3, 480000));

        System.out.println("📋 Lista de empleados:");
        ge.mostrarEmpleados();

        System.out.println("\n🔤 Ordenados por nombre:");
        ge.ordenarPorNombre();

        System.out.println("\n💰 Ordenados por sueldo (desc):");
        ge.ordenarPorSueldoDesc();

        System.out.println("\n❌ Eliminando legajo 2:");
        ge.eliminarPorLegajo(2);

        System.out.println("\n📋 Lista final:");
        ge.mostrarEmpleados();
    }
}
