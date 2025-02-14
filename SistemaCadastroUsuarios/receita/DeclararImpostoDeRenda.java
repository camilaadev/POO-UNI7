package receita;
import java.util.*;
import cidadao.Pessoa;

public class DeclararIR {
  private Pessoa pessoa;
  private List<Emprego empregos; 

  public DeclaracaoIR(Pessoa pessoa){ 
    this.pessoa = pessoa; 
    empregos = new ArrayList<>();
  }

  public void setPessoa(Pessoa pessoa){
     this.pessoa = pessoa
  }
  
  public Pessoa getPessoa(){
    return pessoa;
  } 

  public List<Emprego> getEmpregos){
     return empregos;
  }
  public void addEmprego(Emprego emprego){
     empregos.add(emprego);
  }

  public double getRenda(){
    double somatorio = 0;
    for(Emprego emprego : empregos){
         somatorio += emprego.getSalario();
    }
    return somatorio;
  }
}