import java.util.Observable;

public class Concessionaria extends Observable {
    private String nomeConcessionaria;
    private String cnpj;
    private String endereco;

    public Concessionaria(String nomeConcessionaria, String cnpj, String endereco){
        this.nomeConcessionaria =  nomeConcessionaria;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public void gerarPedido(){
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString(){
        return "Concessionária: " + nomeConcessionaria +
                ", CNPJ: " + cnpj +
                ", Endereço: " + endereco;

    }
}
