import java.util.Observable;
import java.util.Observer;

public class Matriz implements Observer {

    private String nomeMatriz;
    private String notificacao;

    public Matriz(String nomeMatriz) {
        this.nomeMatriz = nomeMatriz;
    }

    public String getNotificacao() {
        return this.notificacao;
    }

    public void produzirVeículo(Concessionaria concessionaria){
        concessionaria.addObserver(this);
    }

    @Override
    public void update(Observable concessionaria, Object arg) {
        this.notificacao = this.nomeMatriz + ", há um pedido em aberto da concessionária " +
                concessionaria.toString();
    }
}
