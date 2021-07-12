public class Principal {
    public static void main(String[] args) {
        /*
        Pessoa vai ser cobrada
        Pessoa que está cobrando
        valor de dívida
        acordo a ser feito com as partes
        forma de pagamento
        valor a ser cobrado = valor original * taxa
         */

        PessoaJuridica lojaDoBairro = new PessoaJuridica();
        lojaDoBairro.setNome("Loja do Bairro");
        lojaDoBairro.setCnpj("94.679.343/0001-78");
        PessoaFisica joao = new PessoaFisica();
        joao.setNome("João");
        joao.setCpf("481.128.090-38");
        joao.setDataNascimento("15/11/1999");

        Divida divida = new Divida(lojaDoBairro, joao, 1000.00);
        AcordoDivida acordoDivida = new AcordoDivida(divida, FormaDePagamento.DEBITO);
        System.out.println("---- Dados Devedor: ");
        System.out.println("Nome: " + acordoDivida.getDivida().getDevedora().getNome());
        System.out.println("Data nascimento: " + acordoDivida.getDivida().getDevedora().getDataFormada());
        System.out.println("Documento : " + acordoDivida.getDivida().getDevedora().getDocumento());
        System.out.println("---- Dados Cobrador");
        System.out.println("Nome: " + acordoDivida.getDivida().getCobradora().getNome());
        System.out.println("Documento: " + acordoDivida.getDivida().getCobradora().getDocumento());

        System.out.println("Valor da dívida: " + acordoDivida.getDivida().getValorDivida());
        System.out.println("Forma de pagamento: " + acordoDivida.getFormaDePagamento().name());
        System.out.println("Valor total: " + acordoDivida.getValorTotal());
    }
}

