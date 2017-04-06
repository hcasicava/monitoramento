/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monbck;

import java.io.File;

/**
 *
 * @author humberto.casicava
 */
public class tamanho {
    public static boolean vtamanho(String Caminho,long _tamanho) throws Exception{
        File f = new File (Caminho);
        long tamanho1 = f.length()/1024;
        if (tamanho1<_tamanho) {
            throw new Exception("[TAMANHO] "+Caminho+" com tamanho inferior ao definido! Tamanho definido:"+_tamanho+" Kb tamanho do arquivo:"+tamanho1+" Kb");
        }
        return true;
        
        
    }
}
