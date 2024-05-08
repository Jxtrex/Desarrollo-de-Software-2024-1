class Word {
    private final String palabra;

    public Word(String correctWord) {
        this.palabra = correctWord;
    }

    public Score guess(String attempt) {
        var score = new Score(palabra);
        score.assess(attempt);
        return score;
    }
}
