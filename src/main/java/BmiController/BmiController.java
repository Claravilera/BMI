package BmiController;

import BmiModel.BmiModel;
import BmiModel.Person;
import BmiView.BmiView;

public class BmiController {
    private BmiView view;

    public BmiController(BmiView vista) {
        this.view = view;
    }

    public void start() {
        double weight = view.requestweight();
        double height = view.requestheight();

        Person person = new Person(weight, height);

        BmiModel model = new BmiModel(person);

        double bmi = model.calculateBMI();
        String clasification = model.giveResultsBMI(bmi);

        view.showresoult(clasification, bmi);
    }
}