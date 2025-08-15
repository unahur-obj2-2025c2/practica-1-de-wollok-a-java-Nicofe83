package ar.edu.unahur.obj2.wtoj.usuario;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.wtoj.contenido.Contenido;
import ar.edu.unahur.obj2.wtoj.planes.PlanDefecto;
import ar.edu.unahur.obj2.wtoj.planes.PlanSuscribible;

public class Usuario {
    private PlanSuscribible plan = new PlanDefecto();
    private List<Contenido> contenidos = new ArrayList<>();

    // constructores

    public Usuario(PlanSuscribible plan) {
        this.plan = plan;
    }

    // getter y setter
    public Usuario() {
    }

    public PlanSuscribible getPlan() {
        return plan;
    }

    public void setPlan(PlanSuscribible plan) {
        this.plan = plan;
    }

    public void verContenido(Contenido contenido) {
        contenidos.add(contenido);
    }

    public List<Contenido> getContenidos() {
        return new ArrayList<>(contenidos);
    }

}
