package model.empresa;

import java.util.ArrayList;
import model.cliente.Cliente;
import model.endereco.Endereco;
import model.pedido.Pedido;
import model.produto.Produto;


public class Empresa {
    private String nome;
    private String cnpj;
    private String email;
    private Endereco endereco;
    private ArrayList<Pedido> pedidos;
    private Double totalPedidos;
    private String verificarRelatorio;
    
    public Empresa(String nome, String cnpj, String email, Endereco endereco, ArrayList<Pedido> pedidos) {

        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.endereco = endereco;
        this.pedidos = new ArrayList<Pedido>();
        this.pedidos = pedidos;
        this.totalPedidos = 0.0;
    }

    //#region Gets e Sets

    public Empresa() {
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj(){
        return this.cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public Endereco getEndereco() {
        return this.endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public ArrayList<Pedido> getPedidos() {
        return this.pedidos;
    }
    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;   
    }
    public Double getTotalPedidos(){
        return this.totalPedidos;
    }
    public String getVerificarRelatorio(){
        return this.verificarRelatorio;
    }
    //#endregion

    //#region Métodos

    public void adicionarPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }

    
    public Double calcularTotalPedidos(){
        for (Pedido pedido : pedidos) {
           this.totalPedidos += pedido.calcularValorPedido();
        }
        return this.totalPedidos;
    }

    
    public void imprimirRelatorio(Cliente cliente, Pedido pedido, Produto produto){

        System.out.println("" );
        System.out.println("Cliente"); 
        System.out.println("_________________________________________________________________________________________"); 
        
        System.out.println("Nome: " +  cliente.getNome());
        System.out.println("CEP: " + cliente.getEndereco().getCep());
        System.out.print("Endereco : " + cliente.getEndereco().getRua() + ",");
        System.out.println(" Bairro " + cliente.getEndereco().getBairro());
        System.out.println("Referencia: " + cliente.getEndereco().getReferencia());
        System.out.println("");
        System.out.println("____________________________________________________________________________________________");
        System.out.println("Codigo        Descricao              Quantidade      Valor Unitario      Valor Total" );
        System.out.print( produto.getCodigo() + "         " + produto.getDescricao() + "        " + produto.getQuantidade() + "              " + produto.getValorUnitario() + "            " + produto.getValorTotal());
        System.out.println("");
        System.out.println("");
        System.out.println("_____________________________________________________________________________________________");
        System.out.println("FORMA DE PAGAMENTO: " + pedido.getForma());
        System.out.println("FRETE: " + pedido.getValorFrete());
        System.out.println("DESCONTO: " + pedido.getDesconto());
        System.out.println("VALOR TOTAL: " + pedido.calcularValorPedido());
        System.out.println("");
        System.out.println("***********************************************************************************************");
        System.out.println("***********************************************************************************************");
        System.out.println("");       
  
    }

    public void lerResposta(String resposta){
        this.verificarRelatorio = resposta;
            
    }
    //#endregion  
}

      
