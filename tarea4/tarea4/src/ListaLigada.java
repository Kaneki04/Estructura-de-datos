class ListaLigada {
    Nodo head;
    private int tamanio;

    public ListaLigada() {
        head = null;
        tamanio = 0;
    }

    public boolean esta_vacia() {
        return tamanio == 0;
    }

    public int get_tamanio() {
        return tamanio;
    }

    public void agregar_al_final(Object valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (esta_vacia()) {
            head = nuevoNodo;
        } else {
            Nodo actual = head;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
        tamanio++;
    }

    public void agregar_al_inicio(Object valor) {
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.siguiente = head;
        head = nuevoNodo;
        tamanio++;
    }

    public void agregar_después_de(int referencia, Object valor) {
        if (referencia < 0 || referencia >= tamanio) {
            System.out.println("Posición fuera de rango");
            return;
        }
        Nodo nuevoNodo = new Nodo(valor);
        Nodo actual = head;
        for (int i = 0; i < referencia; i++) {
            actual = actual.siguiente;
        }
        nuevoNodo.siguiente = actual.siguiente;
        actual.siguiente = nuevoNodo;
        tamanio++;
    }

    public void eliminar(int posicion) {
        if (posicion < 0 || posicion >= tamanio) {
            System.out.println("Posición fuera de rango");
            return;
        }
        if (posicion == 0) {
            eliminar_el_primero();
        } else {
            Nodo actual = head;
            for (int i = 0; i < posicion - 1; i++) {
                actual = actual.siguiente;
            }
            actual.siguiente = actual.siguiente.siguiente;
            tamanio--;
        }
    }

    public void eliminar_el_primero() {
        if (esta_vacia()) {
            System.out.println("La lista está vacía");
            return;
        }
        head = head.siguiente;
        tamanio--;
    }

    public void eliminar_el_final() {
        if (esta_vacia()) {
            System.out.println("La lista está vacía");
            return;
        }
        if (tamanio == 1) {
            head = null;
        } else {
            Nodo actual = head;
            while (actual.siguiente.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = null;
        }
        tamanio--;
    }

    public int buscar(Object valor) {
        Nodo actual = head;
        for (int i = 0; i < tamanio; i++) {
            if (actual.valor.equals(valor)) {
                return i;
            }
            actual = actual.siguiente;
        }
        return -1; // no encontrado
    }

    public void actualizar(Object a_buscar, Object valor) {
        Nodo actual = head;
        while (actual != null) {
            if (actual.valor.equals(a_buscar)) {
                actual.valor = valor;
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("Valor no encontrado");
    }

    public void transversal() {
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.valor + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
