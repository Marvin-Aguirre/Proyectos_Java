
package PackageHeroe;

public abstract class Heroe {
    private String nombre;
    private String universo;

    public Heroe(String nombre, String universo) {
        this.nombre = nombre;
        this.universo = universo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    
    
}
