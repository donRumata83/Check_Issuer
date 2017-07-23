package Body.Model.Parser;

import Body.Model.Cheque;


import java.util.Date;
import java.util.List;

public class SQLParser implements PaserInt {
    @Override
    public void addCheque(Cheque cheque) {
    }

    @Override
    public Cheque getLast() {
        return null;
    }

    @Override
    public List<Cheque> getForDate(Date from, Date to) {
        return null;
    }

    @Override
    public Cheque getByNumber(String number) {
        return null;
    }

    @Override
    public List<Cheque> getByProductName(String name) {
        return null;
    }
}
