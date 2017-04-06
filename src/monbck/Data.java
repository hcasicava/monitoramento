/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monbck;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author humberto.casicava
 */
public class Data {
public static boolean vData(String Caminho,String diaSemana) throws Exception{
        File f = new File (Caminho);
        DateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");  
        DateFormat formatoDiaSemana = new SimpleDateFormat("EEEE");
        Date _data = new Date(f.lastModified());
        Date _dataAtual=new Date(System.currentTimeMillis());
        Date _Seg,_Ter,_Qua,_Qui,_Sex,_dSelecionado;
        String _sData = formatData.format(new Date(f.lastModified()));
        String _sAtualData = formatData.format(_dataAtual);
        Calendar c = Calendar.getInstance();
        c.setTime(_dataAtual);
        //Definindo as datas dos dias da semana
        System.out.println("Caminho");
        System.out.println("** data do arquivo-->"+_data);
        switch (formatoDiaSemana.format(_dataAtual)){
            case "Segunda-feira":
                _Seg=c.getTime();
                c.add(Calendar.DATE, -3);
                _Sex=c.getTime();
                c.add(Calendar.DATE, -1);
                _Qui=c.getTime();
                c.add(Calendar.DATE, -1);
                _Qua=c.getTime();
                c.add(Calendar.DATE, -1);
                _Ter=c.getTime();
                break;
            case "Terça-feira":
                _Ter=c.getTime();
                c.add(Calendar.DATE, -1);
                _Seg=c.getTime();
                c.add(Calendar.DATE, -3);
                _Sex=c.getTime();
                c.add(Calendar.DATE, -1);
                _Qui=c.getTime();
                c.add(Calendar.DATE, -1);
                _Qua=c.getTime();
                break;
            case "Quarta-feira":
                _Qua=c.getTime();
                c.add(Calendar.DATE, -1);
                _Ter=c.getTime();
                c.add(Calendar.DATE, -1);
                _Seg=c.getTime();
                c.add(Calendar.DATE, -3);
                _Sex=c.getTime();
                c.add(Calendar.DATE, -1);
                _Qui=c.getTime();

                break;
            case "Quinta-feira":
                _Qui=c.getTime();
                c.add(Calendar.DATE, -1);
                _Qua=c.getTime();
                c.add(Calendar.DATE, -1);
                _Ter=c.getTime();
                c.add(Calendar.DATE, -1);
                _Seg=c.getTime();
                c.add(Calendar.DATE, -3);
                _Sex=c.getTime();
                break;
            case "Sexta-feira":
                _Sex=c.getTime();
                c.add(Calendar.DATE, -1);
                _Qui=c.getTime();
                c.add(Calendar.DATE, -1);
                _Qua=c.getTime();
                c.add(Calendar.DATE, -1);
                _Ter=c.getTime();
                c.add(Calendar.DATE, -1);
                _Seg=c.getTime();
                break;
            default:  throw new Exception("[Data]: O dia "+formatoDiaSemana.format(_dataAtual)+" não está configurado!");       
        }        
        switch (diaSemana){
            case "SEG":
                _dSelecionado=_Seg;
            break;
            case "TER":
                _dSelecionado=_Ter;
            break;
            case "QUA":
                _dSelecionado=_Qua;
            break;
            case "QUI":
                _dSelecionado=_Qui;
            break;
            case "SEX":
                _dSelecionado=_Sex;
            break;
            default: _dSelecionado=new Date();
            throw new Exception("[Data]: O paramentro "+diaSemana+" não está configurado!");
        }
        System.out.println("Caminho");
        System.out.println("*1* data do arquivo-->"+_data);
        System.out.println("*2* data do arquivo-->"+_dSelecionado);

        String _sDataArquivo = formatData.format(_data);
        System.out.println("*1*"+_sDataArquivo);
        String _sDataSelecionado = formatData.format(_dSelecionado);
        System.out.println("*2*"+_sDataSelecionado);

//        if (_data.equals(_dSelecionado)) {
        if (_sDataArquivo.equals(_sDataSelecionado)) {
            return true;            
        }else {
            throw new Exception("[DATA] Arquivo "+Caminho+" com data inferior. Data correta:"+_sDataSelecionado+" data do arquivo: "+_sDataArquivo);
        }
        
    }    
    
}
