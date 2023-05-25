
package registroestudiante;
//public class NodoEstudiante<T extends Comparable<T>{
public class NodoEstudiante {
    private Estudiante estudiante;
    private NodoEstudiante izquierdo;
    private NodoEstudiante derecho;

    public NodoEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.izquierdo = null;
        this.derecho = null;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public NodoEstudiante getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoEstudiante izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoEstudiante getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoEstudiante derecho) {
        this.derecho = derecho;
    }
}

