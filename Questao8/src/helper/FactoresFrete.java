package helper;

import model.Compra;
import model.DescontoCategoria;
import model.DescontoCpf;

public class FactoresFrete {

    private Compra compra;
    private DescontoCategoria descontoCategoria;
    private DescontoCpf descontoCpf;

    public FactoresFrete(Compra compra) {
        this.compra = compra;
        this.descontoCategoria = new DescontoCategoria();
        this.descontoCpf = new DescontoCpf();

    }

    public String aplicarFrete(){
        if (compra.getValorDaCompra() > 199){
            return "Frete gratis para todo Brasil.";
        }if (compra.getValorDaCompra() > 99 && compra.getValorDaCompra() <= 199){
            return "Frete gratis para Sul e Sudeste";
        }
        return "Frete fixo para estado.";
    }

}
