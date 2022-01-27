package One.Innovation.Digital;

public  abstract class Conta implements Iconta {
    private static  final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL =1;

    protected int agencia;
    protected  int numero;
    protected  double saldo;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public  void sacar(double valor){
        saldo -= valor;
    }
    @Override
    public  void depositar(double valor){
        saldo += valor;
    }
    @Override
    public  void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    protected void imprimirInfosComuns(){
        System.out.printf(String.format("\nAgencia: %d", this.agencia));
        System.out.printf(String.format("\nNumero: %d", this.numero));
        System.out.printf(String.format("\nSaldo: %.2f", this.saldo));
    }

}
