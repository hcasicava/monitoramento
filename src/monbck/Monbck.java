/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monbck;

import java.io.*;
import static monbck.Caminho.vCaminho;
import static monbck.Data.vData;



/**
 *
 * @author humberto.casicava
 */
public class Monbck extends tamanho{
    static final String caminhoInicial="\\\\storage\\BACKUP\\VIAPAR\\DIARIO\\";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        vCaminho(args[0],args[1]);
       // long    xx=vtamanho(caminhoInicial+args[0]+"\\GERAL\\geral.zip");
       // boolean _b=vData("\\\\storage\\BACKUP\\VIAPAR\\DIARIO\\SEX\\GERAL\\geral.zip");
        
    //System.out.println(xx);
   // System.out.println(args[0]);
   /// System.out.println(args[1]);
    }
    
}
