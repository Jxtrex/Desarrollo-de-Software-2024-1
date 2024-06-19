public class Map {
    String[][] mapa = new String[5][5];

    Map(String[][] mapa) {
        int n = mapa.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                this.mapa[i][j] = mapa[i][j];
            }
        }
    }

    boolean isvalidPosition(int x, int y) {
        return x < mapa.length && x >= 0
                && y < mapa.length && y >= 0;
    }
}
