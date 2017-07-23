package Body.Model;

import Body.View;
import Body.Model.Parser.*;

import java.util.Date;

public class Model {
    private View view;
    private PaserInt parser;

    public void setView(View view) {
        this.view = view;
    }

    public void setParser(PaserInt parser) {
        this.parser = parser;
    }

    public String getNextNumber() {
        String newLastNumber = "";
        String lastNumber = parser.getLast().getNumber();
        String[] array = lastNumber.split("-");
        int chequeNumber = Integer.parseInt(array[0]);
        int monthNumber = Integer.parseInt(array[1]);
        Date curentDate = new Date();
        int month = curentDate.getMonth()+1;
        if (month == monthNumber) newLastNumber = ++chequeNumber + "-" + monthNumber;
        else newLastNumber = 1 + "-" + monthNumber;
        return newLastNumber;
    }

    public void save(Cheque cheque) {
        parser.addCheque(cheque);
    }

    public void setNewNumber() {
        view.setNumber(getNextNumber());
    }

}
