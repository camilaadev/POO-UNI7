import java.util.*;

public class MainBanco {
public static void menu(ContaCliente conta, Set<ContaCliente> contas) throws DepositoNegativoException, SaqueNegativoException, SaldoInsuficienteException {
    Scanner scanner = new Scanner(System.in);
    int saida = 0;
    try {
    do {
    System.out.println("Digite a opção desejada:");
    System.out.println("1 - Sacar");
    System.out.println("2 - Depositar");
    System.out.println("3 - Transferir");
    System.out.println("0 - Sair do sistema");
    System.out.print("Sua opção: ");
    int opcao = scanner.nextInt();
    
	if (opcao == 1) {
		double valor;
		System.out.print("Digite o valor para saque: ");
		valor = scanner.nextDouble();
		conta.sacar(valor);
		System.out.println("Saldo Atual: " + conta.getSaldo());
		menu(conta, contas);
  	  }
      
      if (opcao == 3) {
    	  double valor;
    	  System.out.print("Digite o valor para transferencia: ");
    	  valor = scanner.nextDouble();
    	  System.out.print("Digite o cpf do beneficiado: ");
    	  String cpf = scanner.nextLine();
    	  for (ContaCliente s : contas) {
    		  if(cpf == s.getCliente().getCpf()) {
    			  conta.tranferencia(conta, valor);

      }
    	  }
      }
    } while (saida != 0);
    }catch(SaldoInsuficienteException e){
	      System.out.println("saldo insuficiente, seu saldo atual é de: " + conta.getSaldo());
	}catch(SaqueNegativoException e){
	      System.out.print("voce nao pode sacar um valor negativo");
	}catch(Exception e){
	      System.out.print("Digite apenas numeros validos!");
	}
    }
    




public static void main(String[] args) throws SaldoInsuficienteException, SaqueNegativoException, DepositoNegativoException {
    Scanner scanner = new Scanner(System.in);
    Set<ContaCliente> contas = new HashSet<ContaCliente>();
    int opcao = 0;
    do {
    try{
       System.out.println();
    	System.out.println("Bem vindo(a) ao VR Sistema Bancário! Ficamos muito felizes em te ver por aqui :)");
	System.out.println("Você deseja ser  nosso cliente? ");
      System.out.println("[1] - Agora não");
    	System.out.println("[2] - Sim!");
    	System.out.println("[0] - Sair do Sistema");

    	opcao = scanner.nextInt();
    	if (opcao == 1) {
        		System.out.println("Ficamos tristes por não ter você conosco ainda :( Mas fique a vontade, volte quando quiser! ");      	    		break;
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
    			System.out.println("Sua Conta corrente foi criada com sucesso!");
          System.out.println("\n");
          System.out.println("Informações da sua conta: ");
        
          cc.informacoesContaBancaria();
    			contas.add(cc);
    //	menu(cc, contas);
         System.out.println("\n");
           System.out.println("Qual operação você deseja realizar agora? Digite uma opção.");
    System.out.println("1 - Sacar");
    System.out.println("4 - Depositar");
    System.out.println("3 - Transferir");
    System.out.println("0 - Sair do sistema");
    System.out.print("Sua opção: ");
    int op = scanner.nextInt();
    if (opcao == 4) {
    	  double valor;
    	  System.out.print("Digite o valor para deposito: ");
    	  valor = scanner.nextDouble();
    	  cc.depositar(valor);
    	  System.out.println("Saldo Atual: " + cc.getSaldo());
//menu(conta, contas);

      }
    		}
    		if (opcaoConta == 2 ) {
    			ContaCliente cp = new ContaPoupanca(cliente);
    			System.out.println("Conta poupanca criada!");
    			contas.add(cp);
    			menu(cp, contas);

    		}
    	}
    }catch(SaldoInsuficienteException e){
	      System.out.print("saldo insuficiente");
	}catch(SaqueNegativoException e){
	      System.out.print("voce nao pode sacar um valor negativo");
	}catch(Exception e){
	      System.out.print("Digite apenas numeros validos!");
	}
    }while (opcao!=0);
  }
}