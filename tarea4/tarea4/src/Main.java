public class Main {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        // Agregar 5 smartphones
        lista.agregar_al_final(new SmartPhone("Apple", "iPhone 13"));
        lista.agregar_al_final(new SmartPhone("Samsung", "Galaxy S21"));
        lista.agregar_al_final(new SmartPhone("Google", "Pixel 6"));
        lista.agregar_al_final(new SmartPhone("OnePlus", "9 Pro"));
        lista.agregar_al_final(new SmartPhone("Xiaomi", "Mi 11"));

        // Imprimir el contenido
        System.out.println("Contenido de la lista:");
        lista.transversal();

        // Eliminar el de la posición 2
        lista.eliminar(2);
        System.out.println("\nDespués de eliminar el elemento en la posición 2:");
        lista.transversal();

        // Actualizar el segundo elemento
        lista.actualizar(lista.get_tamanio() > 1 ? lista.head.siguiente.valor : null, new SmartPhone("Nokia", "G20"));
        System.out.println("\nDespués de actualizar el segundo elemento:");
        lista.transversal();

        // Agregar un elemento al inicio y otro al final
        lista.agregar_al_inicio(new SmartPhone("Sony", "Xperia 1"));
        lista.agregar_al_final(new SmartPhone("Oppo", "Reno 6"));
        System.out.println("\nDespués de agregar al inicio y al final:");
        lista.transversal();

        // Eliminar el primero
        lista.eliminar_el_primero();
        System.out.println("\nDespués de eliminar el primer elemento:");
        lista.transversal();
    }
}
