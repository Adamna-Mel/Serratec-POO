import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import java.text.ParseException;
import model.cliente.Cliente;
import model.empresa.Empresa;
import model.endereco.Endereco;
import model.pedido.FormaDePagamento;
import model.pedido.Pedido;
import model.produto.Produto;
import model.produto.TipoProduto;

public class App{
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("************************************** WEletronics **************************************");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("");



    var endereco1 = new Endereco("Rua Mariano Torres", 510, "Centro", "Ap 1303", 
                                "Prox. a Rodoviaria", "8060-120", "Curitiba");

    var cliente1 = new Cliente("Ana Julia Moreira", "naju@gmail.com", "(41) 99651-2274", 
                                                           "326.080.654-98", endereco1);

    var pedido1 = new Pedido(1, cliente1, 16.9, 0.0, FormaDePagamento.DEBITO);
    
    
    var produto1 = new Produto("NF006", "Notebook Acer Aspire 5", TipoProduto.FRETE_GRATIS, 1, 4679.0, 25.0);
    pedido1.adicionarProduto(produto1);



    var endereco2 = new Endereco("Benjamin Constant", 301, "Centro", "Terreo", 
                                 "Prox. a Praça da Republica", "66035-095", "Belem");

    var cliente2 = new Cliente("Raquel Silva", "raquel@gmail.com", "(91) 96253-8711", 
                                                        "716.034.401-72", endereco2);

    var pedido2 = new Pedido(6, cliente2, 54.9, 0.0, FormaDePagamento.BOLETO);
    
    
    var produto2 = new Produto("SM007", "Samsung  Galaxy Note 20", TipoProduto.PROMOCAO, 1, 3719.0, 260.0);
    pedido2.adicionarProduto(produto2);
    
    

    var endereco3 = new Endereco("Francisco Bapstista Granito", 777, "Bonsucesso", "", 
                                         "Prox. a Igreja", "25995-970", "Teresopolis");

    Cliente cliente3 = new Cliente("Renan Oliveira", "raquel@gmail.com", "(91) 96253-8711", 
                                                               "716.034.401-72", endereco3);

    var pedido3 = new Pedido(13, cliente3, 9.9, 50.0, FormaDePagamento.PIX);

    
    var produto3 = new Produto("PH074", "Fone Headset Gamer", TipoProduto.IMPORTADOS, 2, 199.0, 0.0);
    pedido3.adicionarProduto(produto3);

    

    var endereco4 = new Endereco("Rua Lamenha Lins", 277, "Batel", "Ap 1906", 
                        "Prox. ao Shopping Curitiba", "80250-250", "Curitiba");

    Cliente cliente4 = new Cliente("Caio Antunes", "caio@gmail.com", "(41) 98793-3515", 
                                                           "902.132.637-19", endereco4);

    var pedido4 = new Pedido(46, cliente4, 27.9, 0.0, FormaDePagamento.CREDITO);

    
    var produto4 = new Produto("PH074", "Fone Headset Gamer", TipoProduto.IMPORTADOS, 1, 199.0, 0.0);
    pedido4.adicionarProduto(produto4);
    
    

    var endereco5 = new Endereco("Prof. Dario Veloso", 810, "Vila Izabel", "Terreo", 
                                "Esquina com rua Tabajaras", "80320-050", "Curitiba");

    Cliente cliente5 = new Cliente("Amanda Melo", "amanda@gmail.com", "(41) 98513-4091", 
                                                            "935.077.650-13", endereco5);

    var pedido5 = new Pedido(13, cliente5, 25.0, 50.0, FormaDePagamento.BOLETO);

    
   var produto5 = new Produto("GJK8", "Samsung Galaxy S21 Ultra", TipoProduto.PROMOCAO, 1, 6974.0, 2000.0);
   pedido5.adicionarProduto(produto5);
    
  

    var endereco = new Endereco("Delfim Moreira", 123, "Varzea", "2º andar", "", "25953-232", "Teresopolis");
    
    var listaDePedidos = new ArrayList<Pedido>();
    listaDePedidos.add(pedido1);
    listaDePedidos.add(pedido2);
    listaDePedidos.add(pedido3);
    listaDePedidos.add(pedido4);
    listaDePedidos.add(pedido5);

    var empresa = new Empresa("WEletronics", "25.789.846/0001-77", "weletronic@gmail.com", endereco, listaDePedidos);

    var scanner = new Scanner(System.in);
    var empresario = new Empresa();

    System.out.print("Olá Sr. Weberson! ");
    System.out.println("Bem vindo ao sistema da WEletronics!!");
    System.out.println("Deseja ver o relatório de vendas da loja agora?");
    empresario.lerResposta(scanner.nextLine());

    if (empresario.getVerificarRelatorio().toLowerCase().equals("sim")){
        System.out.print("Por favor, digite seu CNPJ: ");
        empresario.setCnpj(scanner.nextLine());
    
    
    
    System.out.println("");
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");  
    System.out.println("********************************** Relatório de Vendas **********************************");  
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");  
    System.out.println(""); 

    var formatador = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

    try {

        java.util.Date dataPedido1 = formatador.parse("10/05/2021 21:19:34");

        System.out.println("");
        System.out.println("Pedido recebido em: " + (formatador.format(dataPedido1)));
        System.out.println("");

    } catch (ParseException e) {

        e.printStackTrace();
    }

    empresa.imprimirRelatorio(cliente1, pedido1, produto1);


    try {

        java.util.Date dataPedido2 = formatador.parse("11/05/2021 12:15:07");
        System.out.println("");
        System.out.println("Pedido recebido em: " + (formatador.format(dataPedido2)));
        System.out.println("");

    } catch (ParseException e) {

        e.printStackTrace();
    }
    empresa.imprimirRelatorio(cliente2, pedido2, produto2);


    try {

        java.util.Date dataPedido3 = formatador.parse("12/05/2021 20:12:48");
        System.out.println("");
        System.out.println("Pedido recebido em: " + (formatador.format(dataPedido3)));
        System.out.println("");

    } catch (ParseException e) {

        e.printStackTrace();
    }

    empresa.imprimirRelatorio(cliente3, pedido3, produto3);


    try {

        java.util.Date dataPedido4 = formatador.parse("11/05/2021 16:18:25");
        System.out.println("");
        System.out.println("Pedido recebido em: " + (formatador.format(dataPedido4)));
        System.out.println("");

    } catch (ParseException e) {

        e.printStackTrace();
    }

    empresa.imprimirRelatorio(cliente4, pedido4, produto4);


    try {

        java.util.Date dataPedido5 = formatador.parse("12/05/2021 21:21:21");
        System.out.println("");
        System.out.println("Pedido recebido em: " + (formatador.format(dataPedido5)));
        System.out.println("");

    } catch (ParseException e) {

        e.printStackTrace();
    }


    empresa.imprimirRelatorio(cliente5, pedido5, produto5);

    System.out.println("FATURAMENTO TOTAL R$" + (Math.round(empresa.calcularTotalPedidos())));
    
    }


    else {
        System.out.println("Enviaremos o relatorio por e-mail, para que possa verificar mais tarde."); 
        System.out.print("Por favor, digite seu e-mail: ");
        empresario.setEmail(scanner.nextLine());
    }  


    System.out.println("");
    System.out.println("                        Obrigada por utilizar o sistema!");
    System.out.println("");
    System.out.println("                                   BOAS VENDAS!!");
    System.out.println("");
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
 }
}