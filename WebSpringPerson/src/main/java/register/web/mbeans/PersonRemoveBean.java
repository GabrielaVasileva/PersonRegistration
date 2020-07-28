package register.web.mbeans;

import lombok.NoArgsConstructor;
import register.services.PersonService;

import javax.enterprise.inject.Model;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.io.IOException;

@NoArgsConstructor
@Model
public class PersonRemoveBean {

    private PersonService service;

    @Inject
    public PersonRemoveBean(PersonService service) {
        this.service = service;
    }

    public void remove(String id) throws IOException {
        service.deleteperson(id);
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        context.redirect("/WebSpringPerson_war/");
    }
}
