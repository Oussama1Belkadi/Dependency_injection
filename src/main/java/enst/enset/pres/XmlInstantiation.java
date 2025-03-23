package enst.enset.pres;

import enst.enset.dao.IDao;
import enst.enset.metier.IMetierImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlInstantiation {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        IDao dao = (IDao) context.getBean("dao");
        IMetierImpl metier = (IMetierImpl) context.getBean("metier");
        System.out.println(metier.calcul(12.20));
    }

}
