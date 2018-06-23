package model;

public class DescontoCategoria {

    public double descontar(Compra compra, int contadorDeItens, double valorDesconto){

        int quantidadeDeItensParaDesconto = contadorDeItens/3;
        valorDesconto = valorDesconto * quantidadeDeItensParaDesconto;

        return valorDesconto;
    }

}
