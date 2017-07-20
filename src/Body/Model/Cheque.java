package Body.Model;

import java.util.Date;

public class Cheque {
    private String customer;
    private String product;
    private Date date;
    private String number;
    private double summ;
    private boolean isExistBefore;

    public Cheque(String customer, String product, String numberInMounth, String summ) {
        this.customer = customer;
        this.product = product;
        this.date = new Date();
        this.number = numberInMounth;
        if (summ != "") {
            this.summ = Double.parseDouble(summ);
        }
    }


}
