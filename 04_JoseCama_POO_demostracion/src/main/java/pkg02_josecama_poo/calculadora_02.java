package pkg02_josecama_poo;

// Jose Megun Cama La Madrid

public class calculadora_02 {

    // Atributos
    int a;
    int b;

    // Constructor
    public calculadora_02() {
    }

    // Sobrecarga de constructor
    public calculadora_02(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Metodos
    public void sumar(int c, int e) {
        a = c + e;
        System.out.println(a);
    }

    public void restar(int d, int f) {
        a = d - f;
        System.out.println(a);
    }

    public void multiplicar(int g, int h) {
        b = g * h;
        System.out.println(b);
    }

    public void dividir(int i, int k) {
        if (k != 0) {
            b = i / k;
            System.out.println(b);
        } else {
            System.out.println("Error: No es posible dividir por cero.");
        }
    }

    // Sobrecarga de metodo Sumar 
    public void sumar(int c, int e, int g) {
        a = c + e + g;
        System.out.println(a);
    }
    
    // Método con valor de retorno
    public int obtenerResultadoMultiplicacion() {
        return b;
    }
}



















