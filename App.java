import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transportadora {
    public static void main(String[] args) {
        List<Veiculo> listaVeiculos = new ArrayList<>();
        
        // Instanciando 3 veículos
        Veiculo v1 = new Veiculo(1, "Fiat Palio", "ABC-1234", 10000);
        Veiculo v2 = new Veiculo(2, "VW Gol", "DEF-5678", 20000);
        Veiculo v3 = new Veiculo(3, "Chevrolet Onix",