package register.web.mbeans;

import lombok.NoArgsConstructor;
import register.domain.models.binding.person.PersonRegisterBindingModel;
import register.services.PersonService;

import javax.enterprise.inject.Model;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.io.IOException;

@NoArgsConstructor
@Model
public class PersonRegisterBean {

    private PersonService service;

    private PersonRegisterBindingModel bindingModel = new PersonRegisterBindingModel();

    @Inject
    public PersonRegisterBean(PersonService service) {
        this.service = service;
    }

    public void register() throws IOException {
        service.savePerson(bindingModel);
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        context.redirect("/WebPerson_war/");
    }

    public PersonRegisterBindingModel getBindingModel() {
        return bindingModel;
    }

    public void setBindingModel(PersonRegisterBindingModel bindingModel) {
        this.bindingModel = bindingModel;
    }
}
