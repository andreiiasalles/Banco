class Main {
  public static void main(String[] args) {

    ContaPoupanca cp = new ContaPoupanca(2222, 2222);
		cp.deposita(200.0);

    ContaCorrente cc = new ContaCorrente(1111, 1111);
		cc.deposita(100.0); 

    System.out.println("\nGostaria de sacar 20 reais.");
		cc.saca(20.0);  

    System.out.println("\nCC " + cc.getSaldo());
    
   System.out.println("\nGostaria de sacar 290 reais.");
    cc.saca(290.0);  
    System.out.println("\nCC " + cc.getSaldo());
   
    System.out.println("\nGostaria de sacar 280 reais.");
    cc.saca(280.0); 
    System.out.println("\nCC " + cc.getSaldo());

    cp.saca(20.0);
		
		
    System.out.println("\nCP " + cp.getSaldo());
		
    cp.rendimento();

  
  }
}