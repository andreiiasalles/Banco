public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia,numero);
	}
	
	 public void deposita(double valor){
     	super.saldo += + valor;
			
		}
  
  public void rendimento() {
     saldo *=  1.1375;
    System.out.println("O seu rendimento é: % " + saldo);
   }
}