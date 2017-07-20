package Body.Model;

import java.util.Date;

public class Cheque {
    private String number;
    private String customer;
    private String product;
    private Date date;
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

    public Cheque(String number, String customer, String product, Date date, double summ) {
        this.number = number;
        this.customer = customer;
        this.product = product;
        this.date = date;
        this.summ = summ;
    }

    public String getNumber() {
        return number;
    }

    public String getProduct() {
        return product;
    }

    public Date getDate() {
        return date;
    }

    public String getCustomer() {
        return customer;
    }

    public double getSumm() {
        return summ;
    }
}
