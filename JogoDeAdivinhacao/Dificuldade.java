package jogo;

public enum Dificuldade {
    FACIL(1, 50, 10),
    MEDIO(1, 100, 7),
    DIFICIL(1, 200, 5),
    INSANO(1, 500, 3);

    private final int min;
    private final int max;
    private final int tentativasMax;

    Dificuldade(int min, int max, int tentativasMax) {
        this.min = min;
        this.max = max;
        this.tentativasMax = tentativasMax;
    }

    public int getMin() { return min; }
    public int getMax() { return max; }
    public int getTentativasMax() { return tentativasMax; }
}
