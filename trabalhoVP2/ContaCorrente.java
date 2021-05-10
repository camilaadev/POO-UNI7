public class ContaCorrente extends ContaCliente {
	 
	public ContaCorrente(Pessoa cliente) {
		super(cliente);
	}
	  
	
	public void sacar(double dinheiro) throws SaqueNegativoException, SaldoInsuficienteException  {
		    if (dinheiro < 0) {
		      throw new SaqueNegativoException("Você nao pode sacar valores negativos");
		    }

		    if (dinheiro > this.saldo) {
		      throw new SaldoInsuficienteException("Você tem apenas R$ " + this.saldo + " de saldo");
		    }
		    this.saldo -= dinheiro;
	  }
	
	public double depositar(double dinheiro) throws DepositoNegativoException {
		    if (dinheiro <= 0) {
		      throw new DepositoNegativoException("Você não pode depositar valores negativos");
		    }
		    this.saldo = this.saldo + dinheiro;
		    return saldo;
		  }
}