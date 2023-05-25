/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroestudiante;

import java.util.LinkedList;
import java.util.Queue;

  
public class ArbolEstudiantes {
    private NodoEstudiante raiz;

    public ArbolEstudiantes() {
        raiz = null;
    }
      // Métodos para insertar, buscar, eliminar estudiantes en el árbol 
     private void insertar(NodoEstudiante antiguo, NodoEstudiante nuevoNodo) {
        if (nuevoNodo.getEstudiante().getCodigo() < antiguo.getEstudiante().getCodigo()) {
            if (antiguo.getIzquierdo() == null) {
                antiguo.setIzquierdo(nuevoNodo);
            } else {
                //utilizo recursividad
                insertar(antiguo.getIzquierdo(), nuevoNodo);
            }
        } else {
    
            if (antiguo.getDerecho() == null) {
                antiguo.setDerecho(nuevoNodo);
            } else {
                insertar(antiguo.getDerecho(), nuevoNodo);
            }
        }
    }
   
    public void insertarEstudiante(Estudiante estudiante) {
        NodoEstudiante nuevoNodo = new NodoEstudiante(estudiante);
        if (raiz == null) {
            raiz = nuevoNodo;
        } else {
            //llamo el metodo insertar para que me agrege al lado que es 
            insertar(raiz, nuevoNodo);
        }
    }
    private Estudiante Buscar(NodoEstudiante nodo, int codigo) {
        if (nodo.getEstudiante().getCodigo() == codigo) {
            return nodo.getEstudiante();
        }

        if (nodo.getIzquierdo() != null && codigo < nodo.getEstudiante().getCodigo()) {
            return Buscar(nodo.getIzquierdo(), codigo);
        } else if (nodo.getDerecho() != null) {
            return Buscar(nodo.getDerecho(), codigo);
        }

        return null;
    }
     public Estudiante buscarEstudiante(int codigo) {
        if (raiz != null) {
            return Buscar(raiz, codigo);
        }
        return null;
    }
      private NodoEstudiante eliminar(NodoEstudiante nodo, int codigo) {
        if (nodo == null) {
            return null;
        }

        if (nodo.getEstudiante().getCodigo() == codigo) {
            return nodo.getIzquierdo();
        }

        if (nodo.getIzquierdo() != null && codigo < nodo.getEstudiante().getCodigo()) {
            nodo.setIzquierdo(eliminar(nodo.getIzquierdo(), codigo));
        } else {
            nodo.setDerecho(eliminar(nodo.getDerecho(), codigo));
        }

        return nodo;
    }
    public void eliminarEstudiante(int codigo) {
        if (raiz != null) {
            raiz = eliminar(raiz, codigo);
        }
    }
  

}

