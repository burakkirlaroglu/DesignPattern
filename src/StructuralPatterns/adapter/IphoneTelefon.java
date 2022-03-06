package StructuralPatterns.adapter;

public class IphoneTelefon implements Telefon{

    private int calismaVoltaji;

    public IphoneTelefon() {
        this.calismaVoltaji = 5;
    }

    @Override
    public int sarjEt() {
        System.out.println("Iphone telefonu şarj oluyor...");
        return calismaVoltaji;
    }

}
