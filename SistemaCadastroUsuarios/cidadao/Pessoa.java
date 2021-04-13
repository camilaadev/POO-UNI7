package cidadao;
import cidade.Endereco;
import java.util.*;

public class Pessoa{
  private String nome;
  private String cpf;
  private Date nascimento;
  private Endereco endereco;
  private double rendaMensal;

  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return this.nome;
  }

  public void setEndereco(String endereco){
    this.endereco = endereco;
  }
  public String getEndereco(){
    return this.endereco;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }
  public String getCpf(){
    return this.cpf;
  }

  public Date getNascimento(Date nascimento{
    this.nasacimento = nascimento;
  }
  public void setNascimento(Date nascimento) {
    this.nascimento = nascimento;
  }
  public void setRendaMensal(double rendaMensal){
    this.rendaMensal = rendaMensal;
  }
  public double getRendaMensal(){
    return this.rendaMensal;
  }

  public String toString(){ 
    return "Pessoa{" +" " + "nome: "+nome+ ", cpf: " +cpf+ ", nascimento: " +nascimento+ 
  }

  //aqui se o objeto for uma instancia de pessoa, faz a conversao se tipo para a classe Pessoa
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

  
}