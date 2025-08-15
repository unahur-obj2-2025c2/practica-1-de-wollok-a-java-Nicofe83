package ar.edu.unahur.obj2.wtoj.contenido;

public class Episodio {
    private final Integer numero;
    private final String titulo;
    private Double costo;

    // Constructor
    public Episodio(Integer numero, String titulo, Double costo) {
        this.numero = numero;
        this.titulo = titulo;
        this.costo = costo;
    }

    // Getter y Setter
    public Integer getNumero() {
        return numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
}
