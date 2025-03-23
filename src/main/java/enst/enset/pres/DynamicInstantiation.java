package enst.enset.pres;

import enst.enset.dao.IDao;
import enst.enset.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicInstantiation {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, FileNotFoundException {
        // Lecture du fichier de configuration
        Scanner scanner = new Scanner(new File("config.txt"));

        // L ecture des noms de classes
        String daoClassName = scanner.nextLine();
        String metierClassName = scanner.nextLine();
        scanner.close();

        // Chargement dynamique des classes
        Class<?> daoClass = Class.forName(daoClassName);
        Class<?> metierClass = Class.forName(metierClassName);

        // Instanciation dynamique
        IDao dao = (IDao) daoClass.getDeclaredConstructor().newInstance();
        IMetier metier = (IMetier) metierClass.getDeclaredConstructor().newInstance();

        // Injection de la dépendance par introspection
        Method setDao = metierClass.getMethod("setDao", IDao.class);
        setDao.invoke(metier, dao);

        // Utilisation
        System.out.println("Résultat: " + metier.calcul(123.45));
    }
}
