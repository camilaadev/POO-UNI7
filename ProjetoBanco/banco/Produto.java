package banco;
public abstract class Produto implements Imprimivel {
  //diferença de extends e implements?
  //extends usa com classe e implements com interface, ambos acarretam nas mesmas coisas se estivesse herdando de uma classe abstrata.
  //como estamos implementanmdo significa que a classe Produto tem obrigação de implementar o metodo da interface Imprimivel.
  //mas se eu nao quisesse implementar este método imprimir então significa que eu herdei um metodo abstrato que não está sendo implementado, então a classe Produto deve ser abstrata, mas nesse caso ela ja é, então significa que agora todas as ssubclasses de Produto tem que implementar esse método imprimir.

  
   private String nome;
   private String cpf;
   private int conta; //final pois nunca muda
   private int agencia;
   protected String senha; 
//modificador protected permite o acesso direto pelas subclasses
   private double saldo;
  //classe abstrata não pode ser instanciada, mas as variaveis pode ser do tipo de uma classe abstrata
  //metodo abstrato = alguma subclasse de produto vai ter que dar a implementação deste metodo
  public abstract void calcularRendimento();
   /* quando a classe é abstrata ela pode ter métodos abstratos. um produto não pode ser instanciado pois o metdo abstrato nao permitte implemenação na superclasse
  */
 
  public abstract String getTipo();

   public String getNome(){
      return this.nome;
   }
   public void setNome(String nome){
      this.nome = nome;
   }
   
  public String getCpf(){
    return cpf;
  }
   public void setCpf(String cpf){
     this.cpf = cpf;
   }

    public int getConta(){
     return conta;
   }
   public void setConta(int conta){
     this.conta = conta;
   }

   public int getAgencia(){
     return agencia;
   }
   public void setAgencia(int agencia){
     this.agencia = agencia;
   }

     public double getSaldo(){
     return saldo;
   }
   public void setSaldo(double saldo){
     this.saldo = saldo;
   }
}

  
/*
Modele um sistema que será utilizado por um banco. 

O sistema deve permitir que sejam controlados os rendimentos de certos produtos oferecidos pelo banco, como Conta Corrente, Conta Poupança e Títulos de Capitalização. 
Todos os produtos oferecidos pelo banco possuem dados dos titulares, como nome e CPF, além de serem identificados por um número de conta, agência e tipo de produto. 

O sistema deve calcular automaticamente todos os rendimentos de acordo com regras específicas de cada produto:
- Conta Corrente tem rendimento fixo de 1% do saldo ao mês.
- Conta Poupança tem rendimento de 2% a.a. se a Selic o saldo for maior que 10% a.a., ou 10% da Selic caso contrário.
- Título de Capitalização tem rendimento fixo de 0.5% do saldo ao mês e sorteios mensais de 10.000 reais onde todos os clientes concorrem.
*/




