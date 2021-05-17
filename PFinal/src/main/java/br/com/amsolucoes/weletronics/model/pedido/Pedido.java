package model.pedido;

import java.util.ArrayList;
import java.util.Date;
import model.cliente.Cliente;
import model.produto.Produto;

public class Pedido {
    private Integer numero;
    private Date data;
    private ArrayList<Produto> produtos;
    private Cliente cliente;
    private Double valorFrete;
    private Double desconto;
    private FormaDePagamento forma;
    private Double valorTotal;
    
    public Pedido(
        Integer numero, 
        Cliente cliente, 
        Double valorFrete,
        Double desconto, 
        FormaDePagamento forma) {

        this.numero = numero;
        this.data = new Date();
        this.produtos = new ArrayList<Produto>();
        this.cliente = cliente;
        this.valorFrete = valorFrete;
        this.desconto = desconto;
        this.forma = forma;
        this.valorTotal = 0.0;
    }

    //#region Gets e Sets
    public Integer getNumero() {
        return this.numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public Date getData() {
        return this.data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public ArrayList<Produto> getProdutos() {
        return this.produtos;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Double getValorFrete() {
        return this.valorFrete;
    }
    public void setValorFrete(Double valorFrete) {
        this.valorFrete = valorFrete;
    }
    public Double getDesconto() {
        return this.desconto;
    }
    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
    public FormaDePagamento getForma() {
        return this.forma;
    }
    public void setForma(FormaDePagamento forma) {
        this.forma = forma;
    }
    public Double getValorTotal() {
        return this.valorTotal;
    }
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    //#endregion

    //#region Métodos

    public void esvaziarCarrinho(){
        this.produtos.clear();
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public Double calcularValorPedido(){
        for (Produto produto : produtos) {
            this.valorTotal += produto.getValorTotal() + valorFrete;
        }
         return this.valorTotal;
    }
    //#endregion
}
