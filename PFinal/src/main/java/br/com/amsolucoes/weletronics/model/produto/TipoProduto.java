package model.produto;

public enum TipoProduto {
    NACIONAIS("Nacionais"),
    IMPORTADOS("Importados"),
    PROMOCAO("Promoção"),
    FRETE_GRATIS("Frete Gratis");

    private String categoria;

    private TipoProduto(String categoria){
        this.categoria = categoria;
    }

    public String getCategoria(){
        return this.categoria;
    }    
    
}
