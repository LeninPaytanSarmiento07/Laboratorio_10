/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio10;

/**
 *
 * @author Lenin
 */
public class Laboratorio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CamaraSmartphone camaraPhone = new CamaraSmartphone("Xiaomi", "Redmi Note 12 Pro+");
        ReproductorMusicaSmartphone musicPhone = new ReproductorMusicaSmartphone("Samsung", "Galaxy S23 Ultra");
        NavegadorInternetSmartphone internetPhone = new NavegadorInternetSmartphone("HUAWEI", "P60 Pro");

        camaraPhone.tomarFoto();
        musicPhone.reproducirMusica();
        internetPhone.buscar();
        internetPhone.actualizar();
    }
    
}
