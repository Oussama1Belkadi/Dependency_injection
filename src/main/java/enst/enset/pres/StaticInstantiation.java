package enst.enset.pres;

import enst.enset.dao.IDaoImpl;
import enst.enset.metier.IMetierImpl;

public class StaticInstantiation {
    public static void main(String[] args) {
        IDaoImpl dao = new IDaoImpl();
        IMetierImpl iMetier = new IMetierImpl(dao);
        System.out.println("Resultat: " + iMetier.calcul(12.20) + " c'est une valeur en double" );
    }
}
