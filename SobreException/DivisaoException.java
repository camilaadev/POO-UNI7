/*1 - Implemente um método que recebe dois números inteiros, a e b, e executa o cálculo a / b. Seu método lança uma exceção caso o valor de b seja igual a 0. Implemente ainda um método main que execute seu método e capture possíveis exceções lançadas por ele.

/*public class DivisaoException{
  public void divisaoException(int a, int b) throws Exception{
    try {
      a/b; //tente
    }
      catch(ArithmeticException e) { //aqui captura o erro. no parametro especificamos o erro qu querrmos tratar e guarda o erro dentro da variavel e
        System.out.println("Erro! Não é possível divisão por zero.");
      }
  }
}
 
*/

/*posso criar um aexcecao, todas as excecoes ou herdam de throwable, 
// ou herdq de exception ou de runtime excdption.
 s quero fazer uma excecao que é obrigada ser declarada e / ou obrigatoriamente checada,
 então deve herdar de exception, caso contrario herda de runtime exception, pode herdar tanto de um quano de outro. 
 quando lanca uma excecao, obrigatoriamente tem que declarar o throws, se n tiver isso o cofigo nao vai compilar,
 a nao ser que se fosse o caso de eu herdar de runtime exception

tenho que colocar meu metodo dentro de um try e em seguida fazer o catch, senao vai dar erro de compilação,
 caso eu nao queira fazer isto estao posso colocar throws (nome da exceção)no public static void main


pode ter vários catch em um mesmo try*/
