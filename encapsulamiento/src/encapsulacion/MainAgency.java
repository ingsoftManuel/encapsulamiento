package encapsulacion;
import javax.swing.*;

public class MainAgency {
    public static void main(String[] args) {
        Agency agency = new Agency();
        agency.setAdress(JOptionPane.showInputDialog("ingrese la direccion"));
        agency.setAgentName(JOptionPane.showInputDialog("nobre de la agencia"));
        agency.setPrice(Integer.parseInt(JOptionPane.showInputDialog("precio")));
        JOptionPane.showInputDialog(null,"nombre de la agencia"+agency.getAdress());
    }
}


