public class ContaPoupanca extends ContaCliente {
	
	public ContaPoupanca(Pessoa Cliente) {
		super(Cliente);
	}

	public void sacar(double dinheiro) throws SaqueNegativoException, SaldoInsuficienteException {
		  if (dinheiro < 0) {
		      throw new SaqueNegativoException;
		    }

		    if (dinheiro > this.saldo) {
		      throw new SaldoInsuficienteException("Você só tem R$ " + this.saldo + "  ");
		    }
	}
 
}