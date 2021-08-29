
package Main;

import UniversoPackage.AbstractFactory;
import UniversoPackage.UltimateUniverse;
import PackageHeroe.Spiderman;
import UniversoPackage.MarvelUniverse;

public class Universo {
    
    public static void main(String [] args){
        
        AbstractFactory ultimate_universe= new UltimateUniverse();
        AbstractFactory marvel_universe= new MarvelUniverse();
        
        System.out.println("Nombre del Heroe: "+ultimate_universe.getHeroe().getNombre()+"---Universo al que pertenece---"+ultimate_universe.getHeroe().getUniverso());
        System.out.println("Nombre del Villano:"+ultimate_universe.getVillano().getNombre()+"---Universo al que pertenece---"+ultimate_universe.getVillano().getUniverso());
        
        System.out.println("\n--------------------------------------------------------------------------------------------------------\n");
        
        System.out.println("Nombre del Villano:"+marvel_universe.getVillano().getNombre()+"---Universo al que pertenece---"+marvel_universe.getVillano().getUniverso());
        System.out.println("Nombre del Heroe:"+marvel_universe.getHeroe().getNombre()+"---Universo al que pertenece---"+marvel_universe.getHeroe().getUniverso());
    }
}
