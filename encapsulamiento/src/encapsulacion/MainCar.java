package encapsulacion;
import javax.swing.*;
public class MainCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setPlater(JOptionPane.showInputDialog("plater"));
        car.setColor(JOptionPane.showInputDialog("color"));
        car.setPlater(JOptionPane.showInputDialog(("modelo:")));

    }
}

