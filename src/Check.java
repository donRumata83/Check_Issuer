import java.util.Date;

public class Check {
    private String customer;
    private String product;
    private Date date;
    private String number;

    public Check(String customer, String product, int numberInMounth) {
        this.customer = customer;
        this.product = product;
        this.date = new Date();
        this.number = numberInMounth + " " +  date.getMonth();
    }

    public Check(String product, int numberInMounth) {
        this.customer = "Фізична особа";
        this.product = product;
        this.date = new Date();
        this.number = numberInMounth + " " +  date.getMonth();
    }


}
