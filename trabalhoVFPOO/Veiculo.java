public class Veiculo {

    private final TipoDeVeiculo tipoDeVeiculo;
    /*Principio do aberto/fechado -open closed-
    Deve-se criar os tipos de cada veiculo (definidos na classe veículo) para herdar de Veiculo*/
    //herança está de acordo com o SOLID
    private final Motor motor; 
    private Motorista motoristaAtual;

    public Veiculo(TipoDeVeiculo tipoDeVeiculo, Motor motor) {
        if (tipoDeVeiculo == null)
            throw new NullPointerException("Precisa passar um tipo de veiculo!!");
        this.tipoDeVeiculo = tipoDeVeiculo;
        this.motor = motor;
    }

    public TipoDeVeiculo getTipoDeVeiculo() {
        return tipoDeVeiculo;
    }

    public Motor getMotor() {
        return motor; /*método de acordo com o principio da responsabilidade única do SOLID, pois este método está com apenas uma responsabilidade.*/
    }

    public Motorista getMotoristaAtual() {
        return motoristaAtual;
    }

    public void dirigir(Motorista motorista) {
        if (motorista == null) {
            throw new NullPointerException("Um carro não se dirige sozinho... motorista é nulo!");
        }

        motoristaAtual = motorista;

        if (tipoDeVeiculo == TipoDeVeiculo.BICICLETA) {
            System.out.println("bicicleta sendo pilotada pelo " + motorista.getNome());
        } else {
            LocalDate vencimentoCNH = motorista.getVencimentoCNH();
            if (vencimentoCNH.isBefore(LocalDate.now())) {
                throw new InfracaoException(motorista.getNome() + " com CNH vencida!");
            }

            motor.ligar();
            System.out.println(tipoDeVeiculo + " sendo dirigido pelo " + motorista.getNome());
        }
    }

    public void estacionar() {
        motor.desligar();
        motoristaAtual = null;
        System.out.println(tipoDeVeiculo + " estacionado");
    }

}