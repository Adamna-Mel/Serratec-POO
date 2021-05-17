package model.endereco;

public class Endereco {
        private String rua;
        private Integer numero;
        private String bairro;
        private String complemento;
        private String referencia;
        private String cep;
        private String cidade;
    
        public Endereco(
            String rua, 
            Integer numero, 
            String bairro, 
            String complemento,
            String referencia,
            String cep,
            String cidade) {
    
                this.rua = rua;
                this.numero = numero;
                this.bairro = bairro;
                this.complemento = complemento;
                this.referencia = referencia;
                this.cep = cep;
                this.cidade = cidade;
            }
    
        //#region Gets e Sets
    
        public String getRua() {
            return this.rua;
        }
        public void setRua(String rua) {
            this.rua = rua;
        }
        public Integer getNumero() {
            return this.numero;
        }
        public void setNumero(Integer numero) {
            this.numero = numero;
        }
        public String getBairro() {
            return this.bairro;
        }
        public void setBairro(String bairro) {
            this.bairro = bairro;
        }
        public String getComplemento() {
            return this.complemento;
        }
        public void setComplemento(String complemento) {
            this.complemento = complemento;
        }
        public String getReferencia() {
            return this.referencia;
        }
        public void setReferencia(String referencia) {
            this.referencia = referencia;
        }
        public String getCep() {
            return this.cep;
        }
        public void setCep(String cep) {
            this.cep = cep;
        }
        public String getCidade() {
            return this.cidade;
        }
        public void setCidade(String cidade) {
            this.cidade = cidade;
        }
        //#endregion
}
