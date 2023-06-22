public class Xadrez implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Arrumando Tabuleiro");
        System.out.println("Brancas Jogam primeiro");
    }

    @Override
    public void fechar() {
        System.out.println("Jogo termina em xequeMate");
        System.out.println("Jogo fechado");
    }
}
