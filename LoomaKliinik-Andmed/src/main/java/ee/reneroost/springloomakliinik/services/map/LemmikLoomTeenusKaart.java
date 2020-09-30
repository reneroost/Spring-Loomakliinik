package ee.reneroost.springloomakliinik.services.map;

import ee.reneroost.springloomakliinik.model.LemmikLoom;
import ee.reneroost.springloomakliinik.services.CrudTeenus;

import java.util.Set;

public class LemmikLoomTeenusKaart extends AbstraktneKaaristusTeenus<LemmikLoom, Long>
        implements CrudTeenus<LemmikLoom, Long> {
    @Override
    public Set<LemmikLoom> leiaKoik() {
        return super.leiaKoik();
    }

    @Override
    public LemmikLoom leiaIdPohjal(Long id) {
        return super.leiaIdPohjal(id);
    }

    @Override
    public LemmikLoom salvesta(LemmikLoom objekt) {
        return super.salvesta(objekt.getId(), objekt);
    }

    @Override
    public void kustuta(LemmikLoom objekt) {
        super.kustuta(objekt);
    }

    @Override
    public void kustutaIdPohjal(Long id) {
        super.kustutaIdPohjal(id);
    }
}
