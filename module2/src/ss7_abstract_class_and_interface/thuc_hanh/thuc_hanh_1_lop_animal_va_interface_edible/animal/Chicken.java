package ss7_abstract_class_and_interface.thuc_hanh.thuc_hanh_1_lop_animal_va_interface_edible.animal;

import ss7_abstract_class_and_interface.thuc_hanh.thuc_hanh_1_lop_animal_va_interface_edible.edible_animal.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}