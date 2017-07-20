package Body.Model.Parser;

import Body.Model.Cheque;

import java.util.Date;
import java.util.List;

public interface Paser {
    Cheque getLast();
    List<Cheque> getForDate(Date from, Date to);
    Cheque getByNumber(String number);
    List<Cheque> getByProductName(String name);
    void addCheque(Cheque cheque);

}
