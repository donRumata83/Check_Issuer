package Body;

import Body.Model.Cheque;
import Body.Model.Model;

public class Controller {
    private Model model;
    private Cheque cheque;

    public Controller(Model model) {
        this.model = model;
    }

    public void save(Cheque cheque) {}

    public void print() {}

    public String getNewNumber() {

        return model.getNextNumber();
    }
}
