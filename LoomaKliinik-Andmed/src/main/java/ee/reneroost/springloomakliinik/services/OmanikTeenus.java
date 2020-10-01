package ee.reneroost.springloomakliinik.services;

import ee.reneroost.springloomakliinik.model.Omanik;
import ee.reneroost.springloomakliinik.model.Veterinaar;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface OmanikTeenus extends CrudTeenus<Omanik, Long> {

    Omanik leiaPereNimePohjal(String pereNimi);
}
