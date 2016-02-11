/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

/**
 *
 * @author Pablite5
 */
public class Correo {
   private String correosElectronicos;
   private boolean leido = false;

    public Correo(String correosElectronicos) {
        this.correosElectronicos = correosElectronicos;
    }

    public String getCorreosElectronicos() {
        return correosElectronicos;
    }

    public void setCorreosElectronicos(String correosElectronicos) {
        this.correosElectronicos = correosElectronicos;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }
   
   
}
