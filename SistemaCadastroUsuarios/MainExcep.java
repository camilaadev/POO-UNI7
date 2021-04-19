import cidadao.CadastroPessoa; 
import cidadao.Pessoa;
import java.util.*; 

public class MainExcep{
  private static final String [] NOMES = {"Camila", "Matheus", "Natasha", "Pedro"};
  private static final Random RANDOM = new Random(); 

  public static void main(String[] args){
  CadastroPessoa cadastro = new CadastroPessoa(); 
  CadastroDeclaracao cadastroDeclaracoes = new CadastroDeclaracao();

  for(int i = 0; i<100;i++){
     Pessoa pessoa = new Pessoa(); 
     pessoa.setNome(nomeAleatorio() + " " + nomeAleatorio());
    pessoa.setCpf(RANDOM.nextInt());
    pessoa.setNascimento(new Date());
    pessoa.setRendaMensal(RANDOM.nextInt(22_000));

    cadastro.registrar(pessoa);

    Declaracao ir = new DeclaracaoIR(pessoa); 
    ir.addEmprego(new Emprego("UNI7", 10.0)); cadastroDeclaracoes.registrar(ir);
    }
  }
  
  System.out.println("Total de pessoas: " +cadastro.getPessoas().size());
  for(Pessoa pessoa : cadastro.getPessoas()){
     System.out.println(pessoa);
  }

  public static String nomeAleatorio(){ 
    return NOMES[RANDOM.nextInt(NOMES.length)];
  }
}
}