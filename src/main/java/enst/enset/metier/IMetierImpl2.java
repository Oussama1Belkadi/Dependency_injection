package enst.enset.metier;

import enst.enset.dao.IDao;

public  class IMetierImpl2 implements IMetier {
    private IDao dao;

    public IMetierImpl2() {}

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public Double calcul(Double data) {
        double temp = dao.getData();
        return temp * 2.5;
    }
}
