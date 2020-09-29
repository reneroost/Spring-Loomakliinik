package ee.reneroost.springloomakliinik.services;

import ee.reneroost.springloomakliinik.model.LemmikLoom;

import java.util.Set;

public interface LemmikLoomTeenus {

    LemmikLoom leiaIdPohjal(Long id);

    LemmikLoom salvesta(LemmikLoom omanik);

    Set<LemmikLoom> leiaKoik();
}
