package icse;

import pc.Cola;

public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();
        System.out.println(cola.estavacia());

        for (int i = 1; i <= 5; i++) {
            cola.insertarFin(i);
        }
        cola.mostrarCircular(1);

        cola.eliminarFin();
        cola.eliminarFin();
        cola.mostrarCircular(1);

    }
}
