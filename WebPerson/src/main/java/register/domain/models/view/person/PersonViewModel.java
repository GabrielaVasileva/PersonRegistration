package register.domain.models.view.person;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import register.domain.entities.Person;
import register.domain.models.view.Viewable;

import java.math.BigDecimal;
import java.util.Date;
/**
 * The view model is an abstraction of
 * the view exposing public properties and commands.
 * Instead of the controller of the MVC pattern, or the presenter of the MVP pattern,
 * MVVM has a binder, which automates communication between the view and its bound properties
 * in the view model.
 * The view model has been described as a state of the data in the model.
 * */
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
