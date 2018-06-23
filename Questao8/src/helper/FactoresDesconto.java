package helper;

import model.Compra;
import model.DescontoCategoria;
import model.DescontoCpf;

public class FactoresDesconto {

    private Compra compra;
    private DescontoCategoria descontoCategoria;
    private DescontoCpf descontoCpf;

    public FactoresDesconto(Compra compra) {
        this.compra = compra;
        this.descontoCategoria = new DescontoCategoria();
        this.descontoCpf = new DescontoCpf();
    }

    public void aplicarDesconto(){
        int itensDeLimpesa = 0;
        double valorDesconto = 0;
        for(int i = 0; i < compra.getItensDaCompra().size(); i++){
            if(compra.getItensDaCompra().get(i).getCategoriaDoItem().equals("Limpeza")){
                itensDeLimpesa += 1;
                valorDesconto = compra.getItensDaCompra().get(i).getValorDoItem();
            }
        }

        if(itensDeLimpesa >= 3){
            int multiplicadorDeDesconto = itensDeLimpesa/3;
            descontoCategoria.descontar(compra,multiplicadorDeDesconto,valorDesconto);
        }

        if (compra.isCpfFidalidade()){
            if (compra.getValorDaCompra() > 99 && compra.getValorDaCompra() <= 999){
                descontoCpf.descontoCintoPorcento(compra);
            }
            if (compra.getValorDaCompra() > 999){
                descontoCpf.descontoDezPorcento(compra);
            }
        }
    }
}
