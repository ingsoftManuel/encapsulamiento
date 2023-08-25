package encapsulacion;

public class Car {
    public String getPlater() {
        return plater;
    }

    public void setPlater(String plater) {
        this.plater = plater;
        //this sirve para pasar el dato
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    private String plater;
    private  String color;

    private int model;

}

