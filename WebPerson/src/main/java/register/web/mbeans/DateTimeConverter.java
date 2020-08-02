package register.web.mbeans;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 * Faces converter for support of LocalDate
 */
@FacesConverter(value="dateTimeConverter")
public class DateTimeConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        LocalDate ld = LocalDate.parse(value);
        long dayLongEpochMillis = ld.atStartOfDay(ZoneId.systemDefault()).toEpochSecond() * 1000;
        Date date = new Date(dayLongEpochMillis);
        return date;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {

        LocalDate dateValue = (LocalDate) value;

        return dateValue.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }



}
