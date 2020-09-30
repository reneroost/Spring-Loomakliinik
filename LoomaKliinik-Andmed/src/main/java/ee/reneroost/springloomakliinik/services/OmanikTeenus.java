package ee.reneroost.springloomakliinik.services;

import ee.reneroost.springloomakliinik.model.Omanik;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface OmanikTeenus extends CrudRepository<Omanik, Long> {

    Omanik leiaPereNimePohjal(String pereNimi);
}
