
package UniversoPackage;

import PackageHeroe.Heroe;
import PackageHeroe.Thor;
import PackageVillano.Calavera;
import PackageVillano.Villano;


public class MarvelUniverse implements AbstractFactory {

    @Override
    public Heroe getHeroe() {
        return new Thor("Thor","MarvelUniverse");
    }

    @Override
    public Villano getVillano() {
        return new Calavera("Calavera","MarvelUniverse");
    }
    
}
