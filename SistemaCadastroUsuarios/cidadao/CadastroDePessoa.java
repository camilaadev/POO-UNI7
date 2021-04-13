package cidadao; 
import java.util.*;

public class CadastroDePessoa{
  private final Set<Pessoa> pessoas;

  public CadastroDePessoa(){ 
    pessoas = new HashSet<>();
  }

  public void registrar(Pessoa pessoa){ 
    pessoas.add(pessoa); //adiciona pessoas do cadastro
  }

  public Set<Pessoa> getPessoas(){ 
    return pessoas; //rettorna o conjunto de pessoas do cadasstro
  }