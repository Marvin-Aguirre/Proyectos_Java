
public class Arma implements Muebles {
    private int nivelEnergia;
    private int Potenciador;

    public Arma(int nivelEnergia, int Potenciador) {
        this.nivelEnergia = nivelEnergia;
        this.Potenciador = Potenciador;
    }

    
    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public int getPotenciador() {
        return Potenciador;
    }

    public void setPotenciador(int Potenciador) {
        this.Potenciador = Potenciador;
    }
    
    @Override
    public void coordenadas() {
        
    }
    
}
