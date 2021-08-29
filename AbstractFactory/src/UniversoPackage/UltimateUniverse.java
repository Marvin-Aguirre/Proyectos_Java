/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniversoPackage;

import PackageHeroe.Heroe;
import PackageVillano.Villano;
import PackageHeroe.Spiderman;
import PackageVillano.Ultron;


public class UltimateUniverse implements AbstractFactory {

    @Override
    public Heroe getHeroe() {
        return new Spiderman("Spiderman","Ultimate Universe");
    }

    @Override
    public Villano getVillano() {
        return new Ultron("Ultron"," Ultimate Universe");
    }
    
}
