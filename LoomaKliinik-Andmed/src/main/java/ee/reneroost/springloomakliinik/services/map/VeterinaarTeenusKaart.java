package ee.reneroost.springloomakliinik.services.map;

import ee.reneroost.springloomakliinik.model.Veterinaar;
import ee.reneroost.springloomakliinik.services.CrudTeenus;

import java.util.Set;

public class VeterinaarTeenusKaart extends AbstraktneKaaristusTeenus<Veterinaar, Long>
        implements CrudTeenus<Veterinaar, Long> {


    @Override
    public Set<Veterinaar> leiaKoik() {
        return super.leiaKoik();
    }

    @Override
    public Veterinaar leiaIdPohjal(Long id) {
        return super.leiaIdPohjal(id);
    }

    @Override
    public Veterinaar salvesta(Veterinaar objekt) {
        return super.salvesta(objekt.getId(), objekt);
    }

    @Override
    public void kustuta(Veterinaar objekt) {
        super.kustuta(objekt);
    }

    @Override
    public void kustutaIdPohjal(Long id) {
        super.kustutaIdPohjal(id);
    }
}
