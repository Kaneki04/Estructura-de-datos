public class Main {
    public static void main(String[] args) {
        JuegoDeLaVida juego = new JuegoDeLaVida(5, 5);

        // Configuración inicial: Células vivas en posiciones específicas
        int[][] configuracionInicial = {
                {1, 1}, {1, 2}, {1, 3}, // Una línea horizontal
                {2, 2}
        };
        juego.setConfiguracionInicial(configuracionInicial);

        // Calcular 5 generaciones
        juego.calcularGeneraciones(5);
    }
}
