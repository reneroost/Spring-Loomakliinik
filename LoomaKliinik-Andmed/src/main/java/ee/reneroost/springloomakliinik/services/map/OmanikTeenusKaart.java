package ee.reneroost.springloomakliinik.services.map;

import ee.reneroost.springloomakliinik.model.Omanik;
import ee.reneroost.springloomakliinik.services.CrudTeenus;

import java.util.Set;

public class OmanikTeenusKaart extends AbstraktneKaaristusTeenus<Omanik, Long>
        implements CrudTeenus<Omanik, Long> {


    @Override
    public Set<Omanik> leiaKoik() {
        return super.leiaKoik();
    }

    @Override
    public Omanik leiaIdPohjal(Long id) {
        return super.leiaIdPohjal(id);
    }

    @Override
    public Omanik salvesta(Omanik objekt) {
        return super.salvesta(objekt.getId(), objekt);
    }

    @Override
    public void kustuta(Omanik objekt) {
        super.kustuta(objekt);
    }

    @Override
    public void kustutaIdPohjal(Long id) {
        super.kustutaIdPohjal(id);
    }
}
