package ee.reneroost.springloomakliinik.services;

import ee.reneroost.springloomakliinik.model.Omanik;

import java.util.Set;

public interface OmanikTeenus {

    Omanik leiaPereNimePohjal(String pereNimi);

    Omanik leiaIdPohjal(Long id);

    Omanik salvesta(Omanik omanik);

    Set<Omanik> leiaKoik();
}
