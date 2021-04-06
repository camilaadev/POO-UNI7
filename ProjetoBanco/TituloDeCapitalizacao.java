/* - Título de Capitalização tem rendimento fixo de 0.5% do saldo ao mês e sorteios mensais de 10.000 reais onde todos os clientes concorrem. */

public class TituloDeCapitalizacao extends Produto{
   public  String getTipo(){
    return "Título de Capitalização";
  }

  public void calcularRendimento(){  
    //- Conta Corrente tem rendimento fixo de 1% do saldo ao mês.
    double saldoAtual = getSaldo(); //pega o saldo atual
    saldoAtual += saldoAtual * 0.005; //pega 0.5% do saldo atual e soma à variavel
    setSaldo(saldoAtual); //chama o setSaldo passando o novo valor que acabamos de calcular
  }
  public void receberPremio(int premio){ 
    setSaldo(getSaldo()+premio);
  }


}