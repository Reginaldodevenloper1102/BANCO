
public abstract class  Conta implements IConta{
	
	
	private static final int agenciaPadrao = 1;
	private static int SEQUENCIAL = 1;
	
	protected int  agencia;
	protected int numero;
	protected  double saldo;
	protected Cliente cliente;
	

	public Conta(Cliente cliente) {
		this.agencia = Conta.agenciaPadrao;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	protected void ImprmimindoInfoContas() {
		System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d",this.numero));
		System.out.println(String.format("Saldo: %.2f",this.saldo));
		
	}
	
	

	public void sacar(double valor) {
		saldo -= valor();
		
	}
	public void depositar(double valor) {
		saldo += valor();
		
	}
	
	public double valor() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void transferir(double valor, Conta contaDestino) {
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
    

}
