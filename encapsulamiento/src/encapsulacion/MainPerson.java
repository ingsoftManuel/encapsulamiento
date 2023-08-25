package encapsulacion;
import javax.swing.*;
public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("santiago");
        person.setName(JOptionPane.showInputDialog("ingrese el nombre"));
        System.out.println(person.getName());

        Person person2 = new Person();
        person2.setName("Pepe");


    }
}
//set = cargar
// get obtener

