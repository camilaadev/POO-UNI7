/*1 - Implemente um método que recebe dois números inteiros, a e b, e executa o cálculo a / b. Seu método lança uma exceção caso o valor de b seja igual a 0. Implemente ainda um método main que execute seu método e capture possíveis exceções lançadas por ele.

2 - Crie uma classe ContaPoupanca que possua métodos para depositar e sacar uma determinada quantia de dinheiro. Implemente ainda suas próprias exceções para tratar possíveis erros que possam acontecer ao executar os métodos sacar e depositar. Implemente um método main que execute ambos os métodos e capture possíveis exceções.*/
public class DivisaoException{
  public void divisaoException(int a, int b){
    try {
      a/b;
    }
      catch(ArithmeticException e) { //aqui captura o erro. no parametro especificamos o erro qu querrmos tratar e guarda o erro dentro da variavel e
        System.out.println("Erro! Não é possível divisão por zero.");
      }
  }
}
 