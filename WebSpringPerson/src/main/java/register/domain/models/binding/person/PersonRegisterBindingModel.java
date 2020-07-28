package register.domain.models.binding.person;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import register.domain.entities.Person;
import register.domain.models.binding.Bindable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class PersonRegisterBindingModel implements Bindable<Person> {

    @NotNull
    @Size(min = 1, max = 32)
    private String firstName;

    @NotNull
    @Size(min = 1, max = 32)
    private String lastName;

    @NotNull
    @Size(min = 1, max = 32)
    private String email;

    @NotNull
    private Date birthDate;
}
