package enst.enset.metier;

import enst.enset.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier2")
public  class IMetierImpl2 implements IMetier {
    private IDao dao;

    public IMetierImpl2() {}
    @Autowired
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public Double calcul(Double data) {
        double temp = dao.getData();
        return temp * 2.5;
    }
}
