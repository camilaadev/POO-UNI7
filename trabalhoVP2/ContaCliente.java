import java.util.*;
public abstract class ContaCliente {
	  private double saldo;
	  private Pessoa Cliente;
	  
	
	  public ContaCliente(Pessoa cliente) {
		this.Cliente = cliente;
	}

	

	public void sacar(double dinheiro) throws SaqueNegativoException, SaldoInsuficienteException; 
  
  public double depositar(double dinheiro) throws DepositoNegativoException{

  }
	public setSaldo(){
    this.saldo = saldo;
  }
	public double getSaldo() {
		return saldo;
	}

	 
public Pessoa getCliente() {
	return Cliente;
}

public void setCliente(Pessoa cliente) {
	Cliente = cliente;
}
  Random random = new Random(); // vai gerar uma conta aleatória
  int randomAccount = random.nextInt(9900) + 2;
  int randomAgency = random.nextInt(2530) + 9;
  public void informacoesContaBancaria(){
        System.out.println ("Cliente: "+ this.Cliente.getName() +
                            "\nNumero da Conta: " +randomAccount+
                            "\nTipo da Conta: Conta Corrente" +
                            "\nAgência: " +randomAgency+
                             "\nLimite inicial: R$500,00");
        
  };
	
  public void proximaOperacao(){
      System.out.println("Qual operação você deseja realizar agora? Digite uma opção.");
    System.out.println("1 - Sacar");
    System.out.println("4 - Depositar");
    System.out.println("3 - Transferir");
    System.out.println("0 - Sair do sistema");
  }         
  public void depositar(){
    
    Scanner scanner = new Scanner(System.in);
          double valor;
    	  System.out.print("Digite o valor para deposito: ");
    	  valor = scanner.nextDouble();
        double novoSaldo = saldo += valor;
    	  System.out.println("Seu saldo atual é: " +novoSaldo);

      }
}
