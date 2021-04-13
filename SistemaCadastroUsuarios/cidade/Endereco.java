package cidade; 

public class Endereco{
  private String ruaString rua;
  private String cep;
  private String int numero;

  public Endereco(String rua, String cpf, int numero){
    this.rua = rua;
    this.cpf = cpf;
    this.numero = numero;
  }

  public void setRua(String rua){
     this.rua = rua;
  }
  public String getRua(){
     return this.rua;
  }

  public void setCpf(String cpf){
     this.cpf = cpf;
  }
  public String getCpf(){
    return this.cpf;
  }

  public void setNumero(int numero){
     this.numero = numero;
  }
  public int getNumero(){
    return this.numero;
  }
}