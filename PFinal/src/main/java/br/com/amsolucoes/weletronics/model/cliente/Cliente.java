package model.cliente;

import model.endereco.Endereco;

public class Cliente {
    private String nome;
    private String email;
    private String celular;
    private String cpfOUCnpj;
    private Endereco endereco;
        
    public Cliente(
        String nome, 
        String email, 
        String celular, 
        String cpfOUCnpj, 
        Endereco endereco) {
    
        this.nome = nome;
        this.email = email;
        this.celular = celular;
        this.cpfOUCnpj = cpfOUCnpj;
        this.endereco = endereco;
    }
    
    //#region Gets e Sets
        
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCelular() {
        return this.celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getCpfOUCnpj() {
        return this.cpfOUCnpj;
    }
    public void setCpfOUCnpj(String cpfOUCnpj) {
        this.cpfOUCnpj = cpfOUCnpj;
    }
    public Endereco getEndereco() {
        return this.endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    //#endregion           
}
