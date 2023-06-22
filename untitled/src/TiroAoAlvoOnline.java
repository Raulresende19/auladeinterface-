import java.sql.SQLOutput;

public class TiroAoAlvoOnline implements Jogo{
    @Override
    public void jogar() {
        System.out.println("Armando os alvos");
        System.out.println("Carregando a arma");
        System.out.println("Pode atirar nos alvos");
    }

    @Override
    public void fechar() {
        System.out.println("Alvos derrubado");
        System.out.println("Fechando o estande de alvo");

    }
}
