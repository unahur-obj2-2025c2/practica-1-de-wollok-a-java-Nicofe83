package ar.edu.unahur.obj2.wtoj.contenido;

public abstract class Contenido {
    private String titulo;
    // a todas las clases hay que especificarles que tipo de dato tienen
    // el atributo puede ser publico o privado
    // y posterior hay que poner que tipo de dato va a ser
    private Double costoBase;

    // hay que generar un constructor ( no viene por defecto), boton derecho =>
    // accion de codigo fuente, generar constructor, especificar que tipo de
    // atributo queremos en el constructor. SIEMPRE TIENE QUE HABER UN CONSTRUCTOR

    public Contenido(String titulo, Double costoBase) { // se le pasan los atributos como parametros

        this.titulo = titulo; // this = self
        this.costoBase = costoBase;
    }

    // para hacer los getters, boton derecho, acccion de codigo fuente, generate
    // getters (seleccionar el atrbuto que lleve getter)
    public String getTitulo() {
        return titulo;
    }

    public Double getCostoBase() {
        return costoBase;

    }

    // para los setter solo lo hacemos de los atributos que se van a cambiar: boton
    // derecho accion de codigo fuente, generate setters (seleccionar cual lleva
    // setter)
    public void setCostoBase(Double costoBase) {
        this.costoBase = costoBase;
    }

    public Double costo() {
        return costoBase + this.doCosto();
        // El metodo doCosto aparece como error, nos posicionamos sobre el error y vemos
        // las recomendaciones. Creamos un metodo abstracto llamado doCosto
    }

    protected abstract Double doCosto();

}
