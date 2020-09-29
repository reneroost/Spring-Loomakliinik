package ee.reneroost.springloomakliinik.model;

public class Isik extends BaasOlem {

    private String eesNimi;
    private String pereNimi;

    public String getEesNimi() {
        return eesNimi;
    }

    public void setEesNimi(String eesNimi) {
        this.eesNimi = eesNimi;
    }

    public String getPereNimi() {
        return pereNimi;
    }

    public void setPereNimi(String pereNimi) {
        this.pereNimi = pereNimi;
    }
}
