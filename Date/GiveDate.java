package Date;



import java.text.SimpleDateFormat;
import java.util.Date;


public class GiveDate{

    public String gibDatum(){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.format(date);
    }

}
