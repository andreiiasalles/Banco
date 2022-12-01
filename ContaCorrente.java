public class ContaCorrente extends Conta {
    public ContaCorrente(int agencia, int numero) {
            super(agencia, numero);
    }
        
        
        public void deposita(double valor){
        	super.saldo += valor;
        }
  
        public void saca(double valor)  {
          double resultado = saldo - valor;
          
          if (resultado < -200.0) {
            System.out.println("Limite atingido, " + 
                               " Saldo: " + 
                               this.saldo + 
                               " Valor desejado: " + 
                               valor);
          } else {
            super.saldo -= valor;
          }
        }
}