package register.repositories;


import register.domain.entities.Person;

import javax.ejb.Stateless;
import java.util.logging.Logger;

@Stateless
public class PersonRepositoryImpl extends BaseCrudRepository<Person, String> implements PersonRepository {

    private static final Logger LOG = Logger.getLogger(PersonRepositoryImpl.class.getName());

    @Override
    protected Logger logger() {
        return LOG;
    }
}
