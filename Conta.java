public abstract class Conta{
   
  protected double saldo;
	 private int agencia;
	 private int numero;
	 private Cliente titular;
   private static int total = 0;
     
 
    
   public Conta(int agencia, int numero) {
	   Conta.total++;
	   System.out.println("O total de contas é: " + Conta.total);
	   this.agencia = agencia;
	   this.numero = numero;
	   System.out.println("Estou criando uma conta " + this.numero);
   }

   public abstract void  deposita(double valor);
    	
    
   public void saca(double valor){
       if(this.saldo < valor) {
           System.out.println("Saldo: " + this.saldo + ", Valor: " + valor);
       } else {
         this.saldo -= valor;       
       }   
   }
    
    public double getSaldo() { 
        return this.saldo;
	
    }
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a 0"); 
			return;
		}	
			this.agencia = agencia;
		}
	
	public int getnumero() {
		return this.numero;
	}
	public void setNumero(int novoNumero) {
		if(numero <= 0) {
			System.out.println("Não pode valor <= 0");
			return;
		}
		
		this.numero = novoNumero;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
		}
	public static int getTotal() {
		return Conta.total;
	}
}