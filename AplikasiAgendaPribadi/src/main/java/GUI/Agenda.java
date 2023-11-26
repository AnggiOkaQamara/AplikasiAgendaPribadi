/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author user
 */
public class Agenda {
    String Hari, Waktu, Agd;

    public Agenda(String Hari, String Waktu, String Agd) {
        this.Hari = Hari;
        this.Waktu = Waktu;
        this.Agd = Agd;
    }

    public Agenda() {
    }

    public String getHari() {
        return Hari;
    }

    public void setHari(String Hari) {
        this.Hari = Hari;
    }

    public String getWaktu() {
        return Waktu;
    }

    public void setWaktu(String Waktu) {
        this.Waktu = Waktu;
    }

    public String getAgd() {
        return Agd;
    }

    public void setAgd(String Agd) {
        this.Agd = Agd;
    }
    
 
    
}
