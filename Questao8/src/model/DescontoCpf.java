package model;

public class DescontoCpf {

    public double descontoCintoPorcento(Compra compra){
        return (compra.getValorDaCompra()*5)/100;
    }

    public double descontoDezPorcento(Compra compra){
        return (compra.getValorDaCompra()*10)/100;
    }

}
