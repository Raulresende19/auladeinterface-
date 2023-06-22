public class Main {
    public static void main(String[] args) {

        VideoGame videogame = new VideoGame();
        videogame.ligar();
        videogame.jogar(new TiroAoAlvoOnline());
        videogame.fechar();
    }
}