package register.domain.models.view.person;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import register.domain.entities.Person;
import register.domain.models.view.Viewable;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class PersonViewModel implements Viewable<Person> {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Date birthDate;
}
