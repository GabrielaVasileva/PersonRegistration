package register.services;

import register.domain.entities.Person;
import register.domain.models.binding.person.PersonRegisterBindingModel;

public interface PersonService extends Service<Person, String> {

    boolean savePerson(PersonRegisterBindingModel model);

    boolean deletePerson(String id);
}
