package ee.reneroost.springloomakliinik.model;

import java.time.LocalDate;

public class LemmikLoom extends BaasOlem {

    private LoomaLiik loomaLiik;
    private Omanik omanik;
    private LocalDate synniPaev;

    public LoomaLiik getLoomaLiik() {
        return loomaLiik;
    }

    public void setLoomaLiik(LoomaLiik loomaLiik) {
        this.loomaLiik = loomaLiik;
    }

    public Omanik getOmanik() {
        return omanik;
    }

    public void setOmanik(Omanik omanik) {
        this.omanik = omanik;
    }

    public LocalDate getSynniPaev() {
        return synniPaev;
    }

    public void setSynniPaev(LocalDate synniPaev) {
        this.synniPaev = synniPaev;
    }
}
