package dataFactory;

import pojo.ComponentePojo;
import pojo.ProdutoPojo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {
    public static ProdutoPojo criarProdutoComumValorIgual(double valor){

        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("Playstation 5");
        produto.setProdutoValor(valor);
        List<String> cores = new ArrayList<>();
        cores.add("preto");
        cores.add("branco");
        produto.setProdutoCores(cores);
        produto.setProdutoUrlMock("");
        List<ComponentePojo> componentes = new ArrayList<>();

        //Componente Um
        ComponentePojo componente = new ComponentePojo();
        componente.setComponenteNome("Controle");
        componente.setComponenteQuantidade(1);
        componentes.add(componente);

        //componente Dois
        ComponentePojo componenteDois = new ComponentePojo();
        componenteDois.setComponenteNome("Memory Card");
        componenteDois.setComponenteQuantidade(2);
        componentes.add(componenteDois);

        produto.setComponentes(componentes);

        return produto;
    }
}
