/* - Conta Poupança tem rendimento de 2% a.a. se a Selic for maior que 10% a.a., ou 10% da Selic caso contrário.
Neste caso precisamos da informação da axa selic para calcular esse rendimento */
package banco;
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

  public String toString(){ 
    return "Poupança: " +getConta() + " Saldo: " +getSaldo()+ "Senha: "+senha;
  }
 /* 
    public boolean equals(Object obj){
    // == compara endereços de memória
    //o equals compara o conteúdo dos objetos 
   
    int conta = obj.getConta(); //getConta aqui colocamos ela numa variável do tipo inteiro
    return this.getConta() == conta;
    //numa superclasse não da pra acessar um metodo de uma subclasse, nesse caso o getConta() está em uma subclasse, na hora que compilar isto vai dar um erro.

    A maneira correta de implementar este método é:
  */
  public boolean equals(Object obj){ //aqui compara apenas o número de conta
    ContaPoupanca outraPoupanca = (ContaPoupanca) obj; //casting para tranformar o obj em uma ContaPoupanca
    return this.getConta() == outraPoupanca.getConta();
  }

  /* Interface List = os elementos que estão dentro de uma lista são ordenados, a ordem importa, 
  se adicionamos um elemento numa lista podemos definir uma posiçao para cada elemento. Listas aceitam elementos duplicados 
  
  Interface set = conjunto. é uma coleção/conjunto de elementos. a diferença para um List é que no set não tem ordem, podemos colocar N elementos dentro deste conjunto, mas não tem ordem, apenas a ideia de pertencimento.
  Aqui não aceita elementos duplicados.
  */
}
