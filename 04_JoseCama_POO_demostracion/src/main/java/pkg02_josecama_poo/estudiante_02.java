package pkg02_josecama_poo;

// Jose Megun Cama La Madrid

public class estudiante_02 {

    // Atributos
    String nombre;
    int edad;
    double calificacion;

    // Constructor 
    public estudiante_02() {
    }

    // Sobrecarga de constructor
    public estudiante_02(String nombre, int edad, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    // Métodos
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + " años, Calificación: " + calificacion);
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }

    public void tomarExamen(double nuevaCalificacion) {
        System.out.println(nombre + " ha tomado un examen. Nueva calificación: " + nuevaCalificacion);
        calificacion = nuevaCalificacion;
    }

    public double calcularPromedio(double otraCalificacion) {
        double promedio = (calificacion + otraCalificacion) / 2;
        System.out.println("El promedio es: " + promedio);
        return promedio;
    }

    // Sobrecarga de metodo
    public double calcularPromedio(double otraCalificacion1, double otraCalificacion2) {
        double promedio = (calificacion + otraCalificacion1 + otraCalificacion2) / 3;
        System.out.println("El promedio es: " + promedio);
        return promedio;
    }

    // Método con valor de retorno
    public double obtenerCalificacion() {
        return calificacion;
    }
}





