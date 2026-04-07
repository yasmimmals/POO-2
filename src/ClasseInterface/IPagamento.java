package ClasseInterface;

public interface IPagamento {
    // contrato: quem implementar essa interface, deve implementar esses métodos

     void autorizar(float valor); // já é public por si só

     void exibirComprovante();


}
