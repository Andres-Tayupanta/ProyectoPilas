import java.util.Stack;

public class Pila {
    private Stack<Integer> numeros;//se colocaloque se realiza en esa coleccion

    public Pila(){
        numeros = new Stack<>();// se crea la pila

    }

    public boolean estaVacia(){
        return numeros.empty();
    }

    public void apilar(Integer elemento){
        numeros.push(elemento);// esta apilando
    }

    public Integer desapilar(){
        if (estaVacia()) {
            throw new Exception("NO HAYA ELEMENTOS EN LA PILA");
        }

        return numeros.pop();
    }
}
