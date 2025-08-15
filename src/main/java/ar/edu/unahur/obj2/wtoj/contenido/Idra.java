package ar.edu.unahur.obj2.wtoj.contenido;

public class Idra {
    // Este es un SINGLETON es una clase que se hace para que sea un objeto. Si bien
    // toda clase tiene que tener un constructor, puede anularse

    private static Idra instance = new Idra(); // El atributo instancia genera un objeto de clase Idra

    private Idra() {
    } // ASi se anula el constructor de la clase (llaves vacias)

    private Double valor = 0.5;

    public Double getValor() { // pedimos el valor
        return valor;
    }

    public void setValor(Double valor) { // podmeos cambiar el valor
        this.valor = valor;
    }

    // Necesitamos un metodo que nos devuelva la instancia

    public static Idra getInstance() {
        return instance;
    }

}
