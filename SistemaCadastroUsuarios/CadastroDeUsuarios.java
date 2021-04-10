/* 
1 - Você foi contratado para desenvolver o Sistema Único de Cadastro de Brasileiros. 
Esse sistema é utilizado pela União para registrar todos os cidadãos brasileiros, junto de suas informações, como:
  - Nome
  - CPF
  - Data de Nascimento
  - Endereço
  - Renda mensal

Para que o sistema possa armazenar as informações dos brasileiros, é necessário permitir que essas informações sejam
 armazenadas pelo sistema automaticamente em alguma estrutura de dados de sua escolha. */

//adicionar automaticamente a uma lista.
//conjunto? Interface set? Sim, usar o exemplo do Banco.
public class CadastroDeUsuarios{
  private String nome;
  private String cpf;
  //colocar data de Nascimento aqui usando class Date
  private String endereco;
  private int rendaMensal;

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

  public void setRendaMensal(int rendaMensal){
    this.rendaMensal = rendaMensal;
  }
  public int getRendaMensal(){
    return this.rendaMensal;
  }
}