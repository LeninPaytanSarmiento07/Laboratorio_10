/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio10;

/**
 *
 * @author Lenin
 */
class CamaraSmartphone extends SmartPhone implements Camara {
    public CamaraSmartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void tomarFoto() {
        System.out.println("Tomando una foto con el smartphone " + getMarca() + " " + getModelo());
    }
}
