package ee.reneroost.springloomakliinik.services;

import ee.reneroost.springloomakliinik.model.Veterinaar;

import java.util.Set;

public interface VeterinaarTeenus {

    Veterinaar leiaIdPohjal();

    Veterinaar salvesta(Veterinaar veterinaar);

    Set<Veterinaar> leiaKoik();
}
