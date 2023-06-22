public class VideoGame {
    private Jogo jogo;

    public void ligar(){
        System.out.println("Ligando VideoGame");
    }
    public void jogar(Jogo jogo){
        this.jogo = jogo;
        this.jogo.jogar();
    }
    public void fechar(){
        this.jogo.fechar();
    }
    public void desligar(){
        System.out.println("Desligando VideoGame");
    }
}
