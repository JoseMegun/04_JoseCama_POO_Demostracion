package pkg02_josecama_poo;

// Jose Megun Cama La Madrid

public class Main {
     public static void main(String[] args) {
        // Objeto de la clase Calculadora_04
        calculadora_02 cal = new calculadora_02();

        // Metodos de la calculadora 
        System.out.println("Resultado de la suma: ");
        cal.sumar(12, 14);

        System.out.println("Resultado de la resta: ");
        cal.restar(10, 5);

        System.out.println("Resultado de la multiplicación: ");
        cal.multiplicar(5, 5);

        System.out.println("Resultado de la división: ");
        cal.dividir(30, 10);

        // Objeto de la clase Estudiante_04
        estudiante_02 estudiante = new estudiante_02("Juan", 20, 19);

        // Metodos del estudiante
        estudiante.imprimirInformacion();
        estudiante.estudiar();

        System.out.println("Resultado del examen del estudiante: ");
        estudiante.tomarExamen(20);

        System.out.println("Promedio 1 del estudiante: ");
        double promedio1 = estudiante.calcularPromedio(18);
        
        System.out.println("Promedio 2 del estudiante: ");
        double promedio2 = estudiante.calcularPromedio(20, 16);

        System.out.println("Calificación actual del estudiante: " + estudiante.obtenerCalificacion());
        System.out.println("Promedio 1 del estudiante: " + promedio1);
        System.out.println("Promedio 2 del estudiante: " + promedio2);
    }
}