package ee.reneroost.springloomakliinik.services;

import java.util.Set;

public interface CrudTeenus<T, ID> {

    Set<T> leiaKoik();

    T leiaIdPohjal(ID id);

    T salvesta(T objekt);

    void kustuta(T objekt);

    void kustutaIdPohjal(ID id);

}
