package Model;

import java.util.Date;

public class Cheque {
    private String customer;
    private String product;
    private Date date;
    private String number;

    public Cheque(String customer, String product, int numberInMounth) {
        this.customer = customer;
        this.product = product;
        this.date = new Date();
        this.number = numberInMounth + " " +  date.getMonth();
    }

    public Cheque(String product, int numberInMounth) {
        this.customer = "Фізична особа";
        this.product = product;
        this.date = new Date();
        this.number = numberInMounth + " " +  date.getMonth();
    }

}
