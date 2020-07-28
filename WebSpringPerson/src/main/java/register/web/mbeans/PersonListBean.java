package register.web.mbeans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import register.domain.models.view.person.PersonViewModel;
import register.services.PersonService;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Getter
@NoArgsConstructor
@Model
public class PersonListBean {

    private List<PersonViewModel> people = new ArrayList<>();
    

    @Inject
    public PersonListBean(PersonService service) {
        people = service.findAll(PersonViewModel.class);
        init();
    }

    private void init() {
        if (!people.isEmpty()) {
            
        }
    }

    public List<PersonViewModel> getPeople() {
        Collections.sort(people, new Comparator() {
            public int compare(Object peopleOne, Object peopleTwo) {
                return ((PersonViewModel) peopleOne).getLastName()
                        .compareTo(((PersonViewModel) peopleTwo).getLastName());
            }
        });
        return Collections.unmodifiableList(people);
    }
}



