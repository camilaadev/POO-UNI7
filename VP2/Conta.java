
import java.util.*;

public class Conta{

  private String nome;
  private String cpf;
  private int numDeConta;
  
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return this.nome;
  } 

  public void setCpf(String cpf){
    this.cpf = cpf;
  }
  public String getCpf(){
    return this.cpf;
  }  

  public void setNumDeConta(int numDeConta){
    this.numDeConta = numDeConta;
  }
  public int getNumDeConta(){
    return numDeConta;
  }

public Conta( String nome, String cpf, int numDeConta){
   this.nome = nome;
    this.cpf = cpf;
    this.numDeConta = numDeConta;
}
  /*aqui se o objeto for uma instancia de pessoa, faz a conversao se tipo para a classe Pessoa
  public boolean equals(object o){
     if(o instanceof Pessoa){ 
       Pessoa outraPessoa = (Pessoa) o;
        if(getNome() != null)
          return getNome().equals(outraPessoa.getNome());
      }
      return false;
  }
  public int hashCode(){ 
    return Objects.hash(getNome());
  }

  */
}