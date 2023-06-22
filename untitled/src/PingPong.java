public class PingPong implements Jogo{
    @Override
    public void jogar() {
        System.out.println("Armando mesa e rede");
        System.out.println("Pegando raquetes");
        System.out.println("Podem jogar");
    }

    @Override
    public void fechar() {
        System.out.println("Pontos atingido");
        System.out.println("Ouve um ganhador");
        System.out.println("Jogo fechado ");
    }
}
