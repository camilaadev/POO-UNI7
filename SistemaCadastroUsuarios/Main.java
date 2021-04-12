import java.util.*; 
public class Main {
  public static void main(String[] args){
 
    Usuario usuario1 = new Usuario();
    usuario1.setNome("Camila");
    usuario1.setCpf("165.304.209-85");
    //usuario1 colocar data de nasc aq
    usuario1.setEndereco("Rua: Padre Roger, 12800");
    usuario1.setRendaMensal(1200);

    Usuario usuario2 = new Usuario();
    usuario2.setNome("Mila");
    usuario2.setCpf("265.813.219-35");
    //usuario1 colocar data de nasc aq
    usuario1.setEndereco("Rua: Padre Alencar, 1880");
    usuario1.setRendaMensal(1800);

    Set<Usuario> usuariosSet = new HashSet<>(); //como implementar um set / conjunto:
     usuariosSet.add(usuario1);
     usuariosSet.add(usuario2); 

   Emprego emprego = new Emprego();
    List<Emprego>listaDeEmpregos = new ArrayList<Emprego>(); 
    listaDeEmpregos.setEmpresa("MilaSoluções");
    listaDeEmpregos.setSalarioMensal(1500);
 
  }
}











