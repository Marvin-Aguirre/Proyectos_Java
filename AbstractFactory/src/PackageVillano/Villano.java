
package PackageVillano;


public abstract class Villano {
    private String nombre;
    private String universo;

    public Villano(String nombre, String universo) {
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
