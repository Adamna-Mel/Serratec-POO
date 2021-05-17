package model.pedido;

public enum FormaDePagamento {
    CREDITO("Cartão de Crédito"),
    DEBITO("Cartão de Débito"),
    BOLETO("Boleto"),
    PIX("PIX"),
    PICPAY("PicPay");

    private String forma;

    private FormaDePagamento(String forma){
        this.forma = forma;
    }

    public String getForma(){
        return this.forma;
    }  
}
