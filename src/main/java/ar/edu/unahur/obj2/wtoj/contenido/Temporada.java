package ar.edu.unahur.obj2.wtoj.contenido;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private final Integer numero;
    // final = constante de wollok este atributo NO ES VARIABLE
    private List<Episodio> episodios = new ArrayList<>();
    // Es una lista de elementos de la clase Episodios. Con el new ArrarList<>() se
    // indica que "episodios" es una lista vacia

    // Constructor con los dos atributos
    public Temporada(Integer numero, List<Episodio> episodios) {
        this.numero = numero;
        this.episodios = episodios;
    }

    // Copnstructor solo con l atributo numero, ya que episodios se inicializa con
    // el arrayList (lista vacia)

    public Temporada(Integer numero) {
        this.numero = numero;
    }

    // getters
    public Integer getNumero() {
        return numero;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    // agrega un elemento a la lista episodio
    public void agregarEpisodio(Episodio unEpisodio) {
        episodios.add(unEpisodio);
    }

    public Double costo() {
        return episodios.stream().mapToDouble(e -> e.getCosto()).average().orElse(0.0);
        // stream convierte la lista en un flujo de datos
        // orElse es por si la lista esta vacia (evita el if)
    }

}
