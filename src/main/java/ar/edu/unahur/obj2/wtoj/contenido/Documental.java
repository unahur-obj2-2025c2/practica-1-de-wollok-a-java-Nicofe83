package ar.edu.unahur.obj2.wtoj.contenido;

public class Documental extends Contenido {
    private String director;
    // Si la clase Documental incluyera un atributo propio (en este caso director),
    // habria que generar un constructor que genere los atributos de la clase
    // abstracta + los propios

    public Documental(String titulo, Double costoBase, String director) {
        super(titulo, costoBase);
        this.director = director;
    }

    public Documental(String titulo, Double costoBase) {
        super(titulo, costoBase);
    }

    public String getDirector() {
        return director;
    }

    @Override
    protected Double doCosto() {
        return Idra.getInstance().getValor(); // se va a buscar la instancia de la clase unica y a ese objeto se pide su
                                              // valor
    }

}
