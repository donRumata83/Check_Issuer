package Model;

import java.util.Date;
import java.util.List;

public class SimpleFileParser implements Paser{
    @Override
    public Cheque getLast() {
        return null;
    }

    @Override
    public List<Cheque> getForDate(Date from, Date to) {
        return null;
    }

    @Override
    public Cheque getByNumber() {
        return null;
    }

    @Override
    public List<Cheque> getByProductName(String name) {
        return null;
    }
}
