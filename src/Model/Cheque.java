package Model;

import java.util.Date;

public class Cheque {
    private String customer;
    private String product;
    private Date date;
    private String number;
    private int summ;
    private boolean isExistBefore;

    public Cheque(String customer, String product, int numberInMounth, int summ) {
        this.customer = customer;
        this.product = product;
        this.date = new Date();
        this.number = numberInMounth + " " +  date.getMonth();
        this.summ = summ;
    }

    public Cheque(String product, int numberInMounth, int summ) {
        this.customer = "Фізична особа";
        this.product = product;
        this.date = new Date();
        this.number = numberInMounth + " " +  date.getMonth();
        this.summ = summ;
    }

}
