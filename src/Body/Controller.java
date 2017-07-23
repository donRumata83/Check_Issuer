package Body;

import Body.Model.Cheque;
import Body.Model.Model;

public class Controller {
    private Model model;
    private Cheque cheque;

    public Controller(Model model) {
        this.model = model;
    }

    public void save(Cheque cheque) {
        this.cheque = cheque;
        model.save(cheque);
    }

    public void print() {
        System.out.println("printing");
    }

    public String getNewNumber() {

        return model.getNextNumber();
    }
}
