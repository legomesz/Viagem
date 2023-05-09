import java.time.LocalDate;

public class Viagem {
    private int id;
    private String destino;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private int kmPercorrido;
    private Veiculo veiculo;
    
    public Viagem(int id, String destino, LocalDate dataInicial, LocalDate dataFinal) {
        this.id = id;
        this.destino = destino;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.kmPercorrido = 0;
        this.veiculo = null;
    }
    
    public int getId() {
        return id;
    }
    
    public String getDestino() {
        return destino;
    }
    
    public LocalDate getDataInicial() {
        return dataInicial;
    }
    
    public LocalDate getDataFinal() {
        return dataFinal;
    }
    
    public int getKmPercorrido() {
        return kmPercorrido;
    }
    
    public Veiculo getVeiculo() {
        return veiculo;
    }
    
    public boolean iniciarViagem(Veiculo veiculo) {
        if (veiculo.getStatus() == 'V') {
            return false;
        }
        
        this.veiculo = veiculo;
        this.dataInicial = LocalDate.now();
        veiculo.registrarViagem();
        
        return true;
    }
    
    public void finalizarViagem(int kmAtual) {
        this.dataFinal = LocalDate.now();
        this.kmPercorrido = kmAtual - veiculo.getOdometro();
        veiculo.registrarRetorno(kmAtual);
    }
    
    public int calcularKmPercorrido() {
        return kmPercorrido;
    }
}
