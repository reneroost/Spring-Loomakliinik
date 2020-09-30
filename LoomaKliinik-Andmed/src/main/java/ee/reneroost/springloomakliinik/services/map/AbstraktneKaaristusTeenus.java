package ee.reneroost.springloomakliinik.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstraktneKaaristusTeenus<T, ID> {

    protected Map<ID, T> kaart = new HashMap<>();

    Set<T> leiaKoik() {
        return new HashSet<>(kaart.values());
    }

    T leiaIdPohjal(ID id) {
        return kaart.get(id);
    }

    T salvesta(ID id, T objekt) {
        kaart.put(id, objekt);

        return objekt;
    }

    void kustutaIdPohjal(ID id) {
        kaart.remove(id);
    }

    void kustuta(T objekt) {
        kaart.entrySet().removeIf(sisend -> sisend.getValue().equals(objekt));
    }
}
