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
public class NodoPrograma extends NodoBase{
    private NodoBase variable;
    private NodoBase funcion;
    private NodoBase cuerpo;
    
    	public NodoPrograma(NodoBase cuerpo,NodoBase variable) {
        super();
        this.variable = variable;
        this.cuerpo = cuerpo;
        this.funcion = null;
   
    }
      	public NodoPrograma(NodoBase cuerpo,NodoBase variable,NodoBase funcion) {
        super();
        this.variable = variable;
        this.cuerpo = cuerpo;
        this.funcion = funcion; 
    }  

    public NodoBase getVariable() {
        return variable;
    }

    public void setVariable(NodoBase variable) {
        this.variable = variable;
    }

    public NodoBase getFuncion() {
        return funcion;
    }

    public void setFuncion(NodoBase funcion) {
        this.funcion = funcion;
    }

    public NodoBase getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(NodoBase cuerpo) {
        this.cuerpo = cuerpo;
    }
}

