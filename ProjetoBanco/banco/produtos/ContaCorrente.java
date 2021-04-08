/*se eu herdar de uma classe abstrata enho a obrigação de implementar os métodos abstratos
que foram definidos na superclasse

assim: basta colocar a mesma assiaura delcarada na superclasse, remover a palavra abstract e dar um corpo para o método.

*/
package banco; //a classe ContaCorrente pertence ao pacote Banco. 
//pacote é uma hierarquia de pastas que usamos para organizar os codigos

public class ContaCorrente extends Produto implements Imprimivel {
  
  public  String getTipo(){
    return "Conta Corrente";
  }
  public void calcularRendimento(){  
    //- Conta Corrente tem rendimento fixo de 1% do saldo ao mês.
    double saldoAtual = getSaldo(); //pega o saldo atual
    saldoAtual += saldoAtual * 0.01; //pega 1% do saldo atual e soma à variavel
    setSaldo(saldoAtual); //chama o setSaldo passando o novo valor que acabamos de calcular
  }

  public void imprimir(){
    System.out.println("Rendimento da" +getTipo() +":" );
  }
  

  //esse método pode ser acessado por quaisquer classes definidas no mesmo pacote da classe em que está definido, neste caso na conta corrente 
  int soma(int a, int b){
    return a+b;
  } //para as outras classes do pacote produtos poderem chamar este método soma antes eles em que ter uma instancia de ContaCorrente.

  //agora se esse metodo soma fosse estatico nao precisaria fzer as instancias nas outras classes d pacote produtos. 
}

