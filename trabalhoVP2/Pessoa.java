public class Pessoa {

	private String cpf;
	private String name;
	
	public Pessoa(String cpf, String name) {
		this.cpf = cpf;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

}