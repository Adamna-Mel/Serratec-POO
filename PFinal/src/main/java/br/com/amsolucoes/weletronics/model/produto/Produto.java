package model.produto;

public class Produto {
    private String codigo;
    private String descricao;
    private TipoProduto categoria;
    private Integer quantidade;
    private Double valorUnitario;
    private Double desconto;
    private Double valorTotal;
    
    public Produto(
        String codigo, 
        String descricao, 
        TipoProduto categoria, 
        Integer quantidade, 
        Double valorUnitario,
        Double desconto) {

        this.codigo = codigo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.desconto = desconto;

        this.calcularValorTotal();
    }

    //#region Gets e Sets

    public String getCodigo() {
        return this.codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public TipoProduto getCategoria() {
        return this.categoria;
    }
    public void setCategoria(TipoProduto categoria) {
        this.categoria = categoria;
    }
    public Integer getQuantidade() {
        return this.quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
        this.calcularValorTotal();
    }
    public Double getValorUnitario() {
        return this.valorUnitario;
    }
    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
        this.calcularValorTotal();
    }
    public Double getDesconto() {
        return this.desconto;
    }
    public void setDesconto(Double desconto) {
        this.desconto = desconto;
        this.calcularValorTotal();
    }
    public Double getValorTotal() {
        return this.valorTotal;
    }
    //#endregion

    //#region Métodos

    private void calcularValorTotal(){
        this.valorTotal = (this.quantidade * this.valorUnitario) - this.desconto;
    }
    //#endregion      
}
