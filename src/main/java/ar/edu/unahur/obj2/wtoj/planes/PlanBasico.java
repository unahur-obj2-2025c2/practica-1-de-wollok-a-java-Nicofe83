package ar.edu.unahur.obj2.wtoj.planes;

import java.util.List;

import ar.edu.unahur.obj2.wtoj.usuario.Usuario;

public class PlanBasico implements PlanSuscribible{ 
    // para interface se usa implements
    private Integer limite;
    private Double costoBase;
    //constructor
    public PlanBasico(Integer limite, Double costoBase) {
        this.limite = limite;
        this.costoBase = costoBase;
    }
    @Override
    public Double costoPlan(Usuario usuario) {
        List<Contenido> contenidoUsuario = usuario.getContenidos();    
        List<Contenido> excedentes = contenidoUsuario.subList(limite, contenidoUsuario.size());
        if(limite >= contenidoUsuario.size()){
            return costoBase;
        } else{
            return costoBase + excedentes.stream().mapToDouble(c->c.costo()).sum();
        }
        }
    }

    



    
}
