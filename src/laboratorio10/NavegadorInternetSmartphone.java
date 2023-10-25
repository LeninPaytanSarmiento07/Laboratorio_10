/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio10;

/**
 *
 * @author Lenin
 */
class ReproductorMusicaSmartphone extends SmartPhone implements ReproductorMusica {
    public ReproductorMusicaSmartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void reproducirMusica() {
        System.out.println("Reproduciendo musica en el smartphone " + getMarca() + " " + getModelo());
    }
}
