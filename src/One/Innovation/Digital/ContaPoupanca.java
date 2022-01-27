package One.Innovation.Digital;

public class ContaPoupanca  extends  Conta{
    @Override
    public void imprimirExtrato() {
        System.out.println("\n**** Extrato Conta Poupanca ****");
        super.imprimirInfosComuns();
    }
}
