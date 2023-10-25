/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio10;

/**
 *
 * @author Lenin
 */
class NavegadorInternetSmartphone extends SmartPhone implements NavegadorInternet {
    public NavegadorInternetSmartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void buscar() {
        System.out.println("Buscando en Internet con el smartphone " + getMarca() + " " + getModelo());
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando el navegador de Internet en el smartphone " + getMarca() + " " + getModelo());
    }
}
