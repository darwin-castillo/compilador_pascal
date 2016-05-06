/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

/**
 *
 * @author Miguel
 */
public class NodoFor extends NodoBase {
     private NodoBase asignacion;
     private NodoBase paso;
     private NodoBase cuerpo;
    
     public NodoFor(NodoBase paso, NodoBase cuerpo,NodoBase asignacion) {
        super();
        this.paso = paso;
        this.cuerpo = cuerpo;
        this.asignacion = asignacion;
    }

    public NodoBase getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(NodoBase asignacion) {
        this.asignacion = asignacion;
    }

    public NodoBase getPaso() {
        return paso;
    }

    public void setPaso(NodoBase paso) {
        this.paso = paso;
    }

    public NodoBase getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(NodoBase cuerpo) {
        this.cuerpo = cuerpo;
    }
  
}
