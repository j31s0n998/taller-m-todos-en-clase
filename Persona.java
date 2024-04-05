
package tallerenclaseb1;
import java.time.LocalDate;
import java.time.Period;

public class Persona {
    public static Period personarTiempoDeVida(LocalDate fechaNacimiento){
    LocalDate fechaActual= LocalDate.now();
    int años = fechaActual.getYear()- fechaNacimiento.getYear();
    int mes  = fechaActual.getMonthValue()- fechaNacimiento.getMonthValue();
    int dia  = fechaActual.getDayOfMonth()- fechaNacimiento.getDayOfMonth();
    if(mes<0||(mes == 0 && dia<0)){
    años--;
    mes+=12;
    }
        return Period.of(años, mes, dia);
    
    }
                    
}
