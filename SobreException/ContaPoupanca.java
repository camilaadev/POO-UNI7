/*Crie uma classe ContaPoupanca que possua métodos para depositar e sacar uma determinada quantia de dinheiro. Implemente ainda suas próprias exceções para tratar possíveis erros que possam acontecer ao executar os métodos sacar e depositar. Implemente um método main que execute ambos os métodos e capture possíveis exceções.*/
public class ContaPoupanca{
   private double saldo;

   public ContaPoupanca(){
     this.saldo = 0;
   }
   public void depositar(double dinheiro){
     this.saldo+=dinheiro;
   }
   public void sacar(double dinheiro) throws SaqueNegativoException, SaldoInsuficienteException{

     if(dinheiro>0){ //voce nao tem dinheiro!!
       throw new SaqueNegativoException();
     }
     if(dinheiro>this.saldo) { //se quiser sacar mais do que tem, ent vai lançcar uma exceção
    //aqui criar uma excecao de nome saldoInsuficiente para saque
      throw new SaldoInsuficienteException();//quando estou lançando uma exceção que herda de exception, entao tenho que implementar ela no metodo
     }
     this.saldo-=dinheiro
   }
   public double getSaldo(){
      return this.saldo;
  }
