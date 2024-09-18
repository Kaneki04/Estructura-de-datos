

public class JuegoDeLaVida {
    private Array2d grid;

    public JuegoDeLaVida(int filas, int columnas) {
        grid = new Array2d(filas, columnas);
        grid.clear('D'); // 'D' representa celula muerta
    }

    public void setConfiguracionInicial(int[][] configuracion) {
        for (int[] celula : configuracion) {
            int fila = celula[0];
            int col = celula[1];
            grid.setItem(fila, col, 'V'); // 'V' representa celula viva
        }
    }

    public void calcularGeneraciones(int generaciones) {
        for (int g = 0; g < generaciones; g++) {
            grid = calcularSiguienteGeneracion();
            System.out.println("Generación " + (g + 1) + ":\n" + grid);
        }
    }

    private Array2d calcularSiguienteGeneracion() {
        Array2d nuevaGeneracion = new Array2d(grid.getRowSize(), grid.getColSize());

        for (int i = 0; i < grid.getRowSize(); i++) {
            for (int j = 0; j < grid.getColSize(); j++) {
                int vecinosVivos = contarVecinosVivos(i, j);
                char estadoActual = grid.getItem(i, j);

                if (estadoActual == 'V') { // Célula viva
                    if (vecinosVivos < 2 || vecinosVivos > 3) {
                        nuevaGeneracion.setItem(i, j, 'D'); // Muere
                    } else {
                        nuevaGeneracion.setItem(i, j, 'V'); // Sobrevive
                    }
                } else { // Célula muerta
                    if (vecinosVivos == 3) {
                        nuevaGeneracion.setItem(i, j, 'V'); // Nace
                    } else {
                        nuevaGeneracion.setItem(i, j, 'D'); // Permanece muerta
                    }
                }
            }
        }
        return nuevaGeneracion;
    }

    private int contarVecinosVivos(int fila, int col) {
        int conteo = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue; // Ignorar la celula misma
                int nuevaFila = fila + i;
                int nuevaCol = col + j;
                if (nuevaFila >= 0 && nuevaFila < grid.getRowSize() &&
                        nuevaCol >= 0 && nuevaCol < grid.getColSize() &&
                        grid.getItem(nuevaFila, nuevaCol) == 'V') {
                    conteo++;
                }
            }
        }
        return conteo;
    }
}
