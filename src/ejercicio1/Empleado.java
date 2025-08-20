package ejercicio1;

public class Empleado {
    private String nombre;
    private int legajo;
    private double sueldo;

    public Empleado(String nombre, int legajo, double sueldo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", legajo=" + legajo +
                ", sueldo=" + sueldo +
                '}';
    }
}
