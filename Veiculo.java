public class Veiculo {
    private int id;
    private String modelo;
    private String placa;
    private int odometro;
    private char status; // D - Disponível, V - Viajando, M - Manutenção
    
    public Veiculo(int id, String modelo, String placa, int odometro) {
        this.id = id;
        this.modelo = modelo;
        this.placa = placa;
        this.odometro = odometro;
        this.status = 'D';
    }
    
    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getOdometro() {
        return odometro;
    }
    
    public char getStatus() {
        return status;
    }

    public void registrarViagem() {
        status = 'V';
    }
    
    public void registrarRetorno(int km) {
        status = 'D';
        odometro = km;
    }
    
    public void revisar() {
        status = 'M';
    }
}
