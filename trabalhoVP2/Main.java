import java.util.*;

public class Main {
public static void menu(ContaCliente conta, Set<ContaCliente> contas) throws DepositoNegativoException, SaqueNegativoException, SaldoInsuficienteException {
    Scanner scanner = new Scanner(System.in);
    int saida = 0;

    do {
    try{
       System.out.println();
    	System.out.println("Bem vindo(a) ao VR Sistema Bancário! Ficamos muito felizes em te ver por aqui :)");
	System.out.println("Você deseja ser  nosso cliente? ");
      System.out.println("1 - Agora não");
    	System.out.println("2 - Sim!");
    	System.out.println("0 - Sair do Sistema");

    	opcao = scanner.nextInt();
    	if (opcao == 1) {
        		System.out.println("Ficamos tristes por não ter você conosco ainda :( Mas fique a vontade, volte quando quiser! ");      	   
             		break;
    	}
    	if (opcao == 2) {
    		System.out.println("Ótimo! Vamos abrir sua conta");
    		System.out.print("Digite seu nome: ");
    		String nome = scanner.next();
    		System.out.print("Digite seu cpf: ");
    		String cpf = scanner.next();
    		Pessoa cliente = new Pessoa(cpf, nome);
    		System.out.print("Ótimo!! Agora escolha o tipo da sua conta... Digite:");
    		System.out.println("(1) para Conta Corrente ou (2) para Conta poupança ");
    		int opcaoConta = scanner.nextInt();
    		if (opcaoConta == 1){
    			ContaCliente cc = new ContaCorrente(cliente);
    			System.out.println("Ótimo!! Sua Conta corrente foi criada com sucesso!");
          System.out.println("\n");
          System.out.println("Informações da sua conta: ");
        
          cc.informacoesContaBancaria();
    			//contas.add(cc);
  
         System.out.println("\n");
         cc.proximaOperacao();
    System.out.print("Sua opção: ");
    int opcaoUser = scanner.nextInt();
    if (opcaoUser == 4) {
      cc.depositar();
     break;
      }
    }
    		if (opcaoConta == 2 ) {
    			ContaCliente cp = new ContaPoupanca(cliente);
    			System.out.println("Conta poupanca criada!");
    			contas.add(cp);

    		}
    	}
    }catch(SaldoInsuficienteException e){
	      System.out.print("você possui saldo insuficiente");
	}catch(SaqueNegativoException e){
	      System.out.print("voce tentou sacar um valor negativo, isso não é permitido.");
	}catch(Exception e){
	      System.out.print("Digite valores válidos, exemplo: 1.000");
	}
    }while (opcao!=0);
  }
}