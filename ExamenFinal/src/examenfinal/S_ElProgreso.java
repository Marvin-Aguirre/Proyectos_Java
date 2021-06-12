/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal;

/**
 *
 * @author USUARIO
 */
public class S_ElProgreso {
    String NombreP, PrecioP, DescripcionP;

    public S_ElProgreso(String NombreP, String PrecioP, String DescripcionP) {
        this.NombreP = NombreP;
        this.PrecioP = PrecioP;
        this.DescripcionP = DescripcionP;
    }

    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String NombreP) {
        this.NombreP = NombreP;
    }

    public String getPrecioP() {
        return PrecioP;
    }

    public void setPrecioP(String PrecioP) {
        this.PrecioP = PrecioP;
    }

    public String getDescripcionP() {
        return DescripcionP;
    }

    public void setDescripcionP(String DescripcionP) {
        this.DescripcionP = DescripcionP;
    }
    
    
}
