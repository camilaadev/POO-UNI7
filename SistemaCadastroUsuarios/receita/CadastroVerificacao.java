package receita; 
import java.util.*; 

public class CadastroVerificacao(){ 
private final List<DeclaracaoIR> declaracoes;

public CadastroDeclaracao(){ 
  declaracoes = new ArrayList<>();
}
public void registrar(DeclaracaoIR declaracao){ 
  declaracoes.add(declaracao);
}
public List<DeclaracaoIR> getDeclaracoes(){
  return declaracoes;
}
public List<Pessoa> verificarInconsistencia(List<Pessoa>pessoas){
  List<Pessoa> inconsistencias = new ArrayList<>();
  for (Pessoa pessoa : pessoas) {
        for (DeclaracaoIR declaracao : declaracoes) {
          if (declaracao.getPessoa().getCpf() == pessoa.getCpf()) {
            double rendaMensal = pessoa.getRendaMensal();
            double rendaIR = declaracao.getRenda();

            if (rendaIR != rendaMensal) {
              //inconsistencia
              inconsistencias.add(pessoa);
            }
          }
        }
      }

      return inconsistencias;
}
}