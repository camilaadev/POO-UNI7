/* - Conta Poupança tem rendimento de 2% a.a. se a Selic for maior que 10% a.a., ou 10% da Selic caso contrário.
Neste caso precisamos da informação da axa selic para calcular esse rendimento */

public class ContaPoupanca extends Produto implements Imprimivel{
  //eu tenho um atributo static significa que eu tenho uma área de memória que é compartilhada com  todos os objetos da classe, neste caso da classe ContaPoupanca
  private static double porcentagemSelic; //está em todas as classes, por isso deve ser static

  public String getTipo(){
    return "Conta Poupança";
  }

  public void calcularRendimento(){  
    //- Conta Corrente tem rendimento fixo de 1% do saldo ao mês.
    double saldoAtual = getSaldo(); //pega o saldo atual
    double rendimento;
    if(porcentagemSelic > 10){
        rendimento = saldoAtual * (0.02 / 12); //diide por 12 pois está considerando a selic anual, e na questão estamos calculando o rendimento mensal, eh por isso que tem que dividr por 12(um ano).
    }else{
      rendimento = porcentagemSelic * 0.10;
    }
    setSaldo(saldoAtual + rendimento); //chama o setSaldo passando o novo valor que acabamos de calcular
  }
 
  //estes dois metodos estão manipulando o atributo estático, então também podem ser estáticos
  //o metodo estatico não precisa de uma instanciade classe para ser usado.
  public static void setSelic(double selic){
       porcentagemSelic = porcentagemSelic;
  }
  public static double getSelic(){
    return porcentagemSelic;
  }

  public void imprimir(){
    System.out.println("Rendimento");
  }

}
