package register.services;

import register.domain.entities.Person;
import register.domain.models.binding.person.PersonRegisterBindingModel;

public interface PersonService extends Service<Person, String> {

    boolean saveperson(PersonRegisterBindingModel model);

    boolean deleteperson(String id);
}
