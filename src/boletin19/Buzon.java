/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class Buzon {
     
ArrayList <Correo> correosElectronicos= new ArrayList <Correo> ();
    
    

     public int numeroDeCorreos(){
         int contador=0;
        for(int i=0;i<correosElectronicos.size();i++){
            contador++;
        }
          return contador;
}
       public void engade(Correo c){
           correosElectronicos.add(c);
       }
       public boolean porLer(){
           boolean ler = false;
                   for(int i=0;i<correosElectronicos.size();i++){
              if(correosElectronicos.get(i).isLeido() == false){
                  ler = false;
              }else{
                  ler=true;
              }
           }
        return ler;
       }
       public String amosarPrimeiroNonLeido(){
           for(int i =0;i<correosElectronicos.size();i++){
               if(correosElectronicos.get(i).isLeido() == true){
                   return correosElectronicos.get(i).getCorreosElectronicos();
               }
           }
           return "LEIDOOOOOS LOKOOOO"; 
       }
       public String amosa(int k){
           
           String amosar="";
           if(correosElectronicos.get(k).isLeido() == true) {
               amosar=" NO LEIDO LOKO";
               
           }
           else{
               amosar="ESTA LEIDO LOKOOOOOO";
           }
           return amosar;
       }
       public void eliminar(int k){
           correosElectronicos.remove(k);
       }

    
}
        
                
     

