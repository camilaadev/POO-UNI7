/*se eu herdar de uma classe abstrata enho a obrigação de implementar os métodos abstratos
que foram definidos na superclasse

assim: basta colocar a mesma assiaura delcarada na superclasse, remover a palavra abstract e dar um corpo para o método.

*/
public class ContaCorrente extends Produto{
  
  public  String getTipo(){
    return "Conta Corrente";
  }
  public void calcularRendimento(){  
    //- Conta Corrente tem rendimento fixo de 1% do saldo ao mês.
    double saldoAtual = getSaldo(); //pega o saldo atual
    saldoAtual += saldoAtual * 0.01; //pega 1% do saldo atual e soma à variavel
    setSaldo(saldoAtual); //chama o setSaldo passando o novo valor que acabamos de calcular
  }
}

