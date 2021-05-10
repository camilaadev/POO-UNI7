import java.util.*;

public abstract class ContaCliente {
	  protected double saldo;
	  private Pessoa Cliente;
	  
	
	
	
	  public ContaCliente(Pessoa cliente) {
		this.Cliente = cliente;
	}

	public abstract double depositar(double dinheiro) throws DepositoNegativoException;

	public abstract void sacar(double dinheiro) throws SaqueNegativoException, SaldoInsuficienteException; 
	
	public double getSaldo() {
		return saldo;
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
	

public void tranferencia(ContaCliente conta,double valor) throws DepositoNegativoException, TransferenceException {
	if (this.Cliente.getName() == conta.Cliente.getName()) {
		throw new TransferenceException("Você nao pode transferir para voce mesmo");
	}
	conta.depositar(valor);	
}

public Pessoa getCliente() {
	return Cliente;
}

public void setCliente(Pessoa cliente) {
	Cliente = cliente;
}
}
