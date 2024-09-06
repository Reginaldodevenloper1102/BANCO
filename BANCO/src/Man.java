
public class Man {

	public static void main(String[] args) {
		Cliente Reginaldo = new Cliente();
		Reginaldo.setNome("Reginaldo");
		
		Conta cc = new ContaCorrente(Reginaldo);
		Conta poupanca = new ContaPoupanca(Reginaldo);
		
		cc.depositar(100);
		poupanca.depositar(100);
		
		poupanca.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
		
		

	}

}
