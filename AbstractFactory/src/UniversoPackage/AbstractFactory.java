    
package UniversoPackage;

import PackageHeroe.Heroe;
import PackageVillano.Villano;


public interface AbstractFactory {
    public Heroe getHeroe();
    public Villano getVillano();
}
