
public class NodosMain {
    public static void main(String[] args) {
        Nodo<Integer> head = new Nodo<>(100);
        head.setSiguiente(new Nodo<>(200));
        head.getSiguiente().setSiguiente(new Nodo<>(300));
        head.getSiguiente().getSiguiente().setSiguiente(new Nodo<>(400));
        head.getSiguiente().getSiguiente().getSiguiente().setSiguiente(new Nodo<>(600));

        Nodo<Integer> aux = head;
        while (aux.getDato() != null) {
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }

        head.getSiguiente().setSiguiente(new Nodo<>(333, new Nodo<>(400, new Nodo<>(600))));
        Nodo<Integer> aux2 = head;

        while (aux2.getDato() != null) {
            System.out.println(aux.getDato());
            aux2 = aux2.getSiguiente();

        }
        head.setSiguiente(new Nodo<>(50, new Nodo<>(100, new Nodo<>(333, new Nodo<>(400, new Nodo<>(600))))));
        Nodo<Integer> aux3 = head;

        while (aux3.getDato() != null) {
            System.out.println(aux.getDato());
            aux3 = aux3.getSiguiente();

        }


    }
}