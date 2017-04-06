/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monbck;
import java.io.File;
import static monbck.Data.vData;
import static monbck.tamanho.vtamanho;
/**
 *
 * @author humberto.casicava
 */
public class Caminho {

    static final String caminhoInicial="\\\\storage\\BACKUP\\VIAPAR\\DIARIO\\";
        
        
    public static String vCaminho(String _diaSemana,String _pastaArquivo) throws Exception{
        switch(_pastaArquivo){
            case "COMPSIS":
                vData(caminhoInicial+_diaSemana+"\\COMPSIS\\sicatxp.z01",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\COMPSIS\\sicatxp.z02",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\COMPSIS\\sicatxp.z03",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\COMPSIS\\sicatxp.z04",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\COMPSIS\\sicatxp.z05",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\COMPSIS\\sicatxp.z06",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\COMPSIS\\sicatxp.zip",_diaSemana);
                //Tamanho do arquivo
                vtamanho(caminhoInicial+_diaSemana+"\\COMPSIS\\sicatxp.z01",8000000);
                vtamanho(caminhoInicial+_diaSemana+"\\COMPSIS\\sicatxp.z02",8000000);
                vtamanho(caminhoInicial+_diaSemana+"\\COMPSIS\\sicatxp.z03",8000000);
                vtamanho(caminhoInicial+_diaSemana+"\\COMPSIS\\sicatxp.z04",8000000);
                vtamanho(caminhoInicial+_diaSemana+"\\COMPSIS\\sicatxp.z05",8000000);
                vtamanho(caminhoInicial+_diaSemana+"\\COMPSIS\\sicatxp.z06",8000000);
                vtamanho(caminhoInicial+_diaSemana+"\\COMPSIS\\sicatxp.zip",691215);
                File file= new File(caminhoInicial+_diaSemana+"\\COMPSIS");
                int _qdeArquivos=file.listFiles().length;
                if(_qdeArquivos!=7){
                      throw new Exception("[QDE ARQUIVOS] Pasta "+caminhoInicial+_diaSemana+"\\COMPSIS com qde divergente de arquivos! ");
                }
                break;
            case "DOCNIX":
                break;
            case "GERAL":
                //Verifica a data do arquivo
                vData(caminhoInicial+_diaSemana+"\\GERAL\\geral.zip",_diaSemana);
                //Tamanho do arquivo
                vtamanho(caminhoInicial+_diaSemana+"\\GERAL\\geral.zip",148);
                //Verifica a quantidade de arquivos do diretorio
                File fGeral= new File(caminhoInicial+_diaSemana+"\\GERAL");
                int _qdeArquivosGeral=fGeral.listFiles().length;
                if(_qdeArquivosGeral!=1){
                      throw new Exception("[QDE ARQUIVOS] Pasta "+caminhoInicial+_diaSemana+"\\GERAL com qde divergente de arquivos! Qde esperada:[1] - Qde encontrada: ["+_qdeArquivosGeral+"]");
                }
                
                break;
            case "INTRANET":
                vData(caminhoInicial+_diaSemana+"\\Intranet\\"+_diaSemana+"-bco.sql",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\Intranet\\"+_diaSemana+"-db-intranet.sql",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\Intranet\\"+_diaSemana+"-intra.tar",_diaSemana);
                //Tamanho do arquivo
                vtamanho(caminhoInicial+_diaSemana+"\\Intranet\\"+_diaSemana+"-bco.sql",131000);
                vtamanho(caminhoInicial+_diaSemana+"\\Intranet\\"+_diaSemana+"-db-intranet.sql",107000);
                vtamanho(caminhoInicial+_diaSemana+"\\Intranet\\"+_diaSemana+"-intra.tar",9640000);

                //Verifica a quantidade de arquivos do diretorio
                File fIntranet= new File(caminhoInicial+_diaSemana+"\\INTRANET");
                int _qdeArquivosIntranet=fIntranet.listFiles().length;
                if(_qdeArquivosIntranet!=3){
                      throw new Exception("[QDE ARQUIVOS] Pasta "+caminhoInicial+_diaSemana+"\\INTRANET com qde divergente de arquivos! Qde esperada:[3] - Qde encontrada: ["+_qdeArquivosIntranet+"]");
                }
                break;
            case "Lawyer":

                File fLawyer= new File(caminhoInicial+_diaSemana+"\\LAWYER");
                int _qdeArquivosLawyer=fLawyer.listFiles().length;
                if(_qdeArquivosLawyer!=5){
                      throw new Exception("[QDE ARQUIVOS] Pasta "+caminhoInicial+_diaSemana+"\\LAWYER com qde divergente de arquivos! Qde esperada:[5] - Qde encontrada: ["+_qdeArquivosLawyer+"]");
                } else {
                    File afile[] = fLawyer.listFiles();
                    File arqLawyer1 = afile[0];
                    File arqLawyer2 = afile[1];
                    File arqLawyer3 = afile[2];
                    File arqLawyer4 = afile[3];
                    File arqLawyer5 = afile[4];
                    String _nomeL1 = arqLawyer1.getName();
                    String _nomeL2 = arqLawyer2.getName();
                    String _nomeL3 = arqLawyer3.getName();
                    String _nomeL4 = arqLawyer4.getName();
                    String _nomeL5 = arqLawyer5.getName();
                    vData(caminhoInicial+_diaSemana+"\\LAWYER\\"+_nomeL1,_diaSemana);
                    vData(caminhoInicial+_diaSemana+"\\LAWYER\\"+_nomeL2,_diaSemana);
                    vData(caminhoInicial+_diaSemana+"\\LAWYER\\"+_nomeL3,_diaSemana);
                    vData(caminhoInicial+_diaSemana+"\\LAWYER\\"+_nomeL4,_diaSemana);
                    vData(caminhoInicial+_diaSemana+"\\LAWYER\\"+_nomeL5,_diaSemana);
                    //Tamanho do arquivo
                    vtamanho(caminhoInicial+_diaSemana+"\\LAWYER\\"+_nomeL1,0);
                    vtamanho(caminhoInicial+_diaSemana+"\\LAWYER\\"+_nomeL2,609100);
                    vtamanho(caminhoInicial+_diaSemana+"\\LAWYER\\"+_nomeL3,13027800);
                    vtamanho(caminhoInicial+_diaSemana+"\\LAWYER\\"+_nomeL4,0);
                    vtamanho(caminhoInicial+_diaSemana+"\\LAWYER\\"+_nomeL5,13027800);
                }               
                
                break;
            case "PHOLY":
                vData(caminhoInicial+_diaSemana+"\\Pholy\\Pholy.zip",_diaSemana);
                //Tamanho do arquivo
                vtamanho(caminhoInicial+_diaSemana+"\\Pholy\\Pholy.zip",866000);
                File fPholy= new File(caminhoInicial+_diaSemana+"\\Pholy");
                int _qdeArquivosPholy=fPholy.listFiles().length;
                if(_qdeArquivosPholy!=1){
                      throw new Exception("[QDE ARQUIVOS] Pasta "+caminhoInicial+_diaSemana+"\\Pholy com qde divergente de arquivos! Qde esperada:[1] - Qde encontrada: ["+_qdeArquivosPholy+"]");
                }                
                break;
            case "QLIKVIEW":
                vData(caminhoInicial+_diaSemana+"\\QLIKVIEW\\QLIKVIEW.zip",_diaSemana);
                //Tamanho do arquivo
                vtamanho(caminhoInicial+_diaSemana+"\\QLIKVIEW\\QLIKVIEW.zip",3100000);
                File fQlikView= new File(caminhoInicial+_diaSemana+"\\QlikView");
                int _qdeArquivosQlikView=fQlikView.listFiles().length;
                if(_qdeArquivosQlikView!=1){
                      throw new Exception("[QDE ARQUIVOS] Pasta "+caminhoInicial+_diaSemana+"\\QlikView com qde divergente de arquivos! Qde esperada:[1] - Qde encontrada: ["+_qdeArquivosQlikView+"]");
                }                
                break;
            case "SCO":
                vData(caminhoInicial+_diaSemana+"\\SCO\\Banco_export.zip",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\SCO\\sistema.zip",_diaSemana);
                //Tamanho do arquivo
                vtamanho(caminhoInicial+_diaSemana+"\\SCO\\Banco_export.zip",401000);                
                vtamanho(caminhoInicial+_diaSemana+"\\SCO\\sistema.zip",104000);                
                File fSco= new File(caminhoInicial+_diaSemana+"\\SCO");
                int _qdeArquivosSco=fSco.listFiles().length;
                if(_qdeArquivosSco!=2){
                      throw new Exception("[QDE ARQUIVOS] Pasta "+caminhoInicial+_diaSemana+"\\SCO com qde divergente de arquivos! Qde esperada:[2] - Qde encontrada: ["+_qdeArquivosSco+"]");
                }                
                break;
            case "SENIOR":
                vData(caminhoInicial+_diaSemana+"\\SENIOR\\Acessoss.zip",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\SENIOR\\bd_master.zip",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\SENIOR\\bd_senior.zip",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\SENIOR\\Senior.zip",_diaSemana);
                //Tamanho do arquivo
                vtamanho(caminhoInicial+_diaSemana+"\\SENIOR\\Acessoss.zip",5000);                
                vtamanho(caminhoInicial+_diaSemana+"\\SENIOR\\bd_master.zip",3000);                  
                vtamanho(caminhoInicial+_diaSemana+"\\SENIOR\\bd_senior.zip",347000);                
                vtamanho(caminhoInicial+_diaSemana+"\\SENIOR\\Senior.zip",1630000);                  
                
                File fSenior= new File(caminhoInicial+_diaSemana+"\\SENIOR");
                int _qdeArquivosSenior=fSenior.listFiles().length;
                if(_qdeArquivosSenior!=4){
                      throw new Exception("[QDE ARQUIVOS] Pasta "+caminhoInicial+_diaSemana+"\\SENIOR com qde divergente de arquivos! Qde esperada:[4] - Qde encontrada: ["+_qdeArquivosSenior+"]");
                }                
                break;
            case "SISTEMAS":
                vData(caminhoInicial+_diaSemana+"\\SISTEMAS\\BckBanco_export.zip",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\SISTEMAS\\Iob.zip",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\SISTEMAS\\Sistemas.zip",_diaSemana);
                //Tamanho do arquivo
                vtamanho(caminhoInicial+_diaSemana+"\\SISTEMAS\\BckBanco_export.zip",232000);                
                vtamanho(caminhoInicial+_diaSemana+"\\SISTEMAS\\Iob.zip",300000);                  
                vtamanho(caminhoInicial+_diaSemana+"\\SISTEMAS\\Sistemas.zip",16600000);  
                
                File fSistemas= new File(caminhoInicial+_diaSemana+"\\SISTEMAS");
                int _qdeArquivosSistemas=fSistemas.listFiles().length;
                if(_qdeArquivosSistemas!=3){
                      throw new Exception("[QDE ARQUIVOS] Pasta "+caminhoInicial+_diaSemana+"\\SISTEMAS com qde divergente de arquivos! Qde esperada:[3] - Qde encontrada: ["+_qdeArquivosSistemas+"]");
                }                
                break;
            case "TOTVS_APP":
                vData(caminhoInicial+_diaSemana+"\\TOTVS_APP\\APO_MP10.ZIP",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\TOTVS_APP\\APO_MP11.ZIP",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\TOTVS_APP\\ARQ_MAGNETICOS.ZIP",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\TOTVS_APP\\bckativo.ZIP",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\TOTVS_APP\\BIN.ZIP",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\TOTVS_APP\\conhecimento.zip",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\TOTVS_APP\\DATA.ZIP",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\TOTVS_APP\\MY PROJECTS.ZIP",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\TOTVS_APP\\Pessoal.ZIP",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\TOTVS_APP\\relatorios.ZIP",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\TOTVS_APP\\relogio.ZIP",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\TOTVS_APP\\SYSTEM_MP10.ZIP",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\TOTVS_APP\\SYSTEM_MP11.ZIP",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\TOTVS_APP\\ticketCar.ZIP",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\TOTVS_APP\\web.ZIP",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\TOTVS_APP\\workflow.ZIP",_diaSemana);
                //Tamanho do arquivo
                vtamanho(caminhoInicial+_diaSemana+"\\TOTVS_APP\\APO_MP10.ZIP",228100);                
                vtamanho(caminhoInicial+_diaSemana+"\\TOTVS_APP\\APO_MP11.ZIP",304516);                   
                vtamanho(caminhoInicial+_diaSemana+"\\TOTVS_APP\\ARQ_MAGNETICOS.ZIP",82813);                 
                vtamanho(caminhoInicial+_diaSemana+"\\TOTVS_APP\\bckativo.ZIP",56931);                
                vtamanho(caminhoInicial+_diaSemana+"\\TOTVS_APP\\BIN.ZIP",2420841);                   
                vtamanho(caminhoInicial+_diaSemana+"\\TOTVS_APP\\conhecimento.zip",25598);                 
                vtamanho(caminhoInicial+_diaSemana+"\\TOTVS_APP\\DATA.ZIP",136);                
                vtamanho(caminhoInicial+_diaSemana+"\\TOTVS_APP\\MY PROJECTS.ZIP",28268);                   
                vtamanho(caminhoInicial+_diaSemana+"\\TOTVS_APP\\Pessoal.ZIP",138423);                 
                vtamanho(caminhoInicial+_diaSemana+"\\TOTVS_APP\\relatorios.ZIP",26);                
                vtamanho(caminhoInicial+_diaSemana+"\\TOTVS_APP\\relogio.ZIP",31247);                   
                vtamanho(caminhoInicial+_diaSemana+"\\TOTVS_APP\\SYSTEM_MP10.ZIP",911656);                 
                vtamanho(caminhoInicial+_diaSemana+"\\TOTVS_APP\\SYSTEM_MP11.ZIP",1719910);                 
                vtamanho(caminhoInicial+_diaSemana+"\\TOTVS_APP\\ticketCar.ZIP",676);                
                vtamanho(caminhoInicial+_diaSemana+"\\TOTVS_APP\\web.ZIP",65086);                   
                vtamanho(caminhoInicial+_diaSemana+"\\TOTVS_APP\\workflow.ZIP",441056);                 
                
                
                File fTotvsApp= new File(caminhoInicial+_diaSemana+"\\TOTVS_APP");
                int _qdeArquivosTotvsApp=fTotvsApp.listFiles().length;
                if(_qdeArquivosTotvsApp!=16){
                      throw new Exception("[QDE ARQUIVOS] Pasta "+caminhoInicial+_diaSemana+"\\TOTVS_APP com qde divergente de arquivos! Qde esperada:[16] - Qde encontrada: ["+_qdeArquivosTotvsApp+"]");
                }                
                break;
            case "TOTVS_BD":
                File fTotvsBD= new File(caminhoInicial+_diaSemana+"\\TOTVS_BD");
                int _qdeArquivosTotvsBD=fTotvsBD.listFiles().length;
                if(_qdeArquivosTotvsBD!=2){
                      throw new Exception("[QDE ARQUIVOS] Pasta "+caminhoInicial+_diaSemana+"\\TOTVS_BD com qde divergente de arquivos! Qde esperada:[2] - Qde encontrada: ["+_qdeArquivosTotvsBD+"]");
                } else {
                    File afile[] = fTotvsBD.listFiles();
                    File arquivos1 = afile[0];
                    File arquivos2 = afile[1];
                    String _nome1 = arquivos1.getName();
                    String _nome2 = arquivos2.getName();
                    vData(caminhoInicial+_diaSemana+"\\TOTVS_BD\\"+_nome1,_diaSemana);
                    vData(caminhoInicial+_diaSemana+"\\TOTVS_BD\\"+_nome2,_diaSemana);
                   //Tamanho do arquivo
                   vtamanho(caminhoInicial+_diaSemana+"\\TOTVS_BD\\"+_nome1,3879000);                
                   vtamanho(caminhoInicial+_diaSemana+"\\TOTVS_BD\\"+_nome2,406);                     
                }               
                
                break;
            case "TSM":
                vData(caminhoInicial+_diaSemana+"\\TSM\\devconf.dat",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\TSM\\dsmserv.opt",_diaSemana);
                vData(caminhoInicial+_diaSemana+"\\TSM\\volhist.dat",_diaSemana);
                //Tamanho do arquivo
                vtamanho(caminhoInicial+_diaSemana+"\\TSM\\devconf.dat",2);                
                vtamanho(caminhoInicial+_diaSemana+"\\TSM\\dsmserv.opt",0);                   
                vtamanho(caminhoInicial+_diaSemana+"\\TSM\\volhist.dat",707);                   
                File fTsm= new File(caminhoInicial+_diaSemana+"\\TSM");
                int _qdeArquivosTsm=fTsm.listFiles().length;
                if(_qdeArquivosTsm!=3){
                      throw new Exception("[QDE ARQUIVOS] Pasta "+caminhoInicial+_diaSemana+"\\TSM com qde divergente de arquivos! Qde esperada:[3] - Qde encontrada: ["+_qdeArquivosTsm+"]");
                }                
                break;
                
            default:  throw new Exception("[DIRETORIO]: "+_pastaArquivo+" não encontrada!");    
        }
        
        
        return null;
        
    }
}
