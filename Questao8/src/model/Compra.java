package model;

import java.util.List;

public class Compra {
    private boolean cpfFidalidade;
    private double valorDaCompra;
    private List<ItemDaCompra> itensDaCompra;

    public Compra() {
        for(int i = 0; i < itensDaCompra.size(); i++){
         this.valorDaCompra += itensDaCompra.get(i).getValorDoItem();
        }
    }

    public boolean isCpfFidalidade() {
        return cpfFidalidade;
    }

    public void setCpfFidalidade(boolean cpfFidalidade) {
        this.cpfFidalidade = cpfFidalidade;
    }

    public double getValorDaCompra() {
        return valorDaCompra;
    }

    public void setValorDaCompra(double valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }

    public List<ItemDaCompra> getItensDaCompra() {
        return itensDaCompra;
    }

    public void setItensDaCompra(List<ItemDaCompra> itensDaCompra) {
        this.itensDaCompra = itensDaCompra;
    }
}
