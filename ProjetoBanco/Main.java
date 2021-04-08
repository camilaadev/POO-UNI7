import java.util.*;
 //tem que importar para poder usar as subclasses
import banco.Produto; //pacotes permitem visibilidades: private and public
import banco.produtos.*;

public class Main {
  public static void main(String[] args){
    ContaPoupanca.setSelic(10); 

    ContaPoupanca cp1 = new ContaPoupanca();
    cp1.setConta(1);
    cp1.setSaldo(1500); //saldo inicial
    cp1.imprimir();
    ContaPoupanca cp2 = new ContaPoupanca();
    cp1.setConta(2);
    cp2.setSaldo(9000); //saldo inicial

    ContaCorrente cc1 = new ContaCorrente();
    cp1.setConta(3);
    cc1.setSaldo(90);

    TituloDeCapitalizacao tc1 = new TituloDeCapitalizacao();
    tc1.setConta(4);
    tc1.setSaldo(190);
    TituloDeCapitalizacao tc2 = new TituloDeCapitalizacao();
    tc2.setConta(5);
    tc2.setSaldo(71990);

  
  /* - Título de Capitalização tem [...] sorteios mensais de 10.000 reais onde todos os clientes concorrem. */
  //para fazer o soreio vamos criqr uma lista e colocar as pessoas 

  List <TituloDeCapitalizacao> titulos = new ArrayList<>();
  titulos.add(tc1);
  titulos.add(tc2);

  Random random = new Random(); // vai gerar numeros aleatorios
  int vencedor = random.nextInt(titulos.size()); //parametro é o tamanho da lista de TituloCapitalizacao
  TituloDeCapitalizacao tituloVencedor = titulos.get(vencedor);
  tituloVencedor.receberPremio(10_000);


    //calcular rendimentos usando uma lista 
    
//List e uma interfa e e arrayList é uma classe que implementa eessa interface 
    List<Produto> produtos = new ArrayList<>(); 
    Set<Produto> produtosSet = new HashSet<>(); //como implementar um set / conjunto:
     produtosSet.add(cp1);
     produtosSet.add(cp1); //aqui neste conjunto estou adicionando duas vezes, então esta repetido... Como o set vai saber? ele chama o metodo equals de cada objeto
    produtos.add(cp1);
    produtos.add(cp2);
    produtos.add(cc1);
    produtos.add(tc1);
    produtos.add(tc2);

    //iterar sobre todos os produtos:
    for (Produto produto : produtos){ // para cada produto na lista de Produtos
       produto.calcularRendimento(); //calcule o rendimento
       System.out.println(produto.getTipo() + "-" + produto.getSaldo());
       
      
    }

 /* toda classe seeu tiver um metodo abstrado dela ou herdado, ent a classe em que ser abstrata, se eu nao quisr implementar um metodo abstrato então obrigatoriamente a classe se torna abstrata*/





  }
}











