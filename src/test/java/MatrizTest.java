import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrizTest {
    @Test
    void deveNotificarMatriz() {
        Matriz matriz = new Matriz("Manaus");
        Concessionaria concessionaria = new Concessionaria("yamaha", "123456789", "rua A");

        matriz.produzirVeículo(concessionaria);
        concessionaria.gerarPedido();

        assertEquals("Manaus, há um pedido em aberto da concessionária Concessionária: yamaha, CNPJ: 123456789, Endereço: rua A", matriz.getNotificacao());
    }
}