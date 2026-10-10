package CalculadoraDeRotas;

public class MapaCidade {
    private static final double INF = 999.0;
    private String[] nomeLocal;
    private double[][] matrizDistancia;
    private double[][] matrizTempo;

    public MapaCidade() {
        nomeLocal = new String[]{
                "São Mamede",
                "Cogumelândia",
                "Night City",
                "Vice City",
                "Pombal"
        };
        matrizDistancia = new double[][]{
                {  0.0,   8.0,  67.0,  42.0, 116.0},
                {  8.0,   0.0,  70.0, 999.0, 120.0},
                { 67.0,  70.0,   0.0,  30.0, 999.0},
                { 42.0, 999.0,  30.0,   0.0,  85.0},
                {116.0, 120.0, 999.0,  85.0,   0.0}
        };

        matrizTempo = new double[][]{
                {  0.0,  10.0,  80.0,  50.0, 140.0},
                { 10.0,   0.0,  85.0, 999.0, 150.0},
                { 80.0,  85.0,   0.0,  35.0, 999.0},
                { 50.0, 999.0,  35.0,   0.0, 100.0},
                {140.0, 150.0, 999.0, 100.0,   0.0}
        };
    }

    public String getNomeLocal(int indice){
        return nomeLocal[indice];
    }

    public int getTotalLocais() {
        return nomeLocal.length;
    }

    public double getDistancia(int origem, int destino){
        return matrizDistancia[origem][destino];
    }

    public double getTempo(int origem, int destino){
        return matrizTempo[origem][destino];
    }

    public void atualizarTempo(int origem, int destino, double novoTempo){
        matrizTempo[origem][destino] = novoTempo;
        matrizTempo[destino][origem] = novoTempo;
    }
}