package enst.enset.metier;

import enst.enset.dao.IDao;

public class IMetierImpl implements IMetier {
    private IDao dao;
    public IMetierImpl(IDao iDao) {
        this.dao = iDao;
    }
    @Override
    public Double calcul(Double data) {
        double t = this.dao.getData();
        return t/ 1.0;
    }
}
