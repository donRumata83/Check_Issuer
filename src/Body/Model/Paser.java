package Body.Model;

import java.util.Date;
import java.util.List;

public interface Paser {
    Cheque getLast();
    List<Cheque> getForDate(Date from, Date to);
    Cheque getByNumber();
    List<Cheque> getByProductName(String name);

}
