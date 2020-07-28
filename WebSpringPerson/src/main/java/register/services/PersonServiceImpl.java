package register.services;

import org.modelmapper.ModelMapper;
import register.domain.entities.Person;
import register.domain.models.binding.person.PersonRegisterBindingModel;
import register.repositories.PersonRepository;

import javax.inject.Inject;
import javax.validation.Validator;
import java.util.logging.Logger;

public class PersonServiceImpl extends BaseService<Person, String, PersonRepository> implements PersonService {

    private static final Logger LOG = Logger.getLogger(PersonServiceImpl.class.getName());


    @Inject
    public PersonServiceImpl(PersonRepository repository,
                             ModelMapper mapper,
                             Validator validator) {
        super(mapper, validator, repository);
    }

    @Override
    protected Logger logger() {
        return LOG;
    }

    @Override
    public boolean saveperson(PersonRegisterBindingModel model) {
        if (model == null) {
            return false;
        }

        return create(model);
    }

    @Override
    public boolean deleteperson(String id) {
        return repository.delete(id);
    }
}
