
public class Personaje {
    private int x;
    private int y;
    private int noVidas;
    private int nivelEnergia;
    private int capOfensiva;

    public Personaje(int x, int y, int noVidas, int nivelEnergia, int capOfensiva) {
        this.x = x;
        this.y = y;
        this.noVidas = noVidas;
        this.nivelEnergia = nivelEnergia;
        this.capOfensiva = capOfensiva;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getNoVidas() {
        return noVidas;
    }

    public void setNoVidas(int noVidas) {
        this.noVidas = noVidas;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public int getCapOfensiva() {
        return capOfensiva;
    }

    public void setCapOfensiva(int capOfensiva) {
        this.capOfensiva = capOfensiva;
    }
    
    
}
